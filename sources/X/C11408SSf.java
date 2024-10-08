package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.SSf  reason: case insensitive filesystem */
public abstract class C11408SSf {
    public static final int A01(Context context, int i) {
        0qQ.A0B(context, 0);
        TypedValue A0J = Pxj.A0J(context, i);
        int i2 = A0J.resourceId;
        if (i2 == 0) {
            return A0J.data;
        }
        return context.getColor(i2);
    }

    public static final void A03(Context context, ProgressBar progressBar, int i) {
        0qQ.A0B(progressBar, 1);
        progressBar.getIndeterminateDrawable().setColorFilter(A01(context, i), PorterDuff.Mode.SRC_IN);
    }

    public static final void A05(Button button) {
        int A02;
        Drawable rippleDrawable;
        0qQ.A0B(button, 0);
        button.setElevation(0.0f);
        button.setStateListAnimator((StateListAnimator) null);
        Context context = button.getContext();
        int dimension = (int) context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
        button.setPadding(dimension, 0, dimension, 0);
        button.setAllCaps(false);
        button.setTextSize(17.0f);
        button.setTextColor(A02(context, R.attr.scButtonTextColor, R.color.abc_decor_view_status_guard_light));
        int A022 = A02(context, R.attr.sc_primary_button_background, R.color.sc_default_button_background_color);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.sc_primary_button_corner_radius, typedValue, true)) {
            A02 = AnonymousClass7TF.A02(context, R.dimen.abc_button_inset_vertical_material);
        } else if (typedValue.resourceId == 0) {
            A02 = TypedValue.complexToDimensionPixelSize(typedValue.data, AnonymousClass7TF.A0E(context));
        } else {
            A02 = context.getResources().getDimensionPixelSize(typedValue.resourceId);
        }
        float f = (float) A02;
        int A023 = A02(context, R.attr.sc_accent_deemphasized, R.color.sc_default_button_pressed_background_color);
        if (A022 == A023) {
            rippleDrawable = C9572RdC.A00(f, f, f, f, A022);
        } else {
            rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{A023}), C9572RdC.A00(f, f, f, f, A022), C9572RdC.A00(f, f, f, f, context.getColor(R.color.design_dark_default_color_on_background)));
        }
        button.setBackground(rippleDrawable);
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) context.getResources().getDimension(R.dimen.account_group_management_clickable_width);
            button.requestLayout();
        }
    }

    public static final int A02(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return context.getColor(i2);
        }
        int i3 = typedValue.resourceId;
        if (i3 == 0) {
            return typedValue.data;
        }
        return context.getColor(i3);
    }

    public static final float A00(Context context, int i) {
        TypedValue A0J = Pxj.A0J(context, i);
        if (A0J.resourceId == 0) {
            return TypedValue.complexToDimension(A0J.data, AnonymousClass7TF.A0E(context));
        }
        return (float) context.getResources().getDimensionPixelSize(A0J.resourceId);
    }

    public static void A04(Context context, TextView textView, int i) {
        textView.setTextColor(A01(context, i));
    }
}
