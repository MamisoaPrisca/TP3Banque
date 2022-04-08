/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package mg.nyanjaramamisoa.tp3banque.manager;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import mg.nyanjaramamisoa.tp3banque.ejb.GestionnaireCompte;
import mg.nyanjaramamisoa.tp3banque.entities.CompteBancaire;

/**
 *
 * @author nyamp
 */
@Singleton
@Startup
public class Init {
    @EJB
    private GestionnaireCompte gestionnaireCompte;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PostConstruct
    public void nbComptes(){
        if(gestionnaireCompte.nbComptes()!=0){
            return;
        }
        gestionnaireCompte.creerCompte(new CompteBancaire("John Lennon", 150000));
        gestionnaireCompte.creerCompte(new CompteBancaire("Paul McCartney", 950000 ));
        gestionnaireCompte.creerCompte(new CompteBancaire("Ringo Starr", 20000 )); 
        gestionnaireCompte.creerCompte(new CompteBancaire("Georges Harrisson", 100000));
        
    }
}
