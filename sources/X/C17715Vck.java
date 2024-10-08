package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Vck  reason: case insensitive filesystem */
public final class C17715Vck {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final RoundedCornerImageView A0C;
    public final RoundedCornerImageView A0D;

    public C17715Vck(View view, View view2, View view3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, RoundedCornerImageView roundedCornerImageView, RoundedCornerImageView roundedCornerImageView2) {
        C51973G9u.A0r(3, textView, textView2, roundedCornerImageView);
        C51974G9v.A1Q(textView3, roundedCornerImageView2, textView4, textView5);
        C51974G9v.A1R(textView6, textView7, textView8, textView9);
        this.A02 = view;
        this.A00 = view2;
        this.A0A = textView;
        this.A03 = textView2;
        this.A0D = roundedCornerImageView;
        this.A01 = view3;
        this.A0B = textView3;
        this.A0C = roundedCornerImageView2;
        this.A08 = textView4;
        this.A09 = textView5;
        this.A06 = textView6;
        this.A07 = textView7;
        this.A04 = textView8;
        this.A05 = textView9;
        AnonymousClass3MJ r0 = AnonymousClass3MJ.CENTER_CROP;
        roundedCornerImageView.setBitmapShaderScaleType(r0);
        roundedCornerImageView2.setBitmapShaderScaleType(r0);
    }
}
