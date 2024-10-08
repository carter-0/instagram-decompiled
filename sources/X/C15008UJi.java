package X;

/* renamed from: X.UJi  reason: case insensitive filesystem */
public abstract class C15008UJi extends C240473La {
    public final void finalize() {
        if (!isClosed()) {
            0I1.A09("CloseableImage", "finalize: %s %x still open.", C51968G9o.A1Z(C51968G9o.A16(this), System.identityHashCode(this)));
            close();
        }
    }
}
