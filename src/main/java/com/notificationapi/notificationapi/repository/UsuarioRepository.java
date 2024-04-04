package com.notificationapi.notificationapi.repository;

import com.notificationapi.notificationapi.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, UUID> {

    UsuarioEntity findByCorreoElectronico(String correoElectronico);
}
