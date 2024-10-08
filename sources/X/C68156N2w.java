package X;

/* renamed from: X.N2w  reason: case insensitive filesystem */
public final class C68156N2w extends AnonymousClass0T0 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68156N2w) {
                C68156N2w n2w = (C68156N2w) obj;
                if (!0qQ.A0K(this.A04, n2w.A04) || !0qQ.A0K(this.A00, n2w.A00) || !0qQ.A0K(this.A05, n2w.A05) || !0qQ.A0K(this.A06, n2w.A06) || !0qQ.A0K(this.A03, n2w.A03) || !0qQ.A0K(this.A01, n2w.A01) || !0qQ.A0K(this.A02, n2w.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C68156N2w(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3) {
        this.A04 = str;
        this.A00 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = l;
        this.A01 = num2;
        this.A02 = num3;
    }
}
