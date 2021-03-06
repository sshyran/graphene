package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class AtomicCondition extends GroundCondition {
  public final AtomicFormula atomicformula_;

  public AtomicCondition(AtomicFormula p1) { atomicformula_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GroundCondition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.AtomicCondition) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.AtomicCondition x = (com.biosimilarity.GraphL.model.GraphL.Absyn.AtomicCondition)o;
      return this.atomicformula_.equals(x.atomicformula_);
    }
    return false;
  }

  public int hashCode() {
    return this.atomicformula_.hashCode();
  }


}
