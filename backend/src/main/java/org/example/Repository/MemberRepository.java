package org.example.Repository;

import org.example.DTO.ChatUserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<ChatUserDTO, Long> {

}
