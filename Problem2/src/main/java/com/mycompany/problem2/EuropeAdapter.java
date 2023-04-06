package com.mycompany.problem2;

/**
 *
 * @author Luuth
 */
public class EuropeAdapter implements EuropeanSocket {
    
    private AmericanPlug americanPlug;

    public EuropeAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void plugInEurope() {
        System.out.println("Plugged in with an adapter");
    }
    
}
