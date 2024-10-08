package X;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Ug1  reason: case insensitive filesystem */
public final class C15635Ug1 extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
        C299025uS r2 = new C299025uS(context);
        coordinatorLayout.addView(r2);
        r2.setLayoutParams(new 2dP(-2, -2));
        C299025uS r3 = new C299025uS(context);
        r3.setTag(new Object());
        coordinatorLayout.addView(r3);
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        2dP r0 = new 2dP(-1, -1);
        r0.A00(bottomSheetBehavior);
        r3.setLayoutParams(r0);
        return coordinatorLayout;
    }
}
