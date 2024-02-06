public class Vaso {
    private String material;
    private float custoDeProducao;
    private float valorDeVenda;
    private String cor;
    private int codigoRegistro;

    //Este é um getter do material.
    public String getMaterial() {
        return material;
    }
    /*
    Este é um setter do material.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    public float getCustoDeProducao() {
        return custoDeProducao;
    }

    public void setCustoDeProducao(float custoDeProducao) {
        this.custoDeProducao = custoDeProducao;
    }

    public float getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(float valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(int codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    /**
     * @author Guilherme Cavaleiro
     * @since 06/02/2024
     * @version 1.0
     */
    public void imprimeMaterial(){
        System.out.println("Este vaso, foi feito de " + this.material);
    }
}
