package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class EdgeWildcard extends EdgePlus {
  public final String wild_;

  public EdgeWildcard(String p1) { wild_ = p1; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgePlus.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeWildcard) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeWildcard x = (com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeWildcard)o;
      return this.wild_.equals(x.wild_);
    }
    return false;
  }

  public int hashCode() {
    return this.wild_.hashCode();
  }


}
