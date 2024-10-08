package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;

/* renamed from: X.9XL  reason: invalid class name */
public final class AnonymousClass9XL extends Drawable implements B2I {
    public final AnonymousClass9XN A00;
    public final C306386Ly A01;

    public final float ArT() {
        return 0.0f;
    }

    public final void ESw(float f) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A01.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A00.setBounds(rect);
        C306386Ly r5 = this.A01;
        r5.A0E(rect.width());
        int i = r5.A0A;
        int width = rect.left + ((rect.width() - i) / 2);
        int i2 = rect.top;
        r5.setBounds(new Rect(width, i2, i + width, i2 + r5.A06));
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass9XL(Context context) {
        this.A00 = new AnonymousClass9XN(context);
        C306386Ly A0s = AnonymousClass7TE.A0s(context, 0);
        Resources resources = context.getResources();
        AnonymousClass7TE.A1P(resources, A0s, 2131976701);
        A0s.A0K(Layout.Alignment.ALIGN_CENTER);
        float A0D = (float) AnonymousClass7TE.A0D(resources);
        Typeface A0N = AnonymousClass7TG.A0N(context);
        if (A0N != null) {
            float A012 = AnonymousClass7TE.A01(resources, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            A0s.A0I(A0N);
            AJB.A0B(A0s, A012, A0D, A0D);
            this.A01 = A0s;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
