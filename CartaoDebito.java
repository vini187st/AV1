public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago,
                        String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Cupom Fiscal do Cartão de Débito:\n" +
                "Data/Hora do Pagamento: " + getDataHoraPagamento() + "\n" +
                "Número do Pagamento: " + getNumeroPagamento() + "\n" +
                "Valor Pago: " + getValorPago() + "\n" +
                "Número do Cartão: " + numCartao + "\n" +
                "Titular do Cartão: " + titularCartao;
    }

    // Getters e setters específicos para CartaoDebito
    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }
}