public class Segment implements FigureGeometrique {
    private Point point1;
    private Point point2;
    private int color;
    public Segment(Point point1,Point point2,int color){
        this.color = color;
        this.point1 = point1;
        this.point2 = point2;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public int getColor() {
        return color;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    @Override
    public void Dessigner() {

    }

    @Override
    public void Deplasser(int x,int y) {
        point2.Deplacer(x,y);
        point1.Deplacer(x,y);
    }
}
