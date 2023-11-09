# Pratica6_POO

QUESTÃO 1 

a) Criar a classe Publicação com todos os seus atributos, conforme Diagrama de
Classe.
• Criar a variável contadorPublicacao que deverá ser do tipo double,
public e static. Exemplo: public static double contadorPublicacao;
• Criar o construtor da classe Publicacao e atualizar o contadorPublicacao
toda vez que um objeto for criado.
• Criar os métodos setters dos atributos: textoPublicacao e linkMidia; E
criar os métodos getters dos atributos: dataPublicacao,
textoPublicacao, linkMidia e contadorPublicacao.
b) Criar a classe RedeSocial com todos os seus atributos, conforme Diagrama de
Classe.
• Criar a variável publicações que deverá ser um ArrayList do tipo
Publicacao. Exemplo:
ArrayList<Publicacao> publicacoes = new ArrayList<> ();
• Criar o construtor de RedeSocial que recebe todos os atributos para
criar uma Rede Social.
Criar o método void inserePublicacao(Publicacao publi) que deverá
receber um objeto do tipo Publicacao e inserir no ArrayList
• Criar o método void imprimePublicacoes() que deverá mostrar o total
de publicações, chamando o método getContadorPublicacao(). Além de
mostrar o conteúdo do ArrayList publicacoes, como dataPublicacao e
textoPublicacao.
c) Criar uma classe Principal que terá o main().
• Utilize os comandos JOptionPane() ou System.out.println() para
solicitar os dados de uma Rede Social e assim criar o objeto.
• Você deverá criar dois ou mais objetos do tipo Publicacao. Solicite os
dados pelos comandos JOptionPane() ou System.out.println().
• Inserir os objetos do tipo Publicacao na Rede Social
• Chamar o imprimePublicacoes ao final


QUESTÃO 2 


1. Implemente a classe Pessoa, contendo os atributos “nome”, “email” e “telefone”,
pelo menos.
2. Crie uma classe para um “Funcionario”. Ela deve herdar de Pessoa os seus atributos,
além de adicionar: o departamento onde trabalha, o salário dele (double), a data de
entrada no banco (string), o RG dele (string) e um valor booleano que indique se o
funcionário está na empresa no momento ou se já foi embora.
3. Crie uma classe Empresa que possua “nome”, “cnpj”, “qtde_de_funcionario” e um
array de objetos da classe Funcionario (o array pode armazenar até 100 funcionários).
4. Crie os seguintes métodos para a classe Funcionario, criada anteriormente:
a) método “bonificar”, que aumenta o salário do funcionário de acordo com o
parâmetro passado como argumento;
b) método “demitir”, que não recebe parâmetro algum, apenas modifica o valor
booleano indicando que o funcionário não trabalha mais na empresa;
c) método “mostrarDados”, que simplesmente imprime todos os atributos de um
funcionário.
5. Crie 5 objetos da classe Funcionário e insira-os em um array de objetos dessa classe.
Utilize um for para imprimir todos os atributos dos objetos do array.
6. Crie um objeto Empresa e adicione os 5 Funcionários criados na tarefa anterior.



QUESTÃO 3


1. Criar uma Classe Artigo com os seguintes atributos:
private String titulo;
private String resumo;
private String autores;
Fazer os métodos setters e getters e o construtor
2. Crie uma classe denominada Edição que contenha os seguintes atributos:
private int numero;
private int volume;
private String dataEdicao;
private int tiragem;
private ArrayList<Artigo> artigos;
Fazer os métodos setters e getters e o construtor.
Criar o método que adicionaArtigos em uma Edição.
3. Crie uma classe denominada RevistaCientifica que contenha os seguintes atributos:
private String titulo;
private long issn;
private String peridiocidade;
private Edicao edicoes;
Fazer os métodos setters e getters e o construtor
Fazer um método que adiciona uma Edição na RevistaCientífica
4. Criar um main para manipular os objetos:
Adicione um ArrayList de 10 objetos da classe Artigos.
Crie um objeto do tipo Edição, adicione todos os artigos.
Crie uma Revista Científica e adicione a Edição.
