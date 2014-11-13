package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class BoundEdge extends Binding {
  public final EdgeBinding edgebinding_;

  public BoundEdge(EdgeBinding p1) { edgebinding_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.Binding.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.BoundEdge) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.BoundEdge x = (com.biosimilarity.GraphL.model.GraphL.Absyn.BoundEdge)o;
      return this.edgebinding_.equals(x.edgebinding_);
    }
    return false;
  }

  public int hashCode() {
    return this.edgebinding_.hashCode();
  }


}
