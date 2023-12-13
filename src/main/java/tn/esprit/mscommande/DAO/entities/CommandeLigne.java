package tn.esprit.mscommande.DAO.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class CommandeLigne{
    private static final long serialVersionUID = 6 ;
    @Id
    @GeneratedValue
    private int idCommandeLigne ;
    private String idProduit ;
    private int qte ;
    private float prixProduit ;
    private float prixLigne ;
    private Commande commande ;
    public int getIdCommandeLigne() {
        return idCommandeLigne;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public int getQte() {
        return qte;
    }

    public float getPrixProduit() {
        return prixProduit;
    }

    public float getPrixLigne() {
        return prixLigne;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public void setPrixProduit(float prixProduit) {
        this.prixProduit = prixProduit;
    }

    public void setPrixLigne(float prixLigne) {
        this.prixLigne = prixLigne;
    }

    public CommandeLigne() {
    }

    public CommandeLigne(int idCommandeLigne, String idProduit, int qte, float prixProduit, float prixLigne) {
        this.idCommandeLigne = idCommandeLigne;
        this.idProduit = idProduit;
        this.qte = qte;
        this.prixProduit = prixProduit;
        this.prixLigne = prixLigne;
    }
}
