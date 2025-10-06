package org.example;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int op;
        double inputUm, inputDois;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                    Insira a opção que voce deseja:
                    1. Somar
                    2. Subtrair
                    3. Multiplicar
                    4. Dividir
                    5. Sair"""));
            
            switch (op){
                case 1: 
                    inputUm = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
                    inputDois = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
                    JOptionPane.showMessageDialog(null, calculadora.somar(inputUm, inputDois));
                break;
                case 2:
                    inputUm = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
                    inputDois = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
                    JOptionPane.showMessageDialog(null, calculadora.subtrair(inputUm, inputDois));
                break;
                case 3:
                    inputUm = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
                    inputDois = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
                    JOptionPane.showMessageDialog(null, calculadora.multiplicar(inputUm, inputDois));
                break;
                case 4:
                    inputUm = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
                    inputDois = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
                    JOptionPane.showMessageDialog(null, calculadora.dividir(inputUm, inputDois));
                break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Insira uma opção válida!");
                break;
            }
            
        }while (op!= 5);

        
    }
}