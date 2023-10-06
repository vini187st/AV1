public class pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    public pix(String dataHoraPagamento, int numeroPagamento, double valorPago,
               boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Cupom Fiscal do Pix:\n" +
                "Data/Hora do Pagamento: " + getDataHoraPagamento() + "\n" +
                "Número do Pagamento: " + getNumeroPagamento() + "\n" +
                "Valor Pago: " + getValorPago() + "\n" +
                "Comprovante de Transação Pix: " + comprovanteTransacaoPix;
    }

    // Getters e setters específicos para Pix
    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }
}
