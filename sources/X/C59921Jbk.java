package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Jbk  reason: case insensitive filesystem */
public final class C59921Jbk extends Drawable implements Drawable.Callback {
    public Drawable A00;
    public boolean A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final Path A07;
    public final Drawable A08;
    public final Drawable A09;
    public final C64615Lez A0A;
    public final C64617Lf3 A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C59921Jbk(Context context, Drawable drawable, Drawable drawable2, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        AnonymousClass7TF.A1F(context, 1, drawable);
        this.A0D = str;
        this.A0F = z;
        this.A05 = i3;
        this.A04 = i4;
        this.A00 = drawable;
        this.A0C = str2;
        this.A08 = drawable2;
        this.A0E = z2;
        Paint paint = AnonymousClass3JT.A00;
        this.A09 = AnonymousClass3JT.A05(context, i2, context.getColor(R.color.canvas_bottom_sheet_description_text_color));
        this.A07 = C51965G9l.A0C();
        this.A06 = JTO.A0C();
        this.A03 = context.getResources().getDimensionPixelOffset(i);
        this.A02 = ((float) i4) / 2.0f;
        this.A0A = new C64615Lez(this, 0);
        this.A0B = new C64617Lf3(2, context, this);
        String str3 = this.A0D;
        if (str3 != null) {
            1OO A0J = 1NK.A00().A0J(DbS.A0V(str3), "STORIES_STICKERS_SEARCH");
            A0J.A02(this.A0A);
            A0J.A01();
        }
        if (str2 != null && str2.length() != 0) {
            1OO A0J2 = 1NK.A00().A0J(DbS.A0V(this.A0C), "CUSTOMIZATION_BACKGROUND");
            A0J2.A02(this.A0B);
            A0J2.A01();
        }
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A00;
        int i = this.A03;
        int i2 = i / 2;
        int i3 = this.A04;
        int i4 = i2 + i3;
        int i5 = i3 + i;
        drawable.setBounds(i2, i, i4, i5);
        this.A00.draw(canvas);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setBounds(i2, i, i4, i5);
            drawable2.draw(canvas);
            invalidateDrawable(drawable2);
        } else if (!this.A01 && this.A0F) {
            Drawable drawable3 = this.A09;
            drawable3.setBounds(i2, i, i4, i5);
            drawable3.draw(canvas);
        }
        canvas.drawPath(this.A07, this.A06);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A04 + this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A04 + this.A03;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C59921Jbk(android.content.Context r16, android.graphics.drawable.Drawable r17, android.graphics.drawable.Drawable r18, java.lang.String r19, int r20, int r21, int r22, int r23, int r24, boolean r25) {
        /*
            r15 = this;
            r6 = r18
            r5 = r17
            r11 = r22
            r12 = r23
            r13 = r25
            r10 = r21
            r8 = 0
            r3 = r24
            r0 = r24 & 8
            if (r0 == 0) goto L_0x0016
            r10 = 2131238286(0x7f081d8e, float:1.8092846E38)
        L_0x0016:
            r0 = r24 & 16
            r2 = 1
            if (r0 == 0) goto L_0x001c
            r13 = 1
        L_0x001c:
            r0 = r24 & 32
            r4 = r16
            if (r0 == 0) goto L_0x002d
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            int r11 = r1.getDimensionPixelSize(r0)
        L_0x002d:
            r0 = r24 & 64
            if (r0 == 0) goto L_0x0035
            int r12 = X.JTR.A04(r4)
        L_0x0035:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0045
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            int[] r0 = X.AnonymousClass6LW.A07
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>(r1, r0)
            r5.setShape(r2)
        L_0x0045:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004a
            r6 = r8
        L_0x004a:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            boolean r14 = X.AnonymousClass7TF.A1P(r0)
            r3 = r15
            r7 = r19
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59921Jbk.<init>(android.content.Context, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.String, int, int, int, int, int, boolean):void");
    }
}
