package X;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: X.Oec  reason: case insensitive filesystem */
public final class C71163Oec implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextView A00;

    public C71163Oec(TextView textView) {
        this.A00 = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        TextView textView = this.A00;
        C66583MXo.A0w(textView, A002);
        textView.setScaleX(A002);
        textView.setScaleY(A002);
        textView.setAlpha(A002);
    }
}
