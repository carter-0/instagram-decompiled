package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.9fz  reason: invalid class name and case insensitive filesystem */
public final class C383689fz extends C232922uf {
    public final /* synthetic */ Aa7 A00;

    public final void DmC(2cs r5) {
        0qQ.A0B(r5, 0);
        float f = (float) r5.A09.A00;
        Aa7 aa7 = this.A00;
        ReboundViewPager reboundViewPager = aa7.A07;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (reboundViewPager == null) {
            if (i != 0) {
                0wb.A03("ArCommercePrimaryDialViewController", 002.A0N("onSpringAtRest() dialViewPager is null, progress=", f));
            }
        } else if (i == 0) {
            reboundViewPager.setVisibility(4);
        } else {
            AnonymousClass871 r0 = aa7.A09;
            if (r0 != null) {
                r0.Ciw();
            }
        }
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        this.A00.FL7((float) r5.A09.A00);
    }

    public C383689fz(Aa7 aa7) {
        this.A00 = aa7;
    }
}
