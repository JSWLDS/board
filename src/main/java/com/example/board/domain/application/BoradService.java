package com.example.board.domain.application;

import com.example.board.domain.dao.MemberRepository;
import com.example.board.domain.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoradService {

    private final MemberRepository memberRepository;

    public void createMember(Member member) {
        memberRepository.save(member);
    }

    public List<Member> findMemberArgs() {
        return memberRepository.findAll();
    }

}
