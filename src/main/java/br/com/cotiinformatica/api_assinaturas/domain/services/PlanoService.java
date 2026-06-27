package br.com.cotiinformatica.api_assinaturas.domain.services;

import br.com.cotiinformatica.api_assinaturas.domain.dtos.requests.PlanoRequest;
import br.com.cotiinformatica.api_assinaturas.domain.dtos.responses.PlanoResponse;
import br.com.cotiinformatica.api_assinaturas.infrastructure.repositories.PlanoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanoService {

    private final PlanoRepository planoRepository;

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
