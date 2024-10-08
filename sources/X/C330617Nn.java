package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.7Nn  reason: invalid class name and case insensitive filesystem */
public final class C330617Nn extends View {
    public C330587Nk A00;
    public final C330627No A01 = new C330627No(this);

    public void setCanvasRenderer(C330587Nk r3) {
        C330587Nk r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A00 = r3;
        if (r3 != null) {
            r3.A00 = this.A01;
        }
        invalidate();
    }

    public C330617Nn(Context context) {
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C330587Nk r4 = this.A00;
        if (r4 != null) {
            C330577Nj r42 = (C330577Nj) r4;
            if (canvas.getDensity() != 0) {
                i = canvas.getDensity();
            } else {
                i = r42.A02.getDisplayMetrics().densityDpi;
            }
            for (C17716Vcl vcl : r42.A08) {
                Bitmap bitmap = vcl.A09;
                if (bitmap != null) {
                    Matrix matrix = r42.A03;
                    PointF pointF = vcl.A0B;
                    matrix.setTranslate(pointF.x, pointF.y);
                    float f = vcl.A02;
                    matrix.preScale(f, f);
                    matrix.preRotate((float) ((((double) vcl.A05) / 3.141592653589793d) * 180.0d));
                    matrix.preTranslate(((float) (-bitmap.getScaledWidth(i))) * 0.5f, ((float) (-bitmap.getScaledHeight(i))) * 0.5f);
                    Paint paint = r42.A04;
                    paint.setAlpha((int) (vcl.A01 * 255.0f));
                    canvas.drawBitmap(bitmap, matrix, paint);
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C330587Nk r3 = this.A00;
        if (r3 != null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            Rect rect = r3.A01;
            if (0 != rect.left || 0 != rect.top || i5 != rect.right || i6 != rect.bottom) {
                rect.set(0, 0, i5, i6);
                C330627No r0 = r3.A00;
                if (r0 != null) {
                    C330617Nn r1 = r0.A00;
                    if (r3 == r1.A00) {
                        r1.invalidate();
                    }
                }
            }
        }
    }
}
