package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class LogicalOrDecl implements java.io.Serializable {
  public abstract <R,A> R accept(LogicalOrDecl.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.JudgmentExpr p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.DeclIn p, A arg);

  }

}
