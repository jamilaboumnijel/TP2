public class Test {
    public static void main(String[] args){
        Point p=new Point();
        Point q=new Point();
                p.setCoordonneePoint( u: 15, v: 2);
                q.setCoordonneePoint( u: 14, v: 10);
        p.AffichePoint();
        q.AffichePoint();
        if (p.origine()){
            System.out.println("le p est l'orgine de repere");}
            else{
            System.out.println("le cordonnee de p non nule");}
        if(p.egale(q)){
            System.out.println("la point p egale la point q");}
            else{
            System.out.println("la point p differant a la point q");
        }
        p.AffichePoint();
        Point rs=p.symetrie();
        System.out.println("Le synetoie de cette point est "+rs.abs+","+rs.ord);
        System.out.println("Le nombre de point ="+Point.nombre);


    }
}
