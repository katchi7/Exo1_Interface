public class Segment implements Drawable,Moveable{
    private Point point1;
    private Point point2;
    private int color;
    public Segment(Point point1,Point point2,int color){
        this.color = color;
        this.point1 = point1;
        this.point2 = point2;
    }
    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public void draw() {

    }

    @Override
    public int getColor() {
        return color;
    }


    @Override
    public void translate(int dx, int dy) {
        point1.translate(dx,dy);
        point2.translate(dx,dy);

    }
}
