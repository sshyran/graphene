package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class GraphConnectedCond extends StructureCondition {
  public final EdgeLabelCondition edgelabelcondition_;
  public final StructureCondition structurecondition_1, structurecondition_2;

  public GraphConnectedCond(EdgeLabelCondition p1, StructureCondition p2, StructureCondition p3) { edgelabelcondition_ = p1; structurecondition_1 = p2; structurecondition_2 = p3; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.StructureCondition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.GraphConnectedCond) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.GraphConnectedCond x = (com.biosimilarity.GraphL.model.GraphL.Absyn.GraphConnectedCond)o;
      return this.edgelabelcondition_.equals(x.edgelabelcondition_) && this.structurecondition_1.equals(x.structurecondition_1) && this.structurecondition_2.equals(x.structurecondition_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.edgelabelcondition_.hashCode())+this.structurecondition_1.hashCode())+this.structurecondition_2.hashCode();
  }


}