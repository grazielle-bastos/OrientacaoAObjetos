package C.MetodosEspeciais_GettersSettersConstructs;

public class Main3 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("New Pen", "Amarelo", 0.7f);

        //c1.setModelo("BIC"); // Acesso via método setter
        //c1.modelo = "BIC"; // Acesso direto, pois o atributo é público
        //c1.setPonta(0.5f); // Acesso via método setter
        //c1.ponta = 0.5f; // Acesso direto, pois o atributo é público

        c1.status();

        Caneta c2 = new Caneta("BIC", "Preta", 0.5f);

        c2.status();

        System.out.println("\nTenho uma caneta: " + c1.getModelo() + " de ponta " + c1.getPonta()); // Acesso via método getter


    }


}
