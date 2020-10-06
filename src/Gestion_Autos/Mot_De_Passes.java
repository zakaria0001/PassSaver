/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion_Autos;

import java.io.Serializable;

/**
 *
 * @author Zakaria Nabil
 */
public class Mot_De_Passes implements  Serializable{
    private String siteweb,nomdutilisateur,motdepasse; 

    public String getSiteweb() {
        return siteweb;
    }

    public void setSiteweb(String siteweb) {
        this.siteweb = siteweb;
    }

    public String getNomdutilisateur() {
        return nomdutilisateur;
    }

    public void setNomdutilisateur(String nomdutilisateur) {
        this.nomdutilisateur = nomdutilisateur;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public Mot_De_Passes(String siteweb, String nomdutilisateur, String motdepasse) {
        this.siteweb = siteweb;
        this.nomdutilisateur = nomdutilisateur;
        this.motdepasse = motdepasse;
    }
    
    
}
