package com.mycompany.problem2;

/**
 *
 * @author Thuan Luu
 */
public class EuroDevice {
    
    private EuropeanSocket euroSocket;
    
    public EuroDevice(EuropeanSocket euroSocket){
        this.euroSocket = euroSocket;
    }
    
    public void use(){
        euroSocket.plugInEurope();
    }
}
