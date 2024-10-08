package X;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.Iterator;

public final class LTk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass4UR A00;

    public LTk(AnonymousClass4UR r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float measuredWidth;
        boolean z;
        float f;
        Iterator it = this.A00.A07.iterator();
        while (it.hasNext()) {
            C242213Tb r2 = (C242213Tb) JTR.A10(it);
            if (r2 != null) {
                float A04 = AnonymousClass7TE.A04(valueAnimator.getAnimatedValue());
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) r2;
                JZN jzn = slideInAndOutIconView.A01;
                if (jzn != null) {
                    float f2 = 1.0f - A04;
                    slideInAndOutIconView.setIconColor(DbW.A04(jzn.A01.evaluate(f2, C51967G9n.A0j(), Integer.valueOf(jzn.A00)), "null cannot be cast to non-null type kotlin.Int"));
                    slideInAndOutIconView.setBackgroundAlpha(1.0f - f2);
                    slideInAndOutIconView.setIconScale((float) AnonymousClass37Q.A03(1.0d - ((double) f2), 0.8d, 1.0d));
                }
                C242233Td r4 = slideInAndOutIconView.A03;
                C242233Td r0 = C242233Td.BOTH;
                TitleTextView titleTextView = slideInAndOutIconView.A0C;
                if (r4 == r0) {
                    measuredWidth = (((float) titleTextView.getMeasuredWidth()) * (1.0f - A04)) / 2.0f;
                    titleTextView.setAlpha(A04);
                    boolean z2 = slideInAndOutIconView.A05;
                    ImageView imageView = slideInAndOutIconView.A0B;
                    if (z2) {
                        float f3 = -measuredWidth;
                        imageView.setTranslationX(f3);
                        titleTextView.setTranslationX(f3);
                    } else {
                        imageView.setTranslationX(measuredWidth);
                        titleTextView.setTranslationX(measuredWidth);
                    }
                    f = slideInAndOutIconView.A00 - measuredWidth;
                } else {
                    titleTextView.setScaleX(A04);
                    titleTextView.setScaleY(A04);
                    measuredWidth = ((float) titleTextView.getMeasuredWidth()) * (1.0f - A04);
                    C242233Td r1 = slideInAndOutIconView.A03;
                    if ((r1 != C242233Td.START || slideInAndOutIconView.A05) && (r1 != C242233Td.END || !slideInAndOutIconView.A05)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z3 = slideInAndOutIconView.A05;
                    if (z) {
                        if (z3) {
                            slideInAndOutIconView.A0B.setTranslationX(-measuredWidth);
                        }
                        SlideInAndOutIconView.A00(slideInAndOutIconView, 0.0f, slideInAndOutIconView.A00 - measuredWidth, slideInAndOutIconView.A0A.height());
                        slideInAndOutIconView.invalidate();
                    } else {
                        if (!z3) {
                            slideInAndOutIconView.A0B.setTranslationX(measuredWidth);
                        }
                        f = slideInAndOutIconView.A00;
                    }
                }
                SlideInAndOutIconView.A00(slideInAndOutIconView, measuredWidth, f, slideInAndOutIconView.A0A.height());
                slideInAndOutIconView.invalidate();
            }
        }
    }
}
