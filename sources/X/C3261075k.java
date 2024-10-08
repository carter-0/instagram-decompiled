package X;

/* renamed from: X.75k  reason: invalid class name and case insensitive filesystem */
public final class C3261075k extends C3260875i {
    public final int A00;
    public final C3260875i A01;
    public final C3260875i A02;
    public final AnonymousClass7OS A03;
    public final AnonymousClass7OR A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public C3261075k(C3260875i r2, C3260875i r3, AnonymousClass7OS r4, AnonymousClass7OR r5, Integer num, String str, String str2, int i, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r4, 4);
        0qQ.A0B(r5, 5);
        0qQ.A0B(r2, 7);
        0qQ.A0B(r3, 8);
        this.A07 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = num;
        this.A01 = r2;
        this.A02 = r3;
        this.A08 = z;
        this.A09 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3261075k) {
                C3261075k r5 = (C3261075k) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || this.A00 != r5.A00 || this.A03 != r5.A03 || this.A04 != r5.A04 || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || this.A08 != r5.A08 || this.A09 != r5.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A07.hashCode() * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
        Integer num = this.A05;
        if (num != null) {
            i = num.hashCode();
        }
        int hashCode4 = (((((hashCode3 + i) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int i3 = (hashCode4 + i2) * 31;
        int i4 = 1237;
        if (this.A09) {
            i4 = 1231;
        }
        return i3 + i4;
    }
}
