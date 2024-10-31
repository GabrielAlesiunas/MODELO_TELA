package Tela; // Meu pacote para organizar o código.

import javax.swing.*; // Importa as classes que preciso para a GUI.
import java.awt.*; // Importa classes para layouts.

public class AWTTestSwing { // Minha classe principal.
    
    public static void main(String[] args) { // Onde o programa começa.
        
        // Cria uma janela com título.
        JFrame frame = new JFrame("AWT Test"); 
        
        // Fecha o programa ao fechar a janela.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // Define o tamanho da janela.
        frame.setSize(400, 200); 
        
        // Usa um layout de borda.
        frame.setLayout(new BorderLayout()); 

        // Cria um rótulo com texto.
        JLabel label1 = new JLabel("Label1"); 
        
        // Cria um campo de texto.
        JTextField textField1 = new JTextField(15); 

        // Cria um painel para o topo.
        JPanel topPanel = new JPanel(); 
        
        // Layout em fluxo (alinhado).
        topPanel.setLayout(new FlowLayout()); 
        
        // Adiciona o rótulo ao painel.
        topPanel.add(label1); 
        
        // Adiciona o campo de texto.
        topPanel.add(textField1); 

        // Cria o primeiro botão.
        JButton button1 = new JButton("Button 1"); 
        
        // Cria o segundo botão.
        JButton button2 = new JButton("Button 2"); 
        
        // Cria o terceiro botão.
        JButton button3 = new JButton("Button 3"); 

        // Cria um painel para os botões.
        JPanel buttonPanel = new JPanel(); 
        
        // Layout em fluxo para os botões.
        buttonPanel.setLayout(new FlowLayout()); 
        
        // Adiciona o primeiro botão.
        buttonPanel.add(button1); 
        
        // Adiciona o segundo botão.
        buttonPanel.add(button2); 
        
        // Adiciona o terceiro botão.
        buttonPanel.add(button3); 

        // Adiciona o painel do topo à janela.
        frame.add(topPanel, BorderLayout.NORTH); 
        
        // Adiciona o painel de botões à janela.
        frame.add(buttonPanel, BorderLayout.CENTER); 

        // Mostra a janela.
        frame.setVisible(true); 
    }
}
