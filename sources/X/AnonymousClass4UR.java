package X;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.4UR  reason: invalid class name */
public final class AnonymousClass4UR {
    public ValueAnimator.AnimatorUpdateListener A00;
    public ValueAnimator.AnimatorUpdateListener A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public ValueAnimator A04;
    public AnonymousClass4Ki A05 = AnonymousClass4Ki.STOPPED;
    public AnonymousClass4HM A06;
    public final Set A07 = new 04u(1);

    private void A00(AnonymousClass4Ki r7) {
        RectF rectF;
        float height;
        for (Reference reference : this.A07) {
            C242213Tb r4 = (C242213Tb) reference.get();
            if (r4 != null) {
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) r4;
                slideInAndOutIconView.setVisibility(0);
                String str = slideInAndOutIconView.A04;
                if (str == null || str.isEmpty() || r7 != AnonymousClass4Ki.FULLTEXT) {
                    slideInAndOutIconView.A0C.setVisibility(8);
                    rectF = slideInAndOutIconView.A0A;
                    height = rectF.height();
                } else {
                    TitleTextView titleTextView = slideInAndOutIconView.A0C;
                    titleTextView.setVisibility(0);
                    rectF = slideInAndOutIconView.A0A;
                    height = rectF.height() + ((float) titleTextView.getMeasuredWidth());
                }
                SlideInAndOutIconView.A00(slideInAndOutIconView, 0.0f, height, rectF.height());
            }
        }
    }

    public final void A01() {
        AnonymousClass4Ki r0 = this.A05;
        AnonymousClass4Ki r1 = AnonymousClass4Ki.STOPPED;
        if (r0 != r1) {
            ValueAnimator valueAnimator = this.A02;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = this.A04;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                valueAnimator2.removeAllUpdateListeners();
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = this.A03;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                valueAnimator3.removeAllUpdateListeners();
                valueAnimator3.removeAllListeners();
            }
            this.A05 = r1;
        }
    }

    public final void A02(C232822uV r7) {
        AnonymousClass4Ki r0;
        ValueAnimator valueAnimator;
        int i;
        if (r7.A03) {
            A00(AnonymousClass4Ki.ICON);
            if (this.A02 == null) {
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(150);
                this.A02 = duration;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A00;
                if (animatorUpdateListener == null) {
                    animatorUpdateListener = new AnonymousClass4US(this);
                    this.A00 = animatorUpdateListener;
                }
                duration.addUpdateListener(animatorUpdateListener);
                valueAnimator = this.A02;
            } else {
                return;
            }
        } else {
            C232812uU r02 = r7.A02;
            C232812uU r3 = C232812uU.SLIDE_IN;
            if (r02 == r3) {
                A00(AnonymousClass4Ki.FULLTEXT);
                ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(250);
                this.A04 = duration2;
                duration2.addUpdateListener(new LTk(this));
                this.A04.addListener(new JUJ(r3, this));
                valueAnimator = this.A04;
            } else {
                boolean z = false;
                if (this.A05 != AnonymousClass4Ki.STOPPED) {
                    z = true;
                    A01();
                }
                int i2 = r7.A00;
                if (i2 > 0 || i2 == -1) {
                    r0 = AnonymousClass4Ki.FULLTEXT;
                } else {
                    r0 = AnonymousClass4Ki.ICON;
                }
                this.A05 = r0;
                A00(r0);
                if (!z) {
                    ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(150);
                    this.A02 = duration3;
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = this.A00;
                    if (animatorUpdateListener2 == null) {
                        animatorUpdateListener2 = new AnonymousClass4US(this);
                        this.A00 = animatorUpdateListener2;
                    }
                    duration3.addUpdateListener(animatorUpdateListener2);
                    this.A02.start();
                }
                if (i2 > 0 && (i2 < (i = r7.A01) || i == -1)) {
                    ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(250);
                    this.A04 = duration4;
                    duration4.setStartDelay((long) i2);
                    ValueAnimator valueAnimator2 = this.A04;
                    C232812uU r4 = C232812uU.SLIDE_OUT;
                    valueAnimator2.addUpdateListener(new LTk(this));
                    this.A04.addListener(new JUJ(r4, this));
                    this.A04.start();
                }
                int i3 = r7.A01;
                if (i3 > 0) {
                    ValueAnimator duration5 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(250);
                    this.A03 = duration5;
                    duration5.setStartDelay((long) i3);
                    ValueAnimator valueAnimator3 = this.A03;
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListener3 = this.A01;
                    if (animatorUpdateListener3 == null) {
                        animatorUpdateListener3 = new C64199LTl(this);
                        this.A01 = animatorUpdateListener3;
                    }
                    valueAnimator3.addUpdateListener(animatorUpdateListener3);
                    ValueAnimator valueAnimator4 = this.A03;
                    AnonymousClass4HM r03 = this.A06;
                    if (r03 == null) {
                        r03 = new C62148Kb1(this);
                        this.A06 = r03;
                    }
                    valueAnimator4.addListener(r03);
                    valueAnimator = this.A03;
                } else {
                    return;
                }
            }
        }
        valueAnimator.start();
    }
}
