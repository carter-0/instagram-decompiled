package X;

import java.util.List;

/* renamed from: X.GnG  reason: case insensitive filesystem */
public final class C53384GnG extends AnonymousClass0T0 {
    public final N49 A00;
    public final JV7 A01;
    public final JRG A02;
    public final 1Xj A03;
    public final Integer A04;
    public final Integer A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53384GnG) {
                C53384GnG gnG = (C53384GnG) obj;
                if (!(this.A08 == gnG.A08 && this.A07 == gnG.A07 && this.A09 == gnG.A09 && 0qQ.A0K(this.A02, gnG.A02) && 0qQ.A0K(this.A03, gnG.A03) && 0qQ.A0K(this.A06, gnG.A06) && 0qQ.A0K(this.A01, gnG.A01) && 0qQ.A0K(this.A00, gnG.A00) && this.A0A == gnG.A0A && this.A05 == gnG.A05 && this.A04 == gnG.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C53384GnG A00(JV7 jv7, C53384GnG gnG, JRG jrg, Integer num, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        1Xj r5;
        N49 n49;
        Integer num2 = num;
        boolean z5 = z4;
        JV7 jv72 = jv7;
        List list2 = list;
        JRG jrg2 = jrg;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        Integer num3 = null;
        int i2 = i;
        if ((i & 1) != 0) {
            z8 = gnG.A08;
        }
        if ((i & 2) != 0) {
            z7 = gnG.A07;
        }
        if ((i & 4) != 0) {
            z6 = gnG.A09;
        }
        if ((i & 8) != 0) {
            jrg2 = gnG.A02;
        }
        if ((i & 16) != 0) {
            r5 = gnG.A03;
        } else {
            r5 = null;
        }
        if ((i & 32) != 0) {
            list2 = gnG.A06;
        }
        if ((i & 64) != 0) {
            jv72 = gnG.A01;
        }
        if ((i2 & 128) != 0) {
            n49 = gnG.A00;
        } else {
            n49 = null;
        }
        if ((i2 & 256) != 0) {
            z5 = gnG.A0A;
        }
        if ((i2 & 512) != 0) {
            num3 = gnG.A05;
        }
        if ((i2 & 1024) != 0) {
            num2 = gnG.A04;
        }
        C51973G9u.A0u(5, list2, num3, num2);
        return new C53384GnG(n49, jv72, jrg2, r5, num3, num2, list2, z8, z7, z6, z5);
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A07, C51965G9l.A05(this.A08));
        List list = this.A06;
        return ((AnonymousClass7TF.A09(this.A0A, (((AnonymousClass7TF.A07(list, (((AnonymousClass7TF.A09(this.A09, A092) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31) + C9775RgX.A00(this.A05)) * 31) + HVS.A00(this.A04);
    }

    public C53384GnG(N49 n49, JV7 jv7, JRG jrg, 1Xj r4, Integer num, Integer num2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A02 = jrg;
        this.A03 = r4;
        this.A06 = list;
        this.A01 = jv7;
        this.A00 = n49;
        this.A0A = z4;
        this.A05 = num;
        this.A04 = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53384GnG() {
        /*
            r12 = this;
            r1 = 0
            r8 = 0
            X.0sn r7 = X.0sn.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r9 = r8
            r10 = r8
            r11 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53384GnG.<init>():void");
    }
}
