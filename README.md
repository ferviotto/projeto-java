# Projeto E-commerce
Projeto Final da Primeira Etapa do Bootcamp da Generation patrocinado pela Microsoft - T75.

## Descrição:
1. Nesse projeto, eu criei o e-commerce do meu antigo e pequeno negócio local de venda de produtos naturais para terapia holística, o qual idealizei com o intuito de levar bem-estar às pessoas em meio a Pandemia da COVID-19. Ele era baseado em 3 produtos: vela aromática, óleo corporal e spray de ambiente, sendo que todos tinham óleos essenciais em suas composições;
2. Cada Branch é uma versão do projeto;
3. A Branch Menu é a primeira versão, onde eu criei a Classe Menu e a Classe Util Cores;
4. A Branch Model_Repository é a segunda versão, onde eu adicionei a criação das Classes Models DadosClientes e DadosProdutos, declarando os atributos, o construtor, os getters e setters e os demais métodos. As classes clientes e produtos, que herderam os métodos das respectivas Models DadosClientes e DadosProdutos, também foram criadas aqui. Por fim, criei o EcommerceRepository, onde apresento o CRUD e métodos do meu e-commerce;
5. A Branch Controller é a minha versão final e completa. Aqui podemos verificar a utilização dos preceitos de polimorfismo, além da declaração de objetos do tipo ArrayList e do uso de anotações @Override para sobreescrever métodos ao aplicar outros conceitos fundamentais da lógica de programação que aprendi durante a primeira etapa do curso da Generation.

## Funcionalidades Implementadas:
1. Cadastro de Clientes: Na Classe Controller através do método cadastrarCliente, que adiciona clientes à lista de clientes.
2. Gestão de Produtos: Funções para exibir a gestão de produtos e o status de atividade dos produtos.
3. Carrinho de Compras: Métodos para adicionar produtos, exibir o carrinho e realizar o checkout, incluindo o cálculo do total e a limpeza do carrinho após o pagamento.
4. Busca e Exibição de Produtos: Funções para listar produtos cadastrados e buscar produtos por ID.
5. Exceções Personalizadas: Criação de exceções personalizadas, como ProdutoNaoEncontradoException, para lidar com situações de erro específicas.

Este projeto consolidou meus conhecimentos e habilidades em Java e me deu a oportunidade de aplicar conceitos fundamentais de lógica de programação e desenvolvimento de software.
