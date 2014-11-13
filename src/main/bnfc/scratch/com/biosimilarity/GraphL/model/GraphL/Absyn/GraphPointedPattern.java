package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class GraphPointedPattern extends GraphDeconstructor {
  public final VertexDeconstructor vertexdeconstructor_;

  public GraphPointedPattern(VertexDeconstructor p1) { vertexdeconstructor_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphDeconstructor.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.GraphPointedPattern) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.GraphPointedPattern x = (com.biosimilarity.GraphL.model.GraphL.Absyn.GraphPointedPattern)o;
      return this.vertexdeconstructor_.equals(x.vertexdeconstructor_);
    }
    return false;
  }

  public int hashCode() {
    return this.vertexdeconstructor_.hashCode();
  }


}
