package usandoInterfaces;

public class UsandoInterface {
    public static void main(String[] args) {
        TriAtleta triAtleta = new TriAtleta("Jonathan", "rua");
        triAtleta.aquecer();
        triAtleta.nadar();
        triAtleta.correr();
        triAtleta.pedalar();

        ICiclista ciclista = new TriAtleta("Fulano", "n");
        ciclista.aquecer();
        ciclista.pedalar();

        INadador nadador = new TriAtleta("Beltrano", "b");
        nadador.aquecer();
        nadador.nadar();

        ICorredor corredor = new TriAtleta("Carlos", "c");
        corredor.aquecer();
        corredor.correr();
    }
}
