package br.edu.ifpb.sd.rmi;

import java.rmi.*;
import java.rmi.registry.*;

/**
 * Hello world!
 *
 */
public class CalcClient {
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Registry registry = LocateRegistry.getRegistry(30000);
        ICalc calc = (ICalc) registry.lookup("calculadora");
        registry.lookup("calculadora");
        System.out.println(calc.add(2,3));
    }
    
}
