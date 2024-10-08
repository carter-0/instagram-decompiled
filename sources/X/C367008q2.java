package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8q2  reason: invalid class name and case insensitive filesystem */
public final class C367008q2 {
    public int A00;
    public final TargetViewSizeProvider A01;

    public C367008q2(TargetViewSizeProvider targetViewSizeProvider) {
        0qQ.A0B(targetViewSizeProvider, 1);
        this.A01 = targetViewSizeProvider;
    }

    public final void A00(ViewGroup viewGroup, View[] viewArr, int i, int i2, int i3) {
        0qQ.A0B(viewArr, 4);
        int i4 = 0;
        for (View view : viewArr) {
            if (view != null && view.getVisibility() == 0) {
                i4++;
            }
        }
        int width = ((NineSixteenLayoutConfigImpl) this.A01).A0K.getWidth() - i;
        if (this.A00 != i4 && width > 0) {
            this.A00 = i4;
            int i5 = ((i3 * 2) + i2) * i4;
            if (i5 > width) {
                i2 = Math.round(((float) i2) - (((float) ((i5 - width) + i)) / ((float) i4)));
            }
            int childCount = viewGroup.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = viewGroup.getChildAt(i6);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = i2;
                    layoutParams2.height = i2;
                    layoutParams2.gravity = 16;
                    layoutParams2.setMargins(i3, 0, i3, 0);
                    childAt.setLayoutParams(layoutParams2);
                    i6++;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }
}
