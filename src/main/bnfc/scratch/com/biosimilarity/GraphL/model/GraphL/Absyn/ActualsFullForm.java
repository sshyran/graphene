package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class ActualsFullForm extends Actuals {
  public final ListVertexActual listvertexactual_;
  public final ListEdgeActual listedgeactual_;

  public ActualsFullForm(ListVertexActual p1, ListEdgeActual p2) { listvertexactual_ = p1; listedgeactual_ = p2; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.Actuals.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.ActualsFullForm) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.ActualsFullForm x = (com.biosimilarity.GraphL.model.GraphL.Absyn.ActualsFullForm)o;
      return this.listvertexactual_.equals(x.listvertexactual_) && this.listedgeactual_.equals(x.listedgeactual_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listvertexactual_.hashCode())+this.listedgeactual_.hashCode();
  }


}
