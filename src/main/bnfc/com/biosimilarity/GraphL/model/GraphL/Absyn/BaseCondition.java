package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class BaseCondition extends Condition {
  public final GroundCondition groundcondition_;

  public BaseCondition(GroundCondition p1) { groundcondition_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.Condition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.BaseCondition) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.BaseCondition x = (com.biosimilarity.GraphL.model.GraphL.Absyn.BaseCondition)o;
      return this.groundcondition_.equals(x.groundcondition_);
    }
    return false;
  }

  public int hashCode() {
    return this.groundcondition_.hashCode();
  }


}