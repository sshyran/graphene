package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public class EdgeComprehensionForm extends EdgeComprehension {
  public final EdgeGenerator edgegenerator_;
  public final ListLogicalOrDecl listlogicalordecl_;

  public EdgeComprehensionForm(EdgeGenerator p1, ListLogicalOrDecl p2) { edgegenerator_ = p1; listlogicalordecl_ = p2; }

  public <R,A> R accept(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeComprehension.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeComprehensionForm) {
      com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeComprehensionForm x = (com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeComprehensionForm)o;
      return this.edgegenerator_.equals(x.edgegenerator_) && this.listlogicalordecl_.equals(x.listlogicalordecl_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.edgegenerator_.hashCode())+this.listlogicalordecl_.hashCode();
  }


}
