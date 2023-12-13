package tn.esprit.mscommande.RestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mscommande.DAO.entities.CommandeLigne;
import tn.esprit.mscommande.Service.CommandeLigneService;

import java.util.List;

@RestController
@RequestMapping("commandeLigneRestAPI")
public class CommandeLigneRestAPI {
    @Autowired
    private CommandeLigneService commandeLigneService ;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CommandeLigne>> commandeLigneListe(){
        return new ResponseEntity<>(commandeLigneService.findCommandeLigne(), HttpStatus.OK);
    }

    @PostMapping(value = "{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CommandeLigne addCommandeLigne(@RequestBody CommandeLigne commandeLigne ,@PathVariable("id") int idCommande){
        return commandeLigneService.createCommandeLigne(commandeLigne,idCommande);
    }
}
