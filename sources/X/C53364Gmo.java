package X;

/* renamed from: X.Gmo  reason: case insensitive filesystem */
public final class C53364Gmo extends AnonymousClass0T0 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53364Gmo) {
                C53364Gmo gmo = (C53364Gmo) obj;
                if (!(this.A01 == gmo.A01 && 0qQ.A0K(this.A02, gmo.A02) && 0qQ.A0K(this.A04, gmo.A04) && this.A00 == gmo.A00 && this.A07 == gmo.A07 && this.A05 == gmo.A05 && 0qQ.A0K(this.A03, gmo.A03) && this.A06 == gmo.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Failed";
                break;
            case 3:
                str = "Success";
                break;
            default:
                str = "Initial";
                break;
        }
        int A09 = AnonymousClass7TF.A09(this.A07, (((((C51968G9o.A0F(str, intValue) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + HWK.A00(this.A00)) * 31);
        return DbS.A06(this.A06, (AnonymousClass7TF.A09(this.A05, A09) + C41845B3m.A00(this.A03)) * 31);
    }

    public C53364Gmo(Integer num, Integer num2, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A01 = num;
        this.A02 = str;
        this.A04 = str2;
        this.A00 = num2;
        this.A07 = z;
        this.A05 = z2;
        this.A03 = str3;
        this.A06 = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53364Gmo() {
        /*
            r9 = this;
            r3 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r6 = 0
            r8 = 1
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r3
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53364Gmo.<init>():void");
    }
}
