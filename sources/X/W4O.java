package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.arads.ui.FooterView;
import com.instagram.common.ui.base.IgTextView;

public final class W4O implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ FooterView A04;

    public W4O(FooterView footerView, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A04 = footerView;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        int i = this.A02;
        FooterView footerView = this.A04;
        IgTextView igTextView = footerView.A02;
        int A022 = 0nH.A02(A002, i, igTextView.getCurrentTextColor());
        int i2 = this.A01;
        IgTextView igTextView2 = footerView.A01;
        int A023 = 0nH.A02(A002, i2, igTextView2.getCurrentTextColor());
        int A024 = 0nH.A02(A002, this.A00, this.A03);
        igTextView.setTextColor(A022);
        igTextView2.setTextColor(A023);
        Drawable background = footerView.A00.getBackground();
        0qQ.A0C(background, C273654mx.A00(0));
        ((GradientDrawable) background).setColor(A024);
    }
}
