package J.ExercicioPraticoComHeranca;

public class Tecnico extends Aluno {

    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    protected void praticar(){
        System.out.println("Praticando...");
    }

}
