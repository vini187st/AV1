public class CartaoCredito extends Pagamento {
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago,
                         String numCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Cupom Fiscal do Cartão de Crédito:\n" +
                "Data/Hora do Pagamento: " + getDataHoraPagamento() + "\n" +
                "Número do Pagamento: " + getNumeroPagamento() + "\n" +
                "Valor Pago: " + getValorPago() + "\n" +
                "Número do Cartão: " + numCartao + "\n" +
                "Bandeira do Cartão: " + bandeiraCartao + "\n" +
                "Titular do Cartão: " + titularCartao;
    }

    // Getters e setters específicos para CartaoCredito
    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }
}
