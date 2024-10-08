package X;

/* renamed from: X.8Ku  reason: invalid class name and case insensitive filesystem */
public final class C354138Ku implements C252203oj {
    public final /* synthetic */ C354128Kt A00;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r13) {
        Integer num;
        0qQ.A0B(r13, 0);
        C354128Kt r9 = this.A00;
        if (r9.A04) {
            double A002 = (double) AnonymousClass1GB.A00(r13.A09.A00);
            r9.A00 += A002 - r9.A01;
            r9.A01 = A002;
            if (A002 > 0.0d) {
                double d = (double) r9.A05;
                if (A002 < d) {
                    C354058Km r2 = r9.A02;
                    if (r2 != null) {
                        r2.DSQ(r9.A03, (float) (A002 / d));
                        return;
                    }
                    return;
                }
            }
            double d2 = (double) r9.A05;
            double min = Math.min(A002, d2);
            r9.A01 = min;
            double max = Math.max(min, 0.0d);
            r9.A01 = max;
            boolean z = false;
            r9.A04 = false;
            if ((max <= 0.0d && r9.A03 == AnonymousClass05K.A00) || (max >= d2 && r9.A03 == AnonymousClass05K.A01)) {
                z = true;
            }
            C354058Km r4 = r9.A02;
            if (r4 != null) {
                if (z) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                r4.DC5(num, (float) (max / d2));
            }
            r9.A00 = 0.0d;
            r9.A01 = 0.0d;
        }
    }

    public C354138Ku(C354128Kt r1) {
        this.A00 = r1;
    }
}
