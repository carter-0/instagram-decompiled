package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jd5  reason: case insensitive filesystem */
public final class C59996Jd5 extends Drawable {
    public float A00;
    public float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final Paint A06 = AnonymousClass7TE.A0V(1);
    public final RectF A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final Resources A0D;
    public final Paint A0E = AnonymousClass7TE.A0V(1);
    public final Paint A0F = AnonymousClass7TE.A0V(1);
    public final RectF A0G;
    public final Drawable A0H;
    public final AnonymousClass4DH A0I;
    public final UserSession A0J;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59996Jd5(android.content.Context r27, X.AnonymousClass4DH r28, com.instagram.common.session.UserSession r29) {
        /*
            r26 = this;
            r3 = 1
            r15 = r29
            X.0qQ.A0B(r15, r3)
            r2 = 2
            r7 = r26
            r7.<init>()
            r7.A0J = r15
            r8 = r27
            r7.A05 = r8
            r6 = r28
            r7.A0I = r6
            android.content.res.Resources r4 = X.AnonymousClass7TF.A0A(r8)
            r7.A0D = r4
            r1 = 2131165352(0x7f0700a8, float:1.7944919E38)
            int r0 = r4.getDimensionPixelSize(r1)
            r7.A04 = r0
            int r0 = r4.getDimensionPixelSize(r1)
            r7.A03 = r0
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r1 = r4.getDimensionPixelSize(r0)
            r7.A02 = r1
            r0 = 2131165498(0x7f07013a, float:1.7945215E38)
            float r0 = X.AnonymousClass7TE.A01(r4, r0)
            r7.A09 = r0
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            float r0 = X.AnonymousClass7TE.A01(r4, r0)
            r7.A0A = r0
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            float r0 = X.AnonymousClass7TE.A01(r4, r0)
            r7.A0B = r0
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            float r0 = X.AnonymousClass7TE.A01(r4, r0)
            r7.A0C = r0
            android.graphics.RectF r12 = X.AnonymousClass7TE.A0Y()
            r7.A0G = r12
            android.graphics.RectF r13 = X.AnonymousClass7TE.A0Y()
            r7.A07 = r13
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r3)
            r7.A0E = r0
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r3)
            r7.A06 = r0
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r3)
            r7.A0F = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r7.A08 = r0
            r0 = 2131239507(0x7f082253, float:1.8095323E38)
            android.graphics.drawable.Drawable r11 = r8.getDrawable(r0)
            r7.A0H = r11
            int r0 = X.JTP.A03(r4)
            float r5 = (float) r0
            r14 = 1080033280(0x40600000, float:3.5)
            float r14 = r14 * r5
            float r10 = (float) r1
            float r9 = r10 + r5
            r12.set(r5, r5, r9, r9)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r4 = r10 + r0
            float r9 = r9 + r14
            r0 = 0
            r13.set(r0, r0, r4, r9)
            if (r11 == 0) goto L_0x00a9
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r12.roundOut(r0)
            r11.setBounds(r0)
        L_0x00a9:
            if (r28 == 0) goto L_0x00f0
            r0 = 1058013184(0x3f100000, float:0.5625)
            int r24 = X.JTO.A05(r10, r0)
            r13 = 0
            r18 = 0
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            X.8Qq r4 = new X.8Qq
            r21 = r15
            r23 = r1
            r25 = r18
            r19 = r4
            r20 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.Lgq r1 = new X.Lgq
            r1.<init>(r7, r5)
            X.9ji r0 = new X.9ji
            r0.<init>(r2, r4, r1, r7)
            androidx.fragment.app.FragmentActivity r11 = r6.requireActivity()
            X.0gy r12 = X.AnonymousClass07i.A00(r6)
            X.8XO r14 = X.AnonymousClass8XO.PHOTO_ONLY
            r19 = -1
            r17 = 2147483647(0x7fffffff, float:NaN)
            X.8XZ r10 = new X.8XZ
            r21 = r19
            r23 = r3
            r24 = r18
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24, r25)
            r10.A01 = r2
            r10.A01(r13)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59996Jd5.<init>(android.content.Context, X.4DH, com.instagram.common.session.UserSession):void");
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        canvas.translate(this.A00 + this.A0B, this.A01 + this.A0C);
        canvas.rotate(-8.0f);
        A00(canvas);
        Paint paint = this.A06;
        Context context = this.A05;
        AnonymousClass7TE.A1N(context, paint, R.color.design_dark_default_color_on_background);
        paint.setAlpha(255);
        RectF rectF = this.A07;
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        A01(canvas, 0);
        canvas.restore();
        canvas.save();
        canvas.translate(this.A00 + this.A09, this.A01 + this.A0A);
        canvas.rotate(12.0f);
        A00(canvas);
        AnonymousClass7TE.A1N(context, paint, R.color.design_dark_default_color_on_background);
        paint.setAlpha(255);
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        A01(canvas, 1);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        this.A00 = (((float) (i + i3)) / 2.0f) - (((float) this.A04) / 2.0f);
        this.A01 = (((float) (i2 + i4)) / 2.0f) - (((float) this.A03) / 2.0f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A00(Canvas canvas) {
        Paint paint = this.A0F;
        AnonymousClass7TE.A1N(this.A05, paint, R.color.design_dark_default_color_on_background);
        paint.setAlpha(255);
        paint.setShadowLayer(30.0f, 0.0f, 0.0f, 1493172224);
        canvas.drawRoundRect(this.A07, 0.0f, 0.0f, paint);
    }

    private final void A01(Canvas canvas, int i) {
        List list = this.A08;
        if (list.size() < 2 || i >= list.size()) {
            Paint paint = this.A0E;
            AnonymousClass7TE.A1N(this.A05, paint, R.color.black);
            paint.setAlpha(255);
            canvas.drawRoundRect(this.A0G, 0.0f, 0.0f, paint);
            return;
        }
        ((Drawable) list.get(i)).setAlpha(255);
        ((Drawable) list.get(i)).draw(canvas);
        Drawable drawable = this.A0H;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A04;
    }
}
