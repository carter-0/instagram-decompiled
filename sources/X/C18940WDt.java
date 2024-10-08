package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* renamed from: X.WDt  reason: case insensitive filesystem */
public final class C18940WDt implements AnonymousClass05A {
    public final int A00;
    public final Object A01;

    public C18940WDt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean E2R(View view, AnonymousClass059 r7) {
        int i;
        boolean z;
        C14052Tp0 tp0;
        boolean z2;
        switch (this.A00) {
            case 0:
                tp0 = (C14052Tp0) this.A01;
                z = true;
                i = ((ViewPager2) view).A00 + 1;
                break;
            case 1:
                tp0 = (C14052Tp0) this.A01;
                z = true;
                i = ((ViewPager2) view).A00 - 1;
                break;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A01;
                if (swipeDismissBehavior instanceof BaseTransientBottomBar$Behavior) {
                    z2 = view instanceof U4W;
                } else {
                    z2 = true;
                }
                boolean z3 = false;
                if (!z2) {
                    return false;
                }
                boolean A1S = AnonymousClass7TF.A1S(view.getLayoutDirection(), 1);
                int i2 = swipeDismissBehavior.A02;
                if (i2 != 0 ? !(i2 != 1 || A1S) : A1S) {
                    z3 = true;
                }
                int width = view.getWidth();
                if (z3) {
                    width = -width;
                }
                view.offsetLeftAndRight(width);
                view.setAlpha(0.0f);
                X32 x32 = swipeDismissBehavior.A04;
                if (x32 == null) {
                    return true;
                }
                x32.D9F(view);
                return true;
        }
        ViewPager2 viewPager2 = tp0.A04;
        if (!viewPager2.A0B) {
            return true;
        }
        viewPager2.A04(i, z);
        return true;
    }
}
