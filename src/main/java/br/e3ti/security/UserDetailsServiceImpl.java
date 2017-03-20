package br.e3ti.security;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.GrantedAuthority;

import br.e3ti.interfaces.UsuarioRepository;
import br.e3ti.model.Regra;
import br.e3ti.model.Usuario;

public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private UsuarioRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = userRepository.findByEmail(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Regra role : user.getRegras()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getNome()));
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getSenha(), grantedAuthorities);
    }
}