public class Point {
    int  abs;
    int ord;
    static int nombre;
    int numero;

    p Point(){
        abs=O;
        ord=0;
        nombre ++;

    }


    void setCoordonneePoint(int u, int v){
        abs=u;
        ord=v;
    }
    void translate(int u, int v){
        abs=abs+u;
        ord=ord+v;
    }
    public void AffichePoint(){
        System.out.println("l'ordonnee :"+ord+"l'abscisse:"+abs);
    }

     boolean origine(){
        return(abs == 0.0 )&( ord == 0.0);
    }
    public boolean egale(Point q){

        return(abs == q.abs)&( ord==q.ord);
    }
    void autrePoint(Point p2){
         abs=p2.abs;
         ord=p2.ord;
    }
    Point symetrie(){
         Point sp=new Point();
         sp.abs=0-abs;
         sp.ord=0-ord;
         return sp;
    }

}


