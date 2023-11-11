package tn.esprit.mscommande.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mscommande.DAO.entities.Commande;
import tn.esprit.mscommande.DAO.repositories.CommandeRepository;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository ;
    public Commande addCommande(Commande commande){

        return commandeRepository.save(commande);
    }
    public List<Commande> ListeCommande(){return commandeRepository.findAll();}
    public Commande updateCommandeState(int id , String state){
        Commande c = commandeRepository.findById(id).get();
        c.setEtat(state);
        return commandeRepository.save(c);
    }
    public void deleteCommande(int id){
        Commande c = commandeRepository.findById(id).get();
        commandeRepository.delete(c);

    }
    public Commande commandeDetails(int id){
        return commandeRepository.findById(id).get();
    }
}
