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

    public UsuarioCadastroDTO cadastrarUsuario(UsuarioCadastroDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        Usuario salvo = usuarioRepository.save(usuario);

        // Converte de volta para DTO
        UsuarioCadastroDTO respostaDTO = new UsuarioCadastroDTO();
        respostaDTO.setNome(salvo.getNome());
        respostaDTO.setEmail(salvo.getEmail());
        respostaDTO.setSenha(salvo.getSenha());

        return respostaDTO;
    }

}

