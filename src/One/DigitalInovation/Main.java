package One.DigitalInovation;

public class Main {
    public static void main(String[] args) {

        Fila MinhaFila = new Fila();

        MinhaFila.Enqueue(new No("Primeiro"));
        MinhaFila.Enqueue(new No("Segundo"));
        MinhaFila.Enqueue(new No("Terceiro"));
        MinhaFila.Enqueue(new No("Quarto"));

        System.out.println(MinhaFila);

        System.out.println(MinhaFila.DeQueue());

        System.out.println(MinhaFila);

        MinhaFila.Enqueue(new No("Ultimo"));

        System.out.println(MinhaFila);

        System.out.println(MinhaFila.First());

        System.out.println(MinhaFila);
    }
}
