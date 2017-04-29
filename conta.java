class Conta{

	int numero;
	double saldo;
	int agencia;
	Pessoa titular;

	void deposita(double valorASerDepositado){

		this.saldo += valorASerDepositado;

	}

	void saca(double valorASerSacado){

		if(this.saldo >= valorASerSacado){

			this.saldo -= valorASerSacado;

		}

	}

	void transfere(double valor, Conta destino){

		this.saldo -= valor;
		destino.saldo += valor;

	}
	
}

class Pessoa{

	String nome;
	String cpf;
	String dataNascimento;

}

class Programa{

	public static void main(String[] args){

		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800.0;
		mauricio.agencia = 842;

		mauricio.titular = new Pessoa();
		mauricio.titular.nome = "Mauricio";
		mauricio.titular.cpf = "12345";
		mauricio.titular.dataNascimento = "10/10/1975";


		mauricio.deposita(100.0);
		mauricio.deposita(100.0);
		mauricio.deposita(100.0);
		mauricio.saca(5000.0);


		Conta guilherme = new Conta();
		guilherme.numero = 124;
		guilherme.saldo = 8000.0;
		guilherme.agencia = 129;

		guilherme.titular = new Pessoa();
		guilherme.titular.nome = "Guilherme";
		guilherme.titular.cpf = "123456";
		guilherme.titular.dataNascimento = "10/10/1974";

		guilherme.deposita(100.0);
		guilherme.deposita(100.0);
		guilherme.saca(2000.0);
		guilherme.transfere(1000.0, mauricio);


		System.out.println(mauricio.titular.nome);

		System.out.println(mauricio.saldo);

		System.out.println(guilherme.titular.nome);

		System.out.println(guilherme.saldo);
	}

}