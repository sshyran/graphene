package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class EdgeLabelAtomicCondition extends EdgeLabelCondition {
  public final AtomicFormula atomicformula_;

  public EdgeLabelAtomicCondition(AtomicFormula p1) { atomicformula_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeLabelCondition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeLabelAtomicCondition) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeLabelAtomicCondition x = (com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeLabelAtomicCondition)o;
      return this.atomicformula_.equals(x.atomicformula_);
    }
    return false;
  }

  public int hashCode() {
    return this.atomicformula_.hashCode();
  }


}
