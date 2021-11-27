# IotDsl

## Sobre o Projeto

Desenvolvimento de uma DSL (Linguagem de Domínio Específico) para explorar as possibilidades de gerenciar dispositivos IoT em um ambiente fechado no qual há a necessiade de controlar, por exemplo, controlardores de ar e luzes.

## Quais as vantagens/desvantagens de usar a DSL proposta?

## Exemplo de utilização


```
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
```

## Gramática

A gramática da linguagem está definida no arquivo MyDsl.xtext.

Ela consiste de nenhum ou várias entidades:
