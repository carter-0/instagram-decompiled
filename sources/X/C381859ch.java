package X;

import com.instagram.api.schemas.DirectMediaFallbackUrl;

/* renamed from: X.9ch  reason: invalid class name and case insensitive filesystem */
public final class C381859ch extends AnonymousClass0T0 implements YBN {
    public final DirectMediaFallbackUrl A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381859ch) {
                C381859ch r5 = (C381859ch) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03)) {
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

    public C381859ch(DirectMediaFallbackUrl directMediaFallbackUrl, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A00 = directMediaFallbackUrl;
        this.A01 = num;
        this.A05 = str;
        this.A02 = num2;
        this.A06 = str2;
        this.A04 = l;
        this.A03 = num3;
    }
}
