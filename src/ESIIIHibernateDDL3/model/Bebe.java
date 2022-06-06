package ESIIIHibernateDDL3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe_medico")
public class BebeMedico {
  @Id
  @Column(name = "id_bebe_medico")
  @NotNull
  private int idBebeMedico;

  @ManyToOne
  @JoinColumn(name = "id_bebe")
  private Bebe bebe;

  @ManyToOne
  @JoinColumn(name = "crm_medico")
  private Medico medico;

  public Bebe getBebe() {
    return this.bebe;
  }

  public void setBebe(Bebe bebe) {
    this.bebe = bebe;
  }

  public Medico getMedico() {
    return this.medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  @Override
  public String toString() {
    return "{" +
        " bebe='" + getBebe() + "'" +
        ", medico='" + getMedico() + "'" +
        "}";
  }

}