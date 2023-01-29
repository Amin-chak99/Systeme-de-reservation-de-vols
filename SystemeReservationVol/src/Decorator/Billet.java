package Decorator;

import model.ReservationImpl;

public class Billet extends ReservationImpl {

    public double Price() {
        return 1200;
    }

    public String getDetails() {
        return " Billet";
    

}}
