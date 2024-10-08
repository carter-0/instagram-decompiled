package X;

/* renamed from: X.LvM  reason: case insensitive filesystem */
public final class C65547LvM implements AnonymousClass2Zd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65547LvM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void DFp(AnonymousClass3Q2 r5) {
        02m r2;
        int i;
        short s;
        if (this.A00 != 0) {
            0qQ.A0B(r5, 0);
            LF4 lf4 = (LF4) this.A02;
            if (2PP.A00(r5.A3t, ((AnonymousClass3Q2) this.A01).A3t)) {
                AnonymousClass3QD r22 = r5.A1f;
                AnonymousClass3QD r0 = r5.A6J;
                AnonymousClass2Fj r1 = lf4.A01;
                if (r22 == r0) {
                    r1.A0B(C62502Kgs.SUCCESS);
                    L3G A002 = lf4.A00();
                    r2 = A002.A01;
                    i = A002.A00;
                    r2.markerPoint(i, "end");
                    s = 2;
                } else {
                    r1.A0B(C62502Kgs.ERROR);
                    L3G A003 = lf4.A00();
                    r2 = A003.A01;
                    i = A003.A00;
                    r2.markerPoint(i, "end");
                    s = 3;
                }
                r2.markerEnd(i, s);
            }
        } else if (2PP.A00(r5.A3t, ((AnonymousClass3Q2) this.A02).A3t)) {
            C66053M9m m9m = (C66053M9m) this.A01;
            m9m.A02.A06 = AnonymousClass7TF.A1W(r5.A1f, r5.A6J);
            m9m.A04.countDown();
        }
    }

    public final /* synthetic */ void DQx(AnonymousClass3Q2 r1) {
    }
}
