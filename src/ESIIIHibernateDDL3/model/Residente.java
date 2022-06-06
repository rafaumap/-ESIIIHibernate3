package ESIIIHibernateDDL3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")
public class Residente extends Medico {
  @Column(name = "instituicao_ensino", length = 50)
  @NotNull
  private String instituicaoEnsino;

  @Column(name = "ano_ingresso", length = 10)
  @NotNull
  private int anoIngresso;
}