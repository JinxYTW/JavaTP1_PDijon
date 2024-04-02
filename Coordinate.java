public class Coordinate{
    //Attribut de la classe
    protected double x ;
    protected double y;
    //Constructeur de la classe 
    Coordinate(){
        this.x=1;
        this.y=2;
    }
    Coordinate(double x , double y){
        this.x=x;
        this.y=y;
    }
    Coordinate(Coordinate coordinate){
        this.x=coordinate.x;
        this.y=coordinate.y;
    }
    //Methode de la classe
    public String toString(){
        return this.x+" " +this.y;
    }
    
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    void set(double x,double y){
        x=this.x;
        y=this.y;

    }

    }
