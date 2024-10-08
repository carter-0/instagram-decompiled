package X;

import androidx.compose.foundation.pager.PagerState$scrollToPage$2;

public final class IFL implements C305246Hc {
    public final /* synthetic */ GZF A00;
    public final /* synthetic */ boolean A01;

    public IFL(GZF gzf, boolean z) {
        this.A00 = gzf;
        this.A01 = z;
    }

    public final AnonymousClass6JS AIJ() {
        AnonymousClass6JS r0;
        boolean z = this.A01;
        int A04 = this.A00.A04();
        if (z) {
            return r0;
        }
        r0 = new AnonymousClass6JS(1, A04);
        return r0;
    }

    public final int Aqh() {
        C284945Oz r2 = this.A00.A0C;
        return (-C51970G9q.A0Q(r2).A08) + C51970G9q.A0Q(r2).A03;
    }

    public final float BPK() {
        GZF gzf = this.A00;
        return (float) C52610GZj.A00((JLH) gzf.A0C.getValue(), gzf.A04());
    }

    public final float Bq6() {
        GZF gzf = this.A00;
        return (float) ((((long) gzf.A03()) * ((long) gzf.A05())) + AnonymousClass1GB.A02((double) (gzf.A0N.A04.B6X() * ((float) gzf.A05()))));
    }

    public final int CFO() {
        C284945Oz r1 = this.A00.A0C;
        AnonymousClass6Gj r3 = C51970G9q.A0Q(r1).A09;
        AnonymousClass6Gj r2 = AnonymousClass6Gj.Vertical;
        long A0m = G9t.A0m(C51970G9q.A0Q(r1).A0J);
        if (r3 == r2) {
            return C289005cr.A00(A0m);
        }
        return C51965G9l.A04(A0m);
    }

    public final Object EKc(int i, AnonymousClass4D7 r6) {
        GZF gzf = this.A00;
        C286015Tp r0 = GZF.A0b;
        Object A012 = GZF.A01(C54609HKs.A01, gzf, r6, new PagerState$scrollToPage$2(gzf, (AnonymousClass4D7) null, 0.0f, i));
        1Hj r02 = 1Hj.A02;
        if (A012 != r02) {
            A012 = C60340gF.A00;
        }
        if (A012 != r02) {
            return C60340gF.A00;
        }
        return A012;
    }
}
