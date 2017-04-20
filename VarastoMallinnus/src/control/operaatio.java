/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import model.Askartelu;
import model.Myynti;
import model.Tuote;

/**
 *
 * @author Joni
 */
public class operaatio {
    private LinkedList<Tuote> tuoteLista = new LinkedList();
    private LinkedList<Askartelu> AskarteluLista = new LinkedList();
    private LinkedList<Myynti> MyyntiLista = new LinkedList();

    /**
     * @return the tuoteLista
     */
    public LinkedList<Tuote> getTuoteLista() {
        return tuoteLista;
    }
    
    //id:tä varten palautetaan luotujen tuotteiden määrä
    public int idpalautus()
    {
        return tuoteLista.size() + 1;
    }
    
    public void lisaaTuote(Tuote a)
    {
        if (a instanceof Askartelu)
        {
            getAskarteluLista().add((Askartelu) a);
        }
        else if (a instanceof Myynti)
        {
            getMyyntiLista().add((Myynti) a);
        }
        tuoteLista.add(a);        
    }
    
    public Tuote palautaId(int idd)
    {
        LinkedList a = tuoteLista;
        if (a.size()>0)
        {
            for (int i = 0; i < a.size(); i++)
            {
                Tuote tmp = (Tuote) a.get(i);
                
                if (tmp.getId() == idd)
                {
                    return tmp;
                }
            }
        }
        return null;
    }

    /**
     * @return the AskarteluLista
     */
    public LinkedList<Askartelu> getAskarteluLista() {
        return AskarteluLista;
    }

    /**
     * @return the MyyntiLista
     */
    public LinkedList<Myynti> getMyyntiLista() {
        return MyyntiLista;
    }
    
    public boolean palautaNimella(Tuote a, String b)
    {
        return a.getNimi().toLowerCase().contains( b.toLowerCase() );
    }

    
    public boolean poistaTuote(int a)
    {
        boolean palautus = false;
        for (int i = 0; i < tuoteLista.size(); i++)
        {
            if (tuoteLista.get(i).getId() == a+1)
            {

                if(tuoteLista.get(i) instanceof Myynti)
                {
                    poistaMyynti(i);
                }
                else
                {
                    poistaAskartelu(i);
                }
                tuoteLista.remove(i);
                palautus = true;
                break;
            }
        }
        
        return palautus;
    }
    
    public void poistaMyynti(int a)
    {
        for (int i = 0; i<MyyntiLista.size(); i++)
        {
            if (MyyntiLista.get(i).getId() == a)
            {
                MyyntiLista.remove(i);
            }
        }
    }
    public void poistaAskartelu(int a)
    {
       for (int i = 0; i<AskarteluLista.size(); i++)
        {
            if (AskarteluLista.get(i).getId() == a)
            {
                AskarteluLista.remove(i);
            }
        }
        
    }

    public Tuote palautaTuote(Integer a) {
        for (int i = 0; i < tuoteLista.size(); i++)
        {
            if (tuoteLista.get(i).getId()== a)
            {
                return tuoteLista.get(i);
            }
        }
        return null;
    }

    /**
     * @param tuoteLista the tuoteLista to set
     */
    public void setTuoteLista(LinkedList<Tuote> tuoteLista) {
        this.tuoteLista = tuoteLista;
    }

    /**
     * @param AskarteluLista the AskarteluLista to set
     */
    public void setAskarteluLista(LinkedList<Askartelu> AskarteluLista) {
        this.AskarteluLista = AskarteluLista;
    }

    /**
     * @param MyyntiLista the MyyntiLista to set
     */
    public void setMyyntiLista(LinkedList<Myynti> MyyntiLista) {
        this.MyyntiLista = MyyntiLista;
    }
}
