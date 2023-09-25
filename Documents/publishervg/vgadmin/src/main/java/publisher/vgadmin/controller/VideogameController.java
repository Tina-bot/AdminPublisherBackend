package publisher.vgadmin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import publisher.vgadmin.exception.ResourceNotFoundException;
import publisher.vgadmin.model.Videogame;
import publisher.vgadmin.repository.VideogameRepository;

@CrossOrigin("http://localhost:5173/")
@RestController
@RequestMapping("/api/v1")
public class VideogameController {

    @Autowired
    private VideogameRepository videogameRepository;

    @GetMapping("/videogames")
    public List<Videogame> listVideogames() {
        return videogameRepository.findAll();
    }

    @PostMapping("/videogames")
    public Videogame saveVideogame(@RequestBody Videogame videogame) {
        return videogameRepository.save(videogame);
    }

    @GetMapping("/videogames/{id}")
    public ResponseEntity<Videogame> listVideogameById(@PathVariable Long id) {
        Videogame videogame = videogameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("id :" + id + "not exist"));
        return ResponseEntity.ok(videogame);
    }

    @PutMapping("/videogames/{id}")
    public ResponseEntity<Videogame> updateVideogame(@PathVariable Long id, @RequestBody Videogame videogameRequest) {
        Videogame videogame = videogameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("id :" + id + "not exist"));

        videogame.setTitle(videogameRequest.getTitle());
        videogame.setGenre(videogameRequest.getGenre());
        videogame.setPrice(videogameRequest.getPrice());

        Videogame videogameUpdated = videogameRepository.save(videogame);
        return ResponseEntity.ok(videogameUpdated);
    }

    @DeleteMapping("/videogames/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteVideogame(@PathVariable Long id) {
        Videogame videogame = videogameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("id :" + id + "not exist"));
        videogameRepository.delete(videogame);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
