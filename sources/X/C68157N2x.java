package X;

import com.instagram.api.schemas.DirectMediaFallbackUrl;

/* renamed from: X.N2x  reason: case insensitive filesystem */
public final class C68157N2x extends AnonymousClass0T0 {
    public final DirectMediaFallbackUrl A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68157N2x) {
                C68157N2x n2x = (C68157N2x) obj;
                if (!0qQ.A0K(this.A00, n2x.A00) || !0qQ.A0K(this.A01, n2x.A01) || !0qQ.A0K(this.A05, n2x.A05) || !0qQ.A0K(this.A02, n2x.A02) || !0qQ.A0K(this.A06, n2x.A06) || !0qQ.A0K(this.A04, n2x.A04) || !0qQ.A0K(this.A03, n2x.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C68157N2x(DirectMediaFallbackUrl directMediaFallbackUrl, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A00 = directMediaFallbackUrl;
        this.A01 = num;
        this.A05 = str;
        this.A02 = num2;
        this.A06 = str2;
        this.A04 = l;
        this.A03 = num3;
    }
}
