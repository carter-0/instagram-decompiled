package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.9Wp  reason: invalid class name and case insensitive filesystem */
public final class C380089Wp extends Drawable implements Drawable.Callback, AnonymousClass1MK {
    public static final CharSequence A0O = "…";
    public boolean A00;
    public int A01;
    public C59985Jcu A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Resources A0B;
    public final Paint A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final Paint A0J = AnonymousClass7TE.A0V(1);
    public final Path A0K;
    public final RectF A0L = AnonymousClass7TE.A0Y();
    public final RectF A0M;
    public final boolean A0N;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C380089Wp(android.content.Context r10, com.instagram.music.common.model.MusicAssetModel r11, int r12, int r13, boolean r14, boolean r15, boolean r16) {
        /*
            r9 = this;
            r8 = 1
            r7 = 2
            r9.<init>()
            r9.A0A = r10
            r9.A00 = r14
            r9.A0N = r15
            android.content.res.Resources r3 = r10.getResources()
            r9.A0B = r3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r0.setColor(r13)
            r9.A0C = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r9.A0L = r0
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r8)
            r9.A0J = r0
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r1 = r3.getDimensionPixelSize(r0)
            r9.A05 = r1
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r5 = r3.getDimensionPixelSize(r0)
            r9.A04 = r5
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r9.A0G = r0
            int r2 = X.AnonymousClass7TE.A0C(r3)
            r9.A03 = r2
            int r4 = X.AnonymousClass7TE.A0F(r3)
            r9.A0H = r4
            int r0 = X.AnonymousClass7TE.A0H(r3)
            r9.A0I = r0
            int r2 = r2 + r5
            int r2 = r2 + r4
            int r2 = r2 + r4
            int r12 = r12 - r2
            r9.A08 = r12
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
            int r0 = r10.getColor(r0)
            r9.A07 = r0
            r5 = 6
            X.MMd r0 = new X.MMd
            r0.<init>(r9, r5)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r9.A0E = r0
            r4 = 26
            X.GL8 r0 = new X.GL8
            r0.<init>(r13, r4, r9, r11)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r9.A0F = r0
            r4 = 25
            X.GL8 r0 = new X.GL8
            r0.<init>(r13, r4, r9, r11)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r9.A0D = r0
            r0 = -1
            r9.A01 = r0
            com.instagram.common.typedurl.ImageUrl r6 = r11.A03
            boolean r0 = X.C253833rU.A02(r6)
            if (r0 != 0) goto L_0x0103
            X.1NK r4 = X.1NK.A00()
            if (r16 == 0) goto L_0x00f7
            android.graphics.Bitmap r0 = r4.A0G(r6)
            if (r0 == 0) goto L_0x0103
            r9.A01(r0)
        L_0x00a3:
            X.0eM r0 = r9.A0F
            java.lang.Object r0 = r0.getValue()
            X.6Ly r0 = (X.C306386Ly) r0
            int r4 = r0.A0A
            X.0eM r0 = r9.A0D
            java.lang.Object r0 = r0.getValue()
            X.6Ly r0 = (X.C306386Ly) r0
            int r0 = r0.A0A
            if (r4 >= r0) goto L_0x00ba
            r4 = r0
        L_0x00ba:
            int r2 = r2 + r4
            r9.A09 = r2
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r9.A06 = r0
            float r2 = (float) r2
            float r0 = (float) r0
            r6 = 0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r6, r6, r2, r0)
            r9.A0M = r4
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r0 = 8
            float[] r2 = new float[r0]
            r0 = 0
            float r1 = (float) r1
            r2[r0] = r1
            r2[r8] = r1
            r2[r7] = r1
            r0 = 3
            r2[r0] = r1
            r0 = 4
            r2[r0] = r6
            r0 = 5
            r2[r0] = r6
            r2[r5] = r6
            r0 = 7
            r2[r0] = r6
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r3.addRoundRect(r4, r2, r0)
            r9.A0K = r3
            return
        L_0x00f7:
            r0 = 0
            X.1OO r0 = r4.A0J(r6, r0)
            r0.A02(r9)
            r0.A01()
            goto L_0x00a3
        L_0x0103:
            r9.A00()
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380089Wp.<init>(android.content.Context, com.instagram.music.common.model.MusicAssetModel, int, int, boolean, boolean, boolean):void");
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        A01(r3.A01);
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    private final void A00() {
        Bitmap bitmap;
        Context context = this.A0A;
        this.A01 = AnonymousClass7TE.A08(context);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) context.getDrawable(R.drawable.default_album_art_icon);
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        } else {
            bitmap = null;
        }
        A01(bitmap);
    }

    private final void A01(Bitmap bitmap) {
        int i;
        Integer num;
        if (bitmap != null) {
            boolean z = this.A0N;
            if (z) {
                C14123TqI A002 = new C14120TqF(bitmap).A00();
                int A082 = AnonymousClass7TE.A08(this.A0A);
                int A003 = A002.A00(A082);
                if (A003 == A082) {
                    C14122TqH tqH = A002.A01;
                    if (tqH != null) {
                        A082 = tqH.A05;
                    }
                    A003 = A082;
                }
                this.A01 = A003;
                i = this.A0G;
            } else {
                i = this.A04;
            }
            int i2 = i;
            if (!z) {
                i = this.A05;
            }
            float f = (float) i;
            if (z) {
                num = Integer.valueOf(this.A04 - this.A0G);
            } else {
                num = null;
            }
            C59985Jcu A004 = A13.A00(bitmap, num, f, i2, i2);
            A004.setCallback(this);
            this.A02 = A004;
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A09;
    }

    public final void setAlpha(int i) {
        Drawable mutate;
        this.A0C.setAlpha(i);
        C59985Jcu jcu = this.A02;
        if (!(jcu == null || (mutate = jcu.mutate()) == null)) {
            mutate.setAlpha(i);
        }
        AnonymousClass7TG.A14((Drawable) this.A0F.getValue(), i);
        AnonymousClass7TG.A14((Drawable) this.A0D.getValue(), i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable mutate;
        this.A0C.setColorFilter(colorFilter);
        C59985Jcu jcu = this.A02;
        if (!(jcu == null || (mutate = jcu.mutate()) == null)) {
            mutate.setColorFilter(colorFilter);
        }
        AnonymousClass7TG.A10(colorFilter, (Drawable) this.A0F.getValue());
        AnonymousClass7TG.A10(colorFilter, (Drawable) this.A0D.getValue());
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        AnonymousClass7TF.A13(canvas, AnonymousClass7TE.A0X(this));
        RectF rectF = this.A0M;
        float f = (float) this.A05;
        canvas.drawRoundRect(rectF, f, f, this.A0C);
        C59985Jcu jcu = this.A02;
        if (jcu != null) {
            canvas.save();
            float f2 = (float) this.A03;
            canvas.translate(f2, f2);
            int i = this.A01;
            if (i != -1) {
                Paint paint = this.A0J;
                paint.setColor(i);
                if (this.A0N) {
                    paint.setColorFilter(new PorterDuffColorFilter(AnonymousClass7TE.A08(this.A0A), PorterDuff.Mode.DARKEN));
                }
                RectF rectF2 = this.A0L;
                float f3 = (float) this.A04;
                rectF2.set(0.0f, 0.0f, f3, f3);
                canvas.drawRoundRect(rectF2, f, f, paint);
            }
            jcu.draw(canvas);
            if (this.A00) {
                ((Drawable) this.A0E.getValue()).draw(canvas);
            }
            canvas.restore();
        }
        canvas.save();
        float f4 = (float) (this.A03 + this.A04 + this.A0H);
        int i2 = this.A06;
        AnonymousClass0eM r4 = this.A0F;
        int i3 = ((C306386Ly) r4.getValue()).A06;
        int i4 = this.A0I;
        AnonymousClass0eM r2 = this.A0D;
        canvas.translate(f4, ((float) (i2 - ((i3 + i4) + ((C306386Ly) r2.getValue()).A06))) / 2.0f);
        ((Drawable) r4.getValue()).draw(canvas);
        canvas.translate(0.0f, (float) (((C306386Ly) r4.getValue()).A06 + i4));
        ((Drawable) r2.getValue()).draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.A00) {
            invalidateSelf();
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
        A00();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
