package jpabook.jpashop;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemberRepositoryTest {

//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    @Transactional
//    public void testMember() {
//        Member member = new Member();
//        member.setUsername("memberA");
//
//        Long saveId = memberRepository.save(member);
//
//        Member findMember = memberRepository.find(saveId);
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//        Assertions.assertThat(findMember).isEqualTo(member);
//    }
}