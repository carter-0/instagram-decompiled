package X;

/* renamed from: X.UKq  reason: case insensitive filesystem */
public final class C15037UKq extends AnonymousClass0T0 {
    public final C17653Vbj A00;
    public final Boolean A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final int A08;
    public final String A09;
    public final String A0A;

    public C15037UKq(C17653Vbj vbj, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        0qQ.A0B(str5, 6);
        this.A07 = str;
        this.A01 = bool;
        this.A09 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A05 = str5;
        this.A08 = i;
        this.A00 = vbj;
        this.A04 = str6;
        this.A02 = l;
        this.A0A = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15037UKq) {
                C15037UKq uKq = (C15037UKq) obj;
                if (!0qQ.A0K(this.A07, uKq.A07) || !0qQ.A0K(this.A01, uKq.A01) || !0qQ.A0K(this.A09, uKq.A09) || !0qQ.A0K(this.A03, uKq.A03) || !0qQ.A0K(this.A06, uKq.A06) || !0qQ.A0K(this.A05, uKq.A05) || this.A08 != uKq.A08 || !0qQ.A0K(this.A00, uKq.A00) || !0qQ.A0K(this.A04, uKq.A04) || !0qQ.A0K(this.A02, uKq.A02) || !0qQ.A0K(this.A0A, uKq.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.A05, ((((((((AnonymousClass7TG.A0E(this.A07) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + this.A08) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A0A);
    }
}
