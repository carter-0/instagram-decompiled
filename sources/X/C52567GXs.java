package X;

/* renamed from: X.GXs  reason: case insensitive filesystem */
public final class C52567GXs extends AnonymousClass0T0 {
    public final AnonymousClass3VL A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52567GXs) {
                C52567GXs gXs = (C52567GXs) obj;
                if (this.A00 != gXs.A00 || this.A04 != gXs.A04 || !0qQ.A0K(this.A07, gXs.A07) || !0qQ.A0K(this.A03, gXs.A03) || !0qQ.A0K(this.A06, gXs.A06) || !0qQ.A0K(this.A01, gXs.A01) || !0qQ.A0K(this.A05, gXs.A05) || !0qQ.A0K(this.A02, gXs.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        Integer num = this.A04;
        return ((((((((((AnonymousClass7TG.A0B(num, C56321HwY.A01(num), A0K) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C52567GXs(AnonymousClass3VL r1, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2) {
        this.A00 = r1;
        this.A04 = num;
        this.A07 = str;
        this.A03 = num2;
        this.A06 = str2;
        this.A01 = num3;
        this.A05 = num4;
        this.A02 = num5;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ArbiterEvent(surface=");
        A1A.append(this.A00);
        A1A.append(", name=");
        Integer num = this.A04;
        if (num != null) {
            str = C56321HwY.A01(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", responseId=");
        A1A.append(this.A07);
        A1A.append(", index=");
        A1A.append(this.A03);
        A1A.append(", mediaId=");
        A1A.append(this.A06);
        A1A.append(", dedupExistingItemIndex=");
        A1A.append(this.A01);
        A1A.append(", serverGap=");
        A1A.append(this.A05);
        A1A.append(", gapAtBorder=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
