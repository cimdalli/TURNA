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

    public Project(String name) {
        this.ProjectName = (name != null && !name.equals("")) ? name : "Turna";
        root = new Node(null, ProjectName);
    }

    public Project() {
        this("Turna");
    }

    public String getName() {
        return ProjectName;

    }

    public void setName(String name) {
        this.ProjectName = name;
        this.root.setName(name);
    }

    public Node getRoot() {
        return this.root;

    }

    public void setRoot(Node node) {
        this.root = node;
    }
}
