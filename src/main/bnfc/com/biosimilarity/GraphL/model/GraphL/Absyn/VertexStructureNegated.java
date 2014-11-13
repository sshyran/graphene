package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class VertexStructureNegated extends VertexStructureCondition {
  public final VertexStructureCondition vertexstructurecondition_;

  public VertexStructureNegated(VertexStructureCondition p1) { vertexstructurecondition_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.VertexStructureCondition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.VertexStructureNegated) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.VertexStructureNegated x = (com.biosimilarity.GraphL.model.GraphL.Absyn.VertexStructureNegated)o;
      return this.vertexstructurecondition_.equals(x.vertexstructurecondition_);
    }
    return false;
  }

  public int hashCode() {
    return this.vertexstructurecondition_.hashCode();
  }


}
