package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JVz  reason: case insensitive filesystem */
public abstract class C59741JVz extends IgImageView {
    public float A00;
    public float A01;
    public float A02;
    public PointF A03;
    public boolean A04;
    public float A05;
    public Runnable A06;
    public final Matrix A07 = AnonymousClass7TE.A0U();
    public final Matrix A08 = AnonymousClass7TE.A0U();
    public final 2cs A09;
    public final 2cs A0A;
    public final 2cs A0B;
    public final C71392co A0C;
    public final C71392co A0D;
    public final 2cp A0E;
    public final LFF A0F;
    public final C59894JbJ A0G;
    public final Matrix A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final float[] A0L;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.JVz, android.widget.ImageView] */
    public final void A0I(float f, float f2) {
        Matrix matrix = this.A08;
        matrix.set(getImageMatrix());
        LFF lff = this.A0F;
        A0J(matrix, lff);
        float f3 = f;
        float f4 = f2;
        if (lff.A01() && f == 0.0f && f2 == 0.0f) {
            A0L(true);
        } else {
            new C64437Lbs(matrix, this, lff, f3, f4);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.JVz, android.view.View] */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        0qQ.A0B(keyEvent, 1);
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return C59741JVz.super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public final void setForcedMinZoom(float f) {
        this.A04 = true;
        this.A02 = f;
    }

    public void setImageBitmap(Bitmap bitmap) {
        C59741JVz.super.setImageBitmap(bitmap);
        C59894JbJ jbJ = this.A0G;
        jbJ.A01 = bitmap;
        jbJ.A00 = 0;
        setHighQuality(true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, X.JVz, android.widget.ImageView, android.view.View] */
    public final void setImageRotateBitmapResetBase(C59894JbJ jbJ, float[] fArr, ViewGroup.LayoutParams layoutParams) {
        int width;
        0qQ.A0B(jbJ, 0);
        if (layoutParams != null) {
            width = layoutParams.width;
        } else {
            width = getWidth();
        }
        if (width <= 0) {
            this.A06 = new C59954JcK(this, jbJ, fArr);
            return;
        }
        Bitmap bitmap = jbJ.A01;
        if (bitmap != null) {
            int i = jbJ.A00;
            C59741JVz.super.setImageBitmap(bitmap);
            C59894JbJ jbJ2 = this.A0G;
            jbJ2.A01 = bitmap;
            jbJ2.A00 = i;
            setHighQuality(true);
            setupBaseMatrix(layoutParams);
        } else {
            this.A07.reset();
            setImageBitmap((Bitmap) null);
        }
        Matrix matrix = this.A08;
        if (fArr == null) {
            matrix.set(this.A07);
        } else {
            matrix.setValues(fArr);
        }
        setImageMatrix(matrix);
    }

    public static final float A00(Matrix matrix, C59741JVz jVz) {
        float[] fArr = jVz.A0L;
        matrix.getValues(fArr);
        return (float) JTR.A00(fArr[0], fArr[3]);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.JVz, android.widget.ImageView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C59741JVz r7) {
        /*
            android.graphics.Matrix r1 = r7.A08
            X.LFF r5 = r7.A0F
            r7.A0J(r1, r5)
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x0011
            r7.setImageMatrix(r1)
            return
        L_0x0011:
            android.graphics.Matrix r4 = r7.A0H
            r4.set(r1)
            float r0 = r5.A02
            double r0 = (double) r0
            double r1 = java.lang.Math.sqrt(r0)
            float r0 = (float) r1
            r5.A02 = r0
            float r1 = r5.A00
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            double r2 = (double) r1
            android.graphics.RectF r0 = r7.A0K
            float r0 = r0.width()
            double r0 = (double) r0
            float r0 = X.C64138LPn.A00(r2, r0)
            r5.A00 = r0
        L_0x0035:
            float r1 = r5.A01
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            double r2 = (double) r1
            android.graphics.RectF r0 = r7.A0K
            float r0 = r0.height()
            double r0 = (double) r0
            float r0 = X.C64138LPn.A00(r2, r0)
            r5.A01 = r0
        L_0x0049:
            r5.A00(r4)
            r7.setImageMatrix(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59741JVz.A01(X.JVz):void");
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.JVz, android.view.View] */
    private final void setupBaseMatrix(ViewGroup.LayoutParams layoutParams) {
        float A022;
        int height;
        if (layoutParams != null) {
            A022 = (float) layoutParams.width;
            height = layoutParams.height;
        } else {
            A022 = AnonymousClass7TE.A02(this);
            height = getHeight();
        }
        float f = (float) height;
        C59894JbJ jbJ = this.A0G;
        float A012 = (float) jbJ.A01();
        float A002 = (float) jbJ.A00();
        float max = Math.max(A022 / A012, f / A002);
        Matrix matrix = this.A07;
        0qQ.A0B(matrix, 0);
        matrix.reset();
        if (jbJ.A00 != 0) {
            Bitmap bitmap = jbJ.A01;
            if (bitmap != null) {
                float f2 = ((float) (-bitmap.getWidth())) / 2.0f;
                Bitmap bitmap2 = jbJ.A01;
                if (bitmap2 != null) {
                    matrix.postTranslate(f2, ((float) (-bitmap2.getHeight())) / 2.0f);
                    matrix.postRotate((float) jbJ.A00);
                    matrix.postTranslate(((float) jbJ.A01()) / 2.0f, ((float) jbJ.A00()) / 2.0f);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        matrix.postScale(max, max);
        matrix.postTranslate((A022 - (A012 * max)) / 2.0f, (f - (A002 * max)) / 2.0f);
        matrix.mapRect(this.A0K, this.A0I);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.JVz, android.widget.ImageView] */
    public final void A0H() {
        Matrix matrix = this.A08;
        LFF lff = this.A0F;
        A0J(matrix, lff);
        if (!lff.A01()) {
            lff.A00(matrix);
            setImageMatrix(matrix);
            this.A03 = null;
        }
        this.A0E.A04.clear();
    }

    public final void A0K(RectF rectF, float f, float f2) {
        this.A01 = f;
        if (!this.A04) {
            this.A04 = false;
            this.A02 = f;
        }
        this.A05 = f2;
        this.A0I.set(rectF);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.JVz, android.widget.ImageView, android.view.View] */
    public final void A0M(boolean z) {
        if (this.A0G.A01 != null) {
            setupBaseMatrix((ViewGroup.LayoutParams) null);
            Matrix matrix = this.A08;
            matrix.set(this.A07);
            if (z) {
                float f = this.A02;
                matrix.postScale(f, f, AnonymousClass7TE.A02(this) / 2.0f, AnonymousClass7TE.A03(this) / 2.0f);
            }
            setImageMatrix(matrix);
            this.A03 = null;
            return;
        }
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A06 = new C59955JcL(this, runnable, z);
        }
    }

    public final Matrix getBaseMatrix$fbandroid_java_com_instagram_creation_photo_crop_crop() {
        return this.A07;
    }

    public final float getCropAspectRatio() {
        return this.A00;
    }

    public final Matrix getCropMatrix() {
        return this.A08;
    }

    public final float[] getCropMatrixValues() {
        float[] fArr = new float[9];
        this.A08.getValues(fArr);
        return fArr;
    }

    public final float getCurrentScale() {
        return A00(this.A08, this) / A00(this.A07, this);
    }

    public final C59894JbJ getRotateBitmap() {
        return this.A0G;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.JbJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.LFF, java.lang.Object] */
    public C59741JVz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ? obj = new Object();
        obj.A01 = null;
        obj.A00 = 0;
        this.A0G = obj;
        this.A0F = new Object();
        this.A0H = AnonymousClass7TE.A0U();
        this.A0J = AnonymousClass7TE.A0Y();
        this.A0L = new float[9];
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A05 = 1.0f;
        this.A0I = AnonymousClass7TE.A0Y();
        this.A0K = AnonymousClass7TE.A0Y();
        this.A00 = 1.0f;
        setScaleType(ImageView.ScaleType.MATRIX);
        setCropToPadding(false);
        2cp A002 = C61340me.A00();
        this.A0E = A002;
        C71392co A042 = C71392co.A04(30.0d, 9.0d);
        this.A0C = A042;
        this.A0D = C71392co.A04(0.0d, 1.5d);
        2cs A022 = A002.A02();
        A022.A09(A042);
        this.A0B = A022;
        2cs A023 = this.A0E.A02();
        A023.A00 = 1.0d;
        A023.A02 = 10.0d;
        A023.A06 = false;
        this.A09 = A023;
        2cs A024 = this.A0E.A02();
        A024.A00 = 1.0d;
        A024.A02 = 10.0d;
        A024.A06 = false;
        this.A0A = A024;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.JVz, android.widget.ImageView] */
    private final void setHighQuality(boolean z) {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            bitmapDrawable.setDither(z);
            bitmapDrawable.setAntiAlias(z);
            bitmapDrawable.setFilterBitmap(z);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.JVz, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(android.graphics.Matrix r11, X.LFF r12) {
        /*
            r10 = this;
            X.AnonymousClass7TG.A1N(r11, r12)
            X.JbJ r4 = r10.A0G
            android.graphics.Bitmap r0 = r4.A01
            if (r0 != 0) goto L_0x0019
            X.LFF r1 = r10.A0F
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A02 = r0
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
            r1.A04 = r0
            r1.A03 = r0
        L_0x0018:
            return
        L_0x0019:
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A02 = r0
            r6 = 0
            r12.A01 = r6
            r12.A00 = r6
            r12.A04 = r6
            r12.A03 = r6
            float r5 = A00(r11, r10)
            android.graphics.Matrix r0 = r10.A07
            float r0 = A00(r0, r10)
            float r5 = r5 / r0
            android.graphics.Matrix r2 = r10.A0H
            r2.set(r11)
            android.graphics.PointF r0 = r10.A03
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0103
            float r0 = r0.x
        L_0x003e:
            r12.A03 = r0
            android.graphics.PointF r0 = r10.A03
            if (r0 == 0) goto L_0x00fc
            float r0 = r0.y
        L_0x0046:
            r12.A04 = r0
            float r3 = r10.A02
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0054
            float r1 = r10.A05
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0062
        L_0x0054:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x005a
            float r3 = r10.A05
        L_0x005a:
            float r3 = r3 / r5
            float r1 = r12.A03
            r2.postScale(r3, r3, r1, r0)
            r12.A02 = r3
        L_0x0062:
            android.graphics.RectF r3 = r10.A0J
            android.graphics.Bitmap r0 = r4.A01
            if (r0 == 0) goto L_0x010f
            float r1 = X.JTO.A02(r0)
            android.graphics.Bitmap r0 = r4.A01
            if (r0 == 0) goto L_0x010a
            float r0 = X.JTO.A01(r0)
            r3.set(r6, r6, r1, r0)
            r2.mapRect(r3)
            android.graphics.RectF r4 = r10.A0K
            float r5 = r4.left
            float r2 = r4.right
            float r1 = r4.width()
            float r0 = r3.width()
            float r1 = r1 - r0
            r8 = 2
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            float r1 = r1 / r9
            float r5 = r5 + r1
            float r2 = r2 - r1
        L_0x0091:
            float r0 = r10.A00
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            float r2 = r4.width()
            float r1 = r4.height()
            float r0 = r10.A00
            float r1 = r1 * r0
            float r2 = r2 - r1
            int r0 = (int) r2
            int r0 = r0 / r8
            float r5 = (float) r0
            float r2 = r4.right
            float r2 = r2 - r5
        L_0x00ab:
            float r1 = r3.left
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f3
            float r5 = r5 - r1
        L_0x00b2:
            r12.A00 = r5
        L_0x00b4:
            float r5 = r4.top
            float r2 = r4.bottom
            float r1 = r4.height()
            float r0 = r3.height()
            float r1 = r1 - r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            float r1 = r1 / r9
            float r5 = r5 + r1
            float r2 = r2 - r1
        L_0x00c8:
            float r0 = r10.A00
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
            float r2 = r4.height()
            float r1 = r4.width()
            float r0 = r10.A00
            float r1 = r1 / r0
            float r2 = r2 - r1
            int r0 = (int) r2
            int r0 = r0 / r8
            float r5 = (float) r0
            float r2 = r4.bottom
            float r2 = r2 - r5
        L_0x00e0:
            float r1 = r3.top
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            float r5 = r5 - r1
        L_0x00e7:
            r12.A01 = r5
            return
        L_0x00ea:
            float r1 = r3.bottom
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0018
            float r5 = r2 - r1
            goto L_0x00e7
        L_0x00f3:
            float r1 = r3.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b4
            float r5 = r2 - r1
            goto L_0x00b2
        L_0x00fc:
            float r0 = X.AnonymousClass7TE.A03(r10)
            float r0 = r0 / r9
            goto L_0x0046
        L_0x0103:
            float r0 = X.AnonymousClass7TE.A02(r10)
            float r0 = r0 / r9
            goto L_0x003e
        L_0x010a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x010f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59741JVz.A0J(android.graphics.Matrix, X.LFF):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.JVz, android.view.View] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C59741JVz.super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A06 = null;
            runnable.run();
        }
        if (this.A0G.A01 != null) {
            setupBaseMatrix((ViewGroup.LayoutParams) null);
        }
    }

    public void A0L(boolean z) {
        setHighQuality(z);
    }

    public final void setCropAspectRatio(float f) {
        this.A00 = f;
    }
}
