package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class NegatedCondition extends GroundCondition {
  public final GroundCondition groundcondition_;

  public NegatedCondition(GroundCondition p1) { groundcondition_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GroundCondition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.NegatedCondition) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.NegatedCondition x = (com.biosimilarity.GraphL.model.GraphL.Absyn.NegatedCondition)o;
      return this.groundcondition_.equals(x.groundcondition_);
    }
    return false;
  }

  public int hashCode() {
    return this.groundcondition_.hashCode();
  }


}
