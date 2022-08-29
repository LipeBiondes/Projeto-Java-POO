public class Aluno extends Pessoa {
  private int matricula;
  private String curso;

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public Aluno(String nome, String sexo, int idade) {
    super(nome, sexo, idade);
  }

  @Override
  public void fazerNiver() {
    this.setIdade(this.getIdade() + 1);
  }

  @Override
  public String toString() {
    return "Aluno [ " + super.toString() + " curso=" + curso + ", matricula=" + matricula + "]";
  }

}
