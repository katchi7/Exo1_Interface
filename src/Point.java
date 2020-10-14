public class Point implements Moveable{
    private float x;
    private float y;
    //L constructeur utilise vraisemblablement(Itle9ha 3lina gha howa b francais dyaloo)
    public Point(float x,float y){
        this.x = x;this.y=y;
    }
    //Hadchii machi mouhim
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    //toString: had l methode predefinie l ga3 les objets o hiya li katkteb l objet fach kadwzzo l print
    @Override
    public String toString(){
        //Dertha katreturnee (x,y)
        return "("+x+","+y+")";
    }
    //Had l methode dyal deplacement

    @Override
    public void translate(int dx, int dy) {
        this.x +=dx;
        this.y +=dy;
    }
}
