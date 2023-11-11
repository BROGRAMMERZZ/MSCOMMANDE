package tn.esprit.mscommande.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mscommande.DAO.entities.CommandeLigne;
import tn.esprit.mscommande.DAO.repositories.CommandeLigneRepository;
@Service
public class CommandeLigneService {
    @Autowired
    CommandeLigneRepository commandeLigneRepository ;

    public CommandeLigne createCommandeLigne(CommandeLigne commandeLigne){
        return commandeLigneRepository.save(commandeLigne);
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
