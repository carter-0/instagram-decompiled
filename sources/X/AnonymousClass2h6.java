package X;

import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.2h6  reason: invalid class name */
public final class AnonymousClass2h6 implements Runnable {
    public final /* synthetic */ C226432go A00;

    public AnonymousClass2h6(C226432go r1) {
        this.A00 = r1;
    }

    public final void run() {
        C226462gr r1;
        C226432go r3 = this.A00;
        ColorFilterAlphaImageView colorFilterAlphaImageView = r3.A06;
        if (colorFilterAlphaImageView != null && r3.A02 != 0 && r3.A01 != 0 && (r1 = r3.A05) != null) {
            colorFilterAlphaImageView.setImageDrawable(r1);
            r1.A8s(new FHG(r3));
            r1.E2p();
        }
    }
}
