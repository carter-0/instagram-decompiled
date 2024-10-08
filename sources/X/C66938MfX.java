package X;

/* renamed from: X.MfX  reason: case insensitive filesystem */
public final class C66938MfX extends AnonymousClass4AA {
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66938MfX) {
                C66938MfX mfX = (C66938MfX) obj;
                if (this.A00 != mfX.A00 || !0qQ.A0K(this.A01, mfX.A01) || this.A02 != mfX.A02 || !0qQ.A0K(this.A03, mfX.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31)));
    }

    public C66938MfX(String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
