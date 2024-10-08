package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.UDd  reason: case insensitive filesystem */
public final class C14875UDd extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgFrameLayout A03;
    public final RoundedCornerImageView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14875UDd(View view, TextView textView, TextView textView2, IgFrameLayout igFrameLayout, RoundedCornerImageView roundedCornerImageView) {
        super(view);
        C51974G9v.A1M(textView, textView2, roundedCornerImageView);
        0qQ.A0B(igFrameLayout, 5);
        this.A00 = view;
        this.A02 = textView;
        this.A01 = textView2;
        this.A04 = roundedCornerImageView;
        this.A03 = igFrameLayout;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
    }
}
