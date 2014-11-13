package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class EdgeIntension extends EdgeCollection {
  public final EdgeComprehension edgecomprehension_;

  public EdgeIntension(EdgeComprehension p1) { edgecomprehension_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeCollection.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeIntension) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeIntension x = (com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeIntension)o;
      return this.edgecomprehension_.equals(x.edgecomprehension_);
    }
    return false;
  }

  public int hashCode() {
    return this.edgecomprehension_.hashCode();
  }


}