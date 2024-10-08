package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.HBf  reason: case insensitive filesystem */
public final class C54390HBf extends C273044lr {
    public C273024lp A00;
    public int A01;
    public Resources A02;
    public final Paint A03 = AnonymousClass7TE.A0V(1);
    public final 1QG A04;
    public final RectF A05 = AnonymousClass7TE.A0Y();

    public C54390HBf(C273024lp r2, 1QG r3) {
        AnonymousClass7TF.A1B(r3, 1, r2);
        this.A04 = r3;
        this.A00 = r2;
    }

    public final void A04(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A05;
        float f = (float) this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    public final void A08(C273024lp r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final void A09(SpinnerImageView spinnerImageView) {
        0qQ.A0B(spinnerImageView, 0);
        Context A0S = AnonymousClass7TE.A0S(spinnerImageView);
        spinnerImageView.setImageDrawable(AnonymousClass4Ed.A01(A0S, R.drawable.nav_spinner, 2Yu.A0B(A0S)));
    }

    public final void A0A(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        int i = 77;
        float f = 0.3f;
        if (z) {
            i = 255;
            f = 1.0f;
        }
        this.A03.setAlpha(i);
        textView.setAlpha(f);
    }

    public final void A01() {
        Resources resources;
        int i;
        if (!this.A04.A00 || this.A00 != C273024lp.LARGE) {
            resources = this.A02;
            if (resources != null) {
                i = R.dimen.abc_button_padding_horizontal_material;
            }
            0qQ.A0F("resources");
            throw AnonymousClass00P.createAndThrow();
        }
        resources = this.A02;
        if (resources != null) {
            i = R.dimen.account_discovery_bottom_gap;
        }
        0qQ.A0F("resources");
        throw AnonymousClass00P.createAndThrow();
        this.A01 = resources.getDimensionPixelSize(i);
    }

    public final void A02(int i, int i2) {
        RectF rectF = this.A05;
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        Paint paint = this.A03;
        rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
    }

    public final void A03(Resources resources, TextView textView) {
        AnonymousClass7TG.A1N(textView, resources);
        Paint paint = this.A03;
        Context context = textView.getContext();
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0C(context));
        AnonymousClass7TE.A1Q(paint);
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        int A042 = C51968G9o.A04(context);
        textView.setTextColor(A042);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(A042));
        this.A02 = resources;
        A01();
    }

    public final void A05(View view, View view2, TextView textView, boolean z) {
        AnonymousClass7TG.A1P(textView, view2);
        int i = 8;
        textView.setVisibility(DbW.A00(z ? 1 : 0));
        if (z) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    public final void A0B(View view, TextView textView, boolean z) {
        int i;
        float f;
        AnonymousClass7TG.A1O(textView, view);
        if (view.isEnabled()) {
            i = 255;
            f = 1.0f;
            if (z) {
                i = 179;
                f = 0.7f;
            }
        } else {
            i = 77;
            f = 0.3f;
        }
        this.A03.setAlpha(i);
        textView.setAlpha(f);
        view.postInvalidate();
    }
}
