package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class EdgeGenerator implements java.io.Serializable {
  public abstract <R,A> R accept(EdgeGenerator.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.LRGenEdge p, A arg);

  }

}
