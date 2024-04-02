import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ScannerTools keyboard = new ScannerTools();
        System.out.println("Veuillez entrer le nombre de points :");
        int nbPoints = keyboard.nextInt();
        ArrayList<Point> points = new ArrayList<Point>();
        for (int i = 0; i < nbPoints; i++) {
            System.out.println("Veuillez entrer les coordonnées du point " + i + " :");
            double x = keyboard.nextDouble();
            double y = keyboard.nextDouble();
            points.add(new Point(x, y));
        }
        System.out.println(points.toString());

        
        Coordinate objet1 = new Coordinate();
        Coordinate objet2 = new Coordinate(objet1);
        System.out.println(objet1);
        System.out.println(objet2.toString());

        Point objet3 = new Point();
        Vector objet4 = new Vector();
        System.out.println(objet3);
        System.out.println(objet4);

        objet3.Move(objet4);
        System.out.println(objet3);
    }

}
