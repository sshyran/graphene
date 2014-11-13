package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class ConditionIn extends ConditionOrDecl {
  public final Condition condition_;

  public ConditionIn(Condition p1) { condition_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.ConditionOrDecl.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.ConditionIn) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.ConditionIn x = (com.biosimilarity.GraphL.model.GraphL.Absyn.ConditionIn)o;
      return this.condition_.equals(x.condition_);
    }
    return false;
  }

  public int hashCode() {
    return this.condition_.hashCode();
  }


}
