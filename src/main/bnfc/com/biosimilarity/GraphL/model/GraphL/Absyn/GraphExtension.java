package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class GraphExtension implements java.io.Serializable {
  public abstract <R,A> R accept(GraphExtension.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtensionForm p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphExtensionBuiltinExpr p, A arg);

  }

}