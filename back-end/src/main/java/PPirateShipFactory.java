
public class PPirateShipFactory extends PirateFactory{
    @Override
    PirateShip createPirateShip(int x, int y,char type) {
        // TODO Auto-generated method stub
        if(type=='P')return new RapidPirateShip(x, y);
        else if (type=='Q')return new SlowPirateShip(x, y);
        return null;
    }
}
