package X;

/* renamed from: X.4iy  reason: invalid class name and case insensitive filesystem */
public final class C271514iy {
    public Boolean A00;
    public Boolean A01;
    public final 0lg A02;

    public C271514iy(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
    }

    public final synchronized boolean A00() {
        boolean z;
        Boolean bool = this.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
            this.A01 = true;
        }
        return z;
    }
}
