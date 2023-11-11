package tn.esprit.mscommande.DAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mscommande.DAO.entities.Commande;
import tn.esprit.mscommande.DAO.entities.CommandeLigne;
//a tester et a faire
public interface CommandeLigneRepository  extends JpaRepository<CommandeLigne, Integer> {
}
