import java.text.DecimalFormat;

public class Recibo
{
    private String nomeEmpresa;
    private String data;
    private float valorVendas;
    private float comissao;
    private DecimalFormat mt;

    // Construtor
    public Recibo(String nomeEmpresa, String data, float valorVendas)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.data = data;
        this.valorVendas = valorVendas;
        this.comissao = valorVendas * 1 / 100f;
        mt = new DecimalFormat("###,###.00MT");
    }

    // Getters
    public String getData()
    {
        return data;
    }

    public float getComissao()
    {
        return comissao;
    }

    // Metodo String toString
    public String toString()
    {
        return "| Nome da Empresa: " + nomeEmpresa +
                "| Data: " + data +
                "| ValorVendas: " + mt.format(valorVendas) +
                "| Comissao: " + mt.format(comissao);
    }
}
