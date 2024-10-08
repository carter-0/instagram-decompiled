package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;

/* renamed from: X.TCp  reason: case insensitive filesystem */
public final class C12901TCp implements Runnable {
    public final /* synthetic */ C7927Qcy A00;

    public C12901TCp(C7927Qcy qcy) {
        this.A00 = qcy;
    }

    public final void run() {
        C7927Qcy qcy = this.A00;
        Interpolator interpolator = C7927Qcy.A0S;
        ImageView imageView = qcy.A02;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            RectF rectF = qcy.A0M;
            float f = rectF.top;
            float f2 = f + ((rectF.bottom - f) / 2.0f);
            ImageView imageView2 = qcy.A02;
            if (imageView2 != null) {
                int measuredHeight = (int) (f2 - (((float) imageView2.getMeasuredHeight()) / 2.0f));
                if (marginLayoutParams.topMargin != measuredHeight) {
                    marginLayoutParams.topMargin = measuredHeight;
                    ImageView imageView3 = qcy.A02;
                    if (imageView3 != null) {
                        imageView3.requestLayout();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F("selfieFaceWarning");
        throw AnonymousClass00P.createAndThrow();
    }
}
