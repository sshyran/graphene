package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class ComprehensionExpr extends SelectionExpr {
  public final Comprehension comprehension_;

  public ComprehensionExpr(Comprehension p1) { comprehension_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.SelectionExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.ComprehensionExpr) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.ComprehensionExpr x = (com.biosimilarity.GraphL.model.GraphL.Absyn.ComprehensionExpr)o;
      return this.comprehension_.equals(x.comprehension_);
    }
    return false;
  }

  public int hashCode() {
    return this.comprehension_.hashCode();
  }


}
