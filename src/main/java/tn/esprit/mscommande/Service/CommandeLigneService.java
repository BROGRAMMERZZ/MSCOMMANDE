package tn.esprit.mscommande.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mscommande.DAO.entities.Commande;
import tn.esprit.mscommande.DAO.entities.CommandeLigne;
import tn.esprit.mscommande.DAO.repositories.CommandeLigneRepository;
import tn.esprit.mscommande.DAO.repositories.CommandeRepository;

import java.util.List;

@Service
public class CommandeLigneService {
    @Autowired
    CommandeLigneRepository commandeLigneRepository ;
    @Autowired
    CommandeRepository commandeRepository;
    public List<CommandeLigne> findCommandeLigne(){
        return commandeLigneRepository.findAll();
    }
    public CommandeLigne createCommandeLigne(CommandeLigne commandeLigne , int commandeId){
        Commande commande = commandeRepository.findById(commandeId).get();
        commande.getCommandeLignes().add(commandeLigne);
        commandeRepository.save(commande);
        return  commandeLigneRepository.save(commandeLigne);
    }

    public void deleteCommandeLigne(int id){
        commandeLigneRepository.delete(commandeLigneRepository.findById(id).get());
    }

    public CommandeLigne updateCommandeQte(int id , int qte){
        CommandeLigne commandeLigne = commandeLigneRepository.findById(id).get();
        commandeLigne.setQte(qte);
        return commandeLigneRepository.save(commandeLigne);
    }
}
