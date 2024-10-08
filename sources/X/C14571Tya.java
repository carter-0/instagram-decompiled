package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.Tya  reason: case insensitive filesystem */
public final class C14571Tya {
    public final Paint A00;
    public final Path A01 = new Path();
    public final C14616TzN A02 = C14616TzN.A00();
    public final C14616TzN A03 = C14616TzN.A00();
    public final C14616TzN A04 = C14616TzN.A00();
    public final C14616TzN A05 = C14616TzN.A00();
    public final C14616TzN A06 = C14616TzN.A00();

    public final void A00() {
        Path path = this.A01;
        path.reset();
        C14616TzN tzN = this.A06;
        path.moveTo(tzN.A00, tzN.A01);
        C14616TzN tzN2 = this.A02;
        float f = tzN2.A00;
        float f2 = tzN2.A01;
        C14616TzN tzN3 = this.A03;
        float f3 = tzN3.A00;
        float f4 = tzN3.A01;
        C14616TzN tzN4 = this.A04;
        path.cubicTo(f, f2, f3, f4, tzN4.A00, tzN4.A01);
        C14616TzN tzN5 = this.A05;
        path.lineTo(tzN5.A00, tzN5.A01);
        path.close();
    }

    public C14571Tya(int i, int i2) {
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        AnonymousClass7TE.A1Q(paint);
        paint.setDither(true);
        paint.setColor(i);
        paint.setMaskFilter(new BlurMaskFilter((float) i2, BlurMaskFilter.Blur.NORMAL));
    }
}
