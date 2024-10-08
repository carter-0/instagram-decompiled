package X;

/* renamed from: X.Gbx  reason: case insensitive filesystem */
public final class C52745Gbx extends AnonymousClass0T0 implements JOY {
    public final C61083JwL A00;
    public final C61083JwL A01;
    public final C61083JwL A02;
    public final C61083JwL A03;
    public final C54611HKu A04;
    public final HLX A05;
    public final C64185LSs A06;
    public final XRZ A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A = true;

    public C52745Gbx(C61083JwL jwL, C61083JwL jwL2, C61083JwL jwL3, C61083JwL jwL4, C54611HKu hKu, HLX hlx, C64185LSs lSs, XRZ xrz, Integer num, boolean z) {
        AnonymousClass7TG.A1Q(xrz, jwL);
        0qQ.A0B(lSs, 8);
        this.A07 = xrz;
        this.A02 = jwL;
        this.A00 = jwL2;
        this.A03 = jwL3;
        this.A08 = num;
        this.A05 = hlx;
        this.A06 = lSs;
        this.A01 = jwL4;
        this.A09 = z;
        this.A04 = hKu;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52745Gbx) {
                C52745Gbx gbx = (C52745Gbx) obj;
                if (this.A0A != gbx.A0A || this.A07 != gbx.A07 || !0qQ.A0K(this.A02, gbx.A02) || !0qQ.A0K(this.A00, gbx.A00) || !0qQ.A0K(this.A03, gbx.A03) || !0qQ.A0K(this.A08, gbx.A08) || this.A05 != gbx.A05 || !0qQ.A0K(this.A06, gbx.A06) || !0qQ.A0K(this.A01, gbx.A01) || this.A09 != gbx.A09 || this.A04 != gbx.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CFb() {
        return this.A0A;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A07, C51965G9l.A05(this.A0A));
        C64185LSs lSs = this.A06;
        return AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A07(lSs, (((((((AnonymousClass7TF.A07(this.A02, A072) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NavigationRowUiState(visible=");
        A1A.append(this.A0A);
        A1A.append(", id=");
        A1A.append(this.A07);
        A1A.append(AnonymousClass000.A00(2030));
        A1A.append(this.A02);
        A1A.append(", accessibilityLabel=");
        A1A.append(this.A00);
        A1A.append(", subtitle=");
        A1A.append(this.A03);
        A1A.append(", iconRes=");
        A1A.append(this.A08);
        A1A.append(", cellType=");
        A1A.append(this.A05);
        A1A.append(", abstractDestination=");
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(2011));
        A1A.append(this.A01);
        A1A.append(", disableNavigationRowClick=");
        A1A.append(this.A09);
        A1A.append(", badgeStyle=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}
