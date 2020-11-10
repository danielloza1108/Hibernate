package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
    private final PersonDao personDao;

    public PersonController() {
        this.personDao = new PersonDao();
    }

    @RequestMapping("/addPerson")
    public String addPerson(){
        Personn person = new Personn("Daniel","Loza",'M');
        personDao.save(person);
        return "Id dodanej osoby to: " + person.getId();
    }
}
