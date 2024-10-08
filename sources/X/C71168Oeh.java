package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.text.ExpandableTextView;

/* renamed from: X.Oeh  reason: case insensitive filesystem */
public final class C71168Oeh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ ExpandableTextView A01;
    public final /* synthetic */ N3A A02;
    public final /* synthetic */ C68048MzF A03;
    public final /* synthetic */ C17960Vit A04;
    public final /* synthetic */ 0rk A05;

    public C71168Oeh(ValueAnimator valueAnimator, ExpandableTextView expandableTextView, N3A n3a, C68048MzF mzF, C17960Vit vit, 0rk r6) {
        this.A00 = valueAnimator;
        this.A03 = mzF;
        this.A05 = r6;
        this.A01 = expandableTextView;
        this.A04 = vit;
        this.A02 = n3a;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A042 = DbW.A04(this.A00.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        C66582MXn.A14(this.A03.A01, A042);
        0rk r3 = this.A05;
        int i = A042 - r3.A00;
        ? r1 = this.A01;
        r1.setHeight(r1.getHeight() + i);
        this.A04.A01(this.A02, A042, r3.A00);
        r3.A00 = A042;
    }
}
