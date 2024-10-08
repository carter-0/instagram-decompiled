package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.LTu  reason: case insensitive filesystem */
public final class C64204LTu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ RecyclerView A04;
    public final /* synthetic */ TouchInterceptorFrameLayout A05;
    public final /* synthetic */ C380589Yt A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0rk A08;
    public final /* synthetic */ boolean A09;

    public C64204LTu(RecyclerView recyclerView, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C380589Yt r3, 0sP r4, 0rk r5, int i, int i2, int i3, int i4, boolean z) {
        this.A05 = touchInterceptorFrameLayout;
        this.A00 = i;
        this.A09 = z;
        this.A04 = recyclerView;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        float f;
        0qQ.A0B(valueAnimator, 0);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A05;
        if (touchInterceptorFrameLayout != null) {
            int i = this.A00;
            boolean z = this.A09;
            RecyclerView recyclerView = this.A04;
            int i2 = this.A02;
            int i3 = this.A01;
            int i4 = this.A03;
            C380589Yt r8 = this.A06;
            0sP r5 = this.A07;
            0rk r4 = this.A08;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                float floatValue = number.floatValue();
                0nA.A0f(touchInterceptorFrameLayout, (int) (((float) i) * floatValue));
                if (z) {
                    f = floatValue;
                } else {
                    f = 1.0f - floatValue;
                }
                float min = Math.min(Math.max(0.0f, 1.0f), Math.max(Math.min(0.0f, 1.0f), floatValue));
                touchInterceptorFrameLayout.setAlpha(min);
                0nA.A0V(recyclerView, i2 + ((int) (f * ((float) (i3 - i2)))));
                float f2 = (float) i4;
                int i5 = -1;
                if (z) {
                    i5 = 0;
                }
                float f3 = (((float) i5) + floatValue) * f2;
                if (z) {
                    int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    View A0c = AnonymousClass7TE.A0c(r8.A0B);
                    JTQ.A0v(A0c, min);
                    0nA.A0U(A0c, (int) (f2 * (floatValue - 4.0f)));
                }
                int i7 = (int) f3;
                C51967G9n.A0w(i7 - r4.A00, r5);
                r4.A00 = i7;
            }
        }
    }
}
