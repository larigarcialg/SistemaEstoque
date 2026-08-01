package estoque;

import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> produtos = new ArrayList<>();
	

	public void cadastrarProduto(Produto produto) {

		for (Produto p : produtos) {

			if (p.getCodigo() == produto.getCodigo()) {
				System.out.println("ja existe um produto com esse código.");
				return;
			}
		}

		produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}
	

	public void listarProdutos() {

		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}

		for (Produto produto : produtos) {
			System.out.println("------------------------");
			System.out.println(produto);
		}

	}
	

	public void buscarProduto(int codigo) {

		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigo) {

				System.out.println(produto);
				return;

			}

		}

		System.out.println("produto não encontrado");
	}
	

	public void atualizarEstoque(int codigo, int novaQuantidade) {

		for (Produto produto : produtos) {

			if (produto.getCodigo() == codigo) {

				produto.setQuantidade(novaQuantidade);

				System.out.println("Quantidade atualizada com sucesso!");

				return;
			}

			System.out.println("Produto não encontrado.");

		}

	}
	

	public void removerProduto(int codigo) {

		for (int i = 0; i < produtos.size(); i++) {

			if (produtos.get(i).getCodigo() == codigo) {

				produtos.remove(i);
				System.out.println("Produto removido com sucesso!");
				return;
			}
		}

		System.out.println("Produto não encontrado.");
	}

}