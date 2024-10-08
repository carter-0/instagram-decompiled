package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.8vD  reason: invalid class name and case insensitive filesystem */
public final class C369718vD extends Drawable implements C300645xY, C300655xZ {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public String A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Resources A0D;
    public final Bitmap A0E;
    public final Bitmap A0F;
    public final Canvas A0G;
    public final Paint A0H;
    public final Rect A0I = new Rect();
    public final RectF A0J = new RectF();
    public final String A0K;
    public final Map A0L;
    public final int A0M;
    public final Context A0N;
    public final Typeface A0O;
    public final UserSession A0P;
    public final String[] A0Q;

    public final void AGn(C21236XQh xQh, int i) {
        0qQ.A0B(xQh, 0);
        this.A02 = xQh.A00(i);
        invalidateSelf();
    }

    public final Drawable AKn(String str) {
        0qQ.A0B(str, 0);
        return new C369718vD(this.A0N, this.A0P, str, this.A0M);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = this.A0H;
        paint.setColor(this.A02);
        RectF rectF = this.A0J;
        rectF.set((float) getBounds().centerX(), (float) getBounds().centerY(), (float) getBounds().centerX(), (float) getBounds().centerY());
        rectF.inset((float) ((-this.A07) / 2), (float) ((-this.A03) / 2));
        float f = (float) this.A0C;
        canvas.drawRoundRect(rectF, f, f, paint);
        Map map = this.A0L;
        String str = this.A0K;
        Object obj = map.get(str);
        AnonymousClass6MW r9 = AnonymousClass6MW.A0B;
        int i = -16777216;
        if (obj == r9) {
            i = -1;
        }
        paint.setColor(i);
        String str2 = this.A08;
        int i2 = getBounds().left;
        Bitmap bitmap = this.A0E;
        int i3 = this.A05;
        canvas.drawText(str2, (float) (i2 + bitmap.getWidth() + i3 + this.A0B), (float) (getBounds().centerY() + (this.A06 / 2)), paint);
        Bitmap bitmap2 = this.A0F;
        bitmap2.eraseColor(0);
        Canvas canvas2 = this.A0G;
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        canvas2.save();
        float f2 = rectF.left + ((float) i3);
        if (map.get(str) == r9) {
            paint.setColor(-1);
        } else {
            paint.setColor(-16711936);
        }
        canvas2.translate(-f2, 0.0f);
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode((Xfermode) null);
        canvas.drawBitmap(bitmap2, f2, (float) (getBounds().centerY() - (bitmap.getHeight() / 2)), (Paint) null);
        paint.setShader((Shader) null);
    }

