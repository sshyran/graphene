package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class GraphComprehensionForm extends GraphComprehension {
  public final GraphGenerator graphgenerator_;
  public final ListConditionOrDecl listconditionordecl_;

  public GraphComprehensionForm(GraphGenerator p1, ListConditionOrDecl p2) { graphgenerator_ = p1; listconditionordecl_ = p2; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphComprehension.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.GraphComprehensionForm) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.GraphComprehensionForm x = (com.biosimilarity.GraphL.model.GraphL.Absyn.GraphComprehensionForm)o;
      return this.graphgenerator_.equals(x.graphgenerator_) && this.listconditionordecl_.equals(x.listconditionordecl_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.graphgenerator_.hashCode())+this.listconditionordecl_.hashCode();
  }


}
