package X;

/* renamed from: X.Qdh  reason: case insensitive filesystem */
public final class C7944Qdh extends 2Z0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C7944Qdh(String str, String str2, int i, int i2, boolean z) {
        super(2Z1.A0L);
        this.A03 = str;
        this.A04 = z;
        this.A00 = i;
        this.A02 = !z ? null : str2;
        this.A01 = !z ? -1 : i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C66580MXl.A1V("videoId=", this.A03, A1A);
        Pxf.A1N(", isSucceeded=", A1A, this.A04);
        A1A.append(002.A0O(", invalidResponseCode=", this.A00));
        String str = this.A02;
        if (str != null) {
            C66580MXl.A1V(", loapStreamId=", str, A1A);
            A1A.append(002.A0O(", loapStreamType=", this.A01));
        }
        return A1A.toString();
    }
}
