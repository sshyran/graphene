package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class GraphIsolatedCond extends StructureCondition {
  public final StructureCondition structurecondition_1, structurecondition_2;

  public GraphIsolatedCond(StructureCondition p1, StructureCondition p2) { structurecondition_1 = p1; structurecondition_2 = p2; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.StructureCondition.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.GraphIsolatedCond) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.GraphIsolatedCond x = (com.biosimilarity.GraphL.model.GraphL.Absyn.GraphIsolatedCond)o;
      return this.structurecondition_1.equals(x.structurecondition_1) && this.structurecondition_2.equals(x.structurecondition_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.structurecondition_1.hashCode())+this.structurecondition_2.hashCode();
  }


}
