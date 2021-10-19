package com.bar.manager.exception;

public class DuplicateBartenderException extends RuntimeException{
    public DuplicateBartenderException (){
        super ("Bartender with this NIF already exists");
    }
    public DuplicateBartenderException (String message){
        super (message);
    }
}
