package models.Interfaces;

import java.awt.*;

public interface BasicOperationsWithFigures {

    void setColor(Color color);

    void setSize(int x, int y, int x2, int y2);

    void setFirstPoint(int x, int y);

    void setSecondPoint(int x, int y);

    void setBackgroundColor(Color color);

    void setStroke(Stroke stroke);

    void paintComponents(Graphics g);
}
