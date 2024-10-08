package X;

/* renamed from: X.GEc  reason: case insensitive filesystem */
public final class C52082GEc extends AnonymousClass0T0 implements JN4 {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final 1Xj A02;
    public final boolean A03;
    public final boolean A04;
    public final C295365o2 A05;
    public final Integer A06;

    public C52082GEc(C267324bN r2, C295365o2 r3, C52058GDe gDe, 1Xj r5, Integer num, boolean z, boolean z2) {
        0qQ.A0B(r3, 4);
        this.A00 = r2;
        this.A01 = gDe;
        this.A02 = r5;
        this.A05 = r3;
        this.A06 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52082GEc) {
                C52082GEc gEc = (C52082GEc) obj;
                if (!0qQ.A0K(this.A00, gEc.A00) || !0qQ.A0K(this.A01, gEc.A01) || !0qQ.A0K(this.A02, gEc.A02) || this.A05 != gEc.A05 || !0qQ.A0K(this.A06, gEc.A06) || this.A03 != gEc.A03 || this.A04 != gEc.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A03, (AnonymousClass7TF.A07(this.A05, A07) + AnonymousClass7TG.A0C(this.A06)) * 31));
    }
}
