package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;

public abstract class GN4 {
    public static final void A00(View view) {
        0qQ.A0B(view, 0);
        if (view instanceof LithoView) {
            ((BaseMountingView) view).CsJ();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                0qQ.A0A(childAt);
                A00(childAt);
            }
        }
    }
}
