package br.edu.ifpb.sd.rmi;

import java.rmi.*;
/**
 * Hello world!
 *
 */
public class Calc implements ICalc {
    public int add(int x, int y) throws RemoteException{
        return (x+y);
    }
    public int mult(int x, int y) throws RemoteException{
        return (x*y);
    }
}
