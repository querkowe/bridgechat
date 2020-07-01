package org.example.Service;

import org.example.DTO.ChatUserDTO;
import org.example.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository repo;

    @Override
    public void insert(ChatUserDTO user) {
        repo.save(user);
    }

    @Override
    public ChatUserDTO selectOne(long num) {

        return (ChatUserDTO) repo.findById(num).get();
    }

    @Override
    public void update(ChatUserDTO user) {
        repo.save(user);
    }

    @Override
    public void delete(long num) {
        repo.delete(num);
    }
}
