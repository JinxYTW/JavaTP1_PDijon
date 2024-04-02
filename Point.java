public class Point extends Coordinate {
    Point(){
        super();
    }
    Point(double x , double y){
        super(x,y);
    }
    Point(Point point){
        super(point);
    }
    void Move(Vector vector){
        this.x+=vector.getX();
        this.y+=vector.getY();
    }
}
