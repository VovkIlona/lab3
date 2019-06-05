package ua.lviv.iot.lamps.models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Lamps")
public class LampsControler {
  @Autowired
  LampsRepository lampsRepository;
 
  @GetMapping("/Lamps")
  public List getLamps() {
    return  (List) lampsRepository.findAll();
  }

  @GetMapping("/Lamps/{id}")
  public Lamps getLamps(@PathVariable Integer id) {
    return lampsRepository.findById(id).get();
  }

  
  @PostMapping("/Lamps")
    public Lamps createLamps(@RequestBody Lamps fishProducts) {
      Lamps savedLamps = lampsRepository.save(fishProducts);
    return savedLamps;
  }
  
  @PutMapping("/Lamps/{id}")
   public  Lamps updateLamps(
      @RequestBody Lamps changedLamps, @PathVariable Integer id) {
    lampsRepository.save(changedLamps);
    return changedLamps;
  }
  
  @DeleteMapping("/Lamps/{id}")
  public String deleteLamps(@PathVariable Integer id) {
    lampsRepository.deleteById(id);
    return String.format("Lamps id #%d successfully deleted", id);
  }
  
}
