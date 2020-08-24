/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author Eduardo Reyes
 * @author Raquel Lojano
 * @author Lorena Guadalima
 * @version 1.0.0
 * @since COCOMO1 1.0.0
 */
public class m_Cocomo {

    /**
     * @return the Tdes
     */
    public double getTdes() {
        return Tdes;
    }

    /**
     * @param Tdes the Tdes to set
     */
    public void setTdes(double Tdes) {
        this.Tdes = Tdes;
    }

    /**
     * @return the Ch
     */
    public double getCh() {
        return Ch;
    }

    /**
     * @param Ch the Ch to set
     */
    public void setCh(double Ch) {
        this.Ch = Ch;
    }
    private double Tdes;
    private double Ch;
    /**
     * @return the productoria
     */
    public double getProductoria() {
        return productoria;
    }

    /**
     * @param productoria the productoria to set
     */
    public void setProductoria(double productoria) {
        this.productoria = productoria;
    }
    private double productoria;
    
    
    /**
     * @return the B
     */
    public double getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(double B) {
        this.B = B;
    }

    /**
     * @return the SumFEscala
     */
    public double getSumFEscala() {
        return SumFEscala;
    }

    /**
     * @param SumFEscala the SumFEscala to set
     */
    public void setSumFEscala(double SumFEscala) {
        this.SumFEscala = SumFEscala;
    }

    /**
     * @return the E
     */
    public double getE() {
        return E;
    }

    /**
     * @param E the E to set
     */
    public void setE(double E) {
        this.E = E;
    }
    private double B;
    private double SumFEscala;
    private double E;    
     private double CostoTotal;

    /**
     * @return the CostoTotal
     */
    public double getCostoTotal() {
        return CostoTotal;
    }

    /**
     * @param CostoTotal the CostoTotal to set
     */
    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }
}
