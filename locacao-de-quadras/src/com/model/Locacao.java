package com.model;

import javax.swing.JOptionPane;

public class Locacao {
    private Quadra quadra;
    private Locatario locatario;
    private int tempoMinutos;
    private boolean precisaEquipamento;

    public void cadastrarQuadra() {
        quadra = new Quadra();
        quadra.setNome(JOptionPane.showInputDialog("Digite o nome da quadra:"));
        quadra.setTipo(JOptionPane.showInputDialog("Digite o tipo da quadra:"));
        quadra.setValorMinuto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por minuto da quadra:")));
    }

    public void cadastrarLocatario() {
        locatario = new Locatario();
        locatario.setNome(JOptionPane.showInputDialog("Digite o nome do locatário:"));
        locatario.setCpf(JOptionPane.showInputDialog("Digite o CPF do locatário:"));
        locatario.setTelefone(JOptionPane.showInputDialog("Digite o telefone do locatário:"));
        locatario.setAnoNascimento(
                Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do locatário:")));
    }

    public boolean verificarIdade() {
        int idade = 2023 - locatario.getAnoNascimento();
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "O locatário é menor de idade.");
            return false;
        } else {
            return true;
        }
    }

    public String calcularLocacao() {
        double valorMinuto = quadra.getValorMinuto();
        if (tempoMinutos > 120) {
            valorMinuto *= 0.9; // 10% de desconto
        }
        double valorTotal = valorMinuto * tempoMinutos;
        if (precisaEquipamento) {
            valorTotal += 50; // valor do equipamento
        }
        return "Valor Calculado: R$ " + valorTotal;
    }

    public void mostrarResumoLocacao() {
        JOptionPane.showMessageDialog(null, "Locatário\nNome: " + locatario.getNome() + "\nCPF: " + locatario.getCpf()
                + "\nTelefone: " + locatario.getTelefone() + "\nAno de Nascimento: " + locatario.getAnoNascimento()
                + "\n\nQuadra\nNome da Quadra: " + quadra.getNome() + "\nTipo: " + quadra.getTipo()
                + "\nValor do Minuto: " + quadra.getValorMinuto() + "\n\nLocação\nTempo em Minutos: " + tempoMinutos
                + "\nNecessita Equipamento: " + (precisaEquipamento ? "Sim" : "Não")
                + "\n" + calcularLocacao());
    }

    public void cadastrarLocacao() {
        cadastrarLocatario();
        if (!verificarIdade()) {
            return;
        }
        cadastrarQuadra();
        tempoMinutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em minutos da locação:"));
        String equipamento = JOptionPane.showInputDialog("Necessita equipamento? (S/N)");
        precisaEquipamento = equipamento.equalsIgnoreCase("S");
        mostrarResumoLocacao();
    }
}