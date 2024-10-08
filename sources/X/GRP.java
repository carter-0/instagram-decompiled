package X;

public abstract class GRP {
    public JNL A00;
    public final Object A01;

    public GRP(JNL jnl, Object obj) {
        this.A01 = obj;
        this.A00 = jnl;
    }
}
