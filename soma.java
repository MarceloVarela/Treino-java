class Soma{

    public static void main(String[] args){

		int resultado = 0;
		int ultimoValor;
		for (int x = 0; x <= 1000; x++) {
			ultimoValor = resultado;
			resultado += x;
			System.out.println(resultado);
		}
	}
}