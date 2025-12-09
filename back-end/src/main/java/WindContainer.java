
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class WindContainer{
    List<Wind>winds = new ArrayList<>();
    Random random ;
    void addWhirlpool(Wind whirlpool){
        random = new Random();
        winds.add(whirlpool);
    }
    Point2D newRandomLocation(int x,int y){
        Wind whirlpool = winds.stream().filter(w->w.location.getX()==x&&w.location.getY()==y).collect(Collectors.toList()).getFirst();
        int index = winds.indexOf(whirlpool);
        int size = winds.size();
        int random = this.random.nextInt(0,size);
        if(random==index)random = (random+1)%size;
        Wind neWhirlpool = winds.get(random);  
        int nx= (int)neWhirlpool.getLocation().getX();
        int ny=(int)neWhirlpool.getLocation().getY();   
        System.out.println("Returning the index of random whirpool: "+random+", for whirlpool with index: "+index);     
        return new Point2D.Float(nx,ny);
    }
}