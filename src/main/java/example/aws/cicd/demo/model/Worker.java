package example.aws.cicd.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    private int id;
    private String name;
    private String email;
    private String mobile_number;
}
