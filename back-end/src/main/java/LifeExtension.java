public class LifeExtension implements Life{
    private Life life;
    @Override
    public void addLife() {
        // TODO Auto-generated method stub
        if(this.life == null){
            this.life = new LifeExtension();
            System.out.println("Added shield constructor");
        }
        else{
            life.addLife();
            System.out.println("Added shield extra");
        } 
    }
    @Override
    public void reduceLife() {
        // TODO Auto-generated method stub
    if (this.life != null && this.life.getLife() == null) 
         this.life = null;
     else{
         life.reduceLife();
     }
     System.out.println("Reduced shield");
    }

    @Override
    public Life getLife() {
        // TODO Auto-generated method stub
        return life;
    }
}
