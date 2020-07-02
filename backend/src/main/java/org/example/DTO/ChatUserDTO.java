package org.example.DTO;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="chat_user",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
})
@AllArgsConstructor
@NoArgsConstructor
public class ChatUserDTO implements Serializable {
    @Id
    @GeneratedValue
    private long num;
    @NonNull
    private String id;
    @NonNull
    private String pw;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private String access_token;
    private String refresh_token;

}
