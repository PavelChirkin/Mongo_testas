package data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private ObjectId id;
    //@BsonProperty("name")
    private String name;
    //@BsonProperty("surname")
    private String surname;
    //@BsonProperty("Balance")
    private double balance;
}