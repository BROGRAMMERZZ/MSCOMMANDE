package tn.esprit.mscommande.DAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mscommande.DAO.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
