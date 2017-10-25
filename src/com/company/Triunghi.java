package com.company;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Nightingale on 2017-10-25.
 */
public class Triunghi {


    Point a,b,c;
    ArrayList<Point> puncte; //vector dinamic, ca si list in python, don't worry about it

    Triunghi(Point m, Point n, Point p){
        a=m;
        b=n;
        c=p;
        puncte = new ArrayList<Point>();
        calculeazaPuncte();
    }

    public void aranjeazaDupaX(){
        int aux;
        if(a.x>b.x){
            aux=a.x;
            a.x=b.x;
            b.x=aux;
        }
        if(a.x>c.x){
            aux=a.x;
            a.x=c.x;
            c.x=aux;
        }
        if(b.x>c.x){
            aux=b.x;
            b.x=c.x;
            c.x=aux;
        }
    }

   public void calculeazaPuncte(){
        aranjeazaDupaX();
        //mai intai facem rost de numere intregi
        int x1=(int)a.x; //nus sigur ca ar functiona si pe numere negative, ai grija
        int x2=(int)b.x;
        int y1=0;
        int y2=0;
        Linie linie1 = new Linie(a,c);
        Linie linie2 = new Linie(a,b);
        //prima jumatate
        // i merge pe orizontal
        for(int i=x1;i<=x2;i++){
            y1=(int)linie1.calculeazaY((double)i);
            y2=(int)linie2.calculeazaY((double)i);
            //j merge pe vertical
            for(int j=y1;j<=y2;j++)
                puncte.add(new Point(i,j));
        }
        //trecem la a doua jumatate
        x1= b.x;
        x2 = c.x;
        linie2 = new Linie(b,c);
        for(int i=x1;i<=x2;i++){
            y1=(int)linie1.calculeazaY((double)i);
            y2=(int)linie2.calculeazaY((double)i);
            //j merge pe vertical
            for(int j=y1;j<=y2;j++)
                puncte.add(new Point(i,j));
        }
        //job done
    }
}
