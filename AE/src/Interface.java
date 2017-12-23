import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;

@SuppressWarnings("serial")
public class Interface extends JFrame implements ActionListener {
  private JPanel northPanel;
  private JPanel centerPanel;
  private JButton ouvrir;
  private JButton enregistrer;
  private JButton envoyer;
  private JPanel gauche;
  private JScrollPane droite;
  public LinkedList<Fonctions> fonctions = new LinkedList<Fonctions>();
  public Interface() {
    super("Créateur de Robot");
    ouvrir = new JButton("ouvrir");
    enregistrer = new JButton("enregistrer");
    envoyer = new JButton("envoyer");
    northPanel = new JPanel();
    centerPanel= new JPanel();
    gauche = new JPanel();
    droite = new JScrollPane();
    northPanel.setLayout(new FlowLayout());
    centerPanel.setLayout(new GridLayout(1,2));
    centerPanel.add(gauche);
    centerPanel.add(droite);
    northPanel.add(ouvrir);
    northPanel.add(enregistrer);
    northPanel.add(envoyer);
    setLayout(new BorderLayout()); 
    add(BorderLayout.CENTER, centerPanel);
    add(BorderLayout.NORTH, northPanel);
    setBackground(Color.WHITE);
    
    fonctions.add(new Avancer());
    fonctions.add(new If(new Capteur()));
    fonctions.add(new TournerAGauche(5000));
    //lignes à supprimer
    sfsd
    
    enregistrer.addActionListener(this);
    envoyer.addActionListener(this);
    ouvrir.addActionListener(this);
    
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
  
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource()==enregistrer) {
    	try {
    		SauvegardeVersArduino.sauvegarder(fonctions);
    	}
    	catch (Exception e) {
    		System.err.println("Le fichier ne peut être enregistré");
    		System.err.println(e);
    	}
    }

    if(evt.getSource()==envoyer) {
    }
    if(evt.getSource()==ouvrir) {
    	try {
        	fonctions = Ouvrir.ouvrir();
    	}
    	catch (Exception e) {
    		System.err.println("Le fichier ne peut être ouvert");
    	}
    	
    }
  }
  
  public static void main(String[] args) {
    Interface fenetre = new Interface();
    fenetre.setLocation(300, 50);
    fenetre.setSize(1000, 700);
    fenetre.setVisible(true);
  }
}
