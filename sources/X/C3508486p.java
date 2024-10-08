package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.86p  reason: invalid class name and case insensitive filesystem */
public final class C3508486p extends C232922uf {
    public final /* synthetic */ AnonymousClass86m A00;

    public final void DmC(2cs r6) {
        0qQ.A0B(r6, 0);
        float f = (float) r6.A09.A00;
        AnonymousClass86m r3 = this.A00;
        ReboundViewPager reboundViewPager = r3.A05;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (reboundViewPager == null) {
            if (i != 0) {
                0kD.A07("PreCaptureDialViewController", 002.A0N("onSpringAtRest() mDialViewPager is null, progress=", f), (Throwable) null);
            }
        } else if (i == 0) {
            reboundViewPager.setVisibility(4);
        } else {
            AnonymousClass871 r0 = r3.A09;
            if (r0 != null) {
                r0.Ciw();
            }
        }
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        this.A00.FL7((float) r5.A09.A00);
    }

    public C3508486p(AnonymousClass86m r1) {
        this.A00 = r1;
    }
}
