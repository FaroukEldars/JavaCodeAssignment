package Session06;

import Session04.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return getLength() * 4;
    }

}