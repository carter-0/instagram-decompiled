package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.9XN  reason: invalid class name */
public final class AnonymousClass9XN extends Drawable implements B2I {
    public Drawable A00;
    public Integer A01;
    public float A02;
    public final Context A03;
    public final Paint A04;

    public final float ArT() {
        return 0.0f;
    }

    public final void ESw(float f) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A01 != AnonymousClass05K.A0C) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), this.A02, this.A04);
            Drawable drawable = this.A00;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A02 = ((float) Math.min(getBounds().height(), AnonymousClass7TF.A06(this))) / 5.0f;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(A00(rect));
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass9XN(Context context) {
        this.A03 = context;
        Paint paint = new Paint();
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.igds_color_secondary_button_on_media));
        this.A04 = paint;
        this.A01 = AnonymousClass05K.A0C;
        this.A01 = AnonymousClass05K.A00;
        Rect A002 = A00(AnonymousClass7TE.A0X(this));
        Context context2 = this.A03;
        Drawable drawable = context2.getDrawable(R.drawable.instagram_pause_pano_filled_24);
        if (drawable != null) {
            AnonymousClass7TE.A1R(drawable, AnonymousClass7TE.A09(context2));
            drawable.setBounds(A002);
            this.A00 = drawable;
            invalidateSelf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final Rect A00(Rect rect) {
        int min = Math.min(rect.height(), rect.width()) / 5;
        int height = rect.top + ((rect.height() - min) / 2);
        int width = rect.left + ((rect.width() - min) / 2);
        return new Rect(width, height, width + min, min + height);
    }
}
