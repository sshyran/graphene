package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class EdgeComprehension implements java.io.Serializable {
  public abstract <R,A> R accept(EdgeComprehension.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeComprehensionForm p, A arg);

  }

}