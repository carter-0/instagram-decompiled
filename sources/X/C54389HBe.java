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

/* renamed from: X.HBe  reason: case insensitive filesystem */
public final class C54389HBe extends C273044lr {
    public C273024lp A00;
    public int A01;
    public Resources A02;
    public final 1QG A03;
    public final Paint A04 = AnonymousClass7TE.A0V(1);
    public final RectF A05 = AnonymousClass7TE.A0Y();

    public C54389HBe(C273024lp r2, 1QG r3) {
        AnonymousClass7TF.A1B(r3, 1, r2);
        this.A03 = r3;
        this.A00 = r2;
    }

    public final void A04(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A05;
        float f = (float) this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A04);
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

    public final void A01() {
        Resources resources;
        int i;
        if (!this.A03.A00 || this.A00 != C273024lp.LARGE) {
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
        this.A05.set(0.0f, 0.0f, (float) i, (float) i2);
    }

    public final void A03(Resources resources, TextView textView) {
        AnonymousClass7TG.A1N(textView, resources);
        Paint paint = this.A04;
        Context context = textView.getContext();
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.igds_color_pill_active_background));
        AnonymousClass7TE.A1Q(paint);
        int color = context.getColor(2Yu.A0D(context));
        textView.setTextColor(color);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(color));
        this.A02 = resources;
        A01();
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
}
