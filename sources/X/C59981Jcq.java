package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Jcq  reason: case insensitive filesystem */
public final class C59981Jcq extends Drawable {
    public final float A00;
    public final Context A01;
    public final Paint A02;
    public final Drawable A03;
    public final GVD A04;

    public C59981Jcq(Context context, Drawable drawable) {
        this.A01 = context;
        this.A03 = drawable;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A02 = A0V;
        float f = AnonymousClass7TF.A0E(context).density;
        this.A00 = 23.0f * f;
        AnonymousClass7TE.A1Q(A0V);
        AnonymousClass7TE.A1N(context, A0V, 2Yu.A0C(context));
        this.A04 = new GVD(AnonymousClass7TF.A03(context, R.attr.igds_color_drawer_shadow), AnonymousClass7TE.A05(f, 10.0f));
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return AnonymousClass7TE.A05(this.A00, 2.0f);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass7TE.A05(this.A00, 2.0f);
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        GVD gvd = this.A04;
        gvd.setBounds(A0L);
        gvd.draw(canvas);
        float exactCenterX = A0L.exactCenterX();
        float exactCenterY = A0L.exactCenterY();
        canvas.drawCircle(exactCenterX, exactCenterY, this.A00, this.A02);
        Drawable drawable = this.A03;
        drawable.setBounds((int) (exactCenterX - ((float) (drawable.getIntrinsicWidth() / 2))), (int) (exactCenterY - ((float) (drawable.getIntrinsicHeight() / 2))), (int) (((float) (drawable.getIntrinsicWidth() / 2)) + exactCenterX), (int) (exactCenterX + ((float) (drawable.getIntrinsicHeight() / 2))));
        drawable.draw(canvas);
    }
}
