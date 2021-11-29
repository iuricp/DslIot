# IotDsl

## Sobre o Projeto

As Linguagens Específicas de Domínio (DSL) tornaram-se uma ferramenta onipresente para fornecer abstrações poderosas para casos de uso específicos. Várias linguagens que temos contato e utilizamos são linguagens deste tipo, tais como: sql, html, xml e várias outras. Dentre as possiveis aplicições podemos apontar a Internet das Coisas ou IoT, que é "um conceito que se refere à interconexão digital de objetos cotidianos com a internet, conexão dos objetos mais do que das pessoas." (Wikipédia). Esta área está em grande expansão e carece de amadurecimento em várias vertentes, desde o aspecto tecnologico até o aspecto de modelos de provesso voltados para a gestão de Iot nas empresas. E é justamente por isso tambem que possui um vasto campo de oportunidades.

Imagine, a título de exmeplo, um local, publico ou privado, que tenha um fluxo significativo de pessoas. Estes usuários podem permanecer por longos periodos de tempo ou podem simplismente passar pelo local. Imagine ainda ter que gerenciar a temperatura e luminosidade neste ambiente com tanto dinamismo. Não seria interessante então uma maneira automatizar essa configuração de dispositivos e é aqui que entra nossa linguagem? 

Diante deste contexto, este projeto tem por objetivo o desenvolvimento de uma DSL (Linguagem de Domínio Específico) para explorar as possibilidades de gerenciar dispositivos IoT em um ambiente fechado no qual há a necessiade de controlar dispositicos (inteligentes) para oferecer uma melhor experiência ao usuário que este espaço frequenta. A liguagem proposta facilita a gestão dos dispositivos dos ambientes uma vez que permite os responsáveis rapidamente alterar o estado dos dispositivos com base em eventos.

## Exemplo de utilização

Abaixo pode-se ver o exmeplo de aplicação da DSL prosposta. 

![image](https://user-images.githubusercontent.com/6883715/143666327-9868a57c-33b5-432c-9e92-5b5bed8704b4.png)

Neste exemplo em particular, tomou-se por contexto uma biblioteca pública e seus diversos estados, eventos, as possíveis ações que podem ser adotas por seus gestores e como se dão as transições de estados. Deste modo, os possives estados são: fechado, aberto, vazia e cheia. As transições se baseiam nos eventos, ao lotar, por exemplo, a biblioca passa do estado vazia para cheia. Além disso, cada estado tem uma ação associada. Ao ficar cheia, a temperatura da biblioteca baixa, ou seja quanto mais pessoas no embiente mais quente ele deverá ficar e por isso devemos buscar baixar a temperatura do local para que aquela fique agradaavél para os usuários. 

O usuário da linguagem pode, portanto, configurar o sistema para que ele reaja a diferentes estímulos e a cada transição execute um conjunto de ações. Abaixo podemos observar a linguagem em pleno funcionamento, com o gestor inseririndo os eventos e os sistema então mudando de estado e executando as ações desiginadas:

![image](https://user-images.githubusercontent.com/6883715/143666298-9c4cb6d2-c916-4a8a-bffa-c527c399aae1.png)

## Gramática

A gramática da linguagem está definida no arquivo MyDsl.xtext.

![image](https://user-images.githubusercontent.com/6883715/143794092-ca6ba7ba-4296-44e5-8879-b0e66fe0b471.png)

Basicamente temos eventos, comandos (ou ações), estados e transições (linhas 16 a 29). O IotDsl consite na especificação destes elementos (linhas 7 a 13) conforme mostrado  acima no exemplo.

## Trabalhos futuros

Como trabalhos futuros pretende-se:

- insirir a possibilidade de adicionar, gerenciar e configurar os dispositivos;
- adicionar e gerenciar mais de um ambiente relacionando-os aos respctivos dispositivos;
- utilizar um simulador para simular estimulos externos ao sistema e com isto;
- automarizar as transições de estados como base nestes estímulos;
- gerar relatórios sobre o comportamento do(s) ambiente(s).

Este trabalho foi elaborado Iuri Cabral Paiva durante a disicplina Linguagens de Domínio Específico do Mestrado Profissional no ambito do Programa de Pós-graduação em Tecnologia da Informação (PPgTI) da Universidade Federal do Rio Grande do Norte (UFRN).
