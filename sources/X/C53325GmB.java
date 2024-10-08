package X;

/* renamed from: X.GmB  reason: case insensitive filesystem */
public final class C53325GmB extends AnonymousClass0T0 {
    public final C62949Kp1 A00;
    public final C266444Yx A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53325GmB) {
                C53325GmB gmB = (C53325GmB) obj;
                if (!0qQ.A0K(this.A06, gmB.A06) || !0qQ.A0K(this.A05, gmB.A05) || !0qQ.A0K(this.A03, gmB.A03) || !0qQ.A0K(this.A07, gmB.A07) || !0qQ.A0K(this.A0D, gmB.A0D) || this.A0A != gmB.A0A || this.A0C != gmB.A0C || !0qQ.A0K(this.A00, gmB.A00) || !0qQ.A0K(this.A08, gmB.A08) || !0qQ.A0K(this.A02, gmB.A02) || !0qQ.A0K(this.A01, gmB.A01) || !0qQ.A0K(this.A09, gmB.A09) || this.A0B != gmB.A0B || !0qQ.A0K(this.A04, gmB.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A06));
        int A092 = AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0A, (((AnonymousClass7TF.A08(this.A03, A082) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31));
        return AnonymousClass7TF.A09(this.A0B, (((((((AnonymousClass7TF.A07(this.A00, A092) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + C41845B3m.A00(this.A04);
    }

    public C53325GmB(C62949Kp1 kp1, C266444Yx r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A07 = str4;
        this.A0D = str5;
        this.A0A = z;
        this.A0C = z2;
        this.A00 = kp1;
        this.A08 = str6;
        this.A02 = str7;
        this.A01 = r2;
        this.A09 = str8;
        this.A0B = z3;
        this.A04 = str9;
    }
}
