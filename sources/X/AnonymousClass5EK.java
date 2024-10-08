package X;

/* renamed from: X.5EK  reason: invalid class name */
public final class AnonymousClass5EK extends AnonymousClass5EI {
    public C284625Nh A00;
    public AnonymousClass5EQ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C264744Rc A05;
    public final AnonymousClass4RE A06;
    public final boolean A07;

    public final void A0D() {
        this.A04 = false;
        this.A03 = false;
        super.A0D();
    }

    public final void Cnl() {
    }

    public final void ECj(AnonymousClass4TH r4) {
        C284625Nh r2 = (C284625Nh) r4;
        if (r2.A02 != null) {
            C265164Su r1 = r2.A03;
            r1.getClass();
            r1.ECj(r2.A02);
        }
        if (r4 == this.A00) {
            this.A00 = null;
        }
    }

    public static void A00(AnonymousClass5EK r7, long j) {
        C284625Nh r6 = r7.A00;
        int A062 = r7.A01.A06(r6.A05.A04);
        if (A062 != -1) {
            long j2 = r7.A01.A0D(r7.A05, A062, false).A01;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            r6.A00 = j;
        }
    }

    /* renamed from: A0G */
    public final C284625Nh AMb(C264874Rq r5, AnonymousClass4QW r6, long j) {
        C284625Nh r2 = new C284625Nh(r5, r6, j);
        C265164Su r3 = this.A00;
        boolean z = false;
        if (r2.A03 == null) {
            z = true;
        }
        C256703wD.A04(z);
        r2.A03 = r3;
        if (this.A04) {
            Object obj = r5.A04;
            AnonymousClass5EQ r1 = this.A01;
            Object obj2 = AnonymousClass5EQ.A02;
            if (r1.A00 != null && obj.equals(AnonymousClass5EQ.A02)) {
                obj = this.A01.A00;
            }
            r2.A00(r5.A00(obj));
        } else {
            this.A00 = r2;
            if (!this.A03) {
                this.A03 = true;
                A0F(r3, (Object) null);
                return r2;
            }
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r5.CcB() == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5EK(X.C265164Su r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>(r5)
            r3 = 1
            if (r6 == 0) goto L_0x000d
            boolean r1 = r5.CcB()
            r0 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r4.A07 = r0
            X.4RE r0 = new X.4RE
            r0.<init>()
            r4.A06 = r0
            X.4Rc r0 = new X.4Rc
            r0.<init>()
            r4.A05 = r0
            com.google.android.exoplayer2.Timeline r2 = r5.BHA()
            if (r2 == 0) goto L_0x002f
            r1 = 0
            X.5EQ r0 = new X.5EQ
            r0.<init>(r2, r1, r1)
            r4.A01 = r0
            r4.A02 = r3
            return
        L_0x002f:
            X.4RL r1 = r5.BQS()
            java.lang.Object r0 = X.AnonymousClass5EQ.A02
            X.5NS r3 = new X.5NS
            r3.<init>(r1)
            java.lang.Object r2 = X.AnonymousClass4RE.A0H
            java.lang.Object r1 = X.AnonymousClass5EQ.A02
            X.5EQ r0 = new X.5EQ
            r0.<init>(r3, r2, r1)
            r4.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5EK.<init>(X.4Su, boolean):void");
    }
}
