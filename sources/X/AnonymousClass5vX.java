package X;

/* renamed from: X.5vX  reason: invalid class name */
public final class AnonymousClass5vX extends AnonymousClass0T0 {
    public final int A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass62P A05;
    public final AnonymousClass62P A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass5vX(Boolean bool, Integer num, String str, String str2, AnonymousClass62P r6, AnonymousClass62P r7, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(r6, 4);
        0qQ.A0B(r7, 5);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = num;
        this.A06 = r6;
        this.A05 = r7;
        this.A0A = z;
        this.A00 = i;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5vX) {
                AnonymousClass5vX r5 = (AnonymousClass5vX) obj;
                if (!(0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A04, r5.A04) && this.A02 == r5.A02 && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A05, r5.A05) && this.A0A == r5.A0A && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A09 == r5.A09 && 0qQ.A0K(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A02;
        int hashCode2 = ((((((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + C292845jc.A00(num).hashCode() + num.intValue()) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int i2 = (((hashCode2 + i) * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        Boolean bool = this.A01;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return i8 + hashCode;
    }
}
