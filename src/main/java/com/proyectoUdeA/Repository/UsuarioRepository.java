package com.proyectoUdeA.Repository;

import com.proyectoUdeA.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String Username);
}
