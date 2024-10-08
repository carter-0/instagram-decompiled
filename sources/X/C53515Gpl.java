package X;

/* renamed from: X.Gpl  reason: case insensitive filesystem */
public final class C53515Gpl extends AnonymousClass0T0 implements C59551JNx {
    public final AnonymousClass2DO A00;
    public final C59487JLl A01;
    public final String A02;
    public final C62320sa A03;

    public static AnonymousClass62O A00(C286565Wx r1, AnonymousClass2DO r2, Object obj, String str) {
        C286565Wx.A0L(r1, false);
        return AnonymousClass62Q.A04(new C53515Gpl(r2, C57114IPd.A00, str, (C62320sa) obj));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53515Gpl) {
                C53515Gpl gpl = (C53515Gpl) obj;
                if (!0qQ.A0K(this.A00, gpl.A00) || !0qQ.A0K(this.A03, gpl.A03) || !0qQ.A0K(this.A02, gpl.A02) || !0qQ.A0K(this.A01, gpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C62320sa BXy() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A02)) * 31 * 31);
    }

    public C53515Gpl(AnonymousClass2DO r1, C59487JLl jLl, String str, C62320sa r4) {
        AnonymousClass7TG.A1O(r1, r4);
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = str;
        this.A01 = jLl;
    }
}
