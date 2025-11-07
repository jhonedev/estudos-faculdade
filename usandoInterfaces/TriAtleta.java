package usandoInterfaces;

public class TriAtleta extends Pessoa implements INadador, ICorredor, ICiclista{

    public TriAtleta(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public void aquecer() {
        System.out.println(this.getNome() + " está aquecendo");
    }

    @Override
    public void pedalar() {
        System.out.println(this.getNome() + " está pedalando");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando");
    }
    
}
