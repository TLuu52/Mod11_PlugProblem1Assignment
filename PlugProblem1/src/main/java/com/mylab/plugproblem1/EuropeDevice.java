package com.mylab.plugproblem1;

/**
 *
 * @author Thuan Luu
 */
public class EuropeDevice {
    
    private EuropeSocket europeanSocket;

    public EuropeDevice(EuropeSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    public void use() {
        europeanSocket.plugInEurope();
    }
    
}
