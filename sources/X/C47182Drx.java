package X;

import java.util.List;

/* renamed from: X.Drx  reason: case insensitive filesystem */
public final class C47182Drx extends AnonymousClass0T0 {
    public final long A00;
    public final C46519DgM A01;
    public final C243363Yl A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public static final C47182Drx A00(C46519DgM dgM, C243363Yl r2, Integer num, String str, String str2, String str3, List list, long j, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1U(str2, str3, num);
        AnonymousClass7TG.A1S(r2, dgM);
        0qQ.A0B(list, 9);
        return new C47182Drx(dgM, r2, num, str, str2, str3, list, j, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47182Drx) {
                C47182Drx drx = (C47182Drx) obj;
                if (!(0qQ.A0K(this.A05, drx.A05) && 0qQ.A0K(this.A06, drx.A06) && 0qQ.A0K(this.A04, drx.A04) && this.A03 == drx.A03 && this.A00 == drx.A00 && this.A02 == drx.A02 && this.A01 == drx.A01 && this.A08 == drx.A08 && this.A09 == drx.A09 && 0qQ.A0K(this.A07, drx.A07))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A05)));
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "OTHER";
        } else {
            str = "SELF";
        }
        return AnonymousClass7TE.A0N(this.A07, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A01(this.A00, (A082 + str.hashCode() + intValue) * 31))))));
    }

    public C47182Drx(C46519DgM dgM, C243363Yl r2, Integer num, String str, String str2, String str3, List list, long j, boolean z, boolean z2) {
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = num;
        this.A00 = j;
        this.A02 = r2;
        this.A01 = dgM;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47182Drx() {
        /*
            r12 = this;
            java.lang.String r4 = ""
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r8 = 0
            X.3Yl r2 = X.C243363Yl.NOT_LIKED
            X.DgM r1 = X.C46519DgM.FOLLOW
            r10 = 1
            X.0sn r7 = X.0sn.A00
            r0 = r12
            r5 = r4
            r6 = r4
            r11 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47182Drx.<init>():void");
    }
}
