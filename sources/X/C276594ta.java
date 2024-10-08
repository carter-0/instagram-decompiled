package X;

/* renamed from: X.4ta  reason: invalid class name and case insensitive filesystem */
public final class C276594ta {
    public final C64351Ki A00;
    public volatile Object A01;

    public final Object A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = this.A00.get();
                }
            }
        }
        return this.A01;
    }

    public C276594ta(C64351Ki r1) {
        this.A00 = r1;
    }
}
