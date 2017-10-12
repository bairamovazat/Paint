package models;

import models.Figures.Line;
import models.Figures.Square;
import models.Interfaces.Figure;

public class FactoryOfFigures {
    public Figure getFigure(FiguresEnum figure){
        if (figure == FiguresEnum.line){
            return new Line();
        }else if (figure == FiguresEnum.square){
            return new Square();
        }
        else return null;
    }
}
