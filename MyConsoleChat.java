import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyConsoleChat {
    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(8189))
            {
                System.out.println("Server is Online...");
                Socket socket = serverSocket.accept();
                System.out.println("Client has connected.");

                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                while (true)
                {
                    if (in.readUTF().equalsIgnoreCase("/end"))
                    {
                        break;
                    }
                    out.writeUTF("Server: " + in.readUTF());
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        });
        serverThread.start();

        try (Socket socket = new Socket("localhost", 8189))
        {
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            output.writeUTF("Client: " + input.readUTF());
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
