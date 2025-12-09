import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.InputMismatchException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class FastPirateShipTest {
@Rule
  public final ExpectedException exception = ExpectedException.none();
    @Test
    public void movePirateShipTest(){
        Game game = new Game();
        game.addChristopherColumbusShip(15,15);
        PirateShip pirate = game.addPirateShips(10, 12,'P');
        ChristopherColumbusShip ship = game.getChristopherColumbusShip();
        ship.moveNorth(game);
        Point2D pirateLocation=pirate.getPirateLocation();
        assertEquals(pirateLocation,new Point2D.Float(11,13));
    }
    @Test
    public void movePirateShipWithObstacleTest(){
        Game game = new Game();
        game.addChristopherColumbusShip(10,12);
        PirateShip pirate = game.addPirateShips(15,17,'P');
        ChristopherColumbusShip ship = game.getChristopherColumbusShip();
        game.addIslands(14,16);
        ship.moveEast(game);
        Point2D pirateLocation = pirate.getPirateLocation();
        assertNotEquals(pirateLocation,new Point2D.Float(14,16));
    }
    @Test
    public void createPirateShipTest(){
        Game game = new Game();
        exception.expect(InputMismatchException.class);        
        game.addPirateShips(20, 2,'P');
    }
    @Test
    public void avoidPirateShipCollisionTest(){
        Game game = new Game();
        game.addChristopherColumbusShip(8,10);
        PirateShip pirate1 = game.addPirateShips(10,10,'P');
        PirateShip pirate2 = game.addPirateShips(10,11,'P');
        ChristopherColumbusShip ship = game.getChristopherColumbusShip();
        ship.moveNorth(game);
        Point2D pirate1Location = pirate1.getPirateLocation();
        Point2D pirate2Location = pirate2.getPirateLocation();
        assertNotEquals(pirate1Location,pirate2Location);
    }
    @Test
    public void captureColumbusTest(){
        Game game = new Game();
        game.addChristopherColumbusShip(13,17);
        PirateShip pirateShip = game.addPirateShips(13, 16,'P');
        ChristopherColumbusShip ship = game.getChristopherColumbusShip();
        ship.moveSouth(game);
        assertEquals(game.getWinner(),"Pirate");
    }
    @Test
    public void pirateEntersWhirlpoolTest(){
        Game game = new Game();
        game.addChristopherColumbusShip(17,9);
        PirateShip pirate = game.addPirateShips(9, 15, 'P');
        game.addWind(10, 16);
        ChristopherColumbusShip ship = game.getChristopherColumbusShip();
        ship.moveWest(game);
        Point2D pirateLocation = pirate.getPirateLocation();
        assertNotEquals(new Point2D.Float(10,16),pirateLocation);
        assertNotEquals(new Point2D.Float(11,16),pirateLocation);
        assertNotEquals(new Point2D.Float(12,16),pirateLocation);
        assertNotEquals(new Point2D.Float(10,17),pirateLocation);
        assertNotEquals(new Point2D.Float(10,15),pirateLocation);
    }
    @Test
    public void pirateEntersWhirlpoolWithObstaclesTest(){
        Game game = new Game();
        game.addChristopherColumbusShip(17,9);
        PirateShip pirate = game.addPirateShips(9, 15, 'P');
        game.addWind(10, 14);
        game.addWind(15, 10);
        game.addIslands(16, 10);
        game.addIslands(14, 10);
        game.addIslands(15, 11);
        ChristopherColumbusShip ship = game.getChristopherColumbusShip();
        ship.moveWest(game);
        Point2D pirateLocation = pirate.getPirateLocation();
        assertEquals(pirateLocation,new Point2D.Float(15,9));
    }
}
