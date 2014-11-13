package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class LRGenGraph extends GraphGenerator {
  public final GraphDeconstructor graphdeconstructor_;
  public final GraphCollection graphcollection_;

  public LRGenGraph(GraphDeconstructor p1, GraphCollection p2) { graphdeconstructor_ = p1; graphcollection_ = p2; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphGenerator.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.LRGenGraph) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.LRGenGraph x = (com.biosimilarity.GraphL.model.GraphL.Absyn.LRGenGraph)o;
      return this.graphdeconstructor_.equals(x.graphdeconstructor_) && this.graphcollection_.equals(x.graphcollection_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.graphdeconstructor_.hashCode())+this.graphcollection_.hashCode();
  }


}
