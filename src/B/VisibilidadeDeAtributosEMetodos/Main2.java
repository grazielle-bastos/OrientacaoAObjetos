package B.VisibilidadeDeAtributosEMetodos;

public class Main2 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; // Atributo privado, não pode ser acessado diretamente
        c1.carga = 80; // Atributo protegido, pode ser acessado dentro do mesmo pacote
        //c1.tampada = true; // Atributo público, pode ser acessado diretamente
        c1.tampar();

        c1.status();

    }

}
