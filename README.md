## DISCIPLINA TESTE DE SOFTWARE
## **ANDERSON COSTA MOREIRA SANTANA**
### ATIVIDADE 1

## **TUTORIAL**

&nbsp;&nbsp;&nbsp;Descrição das etapas percorridas para conclusão da atividade.

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Nesta atividade foi selecionada uma pergunta do site Stack Overflow em que a busca pela atividade foi baseada em alguns critérios sugeridos pelo professor, são eles: número de votos acima de 400, ordem decrescente de pontuação (“Highest score”), filtro usado “[unit-testing] or [junit]”, no seguinte link https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println é possível ter acesso a pergunta cujo o título é: “Teste JUnit para System.out.println()”, segundo o autor da pergunta precisava escrever testes JUnit para um aplicativo antigo que era mal projetado e estava escrevendo muitas mensagens de erro na saída padrão. Quando o getResponse(String request) método se comportava corretamente, ele retornava uma resposta XML. Segue código da pergunta.</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem01.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;O autor informou ainda que “Mas, quando ele recebe um XML malformado ou não entende a solicitação, ele retorna null e grava algumas coisas na saída padrão. E, fez a seguinte pergunta: Existe alguma maneira de afirmar a saída do console no JUnit? Para capturar casos como:</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem02.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Dentre mais de 15 resposta a aceita pelo autor foi a que demonstro abaixo:</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem03.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Métodos de testes como exemplos segundo o autor da resposta:</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem04.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Analise e demonstração dos testes unitários da pergunta e resposta usando as ferramentas vscode, JUnit5, Java e Maven.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;A princípio busquei entender o código do autor da pergunta, em seguida passei a organizar os código na IDE para proceder com os testes, foi criado um projeto maven e todos as classes e métodos necessário para realização dos testes, além disso, precisei criar 2 arquivos com extensão propeties chamados requests e responses, também, foi preciso implementar a classe ResponseGenerator, dentro da pasta de testes eu criei classes que representassem o autor da pergunta e autor da resposta, chamadas de AutorPerguntaTest.java e AutorResposaTest.java além dessa, uma terceira classe chamada AutorPerguntaRefatoradoTest.java, está última contendo códigos refatorados da classe AutorPerguntaTest.java cujo o objetivo foi fazer possíveis alterações no código do autor que me permitissem executar a classe sem perder o foco na pergunta do autor pois, os métodos apresentados pelo autor estava apresentando erros e não foi possível corrigi-los por que aparentemente eram métodos implementas e não importados de bibliotecas, além disso, há uma certa dúvida devido a forma como foram instanciados. Posto isto, segue abaixo uma imagem da IDE demonstrando como ficou organizado a estrutura de pastas e classes.</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem05.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Se observarmos o código da imagem acima vemos que há alguns erros nos métodos loadPropertiesFile(“requests.properties”), aparentemente seria uma função para lê os arquivos chamados requests.properties e responses.properties mas, não ficou claro onde ou de qual classe foi utilizado o método loadPropertiesFile impossibilitando assim a execução desses métodos. Mas, não foi obstáculo para responder à pergunta do autor que era saber se “Existia alguma maneira de afirmar a saída do console no JUnit? Para capturar casos como”, segue abaixo o código da classe AutorPergunta.java e AutorPerguntaRefatoradoTest.java.</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem06.png" alt="Texto Alternativo">
</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem07.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Resumidamente, o autor da pergunta estava interessado em verificar se a saída impressa no console durante a execução do teste correspondia ao que era esperado. O objetivo era garantir que a saída do console produzida por um método pudesse ser verificada e comparada dentro de um ambiente de teste automatizado. Apresento a seguir imagem demonstrando o código do autor da resposta:</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem08.png" alt="Texto Alternativo">
</p>

#### Explicando o código implementado pelo autor da resposta.

- Declaração de Streams:
<p style="text-align: justify">&nbsp;&nbsp;&nbsp;outContent e errContent são ByteArrayOutputStream que capturam a saída de texto. originalOut e originalErr armazenam as saídas padrão originais do sistema para restaurá-las depois.</p>

- Método setUpStreams:
<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Redireciona System.out e System.err para outContent e errContent, respectivamente.</p>

- Método restoreStreams:
<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Restaura System.out e System.err para suas saídas padrão originais após o teste.</p>

- Métodos de Teste:
<p style="text-align: justify">&nbsp;&nbsp;&nbsp;out(): Verifica se a string "hello" foi capturada corretamente em outContent. err(): Verifica se a string "hello again" foi capturada corretamente em errContent.
Esses atributos e métodos permite que o teste verifique o conteúdo das saídas de texto do código.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Esses atributos e métodos permite que o teste verifique o conteúdo das saídas de texto do código.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Prosseguindo com os testes, como já disse acima não foi possível executar os métodos do autor pois, para a implementação da lógica de como seria os métodos ficou um pouco confusa. Já a classe AutorPerguntaRefatoradoTest.java executei e funcionou, obviamente foi uma classe refatorada baseando-se nos métodos do autor da pergunta e no meu entendimento de como estavam implementados os métodos. Abaixo segue uma imagem com a classe demonstrando que passou nos casos de testes e uma outra imagem demonstrando falha pois, fiz uma pequena alteração na variável request dentro do método de teste.</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem09.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Segue abaixo uma imagem demonstrando a execução dos métodos sugeridos pelo autor da resposta para provar que há sim possibilidade de redirecionar a saída e testar. Há dois métodos e os dois passaram nos testes.</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem10.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Além de vários testes que já havia feito, para confirmação fiz uma mudança em uma String passada como argumento em System.err.print dentro do método err e o teste não passou como esperado.</p>

<p align="center">
  <img src="codigo_fonte\imgs\imagem11.png" alt="Texto Alternativo">
</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;Com a abordagem que discutimos, é possível testar um aplicativo antigo que escreve mensagens de erro na saída padrão. Ao redirecionar System.out e System.err para ByteArrayOutputStream, você pode capturar essas saídas durante os testes JUnit e verificar se as mensagens de erro ou outras saídas são as esperadas. Assim, podemos afirmar que o código implementado pelo autor da resposta é um exemplo de como redirecionar a saída padrão (System.out) e a saída de erro (System.err) para capturar e verificar o que foi impresso, usando JUnit para testes.</p>