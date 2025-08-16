package ru.iFellow;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Data
public class Service {
    private int x;
    private int id;


    public void square(){
        id = Repository.getKey();
        Repository.setResults(id, x*x);

    }

}
