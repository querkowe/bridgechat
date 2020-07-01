package org.example.Service;

import org.example.DTO.ChatUserDTO;

public interface MemberService {

    public void insert(ChatUserDTO user);
    public ChatUserDTO selectOne(long num);
    public void update(ChatUserDTO user);
    public void delete(long num);

}
