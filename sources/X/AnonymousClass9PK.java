package X;

import java.util.List;

/* renamed from: X.9PK  reason: invalid class name */
public final class AnonymousClass9PK extends AnonymousClass0T0 {
    public final AnonymousClass80V A00;
    public final AnonymousClass80X A01;
    public final Integer A02;
    public final Integer A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9PK) {
                AnonymousClass9PK r5 = (AnonymousClass9PK) obj;
                if (!(this.A03 == r5.A03 && 0qQ.A0K(this.A04, r5.A04) && this.A05 == r5.A05 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A09 == r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AnonymousClass9PK A00(AnonymousClass9PK r12, AnonymousClass80V r13, AnonymousClass80X r14, Integer num, Integer num2, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2 = i;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        Integer num3 = num2;
        AnonymousClass80V r2 = r13;
        AnonymousClass80X r3 = r14;
        boolean z10 = z;
        List list2 = list;
        Integer num4 = num;
        if ((i & 1) != 0) {
            num4 = r12.A03;
        }
        if ((i & 2) != 0) {
            list2 = r12.A04;
        }
        if ((i & 4) != 0) {
            z10 = r12.A05;
        }
        if ((i & 8) != 0) {
            r3 = r12.A01;
        }
        if ((i & 16) != 0) {
            r2 = r12.A00;
        }
        if ((i & 32) != 0) {
            num3 = r12.A02;
        }
        if ((i & 64) != 0) {
            z9 = r12.A06;
        }
        if ((i2 & 128) != 0) {
            z8 = r12.A07;
        }
        if ((i2 & 256) != 0) {
            z7 = r12.A08;
        }
        if ((i2 & 512) != 0) {
            z6 = r12.A09;
        }
        AnonymousClass7TG.A1N(num4, list2);
        0qQ.A0B(num3, 5);
        return new AnonymousClass9PK(r2, r3, num4, num3, list2, z10, z9, z8, z7, z6);
    }

    public final int hashCode() {
        String str;
        String str2;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "REEL";
                break;
            case 2:
                str = "DIRECT";
                break;
            case 3:
                str = "UNSUPPORTED";
                break;
            default:
                str = "STORY";
                break;
        }
        int A092 = (((AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A04, (str.hashCode() + intValue) * 31)) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31;
        int intValue2 = this.A02.intValue();
        switch (intValue2) {
            case 1:
                str2 = "SOUND_OFF";
                break;
            case 2:
                str2 = "HIDDEN";
                break;
            default:
                str2 = "SOUND_ON";
                break;
        }
        int A093 = AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, (A092 + str2.hashCode() + intValue2) * 31)));
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        return A093 + i;
    }

    public AnonymousClass9PK(AnonymousClass80V r1, AnonymousClass80X r2, Integer num, Integer num2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = num;
        this.A04 = list;
        this.A05 = z;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = num2;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A09 = z5;
    }
}
