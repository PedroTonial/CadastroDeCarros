import java.util.Scanner;

public class Carro {
    private String cor, marca;
    private int ano;
    private double preco;

    public Carro(String marca, String cor, int ano, double preco)
    {
        this.marca=marca;
        this.cor=cor;
        this.ano=ano;
        this.preco=preco;
    }
    //GETTERS
    //*******************************************
    public String getMarca()
    {
        return this.marca;
    }

    public String getCor(){
        return this.cor;
    }

    public int getAno(){
        return this.ano;
    }

    public double getPreco(){
        return this.preco;
    }

    //SETTERS
    //**************************************************
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //toString
    //*************************************************
    public String toString(){
        return "\tInformações do carro:" +
                    "\nMarca:" + marca +
                    "\nAno:"+ano+
                     "\nPreco"+preco+
                     "\nCor"+cor;
    }
    //FAZER UM METODO AQUI QUE CRIA UM NOVO OBJETO
   public Carro novoCarro (String cor, String marca, int ano, double preco) {
       return new Carro (cor, marca, ano, preco);
    }
}
