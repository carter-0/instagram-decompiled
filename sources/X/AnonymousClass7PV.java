package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.7PV  reason: invalid class name */
public abstract class AnonymousClass7PV {
    public static boolean A00;

    public static final int A00(Context context, boolean z) {
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        0qQ.A0B(context, 0);
        if (z) {
            boolean z2 = A00;
            i = (int) (((double) AnonymousClass0nB.A01(context)) * 0.9d);
            if (z2 && i > (dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height))) {
                i = dimensionPixelSize2;
            }
            int A01 = ((AnonymousClass0nB.A01(context) - context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material)) - context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width)) - (context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) * 2);
            if (i > A01) {
                return A01;
            }
        } else {
            boolean z3 = A00;
            i = (int) (((double) AnonymousClass0nB.A01(context)) * 0.711d);
            if (!z3 || i <= (dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height))) {
                return i;
            }
            return dimensionPixelSize;
        }
        return i;
    }

    public static final void A01(View view) {
        0qQ.A0B(view, 0);
        A03(view, 0.711d);
    }

    public static final void A02(View view) {
        0qQ.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Context context = view.getContext();
            0qQ.A07(context);
            int A01 = (int) (((double) AnonymousClass0nB.A01(context)) * 0.711d);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
            if (A01 > dimensionPixelSize) {
                A01 = dimensionPixelSize;
            }
            layoutParams.width = A01;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(View view, double d) {
        int dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Context context = view.getContext();
            0qQ.A07(context);
            boolean z = A00;
            int A01 = (int) (((double) AnonymousClass0nB.A01(context)) * d);
            if (z && A01 > (dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height))) {
                A01 = dimensionPixelSize;
            }
            layoutParams.width = A01;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
