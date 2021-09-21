package utilities;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import client.MongoClientProvider;
import data.Transfer;
import data.User;

import java.util.List;


public class DbUtilities {

    public  void insertUser(User user) {
        try(MongoClient client = MongoClientProvider.getClient()) {
            MongoDatabase mongoDatabase = client.getDatabase("LbaDatabase");
            MongoCollection<User> collection = mongoDatabase.getCollection("users", User.class);

            collection.insertOne(user);

        }
        System.out.println("User inserted");
    }
    public  void insertTransfer(Transfer transfer) {
        try(MongoClient client = MongoClientProvider.getClient()) {
            MongoDatabase mongoDatabase = client.getDatabase("LbaDatabase");
            MongoCollection<Transfer> collection = mongoDatabase.getCollection("transfers", Transfer.class);

            collection.insertOne(transfer);

        }
        System.out.println("Transfer inserted");
    }
}
