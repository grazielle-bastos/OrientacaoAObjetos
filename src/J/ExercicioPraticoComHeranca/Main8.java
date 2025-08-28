package J.ExercicioPraticoComHeranca;

public class Main8 {
    public static void main(String[] args) {

        /*Visitante v1 = new Visitante();
        v1.setNome("Maria Silva");
        v1.setIdade(22);
        v1.setSexo("F");
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Maria Silva");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setSexo("F");
        a1.setIdade(22);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("João Silva");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Pedro Silva");
        t1.setRegistroProfissional(123456);
        t1.setSexo("M");
        t1.praticar();
    }
}
