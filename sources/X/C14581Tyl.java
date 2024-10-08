package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.Tyl  reason: case insensitive filesystem */
public final class C14581Tyl {
    public final Paint A00;
    public final Path A01 = new Path();
    public final C14616TzN A02 = C14616TzN.A00();
    public final C14616TzN A03 = C14616TzN.A00();
    public final C14616TzN A04 = C14616TzN.A00();

    public C14581Tyl() {
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        AnonymousClass7TE.A1Q(paint);
        paint.setDither(true);
        paint.setColor(-14298266);
        paint.setMaskFilter(new BlurMaskFilter(175.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
