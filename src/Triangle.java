public class Triangle implements FigureGeometrique {
    private Point point1;
    private Point point2;
    private Point point3;
    private int color;
    public Triangle(Point point1,Point point2,Point point3,int color){
        this.color = color;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
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

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    @Override
    public void Dessigner() {
        // Methode li ka dessigner
    }

    @Override
    public void Deplasser(int x,int y) {
        point1.Deplacer(x,y);
        point2.Deplacer(x,y);
        point3.Deplacer(x,y);
    }
}
