package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.instagram.common.ui.base.IgFrameLayout;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6j4  reason: invalid class name and case insensitive filesystem */
public final class C314926j4 implements C314016hW {
    public final C273384mU A00;

    public final boolean Cn1(C255773uh r2, C250973mM r3, C309426Yf r4, float f) {
        return false;
    }

    public final void DaV(C255773uh r9, C250973mM r10, C309426Yf r11, float f) {
        C316006kx r1;
        IgFrameLayout A002;
        View view;
        0qQ.A0B(r11, 2);
        if (((double) f) >= 0.02d && !r11.A17) {
            r11.A17 = true;
            C313056fm r0 = ((ReelViewerFragment) this.A00).mViewPager;
            Object obj = null;
            if (!(r0 == null || (view = ((C313046fl) r0).A04.A0F) == null)) {
                obj = view.getTag();
            }
            if ((obj instanceof C316006kx) && (r1 = (C316006kx) obj) != null) {
                C316856mK r12 = r1.A1i;
                Object value = r12.A04.getValue();
                if (value != null && (A002 = r12.A00()) != null && A002.getVisibility() == 0) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(value, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.15f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.15f})});
                    ofPropertyValuesHolder.setDuration(200);
                    ofPropertyValuesHolder.setRepeatMode(2);
                    ofPropertyValuesHolder.setRepeatCount(1);
                    ofPropertyValuesHolder.start();
                }
            }
        }
    }

    public C314926j4(C273384mU r1) {
        this.A00 = r1;
    }
}
