package ESIIIHibernateDDL3.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import ESIIIHibernateDDL1.model.Medico;
import ESIIIHibernateDDL3.model.Bebe;
import ESIIIHibernateDDL3.model.BebeMedico;
import ESIIIHibernateDDL3.model.Mae;
import ESIIIHibernateDDL3.model.Residente;

public class HibernateUtil {
  private static SessionFactory sessionFactory;

  public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      try {
        Configuration configuration = new Configuration();

        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernateddl3?createDatabaseIfNotExist=true");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "root");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "update");

        configuration.setProperties(settings);
        configuration.addAnnotatedClass(Bebe.class);
        configuration.addAnnotatedClass(BebeMedico.class);
        configuration.addAnnotatedClass(Mae.class);
        configuration.addAnnotatedClass(Medico.class);
        configuration.addAnnotatedClass(Residente.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties()).build();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    return sessionFactory;
  }

}