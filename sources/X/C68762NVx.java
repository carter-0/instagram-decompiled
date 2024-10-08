package X;

/* renamed from: X.NVx  reason: case insensitive filesystem */
public final class C68762NVx extends C69587NoV {
    public final C66920MfE A00;
    public final N4G A01;
    public final C61046Jvk A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68762NVx) {
                C68762NVx nVx = (C68762NVx) obj;
                if (!0qQ.A0K(this.A02, nVx.A02) || !0qQ.A0K(this.A03, nVx.A03) || !0qQ.A0K(this.A04, nVx.A04) || !0qQ.A0K(this.A05, nVx.A05) || !0qQ.A0K(this.A01, nVx.A01) || this.A06 != nVx.A06 || !0qQ.A0K(this.A00, nVx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A02));
        return AnonymousClass7TF.A09(this.A06, (((AnonymousClass7TF.A08(this.A04, A08) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C68762NVx(C66920MfE mfE, N4G n4g, C61046Jvk jvk, String str, String str2, String str3, boolean z) {
        this.A02 = jvk;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = n4g;
        this.A06 = z;
        this.A00 = mfE;
    }
}
