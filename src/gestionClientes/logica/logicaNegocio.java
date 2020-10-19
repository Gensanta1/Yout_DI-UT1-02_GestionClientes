/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionClientes.logica;

import gestionClientes.dto.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nacho
 */
public class logicaNegocio {
    // defino un ArrayList para meter los clientes. Es static porque pertenece a la clase no a una instacia de un objeto
    private static List<Cliente> listaClientes = new ArrayList<>(); // Alt+Intro para importar 
    
    public static void aniadirCliente(Cliente cliente){ // creo el metodo para añadir clientes
        listaClientes.add(cliente); // agrego un cliente a la lista        
    }

    public static List<Cliente> getListaClientes() { // creo un getter (Alt+insertar) para recuperar la alista
        return listaClientes;
    }
    
    
    
}
