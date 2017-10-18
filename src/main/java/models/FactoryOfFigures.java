package models;

import models.Figures.*;
import models.Interfaces.Figure;

public class FactoryOfFigures {
    public Figure getFigure(FiguresEnum figure){
        if (figure == FiguresEnum.line){
            return new Line();
        }else if (figure == FiguresEnum.square){
            return new Square();
        }else if (figure == FiguresEnum.circle){
            return new Circle();
        }else if (figure == FiguresEnum.heart){
            return new Heart();
        }else if (figure == FiguresEnum.rhombus){
            return new Rhombus();
        }
        else return null;
    }
}
