package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class GraphExtenionExpr extends GraphCollection {
  public final GraphExtension graphextension_;

  public GraphExtenionExpr(GraphExtension p1) { graphextension_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphCollection.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtenionExpr) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtenionExpr x = (com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtenionExpr)o;
      return this.graphextension_.equals(x.graphextension_);
    }
    return false;
  }

  public int hashCode() {
    return this.graphextension_.hashCode();
  }


}
