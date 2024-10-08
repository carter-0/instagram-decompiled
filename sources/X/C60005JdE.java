package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.JdE  reason: case insensitive filesystem */
public final class C60005JdE extends Drawable implements AnonymousClass1MK {
    public long A00;
    public Bitmap A01;
    public C66433MRn A02;
    public C295205nl A03;
    public boolean A04;
    public boolean A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public long A0N;
    public BitmapShader A0O;
    public Matrix A0P;
    public Paint A0Q;
    public Paint A0R;
    public ImageUrl A0S;
    public String A0T;
    public final Paint A0U;
    public final Paint A0V;
    public final float A0W;
    public final float A0X;
    public final float A0Y;
    public final float A0Z;
    public final float A0a;
    public final float A0b;
    public final long A0c;
    public final Context A0d;
    public final Paint A0e;
    public final Paint A0f;
    public final Paint A0g;
    public final Paint A0h;
    public final Rect A0i;
    public final Rect A0j;
    public final RectF A0k;
    public final List A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;

    public C60005JdE(Context context, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        float f6;
        this.A0l = AnonymousClass7TE.A1C();
        this.A06 = 0.5f;
        this.A07 = 0.5f;
        this.A09 = Float.MAX_VALUE;
        this.A0I = 1;
        this.A05 = true;
        this.A0H = 255;
        this.A0d = context;
        this.A08 = f3;
        this.A0m = z4;
        this.A0X = 0nA.A04(context, 0);
        float f7 = 0.0f;
        if (z) {
            f6 = 0nA.A04(context, 3);
        } else {
            f6 = 0.0f;
        }
        this.A0Z = f6;
        this.A0a = z ? 0nA.A04(context, 2) : f7;
        this.A0b = f;
        this.A0W = f2;
        this.A0n = z2;
        this.A0o = z3;
        this.A0k = AnonymousClass7TE.A0Y();
        this.A0i = AnonymousClass7TE.A0W();
        this.A0j = AnonymousClass7TE.A0W();
        this.A0P = AnonymousClass7TE.A0U();
        this.A0B = Color.argb(AnonymousClass7TE.A05(f5, 255.0f), 0, 0, 0);
        this.A0M = Color.argb(AnonymousClass7TE.A05(255.0f, f4), 0, 0, 0);
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0R = A0V2;
        A0V2.setColor(i);
        Paint paint = this.A0R;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.A0R.setStrokeWidth(f6);
        this.A0K = i2;
        this.A0e = AnonymousClass7TE.A0V(3);
        Paint A0V3 = AnonymousClass7TE.A0V(1);
        this.A0U = A0V3;
        A0V3.setColor(i3);
        Paint A0V4 = AnonymousClass7TE.A0V(1);
        this.A0V = A0V4;
        A0V4.setColor(0);
        A0V4.setStrokeWidth(0nA.A04(context, 2));
        A0V4.setStyle(style);
        this.A0f = AnonymousClass7TE.A0V(5);
        this.A0h = AnonymousClass7TE.A0V(5);
        Paint A0V5 = AnonymousClass7TE.A0V(1);
        this.A0g = A0V5;
        A0V5.setStyle(style);
        float A042 = 0nA.A04(context, 1);
        this.A0Y = A042;
        A0V5.setStrokeWidth(A042);
        A0V5.setColor(Color.argb(Math.round(25.5f), 255, 255, 255));
        this.A0Q = JTO.A0C();
        this.A0c = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60005JdE(android.content.Context r17, float r18, float r19, float r20, float r21, float r22, int r23, int r24, int r25, boolean r26, boolean r27) {
        /*
            r16 = this;
            r14 = 1
            r15 = 0
            r10 = 300(0x12c, double:1.48E-321)
            r0 = r16
            r1 = r17
            r3 = r18
            r6 = r19
            r4 = r20
            r2 = r21
            r5 = r22
            r9 = r23
            r7 = r24
            r8 = r25
            r13 = r26
            r12 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60005JdE.<init>(android.content.Context, float, float, float, float, float, int, int, int, boolean, boolean):void");
    }

    public final void A01() {
        this.A0S = null;
        this.A01 = null;
        this.A0O = null;
        this.A0e.setShader((Shader) null);
    }

    public final void A02(ImageUrl imageUrl, String str) {
        String str2;
        String str3 = null;
        if (imageUrl != null) {
            str2 = imageUrl.getUrl();
        } else {
            str2 = null;
        }
        ImageUrl imageUrl2 = this.A0S;
        if (imageUrl2 != null) {
            str3 = imageUrl2.getUrl();
        }
        if (!2PP.A00(str2, str3)) {
            A01();
            this.A0S = imageUrl;
            imageUrl.getClass();
            this.A0T = imageUrl.getUrl();
            this.A00 = System.currentTimeMillis();
            ImageUrl imageUrl3 = this.A0S;
            if (imageUrl3 != null) {
                1OO A0J2 = 1NK.A00().A0J(imageUrl3, str);
                A0J2.A01 = this.A0I;
                A0J2.A02(this);
                A0J2.A08 = this.A0T;
                A0J2.A01();
            }
            invalidateSelf();
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public static void A00(Bitmap bitmap, C60005JdE jdE) {
        jdE.A01 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        jdE.A0O = bitmapShader;
        jdE.A0e.setShader(bitmapShader);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - jdE.A00 < 1) {
            currentTimeMillis = -2;
        }
        jdE.A0N = currentTimeMillis;
        C66433MRn mRn = jdE.A02;
        if (mRn != null) {
            mRn.CyJ(jdE.A01, jdE);
        }
        jdE.invalidateSelf();
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        if (this.A0S != null && 2PP.A00(r3.C3s(), this.A0T)) {
            Bitmap bitmap = r4.A01;
            bitmap.getClass();
            A00(bitmap, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r6 = r22
            android.graphics.Rect r7 = r6.A0j
            int r1 = r6.A0F
            int r0 = r6.A0C
            r4 = 0
            r7.set(r4, r4, r1, r0)
            int[] r8 = r6.getState()
            int r5 = r8.length
            r3 = 0
            r2 = 0
        L_0x0013:
            if (r2 >= r5) goto L_0x001d
            r1 = r8[r2]
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            if (r1 != r0) goto L_0x0170
            r3 = 1
        L_0x001d:
            r12 = 1073741824(0x40000000, float:2.0)
            r5 = r23
            if (r3 == 0) goto L_0x0046
            float r10 = r6.A08
            float r0 = r6.A0a
            float r10 = r10 + r0
            float r9 = r6.A0Z
            float r9 = r9 / r12
            float r10 = r10 - r9
            android.graphics.RectF r8 = r6.A0k
            int r0 = r6.A0L
            float r3 = (float) r0
            float r3 = r3 + r9
            int r0 = r6.A0G
            float r2 = (float) r0
            float r2 = r2 + r9
            int r0 = r6.A0J
            float r1 = (float) r0
            float r1 = r1 - r9
            int r0 = r6.A0A
            float r0 = (float) r0
            float r0 = r0 - r9
            r8.set(r3, r2, r1, r0)
            android.graphics.Paint r0 = r6.A0R
            r5.drawRoundRect(r8, r10, r10, r0)
        L_0x0046:
            r5.save()
            int r0 = r6.A0D
            float r1 = (float) r0
            int r0 = r6.A0E
            float r0 = (float) r0
            r5.translate(r1, r0)
            boolean r0 = r6.A0o
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r0 == 0) goto L_0x016c
            long r0 = r6.A0N
            r9 = -2
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x016c
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x015d
            r10 = 0
        L_0x0068:
            android.graphics.RectF r9 = r6.A0k
            r9.set(r7)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0075
            android.graphics.BitmapShader r0 = r6.A0O
            if (r0 != 0) goto L_0x0083
        L_0x0075:
            float r1 = r6.A08
            android.graphics.Paint r0 = r6.A0U
            r5.drawRoundRect(r9, r1, r1, r0)
            float r1 = r6.A08
            android.graphics.Paint r0 = r6.A0V
            r5.drawRoundRect(r9, r1, r1, r0)
        L_0x0083:
            android.graphics.BitmapShader r8 = r6.A0O
            if (r8 == 0) goto L_0x00fd
            android.graphics.Rect r11 = r6.A0i
            android.graphics.Bitmap r0 = r6.A01
            r0.getClass()
            int r1 = r0.getWidth()
            android.graphics.Bitmap r0 = r6.A01
            int r0 = r0.getHeight()
            r11.set(r4, r4, r1, r0)
            android.graphics.Bitmap r0 = r6.A01
            int r17 = r0.getWidth()
            android.graphics.Bitmap r0 = r6.A01
            int r18 = r0.getHeight()
            int r11 = r6.A0F
            int r1 = r6.A0C
            float r14 = r6.A06
            float r15 = r6.A07
            float r0 = r6.A09
            android.graphics.Matrix r13 = r6.A0P
            r19 = r11
            r20 = r1
            r21 = r4
            r16 = r0
            X.1MF.A0I(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8.setLocalMatrix(r13)
            android.graphics.Paint r1 = r6.A0e
            int r0 = r6.A0H
            float r0 = (float) r0
            int r0 = X.AnonymousClass7TE.A05(r0, r10)
            r1.setAlpha(r0)
            float r0 = r6.A08
            r5.drawRoundRect(r9, r0, r0, r1)
            float r0 = r6.A0W
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00df
            float r1 = r6.A08
            android.graphics.Paint r0 = r6.A0f
            r5.drawRoundRect(r9, r1, r1, r0)
        L_0x00df:
            float r0 = r6.A0b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            float r1 = r6.A08
            android.graphics.Paint r0 = r6.A0h
            r5.drawRoundRect(r9, r1, r1, r0)
        L_0x00ec:
            boolean r0 = r6.A0n
            if (r0 == 0) goto L_0x00fd
            float r0 = r6.A0Y
            float r0 = r0 / r12
            r9.inset(r0, r0)
            float r1 = r6.A08
            android.graphics.Paint r0 = r6.A0g
            r5.drawRoundRect(r9, r1, r1, r0)
        L_0x00fd:
            r5.restore()
            X.5nl r1 = r6.A03
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x012e
            if (r1 == 0) goto L_0x012e
            float r1 = r1.A00
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x012e
            android.graphics.Paint r8 = r6.A0Q
            r0 = 1124073472(0x43000000, float:128.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            int r1 = r1 * r0
            r8.setColor(r1)
            r9.set(r7)
        L_0x011d:
            float r0 = r6.A08
            r5.drawRoundRect(r9, r0, r0, r8)
        L_0x0122:
            android.graphics.BitmapShader r0 = r6.A0O
            if (r0 == 0) goto L_0x012d
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x012d
            r6.invalidateSelf()
        L_0x012d:
            return
        L_0x012e:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0122
            android.graphics.Paint r8 = r6.A0Q
            int r0 = r6.A0K
            r8.setColor(r0)
            int[] r7 = r6.getState()
            int r4 = r7.length
            r2 = 0
        L_0x013f:
            if (r2 >= r4) goto L_0x011d
            r1 = r7[r2]
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            if (r1 != r0) goto L_0x015a
            int r1 = r6.A0D
            float r7 = (float) r1
            int r4 = r6.A0E
            float r2 = (float) r4
            int r0 = r6.A0F
            int r1 = r1 + r0
            float r1 = (float) r1
            int r0 = r6.A0C
            int r4 = r4 + r0
            float r0 = (float) r4
            r9.set(r7, r2, r1, r0)
            goto L_0x011d
        L_0x015a:
            int r2 = r2 + 1
            goto L_0x013f
        L_0x015d:
            long r0 = X.C51966G9m.A07(r0)
            float r9 = (float) r0
            long r0 = r6.A0c
            float r8 = (float) r0
            float r9 = r9 / r8
            float r10 = X.0mi.A00(r9, r2, r3)
            goto L_0x0068
        L_0x016c:
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0068
        L_0x0170:
            int r2 = r2 + 1
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60005JdE.draw(android.graphics.Canvas):void");
    }

    public final void onBoundsChange(Rect rect) {
        float f = this.A0X;
        int round = Math.round(((float) rect.left) + f);
        this.A0G = round;
        int round2 = Math.round(((float) rect.top) + f);
        this.A0L = round2;
        int round3 = Math.round(((float) rect.right) - f);
        this.A0J = round3;
        int round4 = Math.round(((float) rect.bottom) - f);
        this.A0A = round4;
        float f2 = (float) round;
        float f3 = this.A0a;
        int i = (int) (f2 + f3);
        this.A0D = i;
        int i2 = (int) (((float) round2) + f3);
        this.A0E = i2;
        int round5 = Math.round(((float) round3) - f3);
        int round6 = Math.round(((float) round4) - f3);
        this.A0F = round5 - i;
        int i3 = round6 - i2;
        this.A0C = i3;
        if (this.A0m) {
            this.A08 = ((float) i3) / 2.0f;
        }
        float f4 = (float) round6;
        int i4 = this.A0B;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A0f.setShader(new LinearGradient(0.0f, f4, 0.0f, f4 - (((float) i3) * this.A0W), i4, 0, tileMode));
        float f5 = (float) this.A0E;
        this.A0h.setShader(new LinearGradient(0.0f, f5, 0.0f, f5 + (((float) this.A0C) * this.A0b), this.A0M, 0, tileMode));
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A0H = i;
        this.A0e.setAlpha(i);
        this.A0R.setAlpha(i);
        this.A0h.setAlpha(i);
        this.A0f.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0e.setColorFilter(colorFilter);
        this.A0R.setColorFilter(colorFilter);
        this.A0g.setColorFilter(colorFilter);
        this.A0h.setColorFilter(colorFilter);
        this.A0f.setColorFilter(colorFilter);
    }
}
