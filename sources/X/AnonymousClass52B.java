package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.52B  reason: invalid class name */
public final class AnonymousClass52B extends C273044lr {
    public ColorStateList A00;
    public final 1QG A01;

    public AnonymousClass52B(C273024lp r2, 1QG r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A01 = r3;
    }

    public final void A02(int i, int i2) {
    }

    public final void A03(Resources resources, TextView textView) {
        int A0H;
        0qQ.A0B(textView, 0);
        Context context = textView.getContext();
        if (this.A01.ordinal() == 1) {
            A0H = R.color.igds_prism_indigo_primary_borderless_button_label;
        } else {
            A0H = 2Yu.A0H(context, R.attr.igds_color_primary_button);
        }
        ColorStateList A02 = 02K.A02(context, A0H);
        this.A00 = A02;
        textView.setTextColor(A02);
        textView.setCompoundDrawableTintList(this.A00);
    }

    public final void A04(Canvas canvas) {
    }

    public final void A05(View view, View view2, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        0qQ.A0B(view2, 3);
        int i = 0;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    public final void A07(TextView textView, int[] iArr) {
        ColorStateList colorStateList;
        0qQ.A0B(textView, 1);
        if (this.A01.A00 && (colorStateList = this.A00) != null) {
            textView.setTextColor(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()));
        }
    }

    public final void A08(C273024lp r2) {
        0qQ.A0B(r2, 0);
    }

    public final void A09(SpinnerImageView spinnerImageView) {
        0qQ.A0B(spinnerImageView, 0);
        Context context = spinnerImageView.getContext();
        0qQ.A0A(context);
        spinnerImageView.setImageDrawable(AnonymousClass4Ed.A01(context, R.drawable.nav_spinner, 2Yu.A0H(context, R.attr.igds_color_secondary_icon)));
    }

    public final void A0A(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        if (!this.A01.A00) {
            super.A0A(view, textView, z);
        }
    }

    public final void A0B(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        if (!this.A01.A00) {
            super.A0B(view, textView, z);
        }
    }
}
