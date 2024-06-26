package springPractice.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springPractice.demo.controller.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
