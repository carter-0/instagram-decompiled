package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class U1N extends Drawable implements Drawable.Callback, AnonymousClass1MK {
    public float A00;
    public float A01;
    public Drawable A02;
    public C240563Lj A03;
    public final Paint A04 = new Paint(1);
    public final Paint A05 = new Paint(1);
    public final Paint A06;

    public final void A00(ImageUrl imageUrl) {
        this.A03 = null;
        this.A02 = null;
        invalidateSelf();
        C13989Tnp.A1P(this, 1NK.A00(), imageUrl, (String) null);
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        Bitmap bitmap = r7.A01;
        17k.A0E(AnonymousClass7TF.A1V(bitmap));
        0qQ.A0B(bitmap, 1);
        C240563Lj r0 = new C240563Lj(bitmap, false);
        this.A03 = r0;
        r0.setCallback(this);
        this.A03.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        C240563Lj r0 = this.A03;
        if (r0 != null) {
            r0.setAlpha(i);
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.A06.setAlpha(i);
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public U1N(Context context) {
        Paint paint = new Paint(1);
        this.A06 = paint;
        AnonymousClass7TE.A1Q(paint);
        AnonymousClass7TE.A1N(context, paint, R.color.grey_1);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        if (this.A01 > 0.0f) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((float) min) / 2.0f, this.A05);
        }
        if (this.A00 > 0.0f) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((((float) min) / 2.0f) - this.A01) + this.A00, this.A04);
        }
        Drawable drawable = this.A03;
        if (drawable == null && (drawable = this.A02) == null) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((((float) min) / 2.0f) - this.A01) + this.A00, this.A06);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f = ((float) min) - (this.A01 * 2.0f);
        float max = Math.max(f / ((float) intrinsicWidth), f / ((float) intrinsicHeight));
        canvas.save();
        float f2 = this.A01;
        canvas.translate(((float) bounds.left) + f2, ((float) bounds.top) + f2);
        canvas.scale(max, max);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
