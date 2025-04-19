package nubank.services;

import nubank.dto.UsuarioCadastroDTO;
import nubank.entities.Usuario;
import nubank.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> retornarTodos() {
        return usuarioRepository.findAll();
    }


    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}

