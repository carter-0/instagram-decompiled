package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gct  reason: case insensitive filesystem */
public final class C52801Gct extends Drawable implements AnonymousClass1MK {
    public Bitmap A00;
    public Paint A01 = AnonymousClass7TE.A0V(3);
    public final RectF A02 = AnonymousClass7TE.A0Y();

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        Bitmap bitmap = r3.A01;
        if (bitmap != null) {
            this.A00 = bitmap;
        }
        invalidateSelf();
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            Paint paint = this.A01;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            canvas.drawBitmap(bitmap, (Rect) null, this.A02, paint);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A02.set(0.0f, 0.0f, (float) rect.width(), (float) rect.height());
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C52801Gct(ImageUrl imageUrl) {
        1OO A0J = 1NK.A00().A0J(imageUrl, "potato_media_shape_drawable");
        A0J.A02(this);
        A0J.A01();
    }
}
