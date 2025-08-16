package ru.iFellow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Controller {
    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
    @GetMapping(value = "/api/square/{id}")
    public ResponseEntity<?> getSquare(@PathVariable int id) {
        Integer query = Repository.getResults(id);
        if (query == null){
            throw new SquareNotFoundException("Значение с ID " + id + " не найдено.");
        }
        else {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(Response.message(query));
        }
    }

    @PostMapping("/api/square")
    public ResponseEntity<?> setSquare(@RequestBody Service service){
        service.setSquareX();
        service.setId();
        service.saveResult();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Response.message(service.getId(), service.getSquareX()));
    }
}
