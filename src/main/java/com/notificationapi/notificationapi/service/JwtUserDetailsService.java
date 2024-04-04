package com.notificationapi.notificationapi.service;

import com.notificationapi.notificationapi.crossCutting.exception.NotificationException;
import com.notificationapi.notificationapi.domain.UsuarioDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    PasswordEncoder bcryptEnconder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioDomain usuario = usuarioService.findByCorreoElectronico(username);

        if(usuario.equals(null)){
            throw new UsernameNotFoundException("No se encontró ningun usuario con el siguiente nombre: "+ username);
        }else {
            return new org.springframework.security.core.userdetails.User(usuario.getCorreoElectronico(), usuario.getContraseña(),
                    new ArrayList<>());
        }
    }

    public void save(UsuarioDomain UsuarioDomain) throws NotificationException {
        UsuarioDomain.setContraseña(bcryptEnconder.encode(UsuarioDomain.getContraseña()));
        usuarioService.save(UsuarioDomain);
    }
}