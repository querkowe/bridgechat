package org.example.DTO;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name="chat_user")
@AllArgsConstructor
@NoArgsConstructor
public class ChatUserDTO {
    @Id
    @GeneratedValue
    @NonNull private long num;
    @NonNull private String id;
    @NonNull private String pw;
    @NonNull private String name;
    @NonNull private String email;
    private String access_token;
    private String refresh_token;

}
