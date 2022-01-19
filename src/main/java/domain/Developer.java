package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){

    }

    public void progress(){

    }

    public void calculateTotalXp(){

    }
}
