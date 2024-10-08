package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.HBc  reason: case insensitive filesystem */
public final class C54387HBc extends C273044lr {
    public final void A02(int i, int i2) {
    }

    public final void A03(Resources resources, TextView textView) {
        0qQ.A0B(textView, 0);
        Context context = textView.getContext();
        ColorStateList A02 = 02K.A02(context, 2Yu.A08(context));
        textView.setTextAppearance(R.style.igds_emphasized_body_2);
        textView.setTextColor(A02);
        textView.setCompoundDrawableTintList(A02);
    }

    public final void A04(Canvas canvas) {
    }

    public final void A05(View view, View view2, TextView textView, boolean z) {
    }

    public final void A08(C273024lp r2) {
        0qQ.A0B(r2, 0);
    }

    public final void A09(SpinnerImageView spinnerImageView) {
    }
}
