
import java.awt.geom.Point2D;
import java.util.Observer;
interface PirateShip extends Observer{
    Point2D movePirateShip(char[][] oceanGrid,ChristopherColumbusShip ship,Game game);
    Point2D getPirateLocation();
}
