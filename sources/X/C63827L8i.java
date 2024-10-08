package X;

/* renamed from: X.L8i  reason: case insensitive filesystem */
public final class C63827L8i {
    public final int A00;
    public final int A01;
    public final C62448Kfy A02;
    public final Object A03;
    public final boolean A04;

    public C63827L8i(C62448Kfy kfy, Object obj, int i, int i2, boolean z) {
        this.A02 = kfy;
        this.A03 = obj;
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
        if (kfy != C62448Kfy.REFRESH && obj == null) {
            throw AnonymousClass7TE.A0w("Key must be non-null for prepend/append");
        }
    }
}
