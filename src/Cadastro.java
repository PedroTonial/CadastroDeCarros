import java.util.Scanner;

public class Cadastro {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Carro [] carrosCadastrados;
    private int index;

    public Cadastro(int length)
    {
        carrosCadastrados = new Carro [length];
        index = 0;
    }

    public void addCarro (Carro carro){
        if(index >= carrosCadastrados.length){
            System.out.println("Cadastro cheio!");
        }else{
            carrosCadastrados[index] = carro;
            index ++;
            System.out.println("Carro cadastrado: " + carro.getMarca() + " "+ carro.getAno());
        }
    }

    public Carro [] removerCarro (String marca){
        int carroIndex = -1;
        for (int i =0; i < index; i++){
            if(carrosCadastrados[i].getMarca().equalsIgnoreCase(marca)){
                carroIndex = i;
                break;
            }
        }
        if (carroIndex == -1){
            System.out.println("Carro não encontrado!");
            return carrosCadastrados;
        }
        Carro[] novoCadastro = new Carro[carrosCadastrados.length - 1];
        for (int i = 0, j = 0; i < index; i++) {
            if (i != carroIndex) {
                novoCadastro[j++] = carrosCadastrados[i];
            }
        }

        System.out.println("Carro removido: " + carrosCadastrados[carroIndex].getMarca());

        carrosCadastrados = novoCadastro;
        index--;

        return carrosCadastrados;
    }
    public int pegarAtributo (){
        Scanner input = new Scanner (System.in);
        int count =0;
        System.out.println("Qual atributo deseja pesquisar: " +
                "\n1. Cor" +
                "\n2. Marca" +
                "\n3. Ano" +
                "\n4. Preço");
        int option= input.nextInt();
        switch (option){
            case 1:
                count = contarCarrosPorAtributo(1);
                break;
            case 2:
                count = contarCarrosPorAtributo(2);
                break;
            case 3:
                count = contarCarrosPorAtributo(3);
                break;
            case 4:
                count = contarCarrosPorAtributo(4);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Número de carros com o atributo: "+ count);
        return count;
    }
    public int contarCarrosPorAtributo(int atributo){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor do atributo escolhido");
        String valor = input.nextLine();
        int count =0;
        for(int i = 0; i<index;i++){
            switch (atributo) {
                case 1:
                    if (carrosCadastrados[i].getCor().equalsIgnoreCase(valor)) {
                        count++;
                    }
                    break;
                case 2:
                    if (carrosCadastrados[i].getMarca().equalsIgnoreCase(valor)) {
                        count++;
                    }
                    break;
                case 3:
                    if (carrosCadastrados[i].getAno() == Integer.parseInt(valor)) {
                        count++;
                    }
                    break;
                case 4:
                    if (carrosCadastrados[i].getPreco() == Double.parseDouble(valor)) {
                        count++;
                    }
                    break;
            }
        }
        return count;
    }
}