    public final int getOpacity() {
        return -2;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01af, code lost:
        r9.A02 = r19.getColor(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0099, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01c6, code lost:
        if (r0 == false) goto L_0x01ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369718vD(android.content.Context r21, com.instagram.common.session.UserSession r22, java.lang.String r23, int r24) {
        /*
            r20 = this;
            r2 = r24
            r10 = 1
            r19 = r21
            r0 = r19
            X.0qQ.A0B(r0, r10)
            r0 = 4
            r1 = r22
            X.0qQ.A0B(r1, r0)
            r9 = r20
            r9.<init>()
            r0 = r19
            r9.A0N = r0
            r9.A0P = r1
            android.content.res.Resources r11 = r19.getResources()
            X.0qQ.A07(r11)
            r9.A0D = r11
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r10)
            r9.A0H = r4
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.A0J = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A0I = r0
            r14 = 2
            r8 = 0
            java.lang.String r0 = "vibrant_whatsapp_sticker_id"
            java.lang.String r7 = "subtle_whatsapp_sticker_id"
            java.lang.String[] r3 = new java.lang.String[]{r0, r7}
            r9.A0Q = r3
            X.6MW r1 = X.AnonymousClass6MW.A06
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r1)
            X.6MW r12 = X.AnonymousClass6MW.A0B
            X.0eP r6 = new X.0eP
            r6.<init>(r7, r12)
            java.lang.String r0 = "vibrant_chats_on_whatsapp_sticker_id"
            X.0eP r5 = new X.0eP
            r5.<init>(r0, r1)
            java.lang.String r18 = "subtle_chats_on_whatsapp_sticker_id"
            X.0eP r1 = new X.0eP
            r0 = r18
            r1.<init>(r0, r12)
            X.0eP[] r0 = new X.0eP[]{r13, r6, r5, r1}
            java.util.LinkedHashMap r5 = X.0Yt.A07(r0)
            r9.A0L = r5
            r0 = -1
            r9.A07 = r0
            r9.A03 = r0
            r12 = r23
            r9.A0K = r12
            r0 = 2131165540(0x7f070164, float:1.79453E38)
            int r0 = r11.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r9.A01 = r0
            r4.setTextSize(r0)
            r0 = 2131165264(0x7f070050, float:1.794474E38)
            int r0 = r11.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r9.A00 = r0
            X.0qq r1 = X.AnonymousClass0qo.A00(r19)
            java.lang.Object r0 = r5.get(r12)
            X.6MW r0 = (X.AnonymousClass6MW) r0
            if (r0 == 0) goto L_0x009d
            X.0qm r0 = r0.A01
            if (r0 != 0) goto L_0x009f
        L_0x009d:
            X.0qm r0 = X.0qm.A0Y
        L_0x009f:
            android.graphics.Typeface r0 = r1.A02(r0)
            r9.A0O = r0
            r4.setTypeface(r0)
            boolean r1 = X.03t.A0O(r12, r3)
            r0 = 2131955088(0x7f130d90, float:1.9546694E38)
            if (r1 == 0) goto L_0x00b4
            r0 = 2131976872(0x7f1362a8, float:1.9590877E38)
        L_0x00b4:
            java.lang.String r0 = r11.getString(r0)
            r9.A08 = r0
            r9.A0M = r2
            r0 = 2131165288(0x7f070068, float:1.7944789E38)
            int r0 = r11.getDimensionPixelSize(r0)
            int r2 = r24 - r0
            r9.A09 = r2
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r2 = r11.getDimensionPixelSize(r0)
            r9.A0A = r2
            int r1 = r2 / 2
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r11.getDimensionPixelSize(r0)
            int r1 = r1 + r0
            r9.A05 = r1
            int r2 = r2 / r14
            r9.A0B = r2
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r11.getDimensionPixelSize(r0)
            r9.A0C = r0
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r0 = r11.getDimensionPixelSize(r0)
            r9.A04 = r0
            android.graphics.Paint r13 = r9.A0H
            float r0 = r9.A00
            r13.setTextSize(r0)
            int r6 = r9.A05
            int r5 = r9.A0A
            int r6 = r6 + r5
            int r0 = r9.A0B
            int r6 = r6 + r0
            float r0 = r9.A01
            r13.setTextSize(r0)
            java.lang.String r1 = r9.A08
            java.util.regex.Pattern r0 = X.0mp.A00
            if (r1 == 0) goto L_0x0219
            int r0 = r1.length()
        L_0x010f:
            android.graphics.Rect r4 = r9.A0I
            r13.getTextBounds(r1, r8, r0, r4)
            int r1 = r4.width()
            int r0 = r9.A04
            int r1 = r1 + r0
            int r1 = r1 + r6
            int r3 = r9.A09
            if (r1 <= r3) goto L_0x0151
            float r15 = r9.A01
            r2 = 1063675494(0x3f666666, float:0.9)
            float r14 = r15 * r2
            float r1 = (float) r0
            float r1 = r1 * r2
            float r0 = r9.A00
            float r0 = r0 * r2
        L_0x012c:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r2
            r2 = 0
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 < 0) goto L_0x01eb
            r13.setTextSize(r14)
            java.lang.String r15 = r9.A08
            if (r15 == 0) goto L_0x013f
            int r2 = r15.length()
        L_0x013f:
            r13.getTextBounds(r15, r8, r2, r4)
            int r15 = r4.width()
            int r2 = (int) r1
            int r15 = r15 + r2
            int r15 = r15 + r6
            if (r15 > r3) goto L_0x01c9
            r9.A01 = r14
            r9.A04 = r2
        L_0x014f:
            r9.A00 = r0
        L_0x0151:
            int r1 = r4.width()
            int r0 = r9.A04
            int r1 = r1 + r0
            int r1 = r1 + r6
            int r0 = java.lang.Math.min(r3, r1)
            r9.A07 = r0
            int r0 = r4.top
            int r1 = java.lang.Math.abs(r0)
            android.graphics.Paint$FontMetrics r0 = r13.getFontMetrics()
            float r0 = r0.ascent
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r1, r0)
            r9.A06 = r0
            int r1 = r4.height()
            int r0 = r5 * 2
            int r1 = r1 + r0
            r9.A03 = r1
            r0 = 2131237902(0x7f081c0e, float:1.8092068E38)
            android.graphics.Bitmap r1 = X.AnonymousClass6MX.A00(r11, r0)
            int r0 = r9.A04
            android.graphics.Bitmap r0 = X.0fO.A00(r1, r0, r0, r10)
            r9.A0E = r0
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r9.A0F = r1
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r9.A0G = r0
            int r0 = r12.hashCode()
            switch(r0) {
                case -1033971008: goto L_0x01bd;
                case -490213480: goto L_0x01b8;
                default: goto L_0x01ac;
            }
        L_0x01ac:
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
        L_0x01af:
            r0 = r19
            int r0 = r0.getColor(r1)
            r9.A02 = r0
            return
        L_0x01b8:
            boolean r0 = r12.equals(r7)
            goto L_0x01c3
        L_0x01bd:
            r0 = r18
            boolean r0 = r12.equals(r0)
        L_0x01c3:
            r1 = 2131100790(0x7f060476, float:1.7813971E38)
            if (r0 != 0) goto L_0x01af
            goto L_0x01ac
        L_0x01c9:
            int r15 = r4.width()
            int r2 = r9.A04
            int r15 = r15 + r2
            int r15 = r15 + r6
            if (r15 > r3) goto L_0x01d7
            r9.A01 = r14
            goto L_0x014f
        L_0x01d7:
            float r15 = r9.A01
            r17 = 1036831949(0x3dcccccd, float:0.1)
            float r16 = r15 * r17
            float r14 = r14 - r16
            float r2 = (float) r2
            float r2 = r2 * r17
            float r1 = r1 - r2
            float r2 = r9.A00
            float r2 = r2 * r17
            float r0 = r0 - r2
            goto L_0x012c
        L_0x01eb:
            android.text.TextPaint r15 = new android.text.TextPaint
            r15.<init>(r13)
            android.content.res.Resources r0 = r9.A0D
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r15.density = r0
            java.lang.String r14 = r9.A08
            int r1 = r3 - r6
            int r0 = r9.A04
            int r1 = r1 - r0
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r14, r15, r1, r0)
            java.lang.String r0 = r0.toString()
            r9.A08 = r0
            if (r0 == 0) goto L_0x0214
            int r2 = r0.length()
        L_0x0214:
            r13.getTextBounds(r0, r8, r2, r4)
            goto L_0x0151
        L_0x0219:
            r0 = 0
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369718vD.<init>(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, int):void");
    }

    public final String C4F() {
        return this.A0K;
    }

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }
}
