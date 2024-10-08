package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import java.security.InvalidParameterException;

/* renamed from: X.5lf  reason: invalid class name and case insensitive filesystem */
public abstract class C293985lf {
    public static final void A00(View view, ImageView imageView, TextView textView, TextView textView2, Integer num, boolean z) {
        int i;
        0qQ.A0B(num, 0);
        0qQ.A0B(imageView, 1);
        if (num != AnonymousClass05K.A0N) {
            int intValue = num.intValue();
            if (intValue == 0) {
                i = R.dimen.avatar_size_ridiculously_xxxlarge_plus;
            } else if (intValue == 1) {
                i = R.dimen.avatar_size_ridiculously_xxxlarge;
            } else if (intValue == 2) {
                i = R.dimen.avatar_size_ridiculously_xxlarge_plus;
            } else {
                throw new InvalidParameterException(002.A0R("Card type is not supported: ", "SMALL"));
            }
            Resources resources = imageView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            if (z) {
                imageView.setMaxHeight(dimensionPixelSize);
                imageView.setMaxWidth(dimensionPixelSize);
            } else {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
            }
            if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A00) {
                0nA.A0c(view, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            }
            if (textView != null) {
                Context context = textView.getContext();
                textView.setTextColor(context.getColor(2Yu.A0H(context, R.attr.igdsSecondaryText)));
            }
            if (textView2 != null) {
                Context context2 = textView2.getContext();
                textView2.setTextColor(context2.getColor(2Yu.A0H(context2, R.attr.igdsSecondaryText)));
            }
        }
    }
}
