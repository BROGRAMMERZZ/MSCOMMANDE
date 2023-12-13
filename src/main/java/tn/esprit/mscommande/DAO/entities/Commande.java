package tn.esprit.mscommande.DAO.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Commande implements Serializable {
    private static final  long serialVersionUID = 6 ;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idCommande ;

    private Date dateCommande;
    private int idUser ;
    private String etat ;
    private float price ;
    private String ShippingAdress ;
    private String paiementMethod ;
    @OneToMany(cascade = CascadeType.ALL)
     public List<CommandeLigne> commandeLignes ;
    public int getIdCommande() {
        return idCommande;
    }

    public List<CommandeLigne> getCommandeLignes() {
        return commandeLignes;
    }

    public void setCommandeLignes(List<CommandeLigne> commandeLignes) {
        this.commandeLignes = commandeLignes;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getEtat() {
        return etat;
    }

    public float getPrice() {
        return price;
    }

    public String getShippingAdress() {
        return ShippingAdress;
    }

    public String getPaiementMethod() {
        return paiementMethod;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setShippingAdress(String shippingAdress) {
        ShippingAdress = shippingAdress;
    }

    public void setPaiementMethod(String paiementMethod) {
        this.paiementMethod = paiementMethod;
    }

    public Commande() {
        super();
    }

    public Commande(int idCommande, Date dateCommande, int idUser, String etat, float price, String shippingAdress, String paiementMethod, Set<CommandeLigne> commandeLignes) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.idUser = idUser;
        this.etat = etat;
        this.price = price;
        this.ShippingAdress = shippingAdress;
        this.paiementMethod = paiementMethod;
        //this.commandeLignes = commandeLignes;
    }
}
