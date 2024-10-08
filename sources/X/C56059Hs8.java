package X;

/* renamed from: X.Hs8  reason: case insensitive filesystem */
public final class C56059Hs8 {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56059Hs8) && this.A00 == ((C56059Hs8) obj).A00);
    }

    public final int hashCode() {
        int A002 = G9w.A00(this.A00);
        int floatToIntBits = Float.floatToIntBits(10.0f);
        return ((A002 + floatToIntBits) * 31) + floatToIntBits;
    }

    public C56059Hs8(float f) {
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ResistanceConfig(basis=");
        A1A.append(this.A00);
        A1A.append(", factorAtMin=");
        A1A.append(10.0f);
        A1A.append(", factorAtMax=");
        A1A.append(10.0f);
        return AnonymousClass7TG.A0p(A1A);
    }
}
