package br.com.cotiinformatica.api_assinaturas.domain.services;

import br.com.cotiinformatica.api_assinaturas.domain.dtos.requests.PlanoRequest;
import br.com.cotiinformatica.api_assinaturas.domain.dtos.responses.PlanoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {

    public PlanoResponse criarPlano(PlanoRequest request) throws Exception {
        return null;
    }

    public PlanoResponse alterarPlano(Integer id, PlanoRequest request) throws Exception {
        return null;
    }

    public PlanoResponse excluirPlano(Integer id) throws Exception {
        return null;
    }

    public List<PlanoResponse> consultarPlanos() throws Exception {
        return null;
    }

    public PlanoResponse obterPlano(Integer id) throws Exception {
        return null;
    }
}
