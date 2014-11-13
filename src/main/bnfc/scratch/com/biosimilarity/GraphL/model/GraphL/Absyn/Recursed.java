package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class Recursed extends GraphExpr {
  public final String uident_;
  public final Formals formals_;
  public final GraphExpr graphexpr_;
  public final Actuals actuals_;

  public Recursed(String p1, Formals p2, GraphExpr p3, Actuals p4) { uident_ = p1; formals_ = p2; graphexpr_ = p3; actuals_ = p4; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.Recursed) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.Recursed x = (com.biosimilarity.GraphL.model.GraphL.Absyn.Recursed)o;
      return this.uident_.equals(x.uident_) && this.formals_.equals(x.formals_) && this.graphexpr_.equals(x.graphexpr_) && this.actuals_.equals(x.actuals_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.uident_.hashCode())+this.formals_.hashCode())+this.graphexpr_.hashCode())+this.actuals_.hashCode();
  }


}
