package serveur;

import service.CalculatriceWS;


public class ServeurJWS {

	


	/**
	 * Cette classe est responsable de la publication d'un service web CalculatriceWS
	 * à une URL spécifiée.
	 */
	    public static void main(String[] args) {
	        String url = "http://localhost:8084/calculatrice"; // Spécifiez l'URL souhaitée pour le service web

	        // Créez une instance de votre service web
	        CalculatriceWS calculatrice = new CalculatriceWS();

	        // Publiez le service web à l'URL spécifiée
	        Endpoint.publish(url, calculatrice);

	        System.out.println("Service web publié à : " + url);
	    }
	}

