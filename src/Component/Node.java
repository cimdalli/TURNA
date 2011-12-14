package Component;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Emre Nevayeshirazi
 */

/*
 * Author : Emre Nevayeshirazi
 * 
 */
/*
 * Author : Emre Nevayeshirazi
 * 
 */
		
public class Node  {

	private String name;		// name of the node
	private Node parentNode;    // parent of this node
	private Tree[] subTree;     // subtrees related to this node
	
	
	public Node()
	{
		name = null;
		parentNode = null;  
		subTree = null;
	}
	
	public Node(Node parentNode, String name)
	{
		this.name = name;
		this.parentNode = parentNode;
	}	
	
	
	// Get Methods	
	public String getName()   { return name; }			
	public Node getRootNode() { return parentNode; }	
	public Tree[] getSubTree()  { return subTree; }
	
	// Set Methods	
	public void setName(String name)       { this.name = name; }			
	public void setRootNode(Node rootNode) { this.parentNode = rootNode; }	
	public void setSubTree(Tree[] subTree)   { this.subTree = subTree; }	
		
		
	
	public int getTreeIndex(Tree subTree)
	{
		return 1;
	}
	
	public void removeNode(Node node, Tree subTree)
	{
		this.subTree[getTreeIndex(subTree)].removeFromTree(node);
	}
	
	public Node addNode(String name, Tree tree)
	{		
		return this.addNode(new Node(this, name), tree);
	}
	
	public Node addNode(Node node, Tree tree)
	{	
		return this.subTree[getTreeIndex(tree)].addNode(node);
	}
	
	public void removeTree(Tree subTree)
	{
		subTree.removeTree();
	}
	

	public Tree addTree(Tree tree)
	{		
		return null;			
	}
}
