package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class EdgeExpr implements java.io.Serializable {
  public abstract <R,A> R accept(EdgeExpr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeExprNominal p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.EdgeExprStruct p, A arg);

  }

}
