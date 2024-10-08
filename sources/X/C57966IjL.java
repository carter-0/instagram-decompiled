package X;

import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.IjL  reason: case insensitive filesystem */
public final class C57966IjL implements Runnable {
    public final /* synthetic */ IgFrameLayout A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C317676ne A03;
    public final /* synthetic */ C316916mQ A04;

    public C57966IjL(IgFrameLayout igFrameLayout, C255773uh r2, C255783ui r3, C317676ne r4, C316916mQ r5) {
        this.A00 = igFrameLayout;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void run() {
        IgFrameLayout igFrameLayout = this.A00;
        if (igFrameLayout.getVisibility() == 0) {
            C255783ui r4 = this.A02;
            C316916mQ r3 = this.A04;
            int width = r3.A00.getWidth();
            int height = C3019160o.A01(igFrameLayout).getHeight();
            C255773uh r2 = this.A01;
            C51975G9x.A10(igFrameLayout, r2, r4, width, height);
            C317676ne r1 = this.A03;
            if (r1 != null) {
                r1.DnC(r3.A02, r2, r4);
            }
        }
    }
}
