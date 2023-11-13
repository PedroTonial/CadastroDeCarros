import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //****instanciando o vetor e os objetos inciais*******
        Scanner input = new Scanner (System.in);
        Cadastro cadastro = new Cadastro(10);
        Carro carro1 = new Carro("Toyota", "Azul", 2022, 30000.0);
        Carro carro2 = new Carro("Honda", "Vermelho", 2021, 25000.0);
        Carro carro3 = new Carro("Ford", "Preto", 2023, 28000.0);
        Carro carro4 = new Carro("Chevrolet", "Branco", 2020, 20000.0);
        Carro carro5 = new Carro("Nissan", "Prata", 2022, 27000.0);
        //****adicionando os objetos ao vetor******
        cadastro.addCarro(carro1);
        cadastro.addCarro(carro2);
        cadastro.addCarro(carro3);
        cadastro.addCarro(carro4);
        cadastro.addCarro(carro5);

        //****Criando um Menu cíclico*****
        int option;
        do{
            System.out.println("_________________MENU_________________" +
                    "\n1. Adicionar novo carro" +
                    "\n2. Remover um carro" +
                    "\n3. Número de carros com um atributo" +
                    "\n4. Sair");
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Informe os atributos do novo carro");
                    System.out.println("Cor: ");
                    String cor = input.next();
                    System.out.println("Marca: ");
                    String marca = input.next();
                    System.out.println("Ano: ");
                    int ano = input.nextInt();
                    System.out.println("Preço: ");
                    int preco = input.nextInt();
                    Carro novoCarro = new Carro(marca,cor,ano,preco);
                    cadastro.addCarro(novoCarro);
                    break;
                case 2:
                    System.out.println("Informe a marca do carro a ser removido:");
                    String marcaEscolhida = input.next();
                    cadastro.removerCarro(marcaEscolhida);
                    break;
                case 3:
                    cadastro.pegarAtributo();
                    break;
                case 4:
                    System.out.println("*****Saindo da Aplicação!*****");
                    break;
            }
        }while (option!=4);


        }
    }