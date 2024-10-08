package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.PYH  reason: case insensitive filesystem */
public final class C73177PYH implements Runnable {
    public final /* synthetic */ C69203Nh3 A00;
    public final /* synthetic */ C62320sa A01;

    public C73177PYH(C69203Nh3 nh3, C62320sa r2) {
        this.A01 = r2;
        this.A00 = nh3;
    }

    public final void run() {
        this.A01.invoke();
        C69203Nh3 nh3 = this.A00;
        nh3.setVisibility(8);
        IgSimpleImageView igSimpleImageView = nh3.A00;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(8);
        }
    }
}
