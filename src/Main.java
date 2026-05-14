public class Main
{
    public static void main(String[] args)
    {
        GestaoRecibo gr = new GestaoRecibo();

        gr.processarFicheiro("Recibo.txt");
        gr.mostrarResultados();
    }
}