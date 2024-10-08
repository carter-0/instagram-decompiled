package X;

/* renamed from: X.02I  reason: invalid class name */
public abstract class AnonymousClass02I implements AnonymousClass0eK {
    public Object A00;

    public abstract Object A00();

    public final synchronized Object get() {
        Object obj;
        obj = this.A00;
        if (obj == null) {
            obj = A00();
            this.A00 = obj;
        }
        return obj;
    }
}
