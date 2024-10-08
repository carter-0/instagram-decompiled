package X;

/* renamed from: X.GnP  reason: case insensitive filesystem */
public final class C53392GnP extends AnonymousClass0T0 {
    public final int A00;
    public final C53531Gq1 A01;
    public final C54617HLa A02;
    public final C54617HLa A03;
    public final JM1 A04;
    public final JM1 A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53392GnP) {
                C53392GnP gnP = (C53392GnP) obj;
                if (!0qQ.A0K(this.A04, gnP.A04) || !0qQ.A0K(this.A05, gnP.A05) || this.A02 != gnP.A02 || !0qQ.A0K(this.A06, gnP.A06) || this.A0B != gnP.A0B || !0qQ.A0K(this.A08, gnP.A08) || !0qQ.A0K(this.A09, gnP.A09) || !0qQ.A0K(this.A07, gnP.A07) || this.A0A != gnP.A0A || this.A0C != gnP.A0C || !0qQ.A0K(this.A01, gnP.A01) || this.A03 != gnP.A03 || this.A00 != gnP.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C53392GnP A00(C53531Gq1 gq1, C54617HLa hLa, C54617HLa hLa2, JM1 jm1, JM1 jm12, C53392GnP gnP, Long l, String str, String str2, String str3, int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        int i3 = i;
        C54617HLa hLa3 = hLa2;
        C53531Gq1 gq12 = gq1;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        boolean z4 = z;
        Long l2 = l;
        C54617HLa hLa4 = hLa;
        JM1 jm13 = jm12;
        JM1 jm14 = jm1;
        C53392GnP gnP2 = gnP;
        if ((i & 1) != 0) {
            jm14 = gnP2.A04;
        }
        if ((i & 2) != 0) {
            jm13 = gnP2.A05;
        }
        if ((i & 4) != 0) {
            hLa4 = gnP2.A02;
        }
        if ((i & 8) != 0) {
            l2 = gnP2.A06;
        }
        if ((i & 16) != 0) {
            z4 = gnP2.A0B;
        }
        if ((i & 32) != 0) {
            str6 = gnP2.A08;
        }
        if ((i & 64) != 0) {
            str5 = gnP2.A09;
        }
        if ((i3 & 128) != 0) {
            str4 = gnP2.A07;
        }
        if ((i3 & 256) != 0) {
            z2 = gnP2.A0A;
        } else {
            z2 = false;
        }
        if ((i3 & 512) != 0) {
            z3 = gnP2.A0C;
        } else {
            z3 = false;
        }
        if ((i3 & 1024) != 0) {
            gq12 = gnP2.A01;
        }
        if ((i3 & C249703kE.FLAG_MOVED) != 0) {
            hLa3 = gnP2.A03;
        }
        if ((i3 & 4096) != 0) {
            i2 = gnP2.A00;
        } else {
            i2 = 0;
        }
        AnonymousClass7TG.A1T(jm14, jm13, hLa4);
        AnonymousClass7TF.A1E(str6, 5, str4);
        return new C53392GnP(gq12, hLa4, hLa3, jm14, jm13, l2, str6, str5, str4, i2, z4, z2, z3);
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0K(this.A04));
        int A092 = AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A07(this.A02, A072) + AnonymousClass7TG.A0C(this.A06)) * 31);
        return ((((AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A08(this.A07, (AnonymousClass7TF.A08(this.A08, A092) + AnonymousClass7TG.A0E(this.A09)) * 31))) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31) + this.A00;
    }

    public C53392GnP(C53531Gq1 gq1, C54617HLa hLa, C54617HLa hLa2, JM1 jm1, JM1 jm12, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        this.A04 = jm1;
        this.A05 = jm12;
        this.A02 = hLa;
        this.A06 = l;
        this.A0B = z;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A0A = z2;
        this.A0C = z3;
        this.A01 = gq1;
        this.A03 = hLa2;
        this.A00 = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53392GnP() {
        /*
            r14 = this;
            r1 = 0
            X.IQj r4 = X.C57145IQj.A00
            X.HLa r2 = X.C54617HLa.SUCCESS
            r11 = 0
            java.lang.String r7 = ""
            r12 = 1
            r10 = 2000(0x7d0, float:2.803E-42)
            r0 = r14
            r3 = r1
            r5 = r4
            r6 = r1
            r8 = r1
            r9 = r7
            r13 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53392GnP.<init>():void");
    }
}
