package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class VertexBuiltinExpr extends GroundCondition {
  public final VertexBuiltin vertexbuiltin_;

  public VertexBuiltinExpr(VertexBuiltin p1) { vertexbuiltin_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GroundCondition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.VertexBuiltinExpr) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.VertexBuiltinExpr x = (com.biosimilarity.GraphL.model.GraphL.Absyn.VertexBuiltinExpr)o;
      return this.vertexbuiltin_.equals(x.vertexbuiltin_);
    }
    return false;
  }

  public int hashCode() {
    return this.vertexbuiltin_.hashCode();
  }


}