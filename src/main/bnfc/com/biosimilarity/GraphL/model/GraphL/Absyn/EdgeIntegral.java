package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class EdgeIntegral extends Edge {
  public final Integer integer_;

  public EdgeIntegral(Integer p1) { integer_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.Edge.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeIntegral) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeIntegral x = (com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeIntegral)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}
