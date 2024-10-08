package X;

import android.view.animation.Animation;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Ngy  reason: case insensitive filesystem */
public final class C69200Ngy extends WCQ {
    public final /* synthetic */ PMR A00;

    public C69200Ngy(PMR pmr) {
        this.A00 = pmr;
    }

    public final void onAnimationEnd(Animation animation) {
        PMR pmr = this.A00;
        AnonymousClass0eM r1 = pmr.A09;
        if (((ViewPager2) r1.getValue()).A08.A02 == 0 || ((ViewPager2) r1.getValue()).A08.A02 == 2) {
            C68295N9i n9i = pmr.A01;
            if (n9i == null) {
                0qQ.A0F("boundViewModel");
                throw AnonymousClass00P.createAndThrow();
            } else {
                PMR.A01(pmr, n9i, false);
            }
        }
    }
}
