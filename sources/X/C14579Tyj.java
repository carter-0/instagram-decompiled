package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.widget.ImageView;

/* renamed from: X.Tyj  reason: case insensitive filesystem */
public final class C14579Tyj extends ImageView {
    public final Paint A00;
    public final Path A01 = new Path();
    public final float[] A02;

    public C14579Tyj(Context context, float[] fArr) {
        super(context);
        this.A02 = fArr;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        Pxi.A0v(paint, PorterDuff.Mode.DST_OUT);
        setLayerType(2, (Paint) null);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.drawPath(this.A01, this.A00);
    }

    public final float[] getRadii() {
        return this.A02;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-1547611089);
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.A01;
        path.reset();
        float f = (float) i;
        float f2 = (float) i2;
        path.addRoundRect(new RectF(0.0f, 0.0f, f, f2), this.A02, Path.Direction.CW);
        path.addRect(new RectF(0.0f, 0.0f, f, f2), Path.Direction.CCW);
        path.close();
        AnonymousClass0fD.A0D(-309986971, A06);
    }
}
