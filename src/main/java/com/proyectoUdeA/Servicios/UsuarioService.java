package com.proyectoUdeA.Servicios;

import com.proyectoUdeA.Entidades.Usuario;
import com.proyectoUdeA.Entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Long usuarioId);
}
