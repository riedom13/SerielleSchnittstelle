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
public class SimpleSerial implements AutoCloseable{
    private SerialPort serialPort = null;
    private String portName;
    
    
    public SimpleSerial(String portName)
            throws Exception
    {
        final List<String> portNames = findSerialComms();
        if (!portNames.contains(portName))
            throw new Exception(String.format("Schnittstelle %s nicht gefunden", portName));
        this.portName = portName;
    }
    
    public void open()
            throws Exception
    {
        try
        {
        if(serialPort == null)
        serialPort = new SerialPort(portName);
        if(serialPort.isOpened())
            serialPort.openPort();
        
        }
        catch (Exception ex)
        {
            serialPort = null;
            throw ex; //Rethrow
        }
    }
    
    @Override
    public void close()
            throws Exception
    {
        if (serialPort != null)
        {
            if (serialPort.isOpened())
                serialPort.closePort();
        }
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
                
                // Test
                try (final SimpleSerial ser = new SimpleSerial(""))
                {
                    ser.open();
                System.out.println("GEWONNEN!!!");
                
                
                }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
            
    
}
