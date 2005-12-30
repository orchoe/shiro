package org.jsecurity.ri.web.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Les Hazlewood
 */
public abstract class RoleTag extends SecureTag {

    private String name = null;

    public RoleTag(){}

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int onDoStartTag() throws JspException {
        boolean show = showTagBody( getName() );
        if ( show ) {
            return TagSupport.EVAL_BODY_INCLUDE;
        } else {
            return TagSupport.SKIP_BODY;
        }
    }

    protected abstract boolean showTagBody( String roleName );

}
