
import java.awt.geom.Point2D;
class Wind {
    Point2D location;    
    public Wind(int x,int y){
        location=new Point2D.Float(x,y);
    }
    public Point2D getLocation(){
        return location;
    }
}
