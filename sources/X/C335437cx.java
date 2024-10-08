package X;

/* renamed from: X.7cx  reason: invalid class name and case insensitive filesystem */
public final class C335437cx extends AnonymousClass0T0 implements C334087ae {
    public final 1Xj A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final Integer A04;
    public final boolean A05;

    public C335437cx(1Xj r2, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(num, 1);
        this.A04 = num;
        this.A02 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A01 = z4;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335437cx) {
                C335437cx r5 = (C335437cx) obj;
                if (!(this.A04 == r5.A04 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A01 == r5.A01 && 0qQ.A0K(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "SPONSORED";
                break;
            case 2:
                str = "DEFAULT_COMMENTS";
                break;
            case 3:
                str = "CAROUSEL_CHILD_MEDIA_COMMENTS";
                break;
            case 4:
                str = "PHOTO";
                break;
            case 5:
                str = "VIDEO";
                break;
            case 6:
                str = "POST";
                break;
            default:
                str = "EMPTY";
                break;
        }
        int hashCode2 = (str.hashCode() + intValue) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A01) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        1Xj r0 = this.A00;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return i8 + hashCode;
    }
}
