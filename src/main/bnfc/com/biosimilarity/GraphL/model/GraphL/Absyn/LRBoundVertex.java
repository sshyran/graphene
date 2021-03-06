package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class LRBoundVertex extends VertexBinding {
  public final VertexDeconstructor vertexdeconstructor_;
  public final Vertex vertex_;

  public LRBoundVertex(VertexDeconstructor p1, Vertex p2) { vertexdeconstructor_ = p1; vertex_ = p2; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.VertexBinding.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.LRBoundVertex) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.LRBoundVertex x = (com.biosimilarity.GraphL.model.GraphL.Absyn.LRBoundVertex)o;
      return this.vertexdeconstructor_.equals(x.vertexdeconstructor_) && this.vertex_.equals(x.vertex_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.vertexdeconstructor_.hashCode())+this.vertex_.hashCode();
  }


}
