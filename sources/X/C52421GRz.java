package X;

/* renamed from: X.GRz  reason: case insensitive filesystem */
public final class C52421GRz extends AnonymousClass0T0 {
    public final C46519DgM A00;
    public final AnonymousClass3UM A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A = true;
    public final boolean A0B = true;

    public C52421GRz(C46519DgM dgM, AnonymousClass3UM r4, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        0qQ.A0B(dgM, 11);
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A02 = str6;
        this.A08 = z;
        this.A09 = z2;
        this.A00 = dgM;
        this.A01 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52421GRz) {
                C52421GRz gRz = (C52421GRz) obj;
                if (!0qQ.A0K(this.A05, gRz.A05) || !0qQ.A0K(this.A04, gRz.A04) || !0qQ.A0K(this.A06, gRz.A06) || !0qQ.A0K(this.A07, gRz.A07) || !0qQ.A0K(this.A03, gRz.A03) || !0qQ.A0K(this.A02, gRz.A02) || this.A0B != gRz.A0B || this.A0A != gRz.A0A || this.A08 != gRz.A08 || this.A09 != gRz.A09 || this.A00 != gRz.A00 || !0qQ.A0K(this.A01, gRz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A05));
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0B, (((((AnonymousClass7TF.A08(this.A06, A082) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02)) * 31))))));
    }
}
