package pipe.models.component.token;

import pipe.visitor.foo.PetriNetComponentVisitor;

public interface TokenVisitor extends PetriNetComponentVisitor {
    public void visit(Token token);
}