package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;




/**
 * Cette classe représente un service web exposant des opérations mathématiques basiques.
 * Dans ce cas, il s'agit de la fonction de somme.
 */

public class CalculatriceWS {
  
    /**
     * Cette méthode calcule la somme de deux nombres.
     *
     * @param a Le premier nombre à ajouter.
     * @param b Le deuxième nombre à ajouter.
     * @return La somme des deux nombres.
     */
    
    public double somme( double a,double b) {
        return a + b;
    }	
}