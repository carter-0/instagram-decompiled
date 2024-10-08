package X;

/* renamed from: X.UKi  reason: case insensitive filesystem */
public final class C15029UKi extends AnonymousClass0T0 {
    public final long A00;
    public final C376699Iz A01;
    public final C61070Jw8 A02;
    public final C294175lz A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final long A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15029UKi) {
                C15029UKi uKi = (C15029UKi) obj;
                if (!0qQ.A0K(this.A05, uKi.A05) || this.A00 != uKi.A00 || this.A07 != uKi.A07 || !0qQ.A0K(this.A06, uKi.A06) || !0qQ.A0K(this.A08, uKi.A08) || !0qQ.A0K(this.A01, uKi.A01) || !0qQ.A0K(this.A04, uKi.A04) || !0qQ.A0K(this.A03, uKi.A03) || !0qQ.A0K(this.A02, uKi.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TF.A01(this.A07, AnonymousClass7TF.A01(this.A00, AnonymousClass7TE.A0O(this.A05))) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31;
    }

    public C15029UKi(C376699Iz r1, C61070Jw8 jw8, C294175lz r3, String str, String str2, String str3, String str4, long j, long j2) {
        this.A05 = str;
        this.A00 = j;
        this.A07 = j2;
        this.A06 = str2;
        this.A08 = str3;
        this.A01 = r1;
        this.A04 = str4;
        this.A03 = r3;
        this.A02 = jw8;
    }
}
