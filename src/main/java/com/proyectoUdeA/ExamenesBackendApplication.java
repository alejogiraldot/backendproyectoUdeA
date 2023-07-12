package com.proyectoUdeA;

import com.proyectoUdeA.Entidades.Rol;
import com.proyectoUdeA.Entidades.Usuario;
import com.proyectoUdeA.Entidades.UsuarioRol;
import com.proyectoUdeA.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;
	public static void main(String[] args) {
		SpringApplication.run(ExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Usuario usuario = new Usuario();
		usuario.setNombre("Alejandro");
		usuario.setApellido("Giraldo");
		usuario.setPassword("123456");
		usuario.setEmail("Alej409@Hotmail.com");
		usuario.setTelefono("3023079497");
		usuario.setPerfil("Foto.jpg");

		Rol rol =new Rol();
		rol.setRolId(1L);
		rol.setNombre("Admin");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());
	*/
	}

}
