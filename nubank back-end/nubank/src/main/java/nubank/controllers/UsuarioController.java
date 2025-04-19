package nubank.controllers;

import nubank.dto.UsuarioCadastroDTO;
import nubank.entities.Usuario;
import nubank.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody UsuarioCadastroDTO dto) {
        Usuario usuario = dto.toEntity();
        Usuario salvo = usuarioService.salvar(usuario);
        return ResponseEntity.ok(salvo);
    }


}
