package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;

public final class OZ0 {
    public static final OZ0 A00 = new Object();

    public static final boolean A00(View view, View view2, float f, float f2, int i) {
        if (view == null) {
            return false;
        }
        if (view2 != null) {
            RectF A0F = 0nA.A0F(view2);
            f += A0F.left;
            f2 += A0F.top;
        }
        RectF A0F2 = 0nA.A0F(view);
        float f3 = (float) i;
        return f >= A0F2.left - f3 && f <= A0F2.right + f3 && f2 >= A0F2.top - f3 && f2 <= A0F2.bottom + f3;
    }

    public final 0eP A01(Activity activity, Context context, AnonymousClass0eK r7, AnonymousClass0eK r8, float f, boolean z, boolean z2) {
        int A01;
        int i;
        int A002;
        if (z2) {
            A01 = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        } else if (r8 == null || !AnonymousClass7TF.A1Y(r8.get(), false)) {
            A01 = AnonymousClass0nB.A01(context);
        } else {
            A01 = AnonymousClass0nB.A01(context) - (C51972G9s.A08(context) * 2);
        }
        if (z) {
            i = activity.getResources().getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        } else {
            i = 0;
        }
        if (z2) {
            A002 = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        } else if (r7 == null || r8 == null || !AnonymousClass7TF.A1Y(r8.get(), false)) {
            A002 = AnonymousClass0nB.A00(context);
        } else {
            A002 = AnonymousClass7TE.A0M(r7.get()) - i;
        }
        float f2 = (float) A01;
        float f3 = (float) A002;
        if (f > f2 / f3) {
            f3 = f2 / f;
        } else {
            f2 = f3 * f;
        }
        return AnonymousClass7TE.A1L(Float.valueOf(f3), Float.valueOf(f2));
    }
}
