package br.com.cotiinformatica.api_assinaturas.domain.dtos.requests;

public record PlanoRequest(
        String plano,
        String descricao,
        Double preco
) {
}