package com.biosimilarity.GraphL.model.GraphL.Absyn; // Java Package generated by the BNF Converter.

public abstract class GraphExtensionBuiltin implements java.io.Serializable {
  public abstract <R,A> R accept(GraphExtensionBuiltin.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.GraphL.model.GraphL.Absyn.GraphComponents p, A arg);

  }

}
