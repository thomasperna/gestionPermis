/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GstAutoEcole
{
    private ArrayList<Eleve> tousLesEleves;
    private ArrayList<Eleve> lesElevesInscrits;
    private ArrayList<Test> tousLesTests;
    
    public GstAutoEcole()
    {
        tousLesEleves = new ArrayList<>();
        lesElevesInscrits = new ArrayList<>();
        tousLesTests = new ArrayList<>();
    }
    public void AjouterUnEleve(Eleve unEleve)
    {
        getTousLesEleves().add(unEleve);
    }
    public void AjouterUnEleveInscrit(Eleve unEleve)
    {
        getLesElevesInscrits().add(unEleve);
    }
    public void AjouterUnTest(Test unTest)
    {
        getTousLesTests().add(unTest);
    }
    public Eleve GetUnEleve(int i)
    {
        return getTousLesEleves().get(i);
    }
    public Eleve GetUnEleveInscrit(int i)
    {
        return getLesElevesInscrits().get(i);
    }
    public Test GetUnTest(int i)
    {
        return getTousLesTests().get(i);
    }

    /**
     * @return the tousLesEleves
     */
    public ArrayList<Eleve> getTousLesEleves() {
        return tousLesEleves;
    }

    /**
     * @return the lesElevesInscrits
     */
    public ArrayList<Eleve> getLesElevesInscrits() {
        return lesElevesInscrits;
    }

    /**
     * @return the tousLesTests
     */
    public ArrayList<Test> getTousLesTests() {
        return tousLesTests;
    }
    
    // Permet de savoir si l'élève passé en paramètre existe déjà
    // dans la liste des élèves inscrits
    public boolean ExisterEleve(Eleve unEleve)
    {
        boolean existe = false;
        for(Eleve eleve : lesElevesInscrits)
        {
            if(eleve.getIdEleve() == unEleve.getIdEleve())
            {
                existe = true;
                break;
            }
        }
        return existe;
    }
}
