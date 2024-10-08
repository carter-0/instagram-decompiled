package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.instagram.android.R;

public final class U39 extends View {
    public float A00;
    public float A01;
    public int A02;
    public C17483VXk A03;
    public float[] A04;
    public float[] A05;
    public float A06;
    public final int A07;
    public final int A08 = AnonymousClass7TG.A06(getContext());
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Paint A0F;

    public final void onDraw(Canvas canvas) {
        C17483VXk vXk;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        Paint paint = this.A0F;
        paint.setColor(this.A0C);
        float f = this.A06;
        int i = this.A07;
        canvas.drawLine(f, (float) i, f, (float) (i + this.A02), paint);
        float[] fArr = this.A04;
        if (fArr != null && (vXk = this.A03) != null) {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                paint.setColor(this.A0D);
                canvas.drawCircle(this.A06, fArr[i2], (float) this.A0B, paint);
                paint.setColor(((VRV) DbU.A0K(vXk.A03).get(i2)).A01);
                canvas.drawCircle(this.A06, fArr[i2], (float) this.A0A, paint);
            }
        }
    }

    public U39(Context context) {
        super(context);
        Paint paint = new Paint();
        this.A0F = paint;
        AnonymousClass7TE.A1Q(paint);
        paint.setStrokeWidth((float) JTR.A08(context));
        this.A07 = C51972G9s.A08(context);
        this.A0B = DbY.A01(context);
        this.A0A = JTR.A05(context);
        this.A0C = DbV.A01(context);
        this.A0D = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_button_icon);
        this.A09 = C51972G9s.A08(context);
        this.A0E = AnonymousClass7TG.A03(context);
    }

    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.A07;
        this.A02 = (measuredHeight - i3) - this.A08;
        float[] fArr = this.A05;
        if (fArr != null) {
            int length = fArr.length;
            int i4 = 0;
            if (length != 0) {
                float[] fArr2 = new float[length];
                do {
                    int measuredWidth = getMeasuredWidth() - this.A09;
                    float f3 = fArr[i4];
                    float f4 = this.A01;
                    float f5 = this.A00;
                    if (f5 < f4) {
                        f = 0.0f;
                    } else {
                        f = ((float) measuredWidth) * (((f3 - f4) * 1.0f) / (f5 - f4));
                    }
                    fArr2[i4] = f;
                    i4++;
                } while (i4 < length);
                C17483VXk vXk = this.A03;
                if (vXk != null) {
                    this.A06 = fArr2[vXk.A02] + ((float) this.A0E);
                }
                float[] fArr3 = this.A04;
                if (fArr3 != null && vXk != null) {
                    int length2 = fArr3.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f6 = (float) i3;
                        int i6 = this.A02;
                        float f7 = ((VRV) DbU.A0K(vXk.A03).get(i5)).A00;
                        float f8 = vXk.A01;
                        float f9 = vXk.A00;
                        if (f9 < f8) {
                            f2 = 0.0f;
                        } else {
                            f2 = ((float) i6) * (((f9 - f7) * 1.0f) / (f9 - f8));
                        }
                        fArr3[i5] = f6 + f2;
                    }
                }
            }
        }
    }
}
