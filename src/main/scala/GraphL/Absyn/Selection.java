package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class Selection extends SelectionExpr {
  public final ListBinding listbinding_;
  public final GraphExpr graphexpr_;

  public Selection(ListBinding p1, GraphExpr p2) { listbinding_ = p1; graphexpr_ = p2; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.SelectionExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.Selection) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.Selection x = (com.biosimilarity.GraphL.model.GraphL.Absyn.Selection)o;
      return this.listbinding_.equals(x.listbinding_) && this.graphexpr_.equals(x.graphexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listbinding_.hashCode())+this.graphexpr_.hashCode();
  }


}
