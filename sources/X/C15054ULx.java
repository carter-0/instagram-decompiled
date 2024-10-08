package X;

/* renamed from: X.ULx  reason: case insensitive filesystem */
public final class C15054ULx extends AnonymousClass0T0 {
    public final long A00;
    public final C263944Ny A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Double A05;
    public final Long A06;
    public final Long A07;

    public static Long A01(0Aj r3, C15054ULx uLx) {
        r3.AAE(uLx.A01, "advertiser_id");
        r3.A9F("catalog_id", (Long) null);
        return Long.valueOf(uLx.A00);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15054ULx) {
                C15054ULx uLx = (C15054ULx) obj;
                if (this.A00 != uLx.A00 || !0qQ.A0K(this.A01, uLx.A01) || !0qQ.A0K(this.A04, uLx.A04) || !0qQ.A0K(this.A02, uLx.A02) || !0qQ.A0K(this.A07, uLx.A07) || !0qQ.A0K(this.A06, uLx.A06) || !0qQ.A0K(this.A03, uLx.A03) || !0qQ.A0K(this.A05, uLx.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static Long A00(0Aj r2, C15054ULx uLx) {
        r2.AAE(uLx.A01, "advertiser_id");
        r2.A9F("catalog_id", (Long) null);
        return Long.valueOf(uLx.A00);
    }

    public static void A02(0Aj r2, C15054ULx uLx) {
        r2.A9F("product_id", Long.valueOf(uLx.A00));
        r2.AAE(uLx.A01, "merchant_id");
    }

    public final int hashCode() {
        return ((((((((((AnonymousClass7TF.A07(this.A01, C51968G9o.A03(this.A00) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public C15054ULx(C263944Ny r1, Boolean bool, Boolean bool2, Boolean bool3, Double d, Long l, Long l2, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A04 = bool;
        this.A02 = bool2;
        this.A07 = l;
        this.A06 = l2;
        this.A03 = bool3;
        this.A05 = d;
    }
}
