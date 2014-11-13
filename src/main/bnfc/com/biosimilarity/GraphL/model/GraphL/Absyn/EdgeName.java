package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class EdgeName extends EdgePlus {
  public final Edge edge_;

  public EdgeName(Edge p1) { edge_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgePlus.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeName) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeName x = (com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeName)o;
      return this.edge_.equals(x.edge_);
    }
    return false;
  }

  public int hashCode() {
    return this.edge_.hashCode();
  }


}