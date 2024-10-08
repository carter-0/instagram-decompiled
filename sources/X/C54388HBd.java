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

/* renamed from: X.HBd  reason: case insensitive filesystem */
public final class C54388HBd extends C273044lr {
    public int A00;
    public final Paint A01 = AnonymousClass7TE.A0V(1);
    public final RectF A02 = AnonymousClass7TE.A0Y();

    public C54388HBd(C273024lp r2, 1QG r3) {
        AnonymousClass7TF.A1B(r3, 1, r2);
    }

    public final void A04(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A02;
        float f = (float) this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A01);
    }

    public final void A08(C273024lp r2) {
        0qQ.A0B(r2, 0);
    }

    public final void A09(SpinnerImageView spinnerImageView) {
        0qQ.A0B(spinnerImageView, 0);
        Context context = spinnerImageView.getContext();
        0qQ.A0A(context);
        spinnerImageView.setImageDrawable(AnonymousClass4Ed.A01(context, R.drawable.nav_spinner, 2Yu.A0A(context)));
    }

    public final void A02(int i, int i2) {
        RectF rectF = this.A02;
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        Paint paint = this.A01;
        rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
    }

    public final void A03(Resources resources, TextView textView) {
        AnonymousClass7TG.A1N(textView, resources);
        Paint paint = this.A01;
        Context context = textView.getContext();
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.igds_color_separator_or_stroke_on_media));
        paint.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
        paint.setStyle(Paint.Style.STROKE);
        int color = context.getColor(2Yu.A0A(context));
        textView.setTextColor(color);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(color));
        try {
            this.A00 = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        } catch (Resources.NotFoundException unused) {
            0wb.A03("IgdsButton", "Cannot find corner radius resource dimension in LabelInvertedOnMediaRenderer");
            this.A00 = 8;
        }
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

    public final void A0A(View view, TextView textView, boolean z) {
        AnonymousClass7TG.A1O(textView, view);
        Paint paint = this.A01;
        int i = 77;
        if (z) {
            i = 255;
        }
        paint.setAlpha(i);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
        view.postInvalidate();
    }
}
