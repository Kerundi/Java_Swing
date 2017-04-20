/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Joni
 */
public class Askartelu extends Tuote{
    /*
    Myytävien tuotteiden lisäksi on olemassa työntekijöiden käyttöön tarkoitettuja
    askartelutarvikkeita.
    Askartelutarvikkeisiin merkitään mihin ne on tarkoitettu
    */
    private String kohde;
    public Askartelu(int h, int p, int k, int id, String ko, String n)
    {
        super(h,p,k,id,n);
        setKohde(ko);
    }

    /**
     * @return the kohde
     */
    public String getKohde() {
        return kohde;
    }

    /**
     * @param kohde the kohde to set
     */
    public void setKohde(String kohde) {
        this.kohde = kohde;
    }
    //korvataan toString metodi tietojen tallennusta, esittämistä ja latausta varten

    @Override
    public String toString() {
        return super.toString() + "|" +  getKohde(); //To change body of generated methods, choose Tools | Templates.
    } 
    
    
}
