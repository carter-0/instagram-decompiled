package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;

public abstract class VBZ {
    public static final MapBottomSheetBehavior A00(View view) {
        0qQ.A0B(view, 0);
        2dP layoutParams = view.getLayoutParams();
        if (layoutParams instanceof 2dP) {
            0qQ.A0C(layoutParams, C273654mx.A00(48));
            CoordinatorLayout.Behavior behavior = layoutParams.A0A;
            if (behavior instanceof MapBottomSheetBehavior) {
                return (MapBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException(C66579MXk.A00(253));
    }
}
