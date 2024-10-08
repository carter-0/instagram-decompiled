package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.UmT  reason: case insensitive filesystem */
public final class C15987UmT extends C273044lr {
    public Paint A00 = new Paint(1);
    public RectF A01 = new RectF();
    public int A02;

    public final void A04(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A01;
        float f = (float) this.A02;
        canvas.drawRoundRect(rectF, f, f, this.A00);
    }

    public final void A08(C273024lp r2) {
        0qQ.A0B(r2, 0);
    }

    public final void A0A(View view, TextView textView, boolean z) {
        0qQ.A0B(view, 2);
        Paint paint = this.A00;
        int i = 77;
        if (z) {
            i = 255;
        }
        paint.setAlpha(i);
        view.postInvalidate();
    }

    public final void A0B(View view, TextView textView, boolean z) {
        int i;
        0qQ.A0B(view, 2);
        Paint paint = this.A00;
        if (z) {
            i = 179;
        } else {
            i = 77;
            if (view.isEnabled()) {
                i = 255;
            }
        }
        paint.setAlpha(i);
        view.postInvalidate();
    }

    public final void A02(int i, int i2) {
        C13990Tnq.A0q(this.A01, (float) i, i2);
    }

    public final void A03(Resources resources, TextView textView) {
        boolean A1Z = AnonymousClass7TG.A1Z(textView, resources);
        Context context = textView.getContext();
        Paint paint = new Paint(A1Z ? 1 : 0);
        this.A00 = paint;
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.backgroundColorSecondary));
        AnonymousClass7TE.A1Q(this.A00);
        DbY.A12(textView, context);
        this.A02 = AnonymousClass7TE.A0D(resources);
        this.A01 = new RectF();
    }

    public final void A05(View view, View view2, TextView textView, boolean z) {
        AnonymousClass7TG.A1P(textView, view2);
        int i = 0;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    public final void A09(SpinnerImageView spinnerImageView) {
        Context A0E = Pxj.A0E(spinnerImageView);
        spinnerImageView.setImageDrawable(AnonymousClass4Ed.A01(A0E, R.drawable.nav_spinner, 2Yu.A07(A0E)));
    }
}
