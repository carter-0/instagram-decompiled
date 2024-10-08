package X;

/* renamed from: X.SnW  reason: case insensitive filesystem */
public final class C12126SnW implements AnonymousClass0S9 {
    public final int A00;
    public volatile Object A01;

    public final Object get() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = Xr6.A00(this.A00);
                }
            }
        }
        return this.A01;
    }

    public C12126SnW(int i) {
        this.A00 = i;
    }
}
