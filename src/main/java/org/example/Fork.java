package org.example;

public class Fork {
    private boolean isAvailable;
    public Fork(){ setToAvailable(); }
    public boolean isAvailable(){ return isAvailable; }
    public void setToAvailable(){ isAvailable=true; }
    public void setToNotAvailable(){ isAvailable=false; }
}
