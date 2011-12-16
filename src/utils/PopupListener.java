/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

/**
 *
 * @author ok@n
 */
public class PopupListener extends MouseAdapter {

    JPopupMenu popup;

    public PopupListener(JPopupMenu popupMenu) {
        popup = popupMenu;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        maybeShowPopup(e);
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        maybeShowPopup(e);
    }

    private void maybeShowPopup(MouseEvent e) {
        //System.out.println("popup");

        if (e.isPopupTrigger()) {
            popup.show(e.getComponent(),
                    e.getX(), e.getY());
        }
    }
} //end of class PopupListener  