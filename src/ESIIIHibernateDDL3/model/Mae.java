package ESIIIHibernateDDL3.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "mae")
public class Mae {
  @Id
  @Column(name = "id_mae")
  @NotNull
  private int id;

  @Column(name = "nome", length = 60)
  @NotNull
  private String nome;

  @Column(name = "logradouro_endereco", length = 100)
  @NotNull
  private String logradouro;

  @Column(name = "numero_endereco")
  @NotNull
  private int numero;

  @Column(name = "cep_endereco", length = 8)
  @NotNull
  private String cep;

  @Column(name = "complemento_endereco", length = 200)
  private String complemento;

  @Column(name = "telefone", length = 10)
  @NotNull
  private String telefone;

  @Column(name = "data_nasc")
  @NotNull
  private LocalDate dataNasc;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogradouro() {
    return this.logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getCep() {
    return this.cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getComplemento() {
    return this.complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public LocalDate getDataNasc() {
    return this.dataNasc;
  }

  public void setDataNasc(LocalDate dataNasc) {
    this.dataNasc = dataNasc;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", nome='" + getNome() + "'" +
        ", logradouro='" + getLogradouro() + "'" +
        ", numero='" + getNumero() + "'" +
        ", cep='" + getCep() + "'" +
        ", complemento='" + getComplemento() + "'" +
        ", telefone='" + getTelefone() + "'" +
        ", dataNasc='" + getDataNasc() + "'" +
        "}";
  }

}