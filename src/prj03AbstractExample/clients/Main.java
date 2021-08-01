package prj03AbstractExample.clients;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Individual(789111, 10000.0));
        clients.add(new Entity(456111, 50000.0));
        clients.add(new Entreprenuer(123111, 35000.0));

        printClients(clients);

        clients.get(0).withdrawal(9500.0);
        clients.get(1).withdrawal(40000.0);
        clients.get(2).replenishment(500);

        printClients(clients);
    }

    public static void printClients(ArrayList<Client> clients){
        for(Client client : clients){
            client.printInfoAccount();
        }
    }
}
