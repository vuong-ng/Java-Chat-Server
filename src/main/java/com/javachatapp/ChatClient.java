package com.javachatapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.function.Consumer;

public class ChatClient {
    private Socket socket = null;
    private BufferedReader inputConsole = null;
    private PrintWriter out = null;
    private BufferedReader in = null;
    private Consumer<String> onMessageReceived;

    public ChatClient(String address, int port, Consumer<String> onMessageRecieved) throws IOException {
        this.socket = new Socket(address, port);
        System.out.println("Connected to the server");

        // takes in input from keyboard
        this.inputConsole = new BufferedReader(new InputStreamReader(System.in));
        // Takes input in buffer
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // Send input over the network
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.onMessageReceived = onMessageRecieved;
    }

    public void startClient() {
        new Thread(() ->{
            try {
                String line;
                while ( (line = in.readLine()) !=null) {
                onMessageReceived.accept(line);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void sendMessage(String message){
        out.println(message);
    }
    

}
