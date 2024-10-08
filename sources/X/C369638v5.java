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

/* renamed from: X.8v5  reason: invalid class name and case insensitive filesystem */
public final class C369638v5 extends Drawable implements C268714ds, C300645xY {
    public final C387299lz A00;
    public final int A01;
    public final int A02;
    public final Bitmap A03;
    public final Paint A04;
    public final RectF A05;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A03 != null) {
            Rect bounds = getBounds();
            0qQ.A07(bounds);
            canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            canvas.drawRect(this.A05, this.A04);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final C2802350v BzV() {
        return this.A00;
    }

    public final String C4F() {
        return "fb_community_tap_state_id_key";
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C369638v5(Bitmap bitmap, C387299lz r6, int i, int i2) {
        this.A00 = r6;
        this.A03 = bitmap;
        this.A02 = i;
        this.A01 = i2;
        Paint paint = new Paint(3);
        this.A04 = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        this.A05 = new RectF(0.0f, 0.0f, (float) i, (float) i2);
    }
}
