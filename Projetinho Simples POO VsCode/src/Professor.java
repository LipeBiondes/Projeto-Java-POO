public class Professor extends Pessoa {
  private float sal;

  public Professor(String nome, String sexo, int idade) {
    super(nome, sexo, idade);
  }

  public void aumetarSal(int porc) {
    this.sal = (sal * (porc / 100) + sal);
  }

  @Override
  protected void fazerNiver() {

  }

  public float getSal() {
    return sal;
  }

  public void setSal(float sal) {
    this.sal = sal;
  }

  @Override
  public String toString() {
    return "Professor [" + super.toString() + "sal=" + sal + "]";
  }

}
