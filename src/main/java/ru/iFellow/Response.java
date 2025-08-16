package ru.iFellow;

public class Response {

    public static String message(Integer square){
        return "Square: " + square.toString();
    }
    public static String message(Integer id, Integer square){
        return "ID: " + id.toString() + "\nSquare: " + square.toString();
    }
}
