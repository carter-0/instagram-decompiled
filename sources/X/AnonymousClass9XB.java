package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9XB  reason: invalid class name */
public final class AnonymousClass9XB extends Drawable implements C268714ds {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass8DV A04;
    public final String A05;

    public AnonymousClass9XB(Context context, Bitmap bitmap, String str, int i, int i2, int i3, int i4) {
        0qQ.A0B(str, 2);
        this.A05 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = i4;
        AnonymousClass8DV r1 = new AnonymousClass8DV(context.getResources(), bitmap);
        this.A04 = r1;
        r1.A02((float) i4);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A04.draw(canvas);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A04.setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.50v, java.lang.Object, X.Aep] */
    public final C2802350v BzV() {
        String str = this.A05;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A03;
        int i4 = this.A00;
        0qQ.A0B(str, 1);
        ? obj = new Object();
        obj.A04 = str;
        obj.A02 = i;
        obj.A01 = i2;
        obj.A03 = i3;
        obj.A00 = i4;
        return obj;
    }

    public final int getIntrinsicHeight() {
        return this.A04.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A04.A02;
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }
}
