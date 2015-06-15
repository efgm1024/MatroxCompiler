package edu.unitec.ast;

import edu.unitec.visitor.Visitor;
import edu.unitec.visitor.TypeVisitor;

public class BooleanType extends Type {
  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BooleanType)
            return true;
        else
            return false;
    }
  
  
}