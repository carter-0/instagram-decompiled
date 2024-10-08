package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.UgG  reason: case insensitive filesystem */
public final class C15650UgG extends C14097Tpp {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.U3A, android.view.View, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        ? view = new View(context);
        view.setWillNotDraw(false);
        view.setLayerType(2, (Paint) null);
        Paint paint = new Paint(1);
        view.A04 = paint;
        JTO.A1N(paint);
        Paint paint2 = new Paint(1);
        view.A05 = paint2;
        AnonymousClass7TE.A1Q(paint2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        view.A01 = ofFloat;
        0qQ.A0A(ofFloat);
        ofFloat.setDuration(500);
        ValueAnimator valueAnimator = view.A01;
        0qQ.A0A(valueAnimator);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator2 = view.A01;
        0qQ.A0A(valueAnimator2);
        valueAnimator2.addUpdateListener(new W48(view));
        view.A06 = new Point();
        view.A09 = true;
        view.A07 = new RectF();
        view.A08 = new RectF();
        view.A02 = new Matrix();
        view.A03 = new Matrix();
        return view;
    }

    public C15650UgG(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
