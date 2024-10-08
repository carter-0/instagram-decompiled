package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* renamed from: X.UIa  reason: case insensitive filesystem */
public final class C14982UIa extends U1X {
    public RectF A00 = null;
    public WeakReference A01;
    public final Bitmap A02;
    public final Paint A03;
    public final Paint A04;

    public C14982UIa(Resources resources, Bitmap bitmap) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint = new Paint();
        this.A04 = paint;
        Paint paint2 = new Paint(1);
        this.A03 = paint2;
        this.A02 = bitmap;
        paint.setFlags(1);
        JTO.A1N(paint2);
    }

    public final void A00() {
        super.A00();
        RectF rectF = this.A00;
        if (rectF == null) {
            rectF = new RectF();
            this.A00 = rectF;
        }
        this.A0A.mapRect(rectF, this.A0B);
    }

    public final boolean A02() {
        if (!super.A02() || this.A02 == null) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        Shader shader;
        AnonymousClass1Sz.A00();
        if (!A02()) {
            super.draw(canvas);
        } else {
            A00();
            A01();
            WeakReference weakReference = this.A01;
            if (weakReference == null || weakReference.get() != this.A02) {
                Bitmap bitmap = this.A02;
                this.A01 = new WeakReference(bitmap);
                if (bitmap != null) {
                    Paint paint = this.A04;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    this.A00 = true;
                }
            }
            if (this.A00 && (shader = this.A04.getShader()) != null) {
                shader.setLocalMatrix(this.A0A);
                this.A00 = false;
            }
            Paint paint2 = this.A04;
            paint2.setFilterBitmap(false);
            int save = canvas.save();
            canvas.concat(this.A06);
            if (this.A00 != null) {
                int save2 = canvas.save();
                canvas.clipRect(this.A00);
                canvas.drawPath(this.A0J, paint2);
                canvas.restoreToCount(save2);
            } else {
                canvas.drawPath(this.A0J, paint2);
            }
            canvas.restoreToCount(save);
        }
        AnonymousClass1Sz.A00();
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.A04;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }
}
