package object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter

public class Pen {
    private final  String firm;
    private String color;
    private double diameter;

    @Override
    public String toString() {
        return "Ручка фирмы \'" + firm + '\'' +
                ", color='" + color + '\''
                ;


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof  Pen)) return false;
        Pen pen = (Pen) o;

        if (Double.compare(pen.diameter, diameter) != 0) return false;
          if (!firm.equals(pen.firm)) return false;
          if (color != null ) return color.equals(pen.color);
                return pen.color == null;
    }

    @Override
    public int hashCode() {
        return firm.hashCode();
    }


}
