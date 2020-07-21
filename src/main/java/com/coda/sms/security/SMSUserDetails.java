//package com.coda.sms.security;
//
//import java.util.Collection;
//import org.springframework.util.StringUtils;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.coda.sms.dto.StudentDTO;
//
//@SuppressWarnings("serial")
//public class SMSUserDetails implements UserDetails{
//	private List<String> userRoles;
//	private  transient StudentDTO student;
//	
//	public SMSUserDetails(List<String> userRoles, StudentDTO student) {
//		super();
//		this.userRoles = userRoles;
//		this.student = student;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		String roles = StringUtils.collectionToCommaDelimitedString(userRoles);
//		return AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return student.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//			return student.getUserName();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//			return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//			return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//			return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//			return true;
//	}
//
//}
