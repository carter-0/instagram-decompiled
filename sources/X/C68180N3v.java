package X;

/* renamed from: X.N3v  reason: case insensitive filesystem */
public final class C68180N3v extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Float A04;
    public final Float A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68180N3v) {
                C68180N3v n3v = (C68180N3v) obj;
                if (!(this.A06 == n3v.A06 && this.A0A == n3v.A0A && 0qQ.A0K(this.A07, n3v.A07) && 0qQ.A0K(this.A04, n3v.A04) && this.A09 == n3v.A09 && this.A03 == n3v.A03 && 0qQ.A0K(this.A08, n3v.A08) && 0qQ.A0K(this.A05, n3v.A05) && this.A00 == n3v.A00 && this.A0D == n3v.A0D && this.A02 == n3v.A02 && this.A01 == n3v.A01 && this.A0B == n3v.A0B && this.A0C == n3v.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int intValue = this.A06.intValue();
        if (1 != intValue) {
            str = "SQUARE";
        } else {
            str = "PORTRAIT";
        }
        int A0F = C51968G9o.A0F(str, intValue);
        int intValue2 = this.A0A.intValue();
        switch (intValue2) {
            case 1:
                str2 = "CENTER";
                break;
            case 2:
                str2 = "RIGHT";
                break;
            default:
                str2 = "LEFT";
                break;
        }
        int A0F2 = (((C51971G9r.A0F(str2, intValue2, A0F) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31;
        int intValue3 = this.A09.intValue();
        switch (intValue3) {
            case 1:
                str3 = "FIXED";
                break;
            case 2:
                str3 = "FIXED_RATIO";
                break;
            default:
                str3 = "DEFAULT";
                break;
        }
        boolean z = this.A0D;
        return DbS.A06(this.A0C, AnonymousClass7TF.A09(this.A0B, (((AnonymousClass7TF.A09(z, (((((((C51971G9r.A0F(str3, intValue3, A0F2) + this.A03) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31));
    }

    public C68180N3v(Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A06 = num;
        this.A0A = num2;
        this.A07 = num3;
        this.A04 = f;
        this.A09 = num4;
        this.A03 = i;
        this.A08 = num5;
        this.A05 = f2;
        this.A00 = i2;
        this.A0D = z;
        this.A02 = i3;
        this.A01 = i4;
        this.A0B = z2;
        this.A0C = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C68180N3v() {
        /*
            r15 = this;
            r1 = 0
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r8 = 6
            r9 = 0
            r0 = r15
            r2 = r1
            r4 = r3
            r5 = r1
            r7 = r1
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68180N3v.<init>():void");
    }
}
