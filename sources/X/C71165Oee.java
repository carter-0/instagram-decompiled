package X;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.Oee  reason: case insensitive filesystem */
public final class C71165Oee implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ TextView A01;

    public C71165Oee(ImageView imageView, TextView textView) {
        this.A00 = imageView;
        this.A01 = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        this.A00.setAlpha(1.0f - A002);
        TextView textView = this.A01;
        C66583MXo.A0w(textView, A002);
        textView.setAlpha(A002);
        textView.setScaleX(A002);
        textView.setScaleY(A002);
    }
}
