package X;

import com.facebook.rsys.mediasync.gen.MediaSyncContent;

public final class N32 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final MediaSyncContent A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;

    public N32(MediaSyncContent mediaSyncContent, Integer num, Long l, String str, String str2, int i, int i2, int i3) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A05 = l;
        this.A03 = mediaSyncContent;
        this.A01 = i3;
        this.A07 = str2;
        this.A04 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N32) {
                N32 n32 = (N32) obj;
                if (this.A00 != n32.A00 || !0qQ.A0K(this.A06, n32.A06) || this.A02 != n32.A02 || !0qQ.A0K(this.A05, n32.A05) || !0qQ.A0K(this.A03, n32.A03) || this.A01 != n32.A01 || !0qQ.A0K(this.A07, n32.A07) || !0qQ.A0K(this.A04, n32.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TF.A08(this.A06, this.A00 * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31 * 31;
    }
}
