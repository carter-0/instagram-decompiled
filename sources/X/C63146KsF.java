package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.KsF  reason: case insensitive filesystem */
public abstract class C63146KsF {
    public static void A00(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, ViewGroup viewGroup, C279284yO r4) {
        View findViewById;
        View findViewById2;
        if (!(r4 instanceof C363138jC) || (findViewById = viewGroup.findViewById(R.id.feed_gallery_fragment_holder)) == null || findViewById.getVisibility() != 0 || (findViewById2 = viewGroup.findViewById(R.id.container_touch_event_forwarding_view)) == null) {
            View findViewById3 = viewGroup.findViewById(R.id.focus_view);
            if (findViewById3 != null) {
                findViewById3.setBackground(gradientDrawable2);
                return;
            }
            return;
        }
        findViewById2.setBackground(gradientDrawable);
    }
}
