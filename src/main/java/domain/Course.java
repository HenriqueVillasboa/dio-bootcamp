package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course extends Content{

    private Integer workload;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workload;
    }
}
