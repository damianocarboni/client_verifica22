package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("il client è partito");
        Socket s = new Socket("localhost", 3000);
        System.out.println("il client si è collegato");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        BufferedReader inTastiera = new BufferedReader(new InputStreamReader(System.in));
        String num;
        String messaggioRic;
        do {
            System.out.print("Inserisci il numero: ");
            num = inTastiera.readLine();
            out.writeBytes(num + "\n");
            messaggioRic = 

        } while (true);
        
    }
}
