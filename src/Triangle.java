public class Triangle implements Drawable,Moveable {
    private Segment segment1;
    private Segment segment2;
    private Segment segment3;
    private int color;
    public Triangle(Point point1,Point point2,Point point3,int color){
        this.color = color;
        this.segment1 = new Segment(point1,point2,color);
        this.segment2 = new Segment(point2,point3,color);
        this.segment3 = new Segment(point3,point1,color);
    }
    @Override
    public void setColor(int color) {
        this.color = color;
    }
    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void draw() {

    }





    @Override
    public void translate(int dx, int dy) {
        segment1.translate(dx,dy);
        segment2.translate(dx,dy);
        segment3.translate(dx,dy);
    }
}
