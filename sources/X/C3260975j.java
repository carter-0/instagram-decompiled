package X;

/* renamed from: X.75j  reason: invalid class name and case insensitive filesystem */
public final class C3260975j extends C3260875i {
    public final int A00;
    public final AnonymousClass78Y A01;
    public final AnonymousClass7OS A02;
    public final AnonymousClass7OR A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08 = true;

    public C3260975j(AnonymousClass78Y r3, AnonymousClass7OS r4, AnonymousClass7OR r5, Integer num, String str, String str2, String str3, int i) {
        0qQ.A0B(r4, 4);
        0qQ.A0B(r5, 5);
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = num;
        this.A01 = r3;
        this.A07 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3260975j) {
                C3260975j r5 = (C3260975j) obj;
                if (!0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || this.A00 != r5.A00 || this.A02 != r5.A02 || this.A03 != r5.A03 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || this.A08 != r5.A08 || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A07() {
        String str = this.A06;
        if (str.length() <= 0 || str.charAt(0) != this.A03.A00) {
            return 002.A0D(str, this.A03.A00);
        }
        return str;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A06.hashCode() * 31;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((((((hashCode3 + hashCode) * 31) + this.A00) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode2) * 31) + this.A01.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int i3 = (hashCode5 + i2) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }
}
