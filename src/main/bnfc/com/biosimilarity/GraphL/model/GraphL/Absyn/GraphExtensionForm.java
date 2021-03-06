package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class GraphExtensionForm extends GraphExtension {
  public final ListGraphExpr listgraphexpr_;

  public GraphExtensionForm(ListGraphExpr p1) { listgraphexpr_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtension.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtensionForm) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtensionForm x = (com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtensionForm)o;
      return this.listgraphexpr_.equals(x.listgraphexpr_);
    }
    return false;
  }

  public int hashCode() {
    return this.listgraphexpr_.hashCode();
  }


}
