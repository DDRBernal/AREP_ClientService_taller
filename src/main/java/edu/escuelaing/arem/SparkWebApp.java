package edu.escuelaing.arem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class SparkWebApp {

    public static void main(String[] args) throws MalformedURLException {
        try {
            URL mysite = new URL("http://ldbn.escuelaing.edu.co:80/");
            System.out.println("Protocol: " + mysite.getProtocol());
            System.out.println("Protocol: " + mysite.getAuthority());
            System.out.println("Protocol: " + mysite.getHost());
            System.out.println("Protocol: " + mysite.getPort());
            System.out.println("Protocol: " + mysite.getPath());
            System.out.println("Protocol: " + mysite.getQuery());
            System.out.println("Protocol: " + mysite.getFile());
            System.out.println("Protocol: " + mysite.getRef());
        } catch (MalformedURLException e) {
        }

        /*
            Celle-ci comment un browser fonctionne
         */
        URL google = new URL("http://www.google.com/");
        try (BufferedReader reader
                     = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

}