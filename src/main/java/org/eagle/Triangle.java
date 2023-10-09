package org.eagle;

import org.eagle.Shape;

public class Triangle implements Shape {
    private final int length1;
    private final int length2;
    private final int length3;

    public Triangle(int length1, int length2, int length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double triangleEuclidean() {
        double result = (1.0/4.0)*Math.sqrt((this.length1+this.length2+this.length3)*(-this.length1+this.length2+this.length3)*(this.length1-this.length2+this.length3)*(this.length1+this.length2-this.length3));
        return result;
    }
}
