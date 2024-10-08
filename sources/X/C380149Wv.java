package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.9Wv  reason: invalid class name and case insensitive filesystem */
public abstract class C380149Wv extends Drawable implements C268684dp, Drawable.Callback, AnonymousClass1MK, C300645xY {
    public Bitmap A00;
    public Bitmap A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final Paint A05;
    public final RectF A06;
    public final Runnable A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final Paint A0E;
    public final Path A0F;
    public final RectF A0G;
    public final Drawable A0H;
    public final C306386Ly A0I;
    public final C306386Ly A0J;
    public final C306386Ly A0K;
    public final CopyOnWriteArraySet A0L = new CopyOnWriteArraySet();
    public final boolean A0M;

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0L.add(b1v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0069 A[LOOP:0: B:7:0x0063->B:9:0x0069, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CyF(X.C226952iF r12, X.AnonymousClass3LX r13) {
        /*
            r11 = this;
            r3 = 0
            X.AnonymousClass7TF.A1H(r12, r13)
            java.lang.Object r1 = r12.C3s()
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            android.graphics.Bitmap r2 = r13.A01
            int r1 = r11.A03
            int r0 = r11.A02
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)
            r11.A00 = r2
            android.graphics.Paint r1 = r11.A05
            if (r2 == 0) goto L_0x0087
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r10, r10)
            r1.setShader(r0)
            android.graphics.RectF r0 = r11.A06
            float r4 = r0.width()
            float r7 = r0.height()
            android.graphics.Paint r2 = r11.A04
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            r5 = 0
            r1 = 4
            r0 = 1184197120(0x46956a00, float:19125.0)
            int r0 = java.lang.Math.round(r0)
            int r0 = android.graphics.Color.argb(r0, r3, r3, r3)
            int[] r8 = new int[]{r3, r3, r3, r0}
            float[] r9 = new float[r1]
            r9 = {0, 1048576000, 1056964608, 1065353216} // fill-array
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.setShader(r3)
        L_0x0058:
            java.lang.Runnable r0 = r11.A07
            X.11Z.A02(r0)
        L_0x005d:
            java.util.concurrent.CopyOnWriteArraySet r0 = r11.A0L
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)
        L_0x0063:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()
            X.B1v r0 = (X.C41815B1v) r0
            r0.DOX()
            goto L_0x0063
        L_0x0073:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
            android.graphics.Bitmap r0 = r13.A01
            if (r0 == 0) goto L_0x008c
            android.graphics.Bitmap r0 = X.1MF.A05(r0)
            r11.A01 = r0
            goto L_0x0058
        L_0x0086:
            return
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380149Wv.CyF(X.2iF, X.3LX):void");
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0L.remove(b1v);
    }

    public final void draw(Canvas canvas) {
        float f;
        0qQ.A0B(canvas, 0);
        if (!isLoading()) {
            float height = this.A06.height();
            RectF rectF = this.A0G;
            float height2 = rectF.height();
            float f2 = height2 / 2.0f;
            Rect A0X = AnonymousClass7TE.A0X(this);
            Drawable drawable = this.A0H;
            0qQ.A0A(drawable);
            drawable.draw(canvas);
            int save = canvas.save();
            AnonymousClass7TF.A13(canvas, A0X);
            canvas.save();
            Path path = this.A0F;
            canvas.drawPath(path, this.A05);
            canvas.drawPath(path, this.A04);
            canvas.save();
            int i = this.A09;
            float f3 = (float) i;
            float f4 = (height - f3) - height2;
            boolean z = this.A0M;
            if (z) {
                f3 = (float) (this.A03 - i);
            }
            canvas.translate(f3, f4);
            canvas.save();
            if (z) {
                canvas.translate(-height2, 0.0f);
            }
            Bitmap bitmap = this.A01;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0E);
            }
            C306386Ly r2 = this.A0K;
            float f5 = f2 - (((float) r2.A06) / 2.0f);
            int i2 = this.A0C;
            if (z) {
                f = (float) ((-i2) - r2.A0A);
            } else {
                f = height2 + ((float) i2);
            }
            AnonymousClass7TF.A15(canvas, r2, f, f5);
            C306386Ly r1 = this.A0J;
            canvas.translate(0.0f, (float) ((-this.A0B) - r1.A06));
            canvas.save();
            if (z) {
                canvas.translate(-((float) r1.A0A), 0.0f);
            } else {
                canvas.translate(0.0f, 0.0f);
            }
            r1.draw(canvas);
            canvas.restore();
            C306386Ly r12 = this.A0I;
            canvas.translate(0.0f, (float) ((-this.A08) - r12.A06));
            if (z) {
                canvas.translate(-((float) r12.A0A), 0.0f);
            } else {
                canvas.translate(0.0f, 0.0f);
            }
            r12.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public C380149Wv(Context context, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, int i, int i2) {
        int i3 = i;
        Context context2 = context;
        this.A0D = context2;
        this.A03 = i3;
        int i4 = i2;
        this.A02 = i4;
        this.A0M = 0mk.A02(context2);
        this.A0E = AnonymousClass7TE.A0V(3);
        this.A05 = AnonymousClass7TE.A0V(3);
        this.A04 = AnonymousClass7TE.A0V(1);
        Path path = new Path();
        this.A0F = path;
        RectF A0Y = AnonymousClass7TE.A0Y();
        this.A0G = A0Y;
        this.A07 = new C40764Aiu(this);
        float A042 = 0nA.A04(context2, 8);
        float round = (float) Math.round(0nA.A04(context2, 24));
        this.A0A = (int) 0nA.A04(context2, 4);
        int round2 = Math.round(0nA.A04(context2, 16));
        this.A09 = round2;
        0nA.A04(context2, 8);
        this.A08 = Math.round(0nA.A04(context2, 4));
        this.A0B = Math.round(0nA.A04(context2, 8));
        int i5 = (int) (((float) round2) / 2.0f);
        this.A0C = i5;
        0nA.A04(context2, 2);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i4);
        this.A06 = rectF;
        Path path2 = path;
        path2.addRoundRect(rectF, new float[]{A042, A042, A042, A042, A042, A042, A042, A042}, Path.Direction.CW);
        Drawable drawable = context2.getDrawable(R.drawable.sticker_background_shadow);
        this.A0H = drawable;
        0qQ.A0A(drawable);
        drawable.setCallback(this);
        A0Y.set(0.0f, 0.0f, round, round);
        float f = (float) (i - (round2 * 2));
        int i6 = (int) (0.8f * f);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, (int) ((f - A0Y.width()) - ((float) i5)));
        this.A0K = A0s;
        AnonymousClass7TG.A0x(context2, A0s, 12);
        Typeface typeface = Typeface.SANS_SERIF;
        A0s.A0J(typeface, 1);
        A0s.A0F(-1);
        A0s.A0D(10.0f, 0.0f, 0.0f, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0s.A0K(alignment);
        A0s.A0O = true;
        A0s.A0M(str2);
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context2, i6);
        this.A0J = A0s2;
        AnonymousClass7TG.A0x(context2, A0s2, 24);
        A0s2.A0B(0nA.A03(context2, 2.0f), 1.0f);
        A0s2.A0J(typeface, 1);
        A0s2.A0F(-1);
        A0s2.A0D(10.0f, 0.0f, 0.0f, argb);
        A0s2.A0K(alignment);
        A0s2.A0G(3, "…");
        A0s2.A0O = true;
        String str4 = str;
        if (str != null) {
            A0s2.A0M(str4);
        }
        C306386Ly A0s3 = AnonymousClass7TE.A0s(context2, i6);
        this.A0I = A0s3;
        AnonymousClass7TG.A0x(context2, A0s3, 12);
        A0s3.A0J(typeface, 1);
        A0s3.A0F(-1);
        A0s3.A0D(10.0f, 0.0f, 0.0f, argb);
        A0s3.A0K(alignment);
        A0s3.A0O = true;
        A0s3.A0M(str3);
        1OO A0J2 = 1NK.A00().A0J(imageUrl2, (String) null);
        A0J2.A08 = "profile_pic";
        A0J2.A02(this);
        A0J2.A01();
        1NK A002 = 1NK.A00();
        ImageUrl imageUrl3 = imageUrl;
        if (imageUrl != null) {
            1OO A0J3 = A002.A0J(imageUrl3, (String) null);
            A0J3.A08 = "media";
            A0J3.A02(this);
            A0J3.A01();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void AHg() {
        this.A0L.clear();
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final boolean isLoading() {
        if (this.A00 == null || this.A01 == null) {
            return true;
        }
        return false;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0H;
        0qQ.A0A(drawable);
        int i5 = this.A0A;
        drawable.setBounds(i - i5, i2 - i5, i3 + i5, i4 + i5);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
