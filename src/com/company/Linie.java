package com.company;
import java.awt.*;

/**
 * Created by Nightingale on 2017-10-25.
 */



public class Linie {


    double x1, y1, m;

    Linie(Point punct1, Point punct2){
        x1=punct1.x;
        y1=punct1.y;
        m=(punct2.y-punct1.y)/(punct2.x-punct1.x);
    }

    double calculeazaY(double x){
        return(m*x-m*x1+y1);
    }


}