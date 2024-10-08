package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

public final class I82 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public I82(ImageView imageView, C52871Ge4 ge4, float[] fArr, int i) {
        this.A00 = i;
        this.A03 = ge4;
        if (6 - i != 0) {
            this.A02 = fArr;
            this.A01 = imageView;
        } else {
            this.A01 = fArr;
            this.A02 = imageView;
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        float f;
        char c;
        float[] fArr;
        Object obj;
        PathMeasure pathMeasure;
        switch (this.A00) {
            case 0:
                AnonymousClass6Tm r1 = (AnonymousClass6Tm) this.A01;
                C299275ur.A00((C307896Rx) this.A02, r1, (C277014uI) this.A03);
                return;
            case 1:
                0qQ.A0B(valueAnimator, 0);
                C17722Vcr vcr = (C17722Vcr) this.A02;
                Drawable drawable = (Drawable) this.A01;
                vcr.A02 = C51970G9q.A04(valueAnimator.getAnimatedValue("x"), "null cannot be cast to non-null type kotlin.Float") * 0.1f * ((float) drawable.getBounds().width());
                vcr.A03 = C51970G9q.A04(valueAnimator.getAnimatedValue("y"), "null cannot be cast to non-null type kotlin.Float") * 0.1f * ((float) drawable.getBounds().height());
                ((View) this.A03).invalidate();
                return;
            case 2:
                0qQ.A0B(valueAnimator, 0);
                int A032 = AnonymousClass2E0.A0A().A03((Context) this.A01, 21);
                QA4 progressBarView = ((FBPayAnimationButton) this.A03).getProgressBarView();
                C62320sa r5 = (C62320sa) this.A02;
                progressBarView.setCircleColorRaw(2eL.A06(A032, AnonymousClass1GB.A01(255.0f * valueAnimator.getAnimatedFraction())));
                if (valueAnimator.getAnimatedFraction() == 1.0f) {
                    RotateDrawable rotateDrawable = progressBarView.A02;
                    if (rotateDrawable == null) {
                        0qQ.A0F("layerSpinnerRingDrawable");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    rotateDrawable.setAlpha(0);
                    if (r5 != null) {
                        progressBarView.getRootView().postDelayed(new C57713IfG(r5), 800);
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        progressBarView.performHapticFeedback(16);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Object A0o = C51971G9r.A0o(valueAnimator);
                if (A0o instanceof Float) {
                    number = (Number) A0o;
                } else {
                    number = null;
                }
                float f2 = 0.0f;
                if (number != null) {
                    f = number.floatValue();
                } else {
                    f = 0.0f;
                }
                ((C64183LSq) this.A03).A05().setY(f);
                View view = (View) this.A02;
                if (((C53362Gmm) this.A01).A01 != 0.0f) {
                    f2 = f;
                }
                view.setY(f2);
                return;
            case 6:
                c = 0;
                0qQ.A0B(valueAnimator, 0);
                PathMeasure pathMeasure2 = ((C52871Ge4) this.A03).A02;
                fArr = (float[]) this.A01;
                pathMeasure2.getPosTan(pathMeasure2.getLength() * C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"), fArr, (float[]) null);
                obj = this.A02;
                break;
            case 7:
                c = 0;
                0qQ.A0B(valueAnimator, 0);
                pathMeasure = ((C52871Ge4) this.A03).A03;
                break;
            case 8:
                c = 0;
                0qQ.A0B(valueAnimator, 0);
                pathMeasure = ((C52871Ge4) this.A03).A04;
                break;
            default:
                0qQ.A0B(valueAnimator, 0);
                ((View) this.A01).setAlpha(C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
                ((View) this.A03).setAlpha(C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
                ((View) this.A02).setAlpha(C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
                return;
        }
        fArr = (float[]) this.A02;
        pathMeasure.getPosTan(pathMeasure.getLength() * C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"), fArr, (float[]) null);
        obj = this.A01;
        View view2 = (View) obj;
        view2.setTranslationX(fArr[c]);
        view2.setTranslationY(fArr[1]);
    }

    public I82(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }
}
