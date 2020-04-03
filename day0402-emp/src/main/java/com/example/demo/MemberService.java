package com.example.demo;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.db.Member100Manager;
import com.example.demo.vo.Member100Vo;

@Service
public class MemberService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Member100Vo m = Member100Manager.selectMemner(username);
		if(m == null) {
			throw new UsernameNotFoundException(username);
		}
		
		return User.builder().username(username).password(m.getPwd()).roles(m.getRole()).build();
	}

}
