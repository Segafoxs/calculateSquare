package ru.iFellow;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Controller {
    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
    @GetMapping(value = "/getSquare/{id}")
    public Integer getSquare(@PathVariable int id) {
        Integer query = Repository.getResults(id);
        if (query == null){
            return 0;
        }
        else {
            return query;
        }
    }

    @PostMapping("/api/square")
    public Integer setSquare(@RequestBody Service service){
        service.square();
        return service.getId();
    }
}
