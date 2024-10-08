package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.Wom  reason: case insensitive filesystem */
public final class C20297Wom implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C14332TuD A02;

    public C20297Wom(C14332TuD tuD, int i, int i2) {
        this.A02 = tuD;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        C14332TuD tuD = this.A02;
        ViewGroup viewGroup = tuD.A07;
        if (viewGroup != null) {
            int i = this.A00;
            int i2 = this.A01;
            View view = tuD.A06;
            tuD.A00 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = i2;
                }
                view.requestLayout();
            }
            IgFrameLayout igFrameLayout = tuD.A01;
            if (igFrameLayout != null) {
                igFrameLayout.addView(view, 0);
            }
            IgFrameLayout igFrameLayout2 = tuD.A01;
            if (igFrameLayout2 != null) {
                igFrameLayout2.requestLayout();
            }
            IgFrameLayout igFrameLayout3 = tuD.A01;
            if (igFrameLayout3 != null) {
                igFrameLayout3.setVisibility(0);
            }
            0sL r2 = tuD.A00().A00.A0E;
            IgFrameLayout igFrameLayout4 = tuD.A01;
            C66580MXl.A1R(igFrameLayout4);
            r2.invoke(48, igFrameLayout4);
        }
    }
}
