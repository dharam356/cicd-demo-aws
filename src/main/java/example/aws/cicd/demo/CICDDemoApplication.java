package example.aws.cicd.demo;

import example.aws.cicd.demo.model.Worker;
import example.aws.cicd.demo.service.WorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@Slf4j
public class CICDDemoApplication {
    @Autowired
    private WorkerService service;

    public static void main(String[] args) {
        SpringApplication.run(CICDDemoApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity<String> getRequestTest() {
        return ResponseEntity.ok("Welcome");
    }

    @GetMapping("/workers")
    public ResponseEntity<List<Worker>> getAllWorkers() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/workers/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getWorkerById(id));
    }
}
