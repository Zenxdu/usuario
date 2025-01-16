package com.zenxdu.usuario.business;

import com.zenxdu.usuario.business.converter.UsuarioConverter;
import com.zenxdu.usuario.business.dto.UsuarioDTO;
import com.zenxdu.usuario.infrastructure.entity.Usuario;
import com.zenxdu.usuario.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);

        return usuarioConverter.paraUsuarioDTO(
                usuarioRepository.save(usuario)
        );
    }


}
