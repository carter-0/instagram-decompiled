package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Gcl  reason: case insensitive filesystem */
public final class C52794Gcl extends Drawable {
    public final float A00;
    public final float A01;
    public final Paint A02;
    public final Drawable A03;
    public final GVD A04;

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return AnonymousClass7TE.A05(this.A01, 2.0f);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass7TE.A05(this.A01, 2.0f);
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public C52794Gcl(Context context, Drawable drawable) {
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A02 = A0V;
        float f = AnonymousClass7TF.A0E(context).density;
        this.A01 = 23.0f * f;
        this.A00 = 13.0f * f;
        this.A03 = drawable;
        DbX.A11(context, drawable, 2Yu.A0B(context));
        AnonymousClass7TE.A1Q(A0V);
        AnonymousClass7TE.A1N(context, A0V, 2Yu.A0C(context));
        this.A04 = new GVD(AnonymousClass7TF.A03(context, R.attr.igds_color_drawer_shadow), AnonymousClass7TE.A05(f, 10.0f));
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        GVD gvd = this.A04;
        gvd.setBounds(bounds);
        gvd.draw(canvas);
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f = this.A01;
        canvas.drawCircle(exactCenterX, exactCenterY, f, this.A02);
        Drawable drawable = this.A03;
        float f2 = this.A00;
        drawable.setBounds((int) ((exactCenterX - f) + f2), (int) ((exactCenterY - f) + f2), (int) ((exactCenterX + f) - f2), (int) ((exactCenterY + f) - f2));
        drawable.draw(canvas);
    }
}
