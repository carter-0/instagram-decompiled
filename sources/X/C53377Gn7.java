package X;

/* renamed from: X.Gn7  reason: case insensitive filesystem */
public final class C53377Gn7 extends AnonymousClass0T0 {
    public final C59479JLd A00;
    public final C53309Glv A01;
    public final AnonymousClass62P A02;
    public final AnonymousClass62P A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C53377Gn7(C59479JLd jLd, C53309Glv glv, AnonymousClass62P r4, AnonymousClass62P r5, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(r5, 7);
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A01 = glv;
        this.A03 = r4;
        this.A02 = r5;
        this.A00 = jLd;
    }

    public static /* synthetic */ C53377Gn7 A00(C59479JLd jLd, C53377Gn7 gn7, C53309Glv glv, AnonymousClass62P r11, int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        C59479JLd jLd2 = jLd;
        AnonymousClass62P r4 = r11;
        C53309Glv glv2 = glv;
        boolean z5 = z2;
        boolean z6 = z;
        AnonymousClass62P r3 = null;
        if ((i & 1) != 0) {
            z6 = gn7.A04;
        }
        if ((i & 2) != 0) {
            z3 = gn7.A05;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = gn7.A06;
        } else {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z5 = gn7.A07;
        }
        if ((i & 16) != 0) {
            glv2 = gn7.A01;
        }
        if ((i & 32) != 0) {
            r3 = gn7.A03;
        }
        if ((i & 64) != 0) {
            r4 = gn7.A02;
        }
        if ((i & 128) != 0) {
            jLd2 = gn7.A00;
        }
        C51974G9v.A1N(r3, r4, jLd2);
        return new C53377Gn7(jLd2, glv2, r3, r4, z6, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53377Gn7) {
                C53377Gn7 gn7 = (C53377Gn7) obj;
                if (this.A04 != gn7.A04 || this.A05 != gn7.A05 || this.A06 != gn7.A06 || this.A07 != gn7.A07 || !0qQ.A0K(this.A01, gn7.A01) || !0qQ.A0K(this.A03, gn7.A03) || !0qQ.A0K(this.A02, gn7.A02) || !0qQ.A0K(this.A00, gn7.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, C51965G9l.A05(this.A04)));
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A09(this.A07, A09) + AnonymousClass7TG.A0C(this.A01)) * 31)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53377Gn7() {
        /*
            r9 = this;
            r2 = 0
            r5 = 1
            r6 = 0
            X.62M r3 = X.AnonymousClass62M.A01
            X.ILI r1 = X.ILI.A00
            r0 = r9
            r4 = r3
            r7 = r6
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53377Gn7.<init>():void");
    }
}
