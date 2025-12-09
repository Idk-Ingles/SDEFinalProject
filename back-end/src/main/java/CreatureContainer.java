
import java.util.ArrayList;
import java.util.List;

class CreatureContainer implements Monster{
    int xfloor=16;
    int xceiling=19;
    int yfloor=8;
    int yceiling=11;
    List<Monster>whales;
    public CreatureContainer()
    {
        whales = new ArrayList();
    }
    public void addMonster(Monster monster){
        whales.add(monster);
    }
    @Override
    public void move(Game game) {
        // TODO Auto-generated method stub
        for(Monster monster: whales)monster.move(game);
    }
}
