package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oeg  reason: case insensitive filesystem */
public final class C71167Oeg implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71167Oeg(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        switch (this.A00) {
            case 0:
                float A002 = AnonymousClass7TH.A00(valueAnimator);
                C330537Nf r3 = (C330537Nf) this.A01;
                r3.A00 = A002;
                AnonymousClass7PM r2 = r3.A05;
                if (r2 != null) {
                    Iterator it = r2.CFT().iterator();
                    while (it.hasNext()) {
                        JTO.A0H(it).setTranslationX(A002);
                    }
                    C330537Nf.A00(r3, r2, A002);
                }
                Object obj = this.A03;
                Iterator it2 = ((List) this.A04).iterator();
                while (it2.hasNext()) {
                    View A0H = JTO.A0H(it2);
                    if (obj == AnonymousClass05K.A01) {
                        f = -1.0f * A002;
                    } else {
                        f = A002;
                    }
                    A0H.setTranslationX(f);
                }
                ((View) this.A02).invalidate();
                return;
            case 1:
                0qQ.A0B(valueAnimator, 0);
                if (valueAnimator.getAnimatedFraction() > 0.5f) {
                    ((ViewPropertyAnimator) this.A01).setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
                    ((View) this.A02).setVisibility(0);
                    ((C63939LEc) this.A04).A00.A02(((C59671JTb) this.A03).A00, false, false);
                    return;
                }
                return;
            case 2:
                float A003 = AnonymousClass7TH.A00(valueAnimator);
                int A004 = (int) 0nA.A00((Context) this.A01, 12.0f + (4.0f * (1.0f - A003)));
                TextView textView = (TextView) this.A04;
                C66583MXo.A0w(textView, A003);
                textView.setAlpha(A003);
                textView.setScaleX(A003);
                textView.setScaleY(A003);
                Drawable background = ((View) this.A02).getBackground();
                if (background != null) {
                    background.setAlpha((int) (A003 * 255.0f));
                }
                View view = (View) this.A03;
                C66580MXl.A1C(view, A004);
                C66580MXl.A1B(view, A004);
                return;
            case 3:
                int A042 = DbW.A04(((ValueAnimator) this.A01).getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
                C66582MXn.A14((View) this.A03, A042);
                C14074TpO tpO = ((C15286UZq) this.A04).A06;
                if (tpO == null) {
                    0qQ.A0F("grid");
                    throw AnonymousClass00P.createAndThrow();
                }
                0rk r1 = (0rk) this.A02;
                tpO.A04(A042, r1.A00);
                r1.A00 = A042;
                return;
            default:
                return;
        }
    }
}
