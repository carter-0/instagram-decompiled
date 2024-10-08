package X;

import com.instagram.api.schemas.MediaType;

/* renamed from: X.6tC  reason: invalid class name and case insensitive filesystem */
public final class C320926tC extends AnonymousClass0T0 implements C320936tD {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final int A06;
    public final MediaType A07;
    public final String A08;

    public C320926tC(MediaType mediaType, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, int i, int i2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        this.A05 = str;
        this.A00 = i;
        this.A08 = str2;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A04 = num4;
        this.A07 = mediaType;
        this.A06 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C320926tC) {
                C320926tC r5 = (C320926tC) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || this.A00 != r5.A00 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || this.A07 != r5.A07 || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A05.hashCode() * 31) + this.A00) * 31) + this.A08.hashCode()) * 31;
        Integer num = this.A01;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A02;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A03;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A04;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MediaType mediaType = this.A07;
        if (mediaType != null) {
            i = mediaType.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.A06;
    }
}
