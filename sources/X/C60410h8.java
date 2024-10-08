package X;

/* renamed from: X.0h8  reason: invalid class name and case insensitive filesystem */
public final class C60410h8 implements AnonymousClass0S9 {
    public AnonymousClass0eK A00;
    public Object A01;

    public final Object get() {
        if (this.A00 != null) {
            synchronized (this) {
                AnonymousClass0eK r0 = this.A00;
                if (r0 != null) {
                    this.A01 = r0.get();
                    this.A00 = null;
                }
            }
        }
        return this.A01;
    }
}
