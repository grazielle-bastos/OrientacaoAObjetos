package D.ExercicioPraticoComObjetos;

public class Main4 {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(111);
        conta1.setDono("Joaquim");
        conta1.abrirConta("CC");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(222);
        conta2.setDono("Maria");
        conta2.abrirConta("CP");

        conta1.depositar(100);
        conta2.depositar(500);

        conta1.sacar(150);
        conta2.sacar(1000);

        conta1.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();


    }
}
