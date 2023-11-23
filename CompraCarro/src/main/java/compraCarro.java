
public class compraCarro {

	public static void main(String[] args) {

		boolean pix = false;
		boolean boleto = true;
		Boolean credito = false;
		int preco = 500000;
		int saldoDoCliente = 700000;
		String modelo = "Jeep Renegade 2022";

		if (pix = saldoDoCliente >= preco) {
			int desconto = 7500;
			preco = preco - desconto;

			System.out.println("Compra realizada com sucesso " + modelo + ", no valor de R$" + preco + ".");

		} else if (boleto = saldoDoCliente >= preco) {
			int juros = 8000;
			preco = preco + juros;

			System.out.println("Compra realizada com sucesso " + modelo + ", no valor de " + preco + " seu saldo é " + saldoDoCliente + ".");

		} else if (credito = saldoDoCliente >= preco) {
			int juros = 9500;
			preco = preco + juros;

			System.out.println("Compra realizada com sucesso " + modelo + ", no valor de " + preco + ".");
			
		} else {

			System.out.println("Compra não realizada.");

		}

	}

}
