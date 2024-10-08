package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.7ok  reason: invalid class name and case insensitive filesystem */
public final class C342527ok extends Drawable {
    public final int A00;
    public final int A01;
    public final Paint A02;

    public C342527ok(Context context, int i) {
        this.A01 = i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        this.A00 = dimensionPixelSize;
        Paint paint = new Paint(1);
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setShader(new LinearGradient(0.0f, (float) dimensionPixelSize, 0.0f, 0.0f, new int[]{context.getColor(C61670oa.A03() ? R.color.igds_prism_black_alpha_40 : R.color.black_40_transparent), 0}, (float[]) null, Shader.TileMode.CLAMP));
        setBounds(0, 0, i, dimensionPixelSize);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawRect(getBounds(), this.A02);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
