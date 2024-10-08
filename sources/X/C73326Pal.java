package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Pal  reason: case insensitive filesystem */
public final class C73326Pal implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ NR1 A01;
    public final /* synthetic */ boolean A02;

    public C73326Pal(IgSimpleImageView igSimpleImageView, NR1 nr1, boolean z) {
        this.A01 = nr1;
        this.A00 = igSimpleImageView;
        this.A02 = z;
    }

    public final void run() {
        int i;
        float f;
        View view;
        NR1 nr1 = this.A01;
        if (nr1.A04) {
            IgSimpleImageView igSimpleImageView = this.A00;
            boolean A1T = C51970G9q.A1T((igSimpleImageView.getRotation() > 0.0f ? 1 : (igSimpleImageView.getRotation() == 0.0f ? 0 : -1)));
            GA1 ga1 = new GA1(39, nr1, this.A02);
            JTR.A1B(igSimpleImageView);
            ViewParent parent = igSimpleImageView.getParent();
            if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
                i = 0;
            } else {
                i = view.getWidth();
            }
            igSimpleImageView.setVisibility(0);
            float A022 = AnonymousClass7TE.A02(igSimpleImageView);
            float f2 = A022 / 2.0f;
            int i2 = 1;
            if (A1T) {
                i2 = -1;
            }
            igSimpleImageView.clearAnimation();
            ViewPropertyAnimator duration = igSimpleImageView.animate().rotation(((float) i2) * 30.0f).setDuration(450);
            if (A1T) {
                f = -f2;
            } else {
                f = ((float) i) - f2;
            }
            C66580MXl.A1D(C66583MXo.A0E(duration.x(f).y(-(A022 + f2)), 0.85f), new C73251PZV(igSimpleImageView, ga1));
        }
    }
}
