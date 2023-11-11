package tn.esprit.mscommande.RestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mscommande.DAO.entities.Commande;
import tn.esprit.mscommande.Service.CommandeService;

import java.util.List;

@RestController
@RequestMapping("commandeRestAPI")
public class CommandeRestAPI {

    @Autowired
    private CommandeService commandeService ;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<List<Commande>> CommandeListe(){
      return new ResponseEntity<>(commandeService.ListeCommande(),HttpStatus.OK);
    }

    @GetMapping(value = "{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Commande> commandeDetails(@PathVariable("id") int id){
        return new ResponseEntity<>(commandeService.commandeDetails(id),HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Commande> createCommande(@RequestBody Commande commande){
        return new ResponseEntity<>(commandeService.addCommande(commande),HttpStatus.OK);
    }

    @PutMapping(value="{id}/{status}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Commande> updateCommandeState(@PathVariable("id") int id ,
                                                        @PathVariable("status") String state){
        return new ResponseEntity<>(commandeService.updateCommandeState(id , state),HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public void DeleteCommande(@PathVariable("id") int id){
        commandeService.deleteCommande(id);
    }
}
