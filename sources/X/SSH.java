package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class SSH {
    public static final void A03(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        0qQ.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = marginLayoutParams.leftMargin;
            }
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = marginLayoutParams.topMargin;
            }
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = marginLayoutParams.rightMargin;
            }
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = marginLayoutParams.bottomMargin;
            }
            marginLayoutParams.setMargins(i, i2, i3, i4);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void A04(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        viewGroup.setClipToPadding(false);
        A02(viewGroup, (Integer) null, (Integer) null, A01(viewGroup, R.attr.fbpay_ui_navbar_divider_visible_form_top_spacing), (Integer) null);
    }

    public static final void A02(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        if (num != null) {
            paddingLeft = num.intValue();
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        if (num3 != null) {
            paddingTop = num3.intValue();
        } else {
            paddingTop = view.getPaddingTop();
        }
        if (num2 != null) {
            paddingRight = num2.intValue();
        } else {
            paddingRight = view.getPaddingRight();
        }
        if (num4 != null) {
            paddingBottom = num4.intValue();
        } else {
            paddingBottom = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public static final int A00(Context context, int i) {
        return (int) Pxj.A0J(context, i).getDimension(AnonymousClass7TF.A0E(context));
    }

    public static Integer A01(View view, int i) {
        Context context = view.getContext();
        0qQ.A07(context);
        return Integer.valueOf(A00(context, i));
    }
}
