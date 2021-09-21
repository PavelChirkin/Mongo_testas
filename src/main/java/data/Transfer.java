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
public class Transfer {
    private ObjectId id;
    //@BsonProperty("sender")
    private String name;
    //@BsonProperty("receiver")
    private String surname;
    //@BsonProperty("amount")
    private double balance;
}
