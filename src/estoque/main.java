package estoque;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Estoque estoque = new Estoque();

		int opcao;

		do {
			System.out.println("\n ===== Sistema de Estoque ====");
			System.out.println("1- Cadastrar Produto");
			System.out.println("2- Listar Produtos");
			System.out.println("3- Buscar Produto");
			System.out.println("4- Atualizar Estoque");
			System.out.println("5- Remover Produto");
			System.out.println("0- Sair");
			System.out.println("Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:

				System.out.print("Nome do produto: ");
				String nome = scanner.nextLine();

				System.out.print("Código: ");
				int codigo = scanner.nextInt();

				System.out.print("Preço: ");
				double preco = scanner.nextDouble();
				
				System.out.print("Quantidade: ");
				int quantidade = scanner.nextInt();
				scanner.nextLine();
				
				if (preco < 0) {
					System.out.println("Opreço não pode ser negativo");
					break;
				}
			
				if ( quantidade < 0) {
					System.out.println("A quantidade não pode ser negativa.");
					break;
				}

			

				Produto produto = new Produto(nome, codigo, preco, quantidade);

				estoque.cadastrarProduto(produto);
			
				break;

			case 2:

				estoque.listarProdutos();

				break;

			case 3:

				System.out.print("Digite o código do produto: ");
				int codigoBuscar = scanner.nextInt();
				scanner.nextLine();

				estoque.buscarProduto(codigoBuscar);

				break;

			case 4:

				System.out.print("Código do produto: ");
				int codigoAtualizar = scanner.nextInt();

				System.out.print("Nova quantidade: ");
				int novaQuantidade = scanner.nextInt();
				scanner.nextLine();

				estoque.atualizarEstoque(codigoAtualizar, novaQuantidade);

				break;

			case 5:

				System.out.println("Código do produto:");
				int codigoRemover = scanner.nextInt();
				scanner.nextLine();

				estoque.removerProduto(codigoRemover);

				break;

			case 0:

				System.out.println("Encerrando sistema...");

				break;

			default:

				System.out.println("Opção inválida!!!");

			}

		} while (opcao != 0);

		scanner.close();

	}

}
