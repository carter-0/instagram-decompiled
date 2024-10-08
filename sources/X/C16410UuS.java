package X;

import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.UuS  reason: case insensitive filesystem */
public final class C16410UuS extends WYP {
    public final Boolean A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r5, C284395Mi r6) {
        C15993Uma uma = (C15993Uma) r6;
        0qQ.A0B(uma, 0);
        CharSequence charSequence = this.A02;
        if (charSequence.length() > 0) {
            uma.A01.setText(charSequence);
        }
        CharSequence charSequence2 = this.A01;
        if (charSequence2.length() > 0) {
            TextView textView = uma.A00;
            textView.setText(charSequence2);
            if (AnonymousClass7TF.A1Y(this.A00, true)) {
                DbT.A17(textView.getContext(), textView, R.color.design_dark_default_color_on_background);
                IgSimpleImageView igSimpleImageView = uma.A02;
                if (igSimpleImageView != null) {
                    DbU.A14(igSimpleImageView.getContext(), igSimpleImageView, R.color.design_dark_default_color_on_background);
                }
            }
        }
    }

    public C16410UuS(Boolean bool, CharSequence charSequence, CharSequence charSequence2) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = bool;
    }
}
