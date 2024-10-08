package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Size;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.Medium;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public final class LRZ {
    public static final Random A0E = new Random();
    public float A00;
    public int A01;
    public int A02;
    public BitmapShader A03;
    public AnonymousClass1MK A04;
    public C63947LEp A05;
    public boolean A06;
    public final Matrix A07 = AnonymousClass7TE.A0U();
    public final Matrix A08 = AnonymousClass7TE.A0U();
    public final PointF A09 = new PointF();
    public final PointF A0A = new PointF();
    public final RectF A0B = AnonymousClass7TE.A0Y();
    public final float A0C;
    public final Paint A0D = AnonymousClass7TE.A0V(3);

    public static void A00(Bitmap bitmap, LRZ lrz) {
        lrz.A04 = null;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        lrz.A03 = new BitmapShader(bitmap, tileMode, tileMode);
        lrz.A02 = bitmap.getWidth();
        lrz.A01 = bitmap.getHeight();
        lrz.A0D.setShader(lrz.A03);
    }

    public final void A01() {
        this.A05 = null;
        this.A03 = null;
        this.A04 = null;
        this.A02 = 0;
        this.A01 = 0;
        this.A0B.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.A00 = 0.0f;
        this.A0A.set(0.0f, 0.0f);
        this.A09.set(0.0f, 0.0f);
        this.A07.reset();
        this.A08.reset();
        this.A06 = false;
    }

    public final void A02(Canvas canvas, float f, int i, int i2, int i3) {
        if (this.A03 != null) {
            int i4 = i;
            int i5 = i2;
            if (!this.A06 && this.A05 != null) {
                this.A06 = true;
                PointF pointF = new PointF(0.5f, 0.5f);
                Medium medium = this.A05.A01;
                ArrayList A1C = AnonymousClass7TE.A1C();
                0sn<FaceCenter> r0 = medium.A0c;
                if (r0 == null) {
                    r0 = 0sn.A00;
                }
                for (FaceCenter faceCenter : r0) {
                    A1C.add(new PointF(faceCenter.A01, faceCenter.A02));
                }
                if (!A1C.isEmpty()) {
                    PointF A042 = 0mi.A04(A1C);
                    pointF.x = A042.x;
                    pointF.y = A042.y;
                }
                int i6 = this.A02;
                int i7 = this.A01;
                C63947LEp lEp = this.A05;
                int i8 = lEp.A00;
                if (i8 == -1) {
                    i8 = C364678lo.A01(lEp.A01.A0X);
                    lEp.A00 = i8;
                }
                float f2 = pointF.x;
                float f3 = pointF.y;
                Matrix matrix = this.A07;
                1MF.A0I(matrix, f2, f3, 1.5f, i6, i7, i4, i5, i8);
                Matrix matrix2 = this.A08;
                matrix2.set(matrix);
                RectF rectF = this.A0B;
                rectF.set(0.0f, 0.0f, (float) this.A02, (float) this.A01);
                matrix2.mapRect(rectF);
                float abs = Math.abs(rectF.left);
                float f4 = rectF.right - ((float) i);
                float abs2 = Math.abs(rectF.top);
                float f5 = rectF.bottom - ((float) i5);
                float width = rectF.width() * 0.05f;
                float height = rectF.height() * 0.05f;
                if (abs <= width || f4 <= width) {
                    if (abs > f4) {
                        width = Math.min(abs, width);
                    } else {
                        width = Math.max(-f4, -width);
                    }
                } else if (!A0E.nextBoolean()) {
                    width = -width;
                }
                if (abs2 <= height || f5 <= height) {
                    if (abs2 > f5) {
                        height = Math.min(abs2, height);
                    } else {
                        height = Math.max(-f5, -height);
                    }
                } else if (!A0E.nextBoolean()) {
                    height = -height;
                }
                Random random = A0E;
                float nextFloat = (random.nextFloat() * 0.5f) + 0.5f;
                this.A0A.set(width * nextFloat, height * nextFloat);
                this.A09.set(0.0f, 0.0f);
                this.A00 = (random.nextFloat() * 0.2f) + 1.0f;
            }
            Matrix matrix3 = this.A08;
            matrix3.set(this.A07);
            PointF pointF2 = this.A0A;
            float f6 = pointF2.x;
            PointF pointF3 = this.A09;
            matrix3.postTranslate(0mi.A01(f, 0.0f, 1.0f, f6, pointF3.x), 0mi.A01(f, 0.0f, 1.0f, pointF2.y, pointF3.y));
            RectF rectF2 = this.A0B;
            rectF2.set(0.0f, 0.0f, (float) this.A02, (float) this.A01);
            matrix3.mapRect(rectF2);
            float A012 = 0mi.A01(f, 0.0f, 1.0f, this.A00, 1.0f);
            matrix3.postScale(A012, A012, rectF2.centerX(), rectF2.centerY());
            BitmapShader bitmapShader = this.A03;
            bitmapShader.getClass();
            bitmapShader.setLocalMatrix(matrix3);
            Paint paint = this.A0D;
            paint.setAlpha(i3);
            rectF2.set(0.0f, 0.0f, (float) i, (float) i5);
            float f7 = this.A0C;
            canvas.drawRoundRect(rectF2, f7, f7, paint);
        }
    }

    public final void A03(C63947LEp lEp, int i, int i2) {
        Bitmap bitmap;
        if (!2PP.A00(this.A05, lEp)) {
            A01();
            this.A05 = lEp;
            Medium medium = lEp.A01;
            if (medium.A05()) {
                this.A04 = new C64615Lez(this, 1);
                1OO A0J = 1NK.A00().A0J(C253833rU.A01(AnonymousClass7TE.A0t(medium.A0X)), (String) null);
                A0J.A01 = 1MF.A01(medium.A0X, i, i2);
                A0J.A02(this.A04);
                A0J.A01();
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    File A0t = AnonymousClass7TE.A0t(medium.A0X);
                    Medium medium2 = this.A05.A01;
                    bitmap = ThumbnailUtils.createVideoThumbnail(A0t, new Size(medium2.A0B, medium2.A04), (CancellationSignal) null);
                } catch (IOException e) {
                    0wb.A07("KenBurnsImage.loadBitmap#IOException", e);
                    return;
                }
            } else {
                bitmap = ThumbnailUtils.createVideoThumbnail(medium.A0X, 1);
            }
            if (bitmap != null) {
                A00(bitmap, this);
            }
        }
    }

    public LRZ(float f) {
        this.A0C = f;
    }
}
