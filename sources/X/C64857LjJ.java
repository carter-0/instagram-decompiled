package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.android.R;
import com.instagram.common.clips.model.LayoutTransform;
import java.util.ArrayList;
import org.webrtc.CameraCapturer;

/* renamed from: X.LjJ  reason: case insensitive filesystem */
public final class C64857LjJ implements B2X {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public LayoutTransform A05;
    public C60999Juv A06;
    public Float A07;
    public Runnable A08;
    public ArrayList A09;
    public 0sL A0A;
    public 0sK A0B;
    public boolean A0C;
    public boolean A0D;
    public final Matrix A0E = AnonymousClass7TE.A0U();
    public final Matrix A0F = AnonymousClass7TE.A0U();
    public final Paint A0G;
    public final Paint A0H;
    public final RectF A0I = AnonymousClass7TE.A0Y();
    public final C63607Kzv A0J;
    public final float[] A0K = C51965G9l.A1b();
    public final Rect A0L = AnonymousClass7TE.A0W();
    public final RectF A0M = AnonymousClass7TE.A0Y();

    public static final void A02(Bitmap bitmap, Canvas canvas, LayoutTransform layoutTransform, C64857LjJ ljJ, float f, int i) {
        Rect A082 = JTS.A08(bitmap);
        A082.left += (int) (JTO.A02(bitmap) * (((float) i) / f));
        C64857LjJ ljJ2 = ljJ;
        RectF rectF = ljJ2.A0I;
        int i2 = A082.right;
        int i3 = A082.bottom;
        float f2 = (float) i2;
        LayoutTransform layoutTransform2 = layoutTransform;
        float f3 = (float) i3;
        Matrix matrix = ljJ2.A0F;
        float f4 = layoutTransform2.A01;
        matrix.setRotate(f4);
        float[] fArr = ljJ2.A0K;
        fArr[0] = layoutTransform2.A00 * f2;
        fArr[1] = layoutTransform2.A03 * f3;
        matrix.mapPoints(fArr);
        float f5 = fArr[0];
        float f6 = fArr[1];
        Matrix matrix2 = ljJ2.A0E;
        matrix2.reset();
        matrix2.preTranslate(((float) (-i2)) * 0.5f, ((float) (-i3)) * 0.5f);
        if (layoutTransform2.A07) {
            matrix2.postScale(-1.0f, 1.0f);
        }
        matrix2.postRotate(f4);
        float f7 = layoutTransform2.A02;
        matrix2.postScale(f7, f7);
        matrix2.postTranslate(f2 * 0.5f, f3 * 0.5f);
        matrix2.postTranslate(f5, f6);
        matrix2.postTranslate(-((float) A082.left), -((float) A082.top));
        float max = Math.max(rectF.width() / ((float) A082.width()), rectF.height() / ((float) A082.height()));
        matrix2.postScale(max, max);
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.clipRect(rectF);
        canvas2.drawBitmap(bitmap, matrix2, ljJ2.A0H);
        canvas2.restore();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[LOOP:0: B:18:0x004e->B:29:0x0078, LOOP_START, PHI: r4 
      PHI: (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:17:0x004c, B:29:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.graphics.Canvas r12, int r13, int r14, boolean r15) {
        /*
            r11 = this;
            r6 = 0
            r12.save()
            float r0 = r11.A01
            float r0 = -r0
            r5 = 0
            r12.translate(r0, r5)
            X.Juv r0 = r11.A06
            r7 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00ab
            X.0sL r0 = r11.A0A
            if (r0 != 0) goto L_0x00ab
            int r8 = r11.A03(r14)
            double r2 = (double) r8
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x008b
            int r0 = r11.A02
            if (r0 == 0) goto L_0x008b
            double r0 = (double) r13
            int r2 = X.JTP.A01(r0, r2)
            if (r15 != 0) goto L_0x0086
            java.util.ArrayList r1 = r11.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0086
            int r0 = r1.size()
            if (r0 >= r2) goto L_0x0042
            int r0 = r1.size()
            java.util.ArrayList r0 = r11.A00(r0, r2)
            r1.addAll(r0)
        L_0x0042:
            java.util.ArrayList r0 = r11.A09
        L_0x0044:
            r11.A09 = r0
            int r6 = r0.size()
            X.Juv r3 = r11.A06
            if (r3 == 0) goto L_0x00ef
        L_0x004e:
            if (r4 >= r6) goto L_0x00ef
            java.util.ArrayList r0 = r11.A09
            java.lang.Object r9 = r0.get(r4)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0084
            boolean r0 = r11.A0C
            if (r0 != 0) goto L_0x0084
            float r2 = (float) r13
            double[] r0 = r3.A03
            if (r0 == 0) goto L_0x00a1
            r0 = r0[r4]
            float r10 = (float) r0
            float r2 = r2 * r10
            float r0 = (float) r6
            float r2 = r2 / r0
        L_0x006b:
            android.graphics.RectF r1 = r11.A0I
            float r0 = (float) r14
            r1.set(r5, r5, r2, r0)
            if (r9 == 0) goto L_0x007e
            android.graphics.Paint r0 = r11.A0H
            r12.drawBitmap(r9, r7, r1, r0)
        L_0x0078:
            r12.translate(r2, r5)
            int r4 = r4 + 1
            goto L_0x004e
        L_0x007e:
            android.graphics.Paint r0 = r11.A0G
            r12.drawRect(r1, r0)
            goto L_0x0078
        L_0x0084:
            float r2 = (float) r8
            goto L_0x006b
        L_0x0086:
            java.util.ArrayList r0 = r11.A00(r6, r2)
            goto L_0x0044
        L_0x008b:
            java.util.ArrayList r2 = r11.A09
            r2.clear()
            X.Juv r0 = r11.A06
            if (r0 == 0) goto L_0x00a6
            android.graphics.Bitmap[] r1 = r0.A01()
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.util.Collections.addAll(r2, r0)
            goto L_0x0042
        L_0x00a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00ab:
            X.0sL r0 = r11.A0A
            if (r0 == 0) goto L_0x00e3
            int r8 = r11.A03(r14)
            double r2 = (double) r13
            double r0 = (double) r8
            int r9 = X.JTP.A01(r2, r0)
            java.util.ArrayList r0 = A01(r11, r6, r9)
            r11.A09 = r0
        L_0x00bf:
            if (r4 >= r9) goto L_0x00ef
            java.util.ArrayList r0 = r11.A09
            java.lang.Object r3 = r0.get(r4)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            android.graphics.RectF r2 = r11.A0I
            float r1 = (float) r8
            float r0 = (float) r14
            r2.set(r5, r5, r1, r0)
            if (r3 == 0) goto L_0x00dd
            android.graphics.Paint r0 = r11.A0H
            r12.drawBitmap(r3, r7, r2, r0)
        L_0x00d7:
            r12.translate(r1, r5)
            int r4 = r4 + 1
            goto L_0x00bf
        L_0x00dd:
            android.graphics.Paint r0 = r11.A0G
            r12.drawRect(r2, r0)
            goto L_0x00d7
        L_0x00e3:
            android.graphics.RectF r2 = r11.A0M
            float r1 = (float) r13
            float r0 = (float) r14
            r2.set(r5, r5, r1, r0)
            android.graphics.Paint r0 = r11.A0G
            r12.drawRect(r2, r0)
        L_0x00ef:
            r12.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64857LjJ.A04(android.graphics.Canvas, int, int, boolean):void");
    }

    public final void DAp(Canvas canvas, int i, int i2) {
        A04(canvas, i, i2, true);
    }

    public final void FLw(int i, int i2, int i3) {
    }

    public final void reset() {
        this.A06 = null;
    }

    public final int A03(int i) {
        float f;
        C60999Juv juv = this.A06;
        if (juv != null) {
            return (juv.A01 * i) / juv.A00;
        }
        Float f2 = this.A07;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        return (int) (f * ((float) i));
    }

    public C64857LjJ(Context context, C63607Kzv kzv) {
        this.A0J = kzv;
        Paint A0V = AnonymousClass7TE.A0V(3);
        this.A0H = A0V;
        Paint A0V2 = AnonymousClass7TE.A0V(3);
        this.A0G = A0V2;
        this.A04 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
        this.A03 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
        this.A00 = 1.0f;
        Paint.Style style = Paint.Style.FILL;
        A0V.setStyle(style);
        AnonymousClass7TE.A1N(context, A0V, R.color.black);
        A0V2.setStyle(style);
        AnonymousClass7TE.A1N(context, A0V2, R.color.grey_6);
        this.A09 = AnonymousClass7TE.A1C();
    }

    private final ArrayList A00(int i, int i2) {
        Bitmap bitmap;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C60999Juv juv = this.A06;
        if (juv != null) {
            Bitmap[] A012 = juv.A01();
            while (i < i2) {
                i++;
                int A002 = C63116Krk.A00(((this.A04 * i) / this.A03) - 1, 0, A012.length - 1);
                while (true) {
                    if (-1 >= A002) {
                        bitmap = null;
                        break;
                    }
                    bitmap = A012[A002];
                    if (bitmap != null) {
                        break;
                    }
                    A002--;
                }
                A1C.add(bitmap);
            }
            return A1C;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final ArrayList A01(C64857LjJ ljJ, int i, int i2) {
        2HZ A0C2;
        Object invoke;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (ljJ.A00 < 0.0f) {
            A0C2 = new 2HZ(i2, i, -1);
        } else {
            A0C2 = C229632nm.A0C(i, i2);
        }
        int i3 = A0C2.A00;
        int i4 = A0C2.A01;
        int i5 = A0C2.A02;
        if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
            boolean z = true;
            while (true) {
                int abs = (i3 + 1) * ((int) (((float) ljJ.A04) * Math.abs(ljJ.A00)));
                int i6 = ljJ.A03;
                int i7 = (abs / i6) * i6;
                if (i7 == 0) {
                    i7 += i6;
                }
                boolean z2 = ljJ.A0D;
                if (!z2 || !DbT.A1b(A1C)) {
                    if (z2) {
                        i7 = 0;
                    }
                    0sK r4 = ljJ.A0B;
                    if (r4 != null) {
                        invoke = r4.invoke(Integer.valueOf(i7), Boolean.valueOf(z), new C59112J6u(ljJ, 5));
                    } else {
                        0sL r3 = ljJ.A0A;
                        if (r3 != null) {
                            invoke = r3.invoke(Integer.valueOf(i7), new C59112J6u(ljJ, 6));
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                } else {
                    invoke = A1C.get(0);
                }
                if (invoke == null && DbT.A1b(A1C)) {
                    invoke = A1C.get(A1C.size() - 1);
                }
                A1C.add(invoke);
                if (i3 == i4) {
                    break;
                }
                i3 += i5;
                z = false;
            }
        }
        return A1C;
    }
}
