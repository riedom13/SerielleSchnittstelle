/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01.serial;

import java.util.*;
import jssc.*;
/**
 *
 * @author Dominik
 */
public class SimpleSerial {
    
    public SimpleSerial(String portName)
            throws Exception
    {
        
    }
    public final static List<String> findSerialComms()
    {
        return Arrays.asList(SerialPortList.getPortNames());
    }
    
    public static void main(String[] args) {
        try
        {
                final List <String> comms = new ArrayList<>();
                System.out.format("%d Schnittstellen gefunden:%n",comms.size());
                for (String comm: comms)
                    System.out.println(comm);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
            
    
}
