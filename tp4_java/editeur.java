package tp4_java;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowListener;

public class editeur extends Frame implements ActionListener, ItemListener, WindowListener {
	
	TextArea t = new TextArea(3, 50);
	Label l1 = new Label("Couleurs");
	Label l2 = new Label("Tailles");
	Label l3 = new Label("Polices");
	Choice couleur = new Choice();
	Choice taille = new Choice();
	Choice police = new Choice();
	Button efface = new Button("Effacer");
	Button Bold = new Button("BOLD");
	Button italic = new Button("ITALIC");
	Button plain = new Button("PLAIN");

	FlowLayout ft = new FlowLayout();
	
}
