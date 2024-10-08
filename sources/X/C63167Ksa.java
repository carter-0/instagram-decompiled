package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.Ksa  reason: case insensitive filesystem */
public abstract class C63167Ksa {
    public static final void A00(View view, float f) {
        0qQ.A0B(view, 0);
        float A03 = AnonymousClass7TE.A03(view);
        Context context = view.getContext();
        float applyDimension = TypedValue.applyDimension(0, A03, AnonymousClass7TF.A0E(context));
        float applyDimension2 = TypedValue.applyDimension(0, f, AnonymousClass7TF.A0E(context));
        float[] A1b = C51965G9l.A1b();
        A1b[0] = applyDimension;
        A1b[1] = applyDimension2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.setDuration(300);
        C64205LTv.A01(ofFloat, view, 9);
        ofFloat.start();
    }
}
