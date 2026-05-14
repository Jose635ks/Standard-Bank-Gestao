import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class GestaoRecibo
{
    private float totalComissao;
    private int contVendas19;
    private DecimalFormat mt;

    //Constructor
    public GestaoRecibo()
    {
        totalComissao = 0;
        contVendas19 = 0;
        mt = new DecimalFormat("###,###.00MT");
    }

    public void processarFicheiro(String nf)
    {
        StringTokenizer str;
        String umaLinha, data = null, nomeEmpresa = null;
        float valorVendas = 0;

        // Leitura do ficheiro
        try
        {
            FileReader fr = new FileReader(nf);
            BufferedReader br = new BufferedReader(fr);
            umaLinha = br.readLine();
            // Calculos ficam dentro do loop - while
            while (umaLinha != null)
            {
                str = new StringTokenizer(umaLinha, " ");
                nomeEmpresa = str.nextToken();
                data = str.nextToken();
                valorVendas = Float.parseFloat(str.nextToken());

                // Mostrar os recibos
                Recibo r = new Recibo(nomeEmpresa, data, valorVendas);
                System.out.println(r);

                // Acumulador da comissao
                totalComissao += r.getComissao();

                // Contador de vendas do dia 19
                String dia = r.getData().substring(0, 2);
                if (dia.equals("19"))
                    contVendas19++;
                umaLinha = br.readLine(); // Salta para a proxima Linha
            }
            br.close(); // Fecho da Leitura

        } catch (FileNotFoundException a)
        {
            System.out.println("O ficheiro " + nf + " nao foi encontrado");
        } catch (NumberFormatException nb)
        {
            System.out.println(nb.getMessage());
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void mostrarResultados()
    {
        System.out.println("==== Resultados ====");
        System.out.println("Total de comissoes recebidas: "+mt.format(totalComissao));
        System.out.println("Numero de vendas no dia 19: "+contVendas19);
    }
}
