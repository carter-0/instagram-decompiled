package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

public final class UIX extends AnonymousClass763 implements X7S {
    public Integer A00 = AnonymousClass05K.A00;
    public boolean A01 = false;
    public final Paint A02 = JTP.A0D();
    public final float[] A03 = new float[8];
    public final Path A04 = new Path();
    public final Path A05 = new Path();
    public final RectF A06 = new RectF();
    public final RectF A07 = new RectF();
    public final float[] A08 = new float[8];

    public final void ERU(boolean z) {
        this.A01 = true;
        A00();
        invalidateSelf();
    }

    public final void Ehg(float[] fArr) {
        0He.A01(AnonymousClass7TF.A1S(fArr.length, 8), "radii should have exactly 8 values");
        System.arraycopy(fArr, 0, this.A08, 0, 8);
        A00();
        invalidateSelf();
    }

    private void A00() {
        float[] fArr;
        Path path = this.A05;
        path.reset();
        Path path2 = this.A04;
        path2.reset();
        RectF rectF = this.A07;
        C13988Tno.A0v(rectF, this);
        rectF.inset(0.0f, 0.0f);
        if (this.A00 == AnonymousClass05K.A00) {
            path.addRect(rectF, Path.Direction.CW);
        }
        if (this.A01) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, this.A08, Path.Direction.CW);
        }
        rectF.inset(-0.0f, -0.0f);
        float f = 0.0f / 2.0f;
        rectF.inset(f, f);
        if (this.A01) {
            C13992Tns.A0X(path2, rectF);
        } else {
            int i = 0;
            while (true) {
                fArr = this.A03;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.A08[i] + 0.0f) - f;
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = -0.0f / 2.0f;
        rectF.inset(f2, f2);
    }

    public final void Ehh(float f) {
        Arrays.fill(this.A08, f);
        A00();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.A06;
        C13988Tno.A0v(rectF, this);
        int intValue = this.A00.intValue();
        Canvas canvas2 = canvas;
        if (intValue == 1) {
            int save = canvas.save();
            canvas.clipPath(this.A05);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (intValue == 0) {
            super.draw(canvas);
            Paint paint = this.A02;
            AnonymousClass7TE.A1Q(paint);
            paint.setColor(0);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(false);
            Path path = this.A05;
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.A01) {
                float width = ((rectF.width() - rectF.height()) + 0.0f) / 2.0f;
                float height = ((rectF.height() - rectF.width()) + 0.0f) / 2.0f;
                if (width > 0.0f) {
                    float f = rectF.left;
                    canvas2.drawRect(f, rectF.top, f + width, rectF.bottom, paint);
                    float f2 = rectF.right;
                    canvas2.drawRect(f2 - width, rectF.top, f2, rectF.bottom, paint);
                }
                if (height > 0.0f) {
                    float f3 = rectF.left;
                    float f4 = rectF.top;
                    canvas2.drawRect(f3, f4, rectF.right, f4 + height, paint);
                    float f5 = rectF.left;
                    float f6 = rectF.bottom;
                    canvas2.drawRect(f5, f6 - height, rectF.right, f6, paint);
                }
            }
        }
    }

    public UIX(Drawable drawable) {
        super(drawable);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
    }
}
