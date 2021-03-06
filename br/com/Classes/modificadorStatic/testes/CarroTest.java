package br.com.Classes.modificadorStatic.testes;

import br.com.Classes.modificadorStatic.classes.Carro;

public class CarroTest {
    public static void main(String[] args){

        // Acessa o atributo estático (de classe) antes de uma classe ser instânciada
        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(300);
        System.out.println(Carro.getVelocidadeLimite());

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 290);
        Carro c3 = new Carro("Audi", 275);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        // Alterou de toda a classe
        Carro.velocidadeLimite = 220;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
