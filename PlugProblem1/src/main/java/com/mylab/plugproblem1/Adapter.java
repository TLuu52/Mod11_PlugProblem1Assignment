package com.mylab.plugproblem1;

/**
 *
 * @author thuanluu
 */
public class Adapter {
    
    private AmericanPlug americanPlug;

    public Adapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    public void plugIntoEuropeanSocket() {
        System.out.println("Using an adapter to plug American plug into a European socket.");
        americanPlug.plugIn();
    }
}
