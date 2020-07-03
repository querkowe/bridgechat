package org.example.Security;

import lombok.AllArgsConstructor;
import org.example.DTO.ChatUserDTO;
import org.example.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@AllArgsConstructor
public class UserPrincipalDetailsService implements UserDetailsService {

    @Autowired
    private MemberRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        ChatUserDTO user = this.repo.findById(username);


        return null;
    }
}
