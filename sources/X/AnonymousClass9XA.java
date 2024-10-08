package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9XA  reason: invalid class name */
public final class AnonymousClass9XA extends Drawable implements C41795B1a {
    public float A00 = 1.0f;
    public final C306386Ly A01;
    public final C306386Ly A02;

    public final int getOpacity() {
        return -3;
    }

    public final void A00(Canvas canvas, float f, float f2, float f3) {
        this.A00 = f3;
        C306386Ly r1 = this.A01;
        setBounds(new Rect((int) (f3 * f), (int) (f3 * f2), (int) (f3 * (f + ((float) r1.A0A) + ((float) this.A02.A0A))), (int) (f3 * (f2 + ((float) r1.A06)))));
        draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.A01.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A02.A0A + this.A01.A0A;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public AnonymousClass9XA(Context context, String str, int i) {
        C306386Ly A0s = AnonymousClass7TE.A0s(context, i);
        AnonymousClass7TF.A1A(A0s, str);
        AnonymousClass7TG.A0x(context, A0s, 14);
        this.A01 = A0s;
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, i);
        AnonymousClass7TF.A1A(A0s2, "  •  ");
        AnonymousClass7TG.A0x(context, A0s2, 14);
        this.A02 = A0s2;
    }

    public final Rect BIJ() {
        return new Rect(AnonymousClass7TE.A0J(this) + this.A02.A0A, getBounds().top, getBounds().right, getBounds().bottom);
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        AnonymousClass7TG.A0z(canvas, this);
        float f = this.A00;
        canvas.scale(f, f);
        C306386Ly r0 = this.A02;
        r0.draw(canvas);
        canvas.translate((float) r0.A0A, 0.0f);
        this.A01.draw(canvas);
        canvas.restore();
    }
}
