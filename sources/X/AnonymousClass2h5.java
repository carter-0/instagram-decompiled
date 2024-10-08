package X;

import android.view.View;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.2h5  reason: invalid class name */
public final class AnonymousClass2h5 implements Runnable {
    public final /* synthetic */ C226432go A00;

    public AnonymousClass2h5(C226432go r1) {
        this.A00 = r1;
    }

    public final void run() {
        C226462gr r2;
        C226432go r5 = this.A00;
        View view = r5.A03;
        ColorFilterAlphaImageView colorFilterAlphaImageView = r5.A06;
        if (colorFilterAlphaImageView != null && r5.A02 != 0 && r5.A01 != 0 && (r2 = r5.A04) != null && r5.A05 != null) {
            colorFilterAlphaImageView.setImageDrawable(r2);
            colorFilterAlphaImageView.getLayoutParams().width = view.getHeight();
            colorFilterAlphaImageView.getLayoutParams().height = view.getHeight();
            r2.A8s(new FHH(r5));
            r2.E2p();
        }
    }
}
