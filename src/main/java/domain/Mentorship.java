package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mentorship extends Content{

    private LocalDate date;

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20d;
    }
}
