package X;

/* renamed from: X.JyE  reason: case insensitive filesystem */
public final class C61162JyE extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final AnonymousClass8MK A01;
    public final C317966o8 A02;
    public final String A03;

    public C61162JyE(AnonymousClass8MK r2, C317966o8 r3, String str, int i) {
        0qQ.A0B(r3, 2);
        this.A00 = i;
        this.A02 = r3;
        this.A03 = str;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61162JyE) {
                C61162JyE jyE = (C61162JyE) obj;
                if (this.A00 != jyE.A00 || !0qQ.A0K(this.A02, jyE.A02) || !0qQ.A0K(this.A03, jyE.A03) || !0qQ.A0K(this.A01, jyE.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A02.A0S;
        0qQ.A07(str);
        return str;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A07(this.A02, i) + AnonymousClass7TG.A0E(this.A03)) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61162JyE jyE = (C61162JyE) obj;
        0qQ.A0B(jyE, 0);
        return 0qQ.A0K(this.A02.A0H, jyE.A02.A0H);
    }
}
