package X;

/* renamed from: X.7dk  reason: invalid class name and case insensitive filesystem */
public final class C335917dk extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335917dk) {
                C335917dk r5 = (C335917dk) obj;
                if (!(this.A08 == r5.A08 && this.A01 == r5.A01 && 0qQ.A0K(this.A04, r5.A04) && this.A03 == r5.A03 && this.A07 == r5.A07 && this.A00 == r5.A00 && 0qQ.A0K(this.A05, r5.A05) && this.A02 == r5.A02 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = ((i * 31) + this.A01) * 31;
        String str = this.A04;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int A002 = (((i2 + hashCode) * 31) + C393869x8.A00(this.A03)) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        int i5 = (((A002 + i4) * 31) + this.A00) * 31;
        String str2 = this.A05;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int A003 = (((i5 + i3) * 31) + C393869x8.A00(this.A02)) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        return A003 + i6;
    }

    public C335917dk(Integer num, Integer num2, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A08 = z;
        this.A01 = i;
        this.A04 = str;
        this.A03 = num;
        this.A07 = z2;
        this.A00 = i2;
        this.A05 = str2;
        this.A02 = num2;
        this.A06 = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C335917dk() {
        /*
            r10 = this;
            r3 = 0
            r5 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = r10
            r2 = r1
            r4 = r3
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335917dk.<init>():void");
    }
}
