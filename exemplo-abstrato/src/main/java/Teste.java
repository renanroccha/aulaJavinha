public class Teste {

    public static void main(String[] args) {

        Carro carro01 = new Carro("Micha" , "Fiat " , 12.80 ,1978, 2.0, true );

        Carro carro02 = new Carro("Micha" , "Mercedes " , 500.800 ,2022, 2.0, true );

        Bicicleta bicicleta01 = new Bicicleta("Micha", "Chevrolet" , 19.89, 2008, 5.9);


        System.out.println("Relatorio do veiculo:  ");
        carro01.exibirRelatorioRevisao();

        carro02.exibirRelatorioRevisao();

        bicicleta01.exibirRelatorioRevisao();


        System.out.println(Math.PI);

    }


}
