package Assigment_ca2213;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Staff Management System!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/success")
    public ResponseEntity<String> success() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "SuccessHeader");
        return ResponseEntity.ok()
                .headers(headers)
                .body("Request was successful!");
    }

    @GetMapping("/not-found")
    public ResponseEntity<String> notFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Error: Resource not found");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createResource() {
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Location", "/resource/1")
                .body("Resource created successfully!");
    }
}
