package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jd8  reason: case insensitive filesystem */
public final class C59999Jd8 extends Drawable implements Drawable.Callback {
    public final String A00;
    public final int A01;
    public final Path A02 = C51965G9l.A0C();
    public final RectF A03 = AnonymousClass7TE.A0Y();
    public final Drawable A04;
    public final Drawable A05;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A05;
        int i = this.A01;
        drawable.setBounds(0, 0, i, i);
        drawable.draw(canvas);
        Path path = this.A02;
        path.reset();
        RectF rectF = this.A03;
        float f = (float) i;
        rectF.set(0.0f, 0.0f, f, f);
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        AnonymousClass7TG.A11(path, rectF, fArr, f);
        canvas.clipPath(path);
        this.A04.draw(canvas);
        invalidateSelf();
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }

    public C59999Jd8(Context context, Drawable drawable, UserSession userSession, String str, int i) {
        this.A00 = str;
        this.A01 = i;
        this.A05 = drawable;
        this.A04 = C320996tP.A02(context, userSession, str, i, i, false);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
