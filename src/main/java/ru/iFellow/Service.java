package ru.iFellow;
import lombok.Data;

@Data
public class Service {
    private int x;
    private int id;
    private int squareX;

    public void setSquareX() {
        this.squareX = x * x;
    }

    public void setId(){
        this.id = Repository.getKey();
    }

    public void saveResult(){
        Repository.setResults(id, x*x);
    }
}
