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
public abstract class Tuote {
    //jokaisella tuotteella on tieto
    //Missä hyllyssä
    //monnessako paikassa
    //millä tasolla (1-3) se on
    //uniikki ID
    //sekä nimi
    private int hylly;
    private int paikka;
    private int korkeus;
    private int id;
    private String nimi;
    Tuote(int h, int p, int k, int i, String n)
    {
        setHylly(h);
        setKorkeus(k);
        setPaikka(p);
        setId(i);
        setNimi(n);
    }

    /**
     * @return the hylly
     */
    public int getHylly() {
        return hylly;
    }

    /**
     * @param hylly the hylly to set
     */
    public void setHylly(int hylly) {
        this.hylly = hylly;
    }

    /**
     * @return the paikka
     */
    public int getPaikka() {
        return paikka;
    }

    /**
     * @param paikka the paikka to set
     */
    public void setPaikka(int paikka) {
        this.paikka = paikka;
    }

    /**
     * @return the korkeus
     */
    public int getKorkeus() {
        return korkeus;
    }

    /**
     * @param korkeus the korkeus to set
     */
    public void setKorkeus(int korkeus) {
        this.korkeus = korkeus;
    }

    @Override
    public String toString() {
        return  getNimi() + "| ID: " + getId() +  " | Hylly: " + getHylly() + " | Paikka: " + getPaikka() + " | Korkeus: " + getKorkeus(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * @param nimi the nimi to set
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
