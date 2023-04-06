package example.aws.cicd.demo.service;

import example.aws.cicd.demo.model.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class WorkerService {
    private List<Worker> workers = List.of(new Worker(5, "Worker5", "e@a.com", "9876543210"),
            new Worker(1, "Worker1", "a@a.com", "9876543210"),
            new Worker(2, "Worker2", "b@a.com", "9876543201"),
            //new Worker(3, "Worker3", "c@a.com", "9876543120"),
            new Worker(4, "Worker4", "d@a.com", "9876542310"));

    public List<Worker> getAll() {
        log.info("********** Fetching All list *************");
        log.info("returning list: {}", workers);
        return workers;
    }

    public Worker getWorkerById(Integer id) {
        log.info("********** Fetching list by id *************");
        Worker worker = workers.stream().filter(w-> id == w.getId()).findFirst().orElse(new Worker());
        log.info("Worker returning: {}", worker);
        return worker;
    }
}
