package br.com.cotiinformatica.api_assinaturas.domain.services;

import br.com.cotiinformatica.api_assinaturas.domain.dtos.requests.ClienteRequest;
import br.com.cotiinformatica.api_assinaturas.domain.dtos.responses.ClienteResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    public ClienteResponse criarCliente(ClienteRequest request) throws Exception {
        return null;
    }

    public ClienteResponse alterarCliente(Integer id, ClienteRequest request) throws Exception {
        return null;
    }

    public ClienteResponse excluirCliente(Integer id) throws Exception {
        return null;
    }

    public List<ClienteResponse> consultarClientes() throws Exception {
        return null;
    }

    public ClienteResponse obterCliente(Integer id) throws Exception {
        return null;
    }
}