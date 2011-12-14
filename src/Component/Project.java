package Component;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author fuatbasik
 */
public class Project {
    private String ProjectName;
    private Node root;
    
    
    public Project(){
        this.ProjectName = "Turna";
        root = new Root(ProjectName);
    }
    
    public Project(String name){
        this.ProjectName = name;
        root = new Root(ProjectName);
    }
    
   public String getName()   { 
       return ProjectName; 
   
   }
   
   public void setName(String name)   { 
       this.ProjectName = name; 
       this.root.setName(name);
   }
   
   public Node getRoot () { 
        return this.root; 

}
  public void setRoot () {
      System.out.println("Ne gerek var aq.");
  
  }
}
