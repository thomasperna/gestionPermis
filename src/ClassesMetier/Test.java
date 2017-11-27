/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author User
 */
public class Test
{
    private int idTest;
    private String nomTest;
    private int nbFautes;
    private boolean termine;
    
    public Test(){}
    public Test(int unId, String unNom,int unNbFautes, boolean estTermine)
    {
        idTest = unId;
        nomTest = unNom;
        nbFautes = unNbFautes;
        termine = estTermine;
    }

    /**
     * @return the idTest
     */
    public int getIdTest() {
        return idTest;
    }

    /**
     * @return the nomTest
     */
    public String getNomTest() {
        return nomTest;
    }

    /**
     * @return the nbFautes
     */
    public int getNbFautes() {
        return nbFautes;
    }

    /**
     * @param nbFautes the nbFautes to set
     */
    public void setNbFautes(int nbFautes) {
        this.nbFautes = nbFautes;
    }

    /**
     * @return the termine
     */
    public boolean getTermine() {
        return termine;
    }

    /**
     * @param termine the termine to set
     */
    public void setTermine(boolean termine) {
        this.termine = termine;
    }
}
