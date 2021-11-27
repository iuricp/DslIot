# IotDsl

## Sobre o Projeto
Desenvolvimento de uma DSL (Linguagem de Domínio Específico) para explorar as possibilidades de gerenciar dispositivos IoT.

## Quais as vantagens/desvantagens de usar a DSL proposta?

## Exemplo prático de utilização
eventos
 abrir  
 iniciar
 fechar
 lotacaoMaxima 
 esvaziar 
 encerrar 
 end
 
resetEventos
 fechar
end

comandos
 ligarAr 
 desligarAr 
 ligarLuz 
 desligarLuz 
 diminuirTemp 
 aumentarTemp 
 test
 end

estado fechada
 acoes {desligarAr desligarLuz test}
 abrir => aberta
 end

estado aberta
 acoes {ligarAr ligarLuz}
 fechar => fechada
 iniciar => vazia
 end
 
estado vazia
 acoes {aumentarTemp}
 lotacaoMaxima => cheia
 encerrar => aberta
 end
 
estado cheia
 acoes {diminuirTemp}
 esvaziar => vazia
 end 
