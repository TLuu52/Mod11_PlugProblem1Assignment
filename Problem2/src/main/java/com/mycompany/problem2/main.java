package com.mycompany.problem2;

/**
 *
 * @author Thuan Luu
 */
public class main {
    
    public static void main(String[] args) {
        
        AmericanPlug americanPlug = new AmericanSocket();
        EuropeanSocket europeanSocket = new EuropeAdapter(americanPlug);
        EuroDevice europeanDevice = new EuroDevice(europeanSocket);
        europeanDevice.use();
    }
    
}
