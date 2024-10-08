package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

public final class VZJ {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final RoundedCornerImageView A04;

    public VZJ(View view, View view2, TextView textView, TextView textView2, RoundedCornerImageView roundedCornerImageView) {
        C51974G9v.A1M(textView, textView2, roundedCornerImageView);
        0qQ.A0B(view2, 5);
        this.A01 = view;
        this.A03 = textView;
        this.A02 = textView2;
        this.A04 = roundedCornerImageView;
        this.A00 = view2;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
    }
}
