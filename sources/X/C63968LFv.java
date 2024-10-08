package X;

/* renamed from: X.LFv  reason: case insensitive filesystem */
public final class C63968LFv {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63968LFv) {
                C63968LFv lFv = (C63968LFv) obj;
                if (this.A03 != lFv.A03 || !0qQ.A0K(this.A02, lFv.A02) || !0qQ.A0K(this.A00, lFv.A00) || !0qQ.A0K(this.A01, lFv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            str = "CREATED";
        } else {
            str = "GENERATED";
        }
        return ((AnonymousClass7TF.A08(this.A02, C51968G9o.A0F(str, intValue)) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public final String toString() {
        String str;
        if (this.A03.intValue() != 0) {
            str = "CREATED";
        } else {
            str = "GENERATED";
        }
        return 002.A17("PromptSummaryData(summaryType=", str, ", summaryText=", this.A02, Pxd.A00(10), this.A00, AnonymousClass000.A00(851), this.A01, ')');
    }

    public C63968LFv(Integer num, String str, String str2, String str3) {
        this.A03 = num;
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
