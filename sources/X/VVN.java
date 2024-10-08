package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

public final class VVN {
    public final View A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public VVN(View view, TextView textView, RoundedCornerImageView roundedCornerImageView) {
        AnonymousClass7TG.A1Q(textView, roundedCornerImageView);
        this.A00 = view;
        this.A01 = textView;
        this.A02 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
    }
}
