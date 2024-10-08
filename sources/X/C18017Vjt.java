package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.Vjt  reason: case insensitive filesystem */
public class C18017Vjt {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public W1g A04 = null;
    public W1g A05 = null;
    public W1g[] A06 = new W1g[4];
    public Paint A07 = new Paint(2);
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();

    public void A00(Canvas canvas, float f, float f2) {
        Bitmap bitmap;
        Bitmap A022;
        W1g w1g = this.A05;
        Bitmap bitmap2 = null;
        if (w1g != null) {
            bitmap = w1g.A02();
        } else {
            bitmap = null;
        }
        Bitmap bitmap3 = W1g.A0F;
        if (bitmap != bitmap3) {
            float f3 = f;
            float f4 = f2;
            Canvas canvas2 = canvas;
            if (bitmap != null) {
                Paint paint = this.A07;
                paint.setAlpha(255);
                canvas2.drawBitmap(bitmap, f3, f4, paint);
                return;
            }
            Paint paint2 = this.A07;
            paint2.setAlpha(255);
            W1g[] w1gArr = this.A06;
            int i = 0;
            int i2 = 0;
            do {
                W1g w1g2 = w1gArr[i];
                if (!(w1g2 == null || w1g2.A04 != this.A02 + 1 || w1gArr[i].A02() == null)) {
                    i2++;
                }
                i++;
            } while (i < 4);
            W1g w1g3 = this.A04;
            if (w1g3 != null) {
                bitmap2 = w1g3.A02();
            }
            if (i2 != 4) {
                if (!(bitmap2 == null || bitmap2 == bitmap3)) {
                    int i3 = this.A02;
                    W1g w1g4 = this.A04;
                    int i4 = i3 - w1g4.A04;
                    int i5 = w1g4.A00 >> i4;
                    int i6 = (1 << i4) - 1;
                    int i7 = (this.A00 & i6) * i5;
                    int i8 = (i6 & this.A01) * i5;
                    Rect rect = this.A08;
                    rect.set(i7, i8, i7 + i5, i5 + i8);
                    RectF rectF = this.A09;
                    W1g w1g5 = this.A04;
                    rectF.set(f3, f4, ((float) w1g5.A01) + f, ((float) w1g5.A00) + f2);
                    canvas2.drawBitmap(bitmap2, rect, rectF, paint2);
                }
                if (i2 <= 0) {
                    return;
                }
            }
            int i9 = 0;
            do {
                int i10 = 0;
                do {
                    W1g w1g6 = w1gArr[(i9 << 1) + i10];
                    if (!(w1g6 == null || w1g6.A04 != this.A02 + 1 || (A022 = w1g6.A02()) == null || A022 == bitmap3)) {
                        int i11 = w1g6.A00;
                        int i12 = i11 >> 1;
                        float f5 = ((float) (i12 * i9)) + f;
                        float f6 = ((float) (i12 * i10)) + f2;
                        Rect rect2 = this.A08;
                        rect2.set(0, 0, w1g6.A01, i11);
                        RectF rectF2 = this.A09;
                        float f7 = (float) i12;
                        rectF2.set(f5, f6, f5 + f7, f7 + f6);
                        canvas2.drawBitmap(A022, rect2, rectF2, paint2);
                    }
                    i10++;
                } while (i10 < 2);
                i9++;
            } while (i9 < 2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C51968G9o.A16(this));
        sb.append("{tile=");
        Object obj = this.A05;
        Object obj2 = "{x}";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append(", mParentTile=");
        Object obj3 = this.A04;
        if (obj3 != null) {
            obj2 = obj3;
        }
        sb.append(obj2);
        sb.append(", status=");
        sb.append(this.A03);
        return AnonymousClass7TF.A0l("}", sb);
    }
}
