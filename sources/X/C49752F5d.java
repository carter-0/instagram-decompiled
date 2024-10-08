package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.F5d  reason: case insensitive filesystem */
public abstract class C49752F5d {
    public static final void A01(Context context, View view) {
        0qQ.A0B(view, 1);
        float A00 = C66901Mej.A00(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = DbS.A03(context.getResources(), R.dimen.featured_user_story_ring_size);
        layoutParams.height = (int) (context.getResources().getDimension(R.dimen.abc_star_medium) * A00);
        view.setLayoutParams(layoutParams);
    }

    public static final float A00(float f, float f2) {
        float max = Math.max(f2, 1.0f);
        if (max > 1.0f) {
            return Math.min(f * (((max - 1.0f) / 5.0f) + 1.0f), 0.9f);
        }
        return f;
    }
}
