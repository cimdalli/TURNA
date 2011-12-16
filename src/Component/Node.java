package Component;

import GUI.NodeMenu;
import utils.PopupListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Author : Emre Nevayeshirazi
 * 
 */
public class Node extends JPanel {

    private String name;		// name of the node
    private Node parentNode;    // parent of this node
    private Tree[] subTree;     // subtrees related to this node

    public Node(Node parentNode, String name) {
        add(new JLabel(name));
        this.setBackground(Color.cyan);
        
        NodeMenu popup = new NodeMenu(this);
        add(popup);

        this.name = name;
        this.parentNode = parentNode;
    }

    public Node getRootNode() {
        return parentNode;
    }

    public Tree[] getSubTree() {
        return subTree;
    }

    public void setRootNode(Node rootNode) {
        this.parentNode = rootNode;
    }

    public void setSubTree(Tree[] subTree) {
        this.subTree = subTree;
    }

    public int getTreeIndex(Tree subTree) {
        return 1;
    }

    public void removeNode(Node node, Tree subTree) {
        this.subTree[getTreeIndex(subTree)].removeFromTree(node);
    }

    public Node addNode() {
        return new Node(this,null);
    }

    public Node addNode(String name, Tree tree) {
        return this.addNode(new Node(this, name), tree);
    }

    public Node addNode(Node node, Tree tree) {
        return this.subTree[getTreeIndex(tree)].addNode(node);
    }

    public void removeTree(Tree subTree) {
        subTree.removeTree();
    }

    public Tree addTree(Tree tree) {
        return null;
    }

    public void addConstraint() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void addCardinality() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void removeNode() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
