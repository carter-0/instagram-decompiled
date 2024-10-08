package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.EqU  reason: case insensitive filesystem */
public abstract class C49163EqU {
    public static void A00(Context context, G6V g6v, EyR eyR, String str, int i, boolean z) {
        IgTextView igTextView = eyR.A01;
        igTextView.setText(str);
        igTextView.setTextColor(i);
        int i2 = 0;
        igTextView.setVisibility(DbW.A01(z ? 1 : 0));
        SpinnerImageView spinnerImageView = eyR.A02;
        if (!z) {
            i2 = 8;
        }
        spinnerImageView.setVisibility(i2);
        int A03 = AnonymousClass7TF.A03(context, R.attr.glyphColorSecondary);
        spinnerImageView.setNormalColor(A03);
        spinnerImageView.setActiveColor(A03);
        if (g6v != null) {
            FP4.A01(eyR.A00, 28, g6v);
        }
    }
}
