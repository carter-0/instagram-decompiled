package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

public final class U38 extends View {
    public float A00 = Float.NaN;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Path A05;
    public RectF A06;
    public float[] A07;
    public int[] A08 = {0, 0};
    public Rect A09;
    public final Paint A0A = new Paint();

    public U38(Context context) {
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.A0A;
        paint.setShader(new LinearGradient(((float) getWidth()) * this.A03, ((float) getHeight()) * this.A04, ((float) getWidth()) * this.A01, ((float) getHeight()) * this.A02, this.A08, this.A07, Shader.TileMode.CLAMP));
        if (C244163ak.A00(this.A00)) {
            Rect rect = this.A09;
            if (rect == null) {
                rect = new Rect();
                this.A09 = rect;
            }
            getDrawingRect(rect);
            canvas.clipRect(this.A09);
            canvas.drawPaint(paint);
            return;
        }
        if (this.A05 == null) {
            this.A05 = new Path();
        }
        if (this.A06 == null) {
            this.A06 = new RectF();
        }
        this.A05.reset();
        C13990Tnq.A0q(this.A06, (float) getWidth(), getHeight());
        Path path = this.A05;
        RectF rectF = this.A06;
        float[] fArr = new float[8];
        float f = this.A00;
        fArr[0] = f;
        C13989Tnp.A1U(fArr, f);
        AnonymousClass7TG.A11(path, rectF, fArr, f);
        canvas.drawPath(this.A05, paint);
    }
}
