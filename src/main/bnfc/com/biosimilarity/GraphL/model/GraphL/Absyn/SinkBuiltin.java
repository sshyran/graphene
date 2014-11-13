package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class SinkBuiltin extends VertexBuiltin {
  public final VertexExpr vertexexpr_;

  public SinkBuiltin(VertexExpr p1) { vertexexpr_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.VertexBuiltin.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.SinkBuiltin) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.SinkBuiltin x = (com.biosimilarity.GraphL.model.GraphL.Absyn.SinkBuiltin)o;
      return this.vertexexpr_.equals(x.vertexexpr_);
    }
    return false;
  }

  public int hashCode() {
    return this.vertexexpr_.hashCode();
  }


}
