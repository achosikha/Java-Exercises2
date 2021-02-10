import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;
    private Server server;

    private DataInputStream in;
    private DataOutputStream out;
    private boolean running;

    private static int userNumber = 1;

    ClientHandler(Socket socket, Server server)
    {
        this.socket = socket;
        this.server = server;
        running = true;
    }

    @Override
    public void run() {
        try {
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());

            Thread.currentThread().setName("User " + userNumber++);

            System.out.println(Thread.currentThread().getName() + " start processing...");

            while (running)
            {
                String msg = in.readUTF();

                // String[] arrayStringIn = str.split ("]:", 2);
                // Поделить String на два элемента и сделать указателем ]:
                // проверить количество элементов в массиве, если два то
                // перебросить первую часть, как указатель на клиента, а
                // вторую, как непосредственно текст.

                if (msg.equals("/quit"))
                {
                    out.writeUTF(msg);
                } else
                {
                    server.broadCastMessage(msg);
                }
                System.out.println(Thread.currentThread().getName() + ": " + msg);
            }
        } catch (Exception e)
        {
            System.err.println("Handled connection was broken.");
            server.removeClient(this);
        }
    }

    public void sendMessage(String message) throws IOException {
            out.writeUTF(message);
            out.flush();
    }
}