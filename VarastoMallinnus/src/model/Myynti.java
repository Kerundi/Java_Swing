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
public class Myynti extends Tuote {
    /*
    on olemassa myytavia tuotteita
    sekä askarteluun tarkoitettuja tuotteita
    Myytävillä tuotteilla on olemassa hinta
    */
    private double hinta;
    
    public Myynti(int h, int p, int k, int id, double hi, String n)
    {
        super(h,p,k,id,n);
        setHinta(hi);
        
    }

    /**
     * @return the hinta
     */
    public double getHinta() {
        return hinta;
    }

    /**
     * @param hinta the hinta to set
     */
    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + getHinta(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
