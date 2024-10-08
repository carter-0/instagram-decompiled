package X;

public final class GFK extends AnonymousClass0T0 implements JQW, JTL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public GFK(C59671JTb jTb, GKJ gkj, GEG geg, C267324bN r4, C52058GDe gDe, C52093GEn gEn, C52091GEl gEl, C52671Gaj gaj, int i) {
        this.A00 = i;
        this.A02 = r4;
        this.A04 = gDe;
        this.A03 = geg;
        this.A07 = jTb;
        this.A05 = gkj;
        this.A08 = gEl;
        this.A06 = gEn;
        this.A01 = gaj;
    }

    public final C52671Gaj AtN() {
        return (C52671Gaj) this.A01;
    }

    public final C267324bN BML() {
        return (C267324bN) this.A02;
    }

    public final GEG BMM() {
        return (GEG) this.A03;
    }

    public final C52058GDe BMN() {
        return (C52058GDe) this.A04;
    }

    public final GKJ BQN() {
        return (GKJ) this.A05;
    }

    public final C52093GEn Bau() {
        return (C52093GEn) this.A06;
    }

    public final C52091GEl CB8() {
        return (C52091GEl) this.A08;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof GFK)) {
            return false;
        }
        GFK gfk = (GFK) obj;
        if (gfk.A00 != i || !0qQ.A0K(this.A02, gfk.A02) || !0qQ.A0K(this.A04, gfk.A04) || !0qQ.A0K(this.A03, gfk.A03) || !0qQ.A0K(this.A07, gfk.A07) || !0qQ.A0K(this.A05, gfk.A05) || !0qQ.A0K(this.A08, gfk.A08) || !0qQ.A0K(this.A06, gfk.A06) || !0qQ.A0K(this.A01, gfk.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        int A072 = (AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A02)))))) + AnonymousClass7TG.A0C(this.A06)) * 31;
        Object obj = this.A01;
        if (i != 0) {
            return A072 + AnonymousClass7TE.A0L(obj);
        }
        return AnonymousClass7TE.A0N(obj, A072);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GFK(X.C59671JTb r12, X.GKJ r13, X.GEG r14, X.C267324bN r15, X.C52058GDe r16, X.C52093GEn r17, X.C52091GEl r18, int r19, int r20) {
        /*
            r11 = this;
            r7 = r17
            r9 = 0
            r1 = r11
            r0 = r20
            r11.A00 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r18
            int r20 = 1 - r20
            if (r20 == 0) goto L_0x001e
            r0 = r19 & 64
            if (r0 == 0) goto L_0x0019
            r7 = r9
        L_0x0019:
            r10 = 2
            r1.<init>((X.C59671JTb) r2, (X.GKJ) r3, (X.GEG) r4, (X.C267324bN) r5, (X.C52058GDe) r6, (X.C52093GEn) r7, (X.C52091GEl) r8, (X.C52671Gaj) r9, (int) r10)
            return
        L_0x001e:
            r10 = 1
            r1.<init>((X.C59671JTb) r2, (X.GKJ) r3, (X.GEG) r4, (X.C267324bN) r5, (X.C52058GDe) r6, (X.C52093GEn) r7, (X.C52091GEl) r8, (X.C52671Gaj) r9, (int) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFK.<init>(X.JTb, X.GKJ, X.GEG, X.4bN, X.GDe, X.GEn, X.GEl, int, int):void");
    }
}
