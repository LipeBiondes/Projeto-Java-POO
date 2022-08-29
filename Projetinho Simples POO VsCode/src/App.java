public class App {
    public static void main(String[] args) throws Exception {
        Aluno a[] = new Aluno[5];
        a[0] = new Aluno("Alefe Filipe", "M", 20);
        a[0].setCurso("Bacharelado em Engenharia de Software");
        a[0].setMatricula(1);

        Professor prof[] = new Professor[2];
        prof[0] = new Professor("Quinto", "M", 45);
        prof[0].setSal(3000.45f);

        Aula au[] = new Aula[2];
        au[0] = new Aula("Fundamentos de Redes", "12/09/22", 120, 1);

        SalaDeAula sala = new SalaDeAula(a[0], prof[0], au[0]);
        sala.marcarAula(12, a[0], prof[0], au[0]);
        sala.comecarAula();
        sala.finalizarAula();
    }
}
