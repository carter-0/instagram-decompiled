package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class W4K implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public W4K(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C17185VLp vLp;
        ValueAnimator valueAnimator2 = valueAnimator;
        switch (this.A00) {
            case 0:
                0qQ.A0B(valueAnimator2, 0);
                ((C18504Vt1) this.A01).A00 = C51970G9q.A04(valueAnimator2.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
                ((Drawable) this.A02).invalidateSelf();
                return;
            case 1:
                float A002 = AnonymousClass7TH.A00(valueAnimator2);
                U3Z u3z = (U3Z) this.A02;
                C17722Vcr vcr = (C17722Vcr) this.A01;
                U3Z.A02(vcr, u3z, A002);
                if (A002 > 0.95f && (vLp = vcr.A09) != null && !u3z.A03.hasMessages(1, vcr)) {
                    U3Z.A04(vcr, u3z, vLp);
                    return;
                }
                return;
            case 2:
                U19 u19 = (U19) this.A02;
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                if (u19.A02 != animatedFraction) {
                    U19.A03(u19, animatedFraction);
                    return;
                }
                return;
            case 3:
                int A04 = DbW.A04(C51971G9r.A0o(valueAnimator2), "null cannot be cast to non-null type kotlin.Int");
                View view = (View) this.A02;
                float f = 100.0f - ((float) A04);
                view.setTranslationY(f);
                ((View) this.A01).setTranslationY(f);
                view.setAlpha((float) (((double) A04) * 0.01d));
                return;
            case 4:
                Iterator it = ((List) this.A02).iterator();
                while (it.hasNext()) {
                    JTO.A0H(it).setAlpha(C13989Tnp.A02(valueAnimator2));
                }
                return;
            case 5:
                W1R w1r = (W1R) this.A01;
                w1r.A00 = C13989Tnp.A02(valueAnimator2);
                W1R.A00((Context) this.A02, w1r);
                return;
            case 6:
                int A042 = DbW.A04(((ValueAnimator) this.A01).getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
                C15286UZq uZq = (C15286UZq) this.A02;
                C14074TpO tpO = uZq.A06;
                if (tpO != null) {
                    tpO.A04(A042, uZq.A00);
                    C14074TpO tpO2 = uZq.A06;
                    if (tpO2 != null) {
                        DiscoveryRecyclerView discoveryRecyclerView = tpO2.A04;
                        if (discoveryRecyclerView != null) {
                            discoveryRecyclerView.postOnAnimation(new C20066WkQ(uZq));
                        }
                        uZq.A00 = A042;
                        return;
                    }
                }
                0qQ.A0F("grid");
                throw AnonymousClass00P.createAndThrow();
            default:
                float A003 = AnonymousClass7TH.A00(valueAnimator2);
                U3I u3i = (U3I) this.A02;
                float height = ((float) (u3i.getHeight() * 3)) / 4.0f;
                int[] iArr = U3I.A0D;
                int[] iArr2 = U3I.A0E;
                ArgbEvaluator argbEvaluator = (ArgbEvaluator) this.A01;
                int min = Math.min(4, 4);
                ArrayList arrayList = new ArrayList(min);
                for (int i = 0; i < min; i++) {
                    Object evaluate = argbEvaluator.evaluate(A003, Integer.valueOf(iArr[i]), Integer.valueOf(iArr2[i]));
                    0qQ.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    arrayList.add(evaluate);
                }
                float f2 = height;
                u3i.A01.setShader(new LinearGradient(height, ((float) u3i.getHeight()) - height, ((float) u3i.getWidth()) - height, f2, 00k.A0x(arrayList), U3I.A0C, Shader.TileMode.CLAMP));
                u3i.invalidate();
                return;
        }
    }
}
