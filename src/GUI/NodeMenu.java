/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Component.Node;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import utils.PopupListener;

/**
 *
 * @author ok@n
 */
public class NodeMenu extends JPopupMenu {

    public NodeMenu(final Node node) {
        super();

        this.add((JMenuItem) new JMenuItem("Add node")).addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                node.addNode();
            }
        });
        
        this.add((JMenuItem) new JMenuItem("Add constraint")).addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                node.addConstraint();
            }
        });
        
        this.add((JMenuItem) new JMenuItem("Add cardinality")).addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                node.addCardinality();
            }
        });
        
        this.addSeparator();
        
        this.add((JMenuItem) new JMenuItem("Remove node")).addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                node.removeNode();
            }
        });


        node.addMouseListener(new PopupListener(this));

    }
}
