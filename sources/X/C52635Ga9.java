package X;

import android.os.CountDownTimer;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.Ga9  reason: case insensitive filesystem */
public final class C52635Ga9 extends CountDownTimer {
    public final /* synthetic */ C52643GaH A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52635Ga9(C52643GaH gaH, long j) {
        super(j, 35);
        this.A00 = gaH;
    }

    public final void onFinish() {
        AnonymousClass3TF r1;
        C52643GaH gaH = this.A00;
        GFO gfo = gaH.A03;
        2V5 r6 = gfo.A08;
        C51967G9n.A19(r6, 1.0f);
        2V5 r5 = gfo.A0A;
        int A09 = C51970G9q.A09(r5) + 1;
        int A03 = gfo.A03();
        ReboundViewPager reboundViewPager = gaH.A01;
        if (reboundViewPager != null) {
            r1 = reboundViewPager.A0O;
        } else {
            r1 = null;
        }
        if (r1 != AnonymousClass3TF.IDLE) {
            return;
        }
        if (A09 < A03 || gfo.A0D()) {
            gfo.A04().Ckn(AnonymousClass05K.A00, C51970G9q.A09(r5), A09 % gfo.A03());
            if (gfo.A0D()) {
                ReboundViewPager reboundViewPager2 = gfo.A03;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0B(0.0f);
                }
            } else {
                ReboundViewPager reboundViewPager3 = gfo.A03;
                if (reboundViewPager3 != null) {
                    reboundViewPager3.A0L(A09, 0.0f);
                }
            }
            C52635Ga9 ga9 = new C52635Ga9(gaH, gaH.A00);
            ga9.start();
            C51967G9n.A19(r6, 0.0f);
            C51967G9n.A1A(r5, A09);
            gaH.A02 = ga9;
            return;
        }
        gfo.A08();
    }

    public final void onTick(long j) {
        C52643GaH gaH = this.A00;
        2V5 r6 = gaH.A03.A08;
        long j2 = gaH.A00;
        C51967G9n.A19(r6, ((float) (j2 - j)) / ((float) j2));
    }
}
