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
public class Eleve
{
    private int idEleve;
    private String nomEleve;
    private ArrayList<Test> sesTests;
    
    public Eleve(){}
    public Eleve(int unId, String unNom)
    {
        idEleve = unId;
        nomEleve = unNom;
        sesTests = new ArrayList<>();
    }

    /**
     * @return the idEleve
     */
    public int getIdEleve() {
        return idEleve;
    }

    /**
     * @return the nomEleve
     */
    public String getNomEleve() {
        return nomEleve;
    }
    
    public void AjouterUnTest(Test unTest)
    {
        getSesTests().add(unTest);
    }

    /**
     * @return the sesTests
     */
    public ArrayList<Test> getSesTests() {
        return sesTests;
    }
    
    public Test GetUnTest(int i)
    {
        return sesTests.get(i);
    }
    
    // Permet de savoir si le test passé en paramètre
    // est déjà présent dans la liste des tests de l'élève
    public boolean VerifierPresenceTest(Test unTest)
    {
        boolean trouve = false;
        // A vous de jouer
        
        
        return trouve;
    }
    
    // Permet de savoir si le test passé en paramètre
    // est terminé dans la liste des tests de l'élève
    public boolean VerifierSiTestTermine(Test unTest)
    {
        boolean estTermine = false;
        // A vous de jouer
        
        
        
        return estTermine;
    }
    
    // Permet de supprimer le test passé en paramètre
    // dans la liste des tests de lélève
    public void SupprimerTest(int idTest)
    {
        // A vous de jouer
        
        
        
    }
}
