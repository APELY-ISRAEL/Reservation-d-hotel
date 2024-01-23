package projet.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import projet.web.models.Personne;
import projet.web.service.PersonneService;

import java.util.List;

@Controller
public class PersonneController {
    private final PersonneService personneService;

    @Autowired
    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }


     @GetMapping("/categorie")
    public String Categories() {
        return "layout";
    }
   /* @GetMapping("categorie/register")
    public String Registers() {
        return "register";
    }*/
   @GetMapping("/categorie/login")
   public String showLoginForm(Model model) {
       model.addAttribute("personne", new Personne());
       return "login";
   }
    @PostMapping("/categorie/login")
    public String processLogin(@ModelAttribute("personne") Personne personne) {
        // Logique de traitement du formulaire ici
        return "redirect:/categorie";
    }
     

   /*  @PostMapping("/accueil")
    public String listPersonne(Model model) {
        List<Personne> personnes = personneService.findAllPersonne();
        model.addAttribute("personnes", personnes);
        return "login";
    }*/

    @GetMapping("/categorie/register")
    public String createPersonne(Model model) {
        Personne personne = new Personne();  // Correction du nom de la variable
        model.addAttribute("personne", personne);  // Correction du nom de l'attribut
        return "register";
    }
    @PostMapping("/categorie/register")
    public String savePersonne(@ModelAttribute("personne") Personne personne){
         personneService.savePersonne(personne);
         return "redirect:/categorie";
    }
    @GetMapping("/categorie/chambre")
    public String Chambres() {
        return "chambre";
    }

}