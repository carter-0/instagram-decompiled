package X;

import java.util.List;

public final class NVJ extends C69583NoR {
    public final int A00;
    public final int A01;
    public final C266444Yx A02;
    public final C266444Yx A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public NVJ(C266444Yx r2, C266444Yx r3, Integer num, String str, String str2, List list, int i, int i2) {
        0qQ.A0B(num, 1);
        this.A04 = num;
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = str;
        this.A00 = i;
        this.A07 = list;
        this.A01 = i2;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NVJ) {
                NVJ nvj = (NVJ) obj;
                if (this.A04 != nvj.A04 || !0qQ.A0K(this.A03, nvj.A03) || !0qQ.A0K(this.A02, nvj.A02) || !0qQ.A0K(this.A06, nvj.A06) || this.A00 != nvj.A00 || !0qQ.A0K(this.A07, nvj.A07) || this.A01 != nvj.A01 || !0qQ.A0K(this.A05, nvj.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, C69908NuA.A00(this.A04) * 31)) + AnonymousClass7TG.A0E(this.A06)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + this.A01) * 31) + C41845B3m.A00(this.A05);
    }
}
