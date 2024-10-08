package X;

/* renamed from: X.N9a  reason: case insensitive filesystem */
public final class C68287N9a extends AnonymousClass0T0 implements C74270Pry {
    public final float A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68287N9a) {
                C68287N9a n9a = (C68287N9a) obj;
                if (!(this.A01 == n9a.A01 && Float.compare(this.A00, n9a.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A01) + Float.floatToIntBits(this.A00);
    }

    public C68287N9a(boolean z, float f) {
        this.A01 = z;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallBottomSheetViewModel(show=");
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(203));
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
