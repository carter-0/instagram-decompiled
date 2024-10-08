package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.SQz  reason: case insensitive filesystem */
public final class C11386SQz {
    public static final void A00(Context context, View view, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, f, AnonymousClass7TF.A0E(context));
        if (applyDimension < 1) {
            applyDimension = 1;
        }
        layoutParams.height = applyDimension;
        view.setLayoutParams(layoutParams);
        C11409SSh.A01(view, i);
        if (z) {
            view.setVisibility(0);
        }
    }

    public static final void A02(Context context, View view, REP rep, Integer num, Integer num2) {
        int i;
        Drawable background;
        int i2;
        boolean A1U = AnonymousClass7TF.A1U(0, context, view);
        int ordinal = rep.ordinal();
        String A00 = C273654mx.A00(0);
        if (ordinal == 0) {
            i = R.drawable.fbpay_accordion_background;
            view.setBackgroundResource(i);
            background = view.getBackground();
        } else if (ordinal != A1U) {
            String A002 = C273654mx.A00(16);
            if (ordinal == 2) {
                i2 = R.drawable.fbpay_accordion_background_without_top_bottom_flat;
            } else if (ordinal == 3) {
                i2 = R.drawable.fbpay_accordion_background_without_top;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            view.setBackgroundResource(i2);
            Drawable background2 = view.getBackground();
            0qQ.A0C(background2, A002);
            background = ((LayerDrawable) background2).getDrawable(0);
        } else {
            i = R.drawable.fbpay_accordion_background_bottom_flat;
            view.setBackgroundResource(i);
            background = view.getBackground();
        }
        0qQ.A0C(background, A00);
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(SPB.A00(context, num.intValue()));
        if (num2 != null) {
            int intValue = num2.intValue();
            int A003 = SSH.A00(context, R.attr.fbpay_ui_accordion_border_stroke);
            gradientDrawable.mutate();
            gradientDrawable.setStroke(A003, SPB.A00(context, intValue));
        }
    }

    public final void A03(Context context, View view, REP rep, int i) {
        0qQ.A0B(view, 1);
        A01(context, view, rep);
        C11409SSh.A05(view, AnonymousClass2E0.A0A().A02(i), false);
    }

    public static void A01(Context context, View view, REP rep) {
        A02(context, view, rep, 59, 60);
    }
}
