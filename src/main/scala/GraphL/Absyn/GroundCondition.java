package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class GroundCondition implements java.io.Serializable {
  public abstract <R,A> R accept(GroundCondition.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.VertexBuiltinExpr p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphBuiltinExpr p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.AtomicCondition p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.NegatedCondition p, A arg);

  }

}
