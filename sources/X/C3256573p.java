package X;

import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.73p  reason: invalid class name and case insensitive filesystem */
public abstract class C3256573p {
    public static final void A00(TextView textView, boolean z) {
        0qQ.A0B(textView, 0);
        if (z) {
            textView.setShadowLayer(2.0f, 0.0f, 1.0f, textView.getContext().getColor(R.color.black_50_transparent));
            textView.setTextColor(-1);
        } else if (textView.getShadowColor() != 0) {
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }
}
