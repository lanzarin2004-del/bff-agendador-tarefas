package com.lanz.bffagendadortarefas.business;


import com.lanz.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.lanz.bffagendadortarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient client;

    public void enviaEmail(TarefasDTOResponse dto){
       client.enviarEmail(dto);
    }
}
