package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcd  reason: case insensitive filesystem */
public final class C52786Gcd extends Drawable {
    public final int A00;
    public final Context A01;
    public final Paint A02;

    public C52786Gcd(Context context, int i, int i2, boolean z) {
        this.A01 = context;
        this.A00 = i;
        Paint paint = new Paint();
        AnonymousClass7TE.A1Q(paint);
        paint.setAntiAlias(true);
        if (z) {
            paint.setShadowLayer(15.0f, 2.0f, 2.0f, i2);
        }
        this.A02 = paint;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        int i = this.A00;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) A0L.width(), (float) A0L.height(), new int[]{2eL.A06(i, 216), i}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = this.A02;
        paint.setShader(linearGradient);
        canvas.drawCircle((float) A0L.centerX(), (float) A0L.centerY(), ((float) A0L.width()) / 2.0f, paint);
    }
}
