package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.GaH  reason: case insensitive filesystem */
public final class C52643GaH {
    public long A00;
    public ReboundViewPager A01;
    public C52635Ga9 A02;
    public final GFO A03;

    public final void A00() {
        C52635Ga9 ga9 = this.A02;
        if (ga9 != null) {
            ga9.cancel();
            this.A02 = null;
        }
    }

    public final void A01() {
        if (this.A02 == null) {
            C52635Ga9 ga9 = new C52635Ga9(this, (long) (((float) this.A00) * (1.0f - C51970G9q.A02(this.A03.A08))));
            ga9.start();
            this.A02 = ga9;
        }
    }

    public C52643GaH(GFO gfo, long j) {
        this.A03 = gfo;
        this.A00 = j;
    }
}
