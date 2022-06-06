package ESIIIHibernateDDL3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
@Inheritance(strategy = InheritanceType.JOINED)
public class Medico {
  @Id
  @Column(name = "crm", length = 7)
  @NotNull
  private String crm;

  @Column(name = "nome", length = 60)
  @NotNull
  private String nome;

  @Column(name = "telefone_celular", length = 11)
  @NotNull
  private String celular;

  @Column(name = "especialidade", length = 30)
  @NotNull
  private String especialidade;

  public String getCrm() {
    return this.crm;
  }

  public void setCrm(String crm) {
    this.crm = crm;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCelular() {
    return this.celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getEspecialidade() {
    return this.especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  @Override
  public String toString() {
    return "{" +
        " crm='" + getCrm() + "'" +
        ", nome='" + getNome() + "'" +
        ", celular='" + getCelular() + "'" +
        ", especialidade='" + getEspecialidade() + "'" +
        "}";
  }
}