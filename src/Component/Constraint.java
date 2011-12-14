package Component;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author fuatbasik
 */
public class Constraint {
    private boolean andConstraint;
    private boolean orConstraint;
    private boolean impliesConstraint;
    private boolean notConstraint;
    
    
    public Constraint() {
    
    }

    public void setAndConstraint(boolean andConstraint) {
        this.andConstraint = andConstraint;
    }

    public void setImpliesConstraint(boolean impliesConstraint) {
        this.impliesConstraint = impliesConstraint;
    }

    public void setNotConstraint(boolean notConstraint) {
        this.notConstraint = notConstraint;
    }

    public void setOrConstraint(boolean orConstraint) {
        this.orConstraint = orConstraint;
    }
    
    public boolean isAndConstraint() {
        return andConstraint;
    }

    public boolean isImpliesConstraint() {
        return impliesConstraint;
    }

    public boolean isNotConstraint() {
        return notConstraint;
    }

    public boolean isOrConstraint() {
        return orConstraint;
    }    
}
