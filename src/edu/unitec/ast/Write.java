package edu.unitec.ast;

import edu.unitec.intermediatelanguage.IntermediateForm;
import edu.unitec.visitor.IntermediateVisitor;
import edu.unitec.visitor.TypeVisitor;
import edu.unitec.visitor.Visitor;

public class Write extends Statement {

    public Exp e;

    public Write(Exp ae) {
        e = ae;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }
    
    public IntermediateForm accept(IntermediateVisitor v) {
    return v.visit(this);
  }
    
}
