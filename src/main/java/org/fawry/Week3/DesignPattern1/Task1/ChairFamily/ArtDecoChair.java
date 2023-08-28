package org.fawry.Week3.DesignPattern1.Task1.ChairFamily;

import org.fawry.Week3.DesignPattern1.Task1.Furniture;

public class ArtDecoChair implements Furniture {

    @Override
    public void describe() {
        System.out.println("This is an Art Deco chair.");
    }
}
