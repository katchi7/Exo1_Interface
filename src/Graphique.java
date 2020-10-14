import java.util.List;

public class Graphique {
    private static List<FigureGeometrique> Figures;
    public void addFigure(FigureGeometrique figure){
        Figures.add(figure);
    }

    public static void setFigures(List<FigureGeometrique> figures) {
        Figures = figures;
    }
    //3la 7ssab mafhemt hadchi li baghi mn question 2
    public static void Dessigner(){
        for(FigureGeometrique figure : Figures){
            figure.Dessigner();
        }
    }
}
