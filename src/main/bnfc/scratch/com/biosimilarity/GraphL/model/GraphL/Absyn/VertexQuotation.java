package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class VertexQuotation extends Vertex {
  public final GraphExpr graphexpr_;

  public VertexQuotation(GraphExpr p1) { graphexpr_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.Vertex.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.VertexQuotation) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.VertexQuotation x = (com.biosimilarity.GraphL.model.GraphL.Absyn.VertexQuotation)o;
      return this.graphexpr_.equals(x.graphexpr_);
    }
    return false;
  }

  public int hashCode() {
    return this.graphexpr_.hashCode();
  }


}
