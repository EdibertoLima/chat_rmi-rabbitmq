/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.rmi.*;

/**
 *
 * @author ediberto
 */
interface IterfeceRemota extends Remote{
    public void EnviarMensagem(String nome,String men) throws RemoteException;
}
