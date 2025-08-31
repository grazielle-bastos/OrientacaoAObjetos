package K.Polimorfismo;

public class Main9 {
    public static void main(String[] args) {
        // Animal n = new Animal(); // Erro de compilação

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();

        p.locomover();

        r.locomover();

        c.locomover();

        ca.locomover();

        c.emitirSom();

        ca.emitirSom();

    }
}
