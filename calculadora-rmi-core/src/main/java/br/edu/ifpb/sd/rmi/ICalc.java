package br.edu.ifpb.sd.rmi;

import java.rmi.*;
/**
 * Hello world!
 *
 */
public interface ICalc extends Remote{
    public int add(int x, int y) throws RemoteException;
    public int mult(int x, int y) throws RemoteException;
}
