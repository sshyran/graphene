package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class GraphDeconstructor implements java.io.Serializable {
  public abstract <R,A> R accept(GraphDeconstructor.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphIsolatedPattern p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphPointedPattern p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphConnectedPattern p, A arg);
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphLiteral p, A arg);

  }

}
