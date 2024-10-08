package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9py  reason: invalid class name and case insensitive filesystem */
public final class C389649py extends C299875vz implements C268714ds, C300645xY, C300655xZ, C3724991d {
    public int A00;
    public int A01;
    public int A02;
    public LinearGradient A03;
    public LinearGradient A04;
    public String A05;
    public int[] A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Bitmap A0A;
    public final Bitmap A0B;
    public final Canvas A0C;
    public final Paint A0D;
    public final RectF A0E = AnonymousClass7TE.A0Y();
    public final C387309m0 A0F;
    public final AnonymousClass6M4 A0G;
    public final String A0H;
    public final String[] A0I;
    public final int A0J;
    public final Context A0K;
    public final Resources A0L;
    public final Rect A0M;
    public final UserSession A0N;
    public final boolean A0O;

    public final void AGn(C21236XQh xQh, int i) {
        0qQ.A0B(xQh, 0);
        int A012 = xQh.A01(i);
        this.A06 = new int[]{A012, A012};
        int A042 = AnonymousClass7TF.A04(this);
        int i2 = this.A02 / 2;
        this.A03 = new LinearGradient((float) (A042 - i2), 0.0f, (float) (AnonymousClass7TF.A04(this) + i2), 0.0f, this.A06, (float[]) null, Shader.TileMode.REPEAT);
        invalidateSelf();
        this.A00 = xQh.A00(i);
        invalidateSelf();
    }

    public final Drawable AKn(String str) {
        0qQ.A0B(str, 0);
        C387309m0 r3 = this.A0F;
        Context context = this.A0K;
        int i = this.A0J;
        return new C389649py(context, this.A0N, r3, str, i, this.A0O);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = this.A0D;
        paint.setColor(this.A00);
        RectF rectF = this.A0E;
        rectF.set((float) AnonymousClass7TF.A04(this), (float) AnonymousClass7TF.A05(this), (float) AnonymousClass7TF.A04(this), (float) AnonymousClass7TF.A05(this));
        rectF.inset((float) ((-this.A02) / 2), (float) ((-this.A01) / 2));
        float f = (float) this.A09;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(-1);
        paint.setShader(this.A03);
        String str = this.A05;
        int A0J2 = AnonymousClass7TE.A0J(this);
        Bitmap bitmap = this.A0A;
        int i = this.A08;
        canvas.drawText(str, (float) (A0J2 + bitmap.getWidth() + i + this.A07), ((float) AnonymousClass7TF.A05(this)) - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        Bitmap bitmap2 = this.A0B;
        bitmap2.eraseColor(0);
        Canvas canvas2 = this.A0C;
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        canvas2.save();
        float f2 = rectF.left + ((float) i);
        if (03t.A0O(this.A0H, this.A0I)) {
            paint.setColor(-1);
            paint.setShader(this.A04);
        } else {
            canvas2.translate(-f2, 0.0f);
        }
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode((Xfermode) null);
        canvas.drawBitmap(bitmap2, f2, (float) (AnonymousClass7TF.A05(this) - (bitmap.getHeight() / 2)), paint);
        paint.setShader((Shader) null);
        if (this.A0O) {
            this.A0G.draw(canvas);
        }
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        int A042 = AnonymousClass7TF.A04(this);
        int i = this.A02 / 2;
        this.A03 = new LinearGradient((float) (A042 - i), 0.0f, (float) (AnonymousClass7TF.A04(this) + i), 0.0f, this.A06, (float[]) null, Shader.TileMode.REPEAT);
    }

    public final void setAlpha(int i) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b4, code lost:
        r9 = X.C346897vw.A01(r18);
        r8 = com.instagram.android.R.dimen.mk_title_font_size;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00bb, code lost:
        if (r9 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00bd, code lost:
        r8 = com.instagram.android.R.dimen.avatar_search_sticker_tray_text_size;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c0, code lost:
        r11 = X.AnonymousClass7TE.A01(r1, r8);
        r0.setTextSize(r11);
        r9 = X.C346897vw.A01(r18);
        r8 = X.AnonymousClass0qo.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00cf, code lost:
        if (r9 == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d1, code lost:
        r3 = X.0qm.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d3, code lost:
        r0.setTypeface(r8.A02(r3));
        r3 = 2131968686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e1, code lost:
        if (X.C346897vw.A01(r18) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e3, code lost:
        r3 = 2131968681;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e6, code lost:
        r4.A05 = r1.getString(r3);
        r4.A0J = r2;
        r2 = r24 - X.AnonymousClass7TE.A0E(r1);
        r13 = X.AnonymousClass7TE.A0G(r1);
        r12 = r13 / 2;
        r4.A07 = r12;
        r8 = X.C346897vw.A01(r18);
        r3 = com.instagram.android.R.dimen.audience_lists_text_in_badge_horizontal_margin_right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0103, code lost:
        if (r8 == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0105, code lost:
        r3 = com.instagram.android.R.dimen.abc_button_inset_vertical_material;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0108, code lost:
        r9 = r12 + r1.getDimensionPixelSize(r3);
        r4.A08 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0114, code lost:
        if (X.C346897vw.A01(r18) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0116, code lost:
        r10 = r1.getDimensionPixelSize(com.instagram.android.R.dimen.abc_action_bar_elevation_material);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011d, code lost:
        r8 = X.C346897vw.A01(r18);
        r3 = com.instagram.android.R.dimen.abc_button_inset_vertical_material;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0124, code lost:
        if (r8 == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0126, code lost:
        r3 = com.instagram.android.R.dimen.account_discovery_bottom_gap;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0129, code lost:
        r4.A09 = r1.getDimensionPixelSize(r3);
        r9 = ((r9 + r13) + r6.getWidth()) + r12;
        r0.setTextSize(r11);
        r3 = r4.A05;
        r1 = X.0mp.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x013d, code lost:
        if (r3 == null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x013f, code lost:
        r1 = r3.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0143, code lost:
        r0.getTextBounds(r3, 0, r1, r5);
        r4.A02 = java.lang.Math.min(r2, r5.width() + r9);
        r4.A01 = (r5.height() + (r13 * 2)) - (r10 * 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x015e, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0160, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0162, code lost:
        r3 = X.0qm.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0196, code lost:
        r4.A06 = r8;
        r11 = 0.0f;
        r9 = (float) r6.getWidth();
        r8 = (float) r6.getHeight();
        r15 = X.ABP.A01(r3);
        r16 = X.ABP.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b5, code lost:
        if (r11.equals(r8) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b7, code lost:
        r4.A00 = X.AnonymousClass6MW.A0A.A00;
        r15 = X.AnonymousClass5BH.A01;
        r4.A06 = r15;
        r10 = new android.graphics.LinearGradient(0.0f, 0.0f, (float) r6.getWidth(), (float) r6.getHeight(), r15, (float[]) null, android.graphics.Shader.TileMode.REPEAT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ec, code lost:
        r4.A00 = r9.A00;
        r8 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0206, code lost:
        r4.A06 = r8;
        r11 = 0.0f;
        r9 = (float) r6.getWidth();
        r8 = (float) r6.getHeight();
        r15 = new int[]{r10, r10};
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0219, code lost:
        r10 = new android.graphics.LinearGradient(r11, r11, r9, r8, r15, r16, android.graphics.Shader.TileMode.REPEAT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0223, code lost:
        r4.A04 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b2, code lost:
        r4.A06 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C389649py(android.content.Context r20, com.instagram.common.session.UserSession r21, X.C387309m0 r22, java.lang.String r23, int r24, boolean r25) {
        /*
            r19 = this;
            r2 = r24
            r8 = 1
            r1 = r22
            X.0qQ.A0B(r1, r8)
            r9 = 2
            r3 = r20
            r18 = r21
            r0 = r18
            X.AnonymousClass7TF.A1D(r3, r9, r0)
            r4 = r19
            r4.<init>()
            r4.A0F = r1
            r4.A0K = r3
            r4.A0N = r0
            r0 = r25
            r4.A0O = r0
            r0 = r23
            r4.A0H = r0
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r3)
            r4.A0L = r1
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r8)
            r4.A0D = r0
            android.graphics.RectF r5 = X.AnonymousClass7TE.A0Y()
            r4.A0E = r5
            android.graphics.Rect r5 = X.AnonymousClass7TE.A0W()
            r4.A0M = r5
            r7 = 0
            java.lang.String r14 = "notify_me_sticker_hero"
            java.lang.String r13 = "notify_me_sticker_redesign_hero"
            java.lang.String r12 = "notify_me_sticker_redesign_default"
            java.lang.String[] r6 = new java.lang.String[]{r14, r13, r12}
            r4.A0I = r6
            r6 = 2130970224(0x7f040670, float:1.7549152E38)
            int r10 = X.AnonymousClass7TF.A03(r3, r6)
            int[] r6 = new int[]{r10, r10}
            r4.A06 = r6
            r6 = -1
            r4.A02 = r6
            r4.A01 = r6
            X.6M4 r6 = X.AnonymousClass7TH.A0A(r3, r4)
            r4.A0G = r6
            boolean r11 = X.C346897vw.A01(r18)
            r6 = 2131237868(0x7f081bec, float:1.8091999E38)
            if (r11 == 0) goto L_0x006e
            r6 = 2131237869(0x7f081bed, float:1.8092E38)
        L_0x006e:
            android.graphics.Bitmap r11 = X.AnonymousClass6MX.A00(r1, r6)
            boolean r15 = X.C346897vw.A01(r18)
            r6 = 2131165203(0x7f070013, float:1.7944616E38)
            if (r15 == 0) goto L_0x007e
            r6 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x007e:
            int r6 = r1.getDimensionPixelSize(r6)
            android.graphics.Bitmap r6 = X.0fO.A00(r11, r6, r6, r8)
            r4.A0A = r6
            int r15 = r6.getWidth()
            int r11 = r6.getHeight()
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r15, r11, r8)
            r4.A0B = r11
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r11)
            r4.A0C = r8
            java.lang.String r11 = r4.A0H
            int r8 = r11.hashCode()
            switch(r8) {
                case -1742546155: goto L_0x0188;
                case -690986813: goto L_0x01af;
                case -668172176: goto L_0x01e2;
                case 604187661: goto L_0x0176;
                case 717279177: goto L_0x01f4;
                case 779619080: goto L_0x01d7;
                case 1132985856: goto L_0x0227;
                case 1239545019: goto L_0x01ac;
                case 1810772294: goto L_0x0166;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            int r8 = X.AnonymousClass7TE.A0A(r3)
            r4.A00 = r8
            int[] r8 = new int[]{r10, r10}
        L_0x00b2:
            r4.A06 = r8
        L_0x00b4:
            boolean r9 = X.C346897vw.A01(r18)
            r8 = 2131165639(0x7f0701c7, float:1.79455E38)
            if (r9 == 0) goto L_0x00c0
            r8 = 2131165317(0x7f070085, float:1.7944848E38)
        L_0x00c0:
            float r11 = X.AnonymousClass7TE.A01(r1, r8)
            r0.setTextSize(r11)
            boolean r9 = X.C346897vw.A01(r18)
            X.0qq r8 = X.AnonymousClass0qo.A00(r3)
            if (r9 == 0) goto L_0x0162
            X.0qm r3 = X.0qm.A0Y
        L_0x00d3:
            android.graphics.Typeface r3 = r8.A02(r3)
            r0.setTypeface(r3)
            boolean r8 = X.C346897vw.A01(r18)
            r3 = 2131968686(0x7f1342ae, float:1.9574274E38)
            if (r8 == 0) goto L_0x00e6
            r3 = 2131968681(0x7f1342a9, float:1.9574263E38)
        L_0x00e6:
            java.lang.String r3 = r1.getString(r3)
            r4.A05 = r3
            r4.A0J = r2
            int r3 = X.AnonymousClass7TE.A0E(r1)
            int r2 = r24 - r3
            int r13 = X.AnonymousClass7TE.A0G(r1)
            int r12 = r13 / 2
            r4.A07 = r12
            boolean r8 = X.C346897vw.A01(r18)
            r3 = 2131165293(0x7f07006d, float:1.79448E38)
            if (r8 == 0) goto L_0x0108
            r3 = 2131165195(0x7f07000b, float:1.79446E38)
        L_0x0108:
            int r3 = r1.getDimensionPixelSize(r3)
            int r9 = r12 + r3
            r4.A08 = r9
            boolean r3 = X.C346897vw.A01(r18)
            if (r3 == 0) goto L_0x0160
            r3 = 2131165190(0x7f070006, float:1.794459E38)
            int r10 = r1.getDimensionPixelSize(r3)
        L_0x011d:
            boolean r8 = X.C346897vw.A01(r18)
            r3 = 2131165195(0x7f07000b, float:1.79446E38)
            if (r8 == 0) goto L_0x0129
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x0129:
            int r1 = r1.getDimensionPixelSize(r3)
            r4.A09 = r1
            int r9 = r9 + r13
            int r1 = r6.getWidth()
            int r9 = r9 + r1
            int r9 = r9 + r12
            r0.setTextSize(r11)
            java.lang.String r3 = r4.A05
            java.util.regex.Pattern r1 = X.0mp.A00
            if (r3 == 0) goto L_0x015e
            int r1 = r3.length()
        L_0x0143:
            r0.getTextBounds(r3, r7, r1, r5)
            int r0 = r5.width()
            int r0 = r0 + r9
            int r0 = java.lang.Math.min(r2, r0)
            r4.A02 = r0
            int r1 = r5.height()
            int r0 = r13 * 2
            int r1 = r1 + r0
            int r0 = r10 * 2
            int r1 = r1 - r0
            r4.A01 = r1
            return
        L_0x015e:
            r1 = 0
            goto L_0x0143
        L_0x0160:
            r10 = 0
            goto L_0x011d
        L_0x0162:
            X.0qm r3 = X.0qm.A0V
            goto L_0x00d3
        L_0x0166:
            boolean r8 = r11.equals(r12)
            if (r8 == 0) goto L_0x00a8
            X.6MW r9 = X.AnonymousClass6MW.A06
            int r8 = r9.A00
            r4.A00 = r8
            int[] r8 = r9.A03
            goto L_0x0206
        L_0x0176:
            boolean r8 = r11.equals(r14)
            if (r8 == 0) goto L_0x00a8
            int r8 = X.AnonymousClass7TE.A0A(r3)
            r4.A00 = r8
            int[] r8 = new int[r9]
            r8 = {-16777216, -16777216} // fill-array
            goto L_0x0196
        L_0x0188:
            boolean r8 = r11.equals(r13)
            if (r8 == 0) goto L_0x00a8
            X.6MW r9 = X.AnonymousClass6MW.A07
            int r8 = r9.A00
            r4.A00 = r8
            int[] r8 = r9.A03
        L_0x0196:
            r4.A06 = r8
            r11 = 0
            int r8 = r6.getWidth()
            float r9 = (float) r8
            int r8 = r6.getHeight()
            float r8 = (float) r8
            int[] r15 = X.ABP.A01(r3)
            float[] r16 = X.ABP.A00()
            goto L_0x0219
        L_0x01ac:
            java.lang.String r8 = "notify_me_sticker_redesign_rainbow"
            goto L_0x01b1
        L_0x01af:
            java.lang.String r8 = "notify_me_sticker_rainbow"
        L_0x01b1:
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x00a8
            X.6MW r8 = X.AnonymousClass6MW.A0A
            int r8 = r8.A00
            r4.A00 = r8
            int[] r15 = X.AnonymousClass5BH.A01
            r4.A06 = r15
            r11 = 0
            int r8 = r6.getWidth()
            float r13 = (float) r8
            int r8 = r6.getHeight()
            float r14 = (float) r8
            r16 = 0
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r12 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0223
        L_0x01d7:
            java.lang.String r8 = "notify_me_sticker_redesign_subtle"
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x00a8
            X.6MW r9 = X.AnonymousClass6MW.A0B
            goto L_0x01ec
        L_0x01e2:
            java.lang.String r8 = "notify_me_sticker_redesign_monotone"
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x00a8
            X.6MW r9 = X.AnonymousClass6MW.A09
        L_0x01ec:
            int r8 = r9.A00
            r4.A00 = r8
            int[] r8 = r9.A03
            goto L_0x00b2
        L_0x01f4:
            java.lang.String r8 = "notify_me_sticker_redesign_vibrant"
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x00a8
            X.6MW r8 = X.AnonymousClass6MW.A0C
            int r8 = r8.A00
            r4.A00 = r8
            int[] r8 = new int[]{r10, r10}
        L_0x0206:
            r4.A06 = r8
            r11 = 0
            int r8 = r6.getWidth()
            float r9 = (float) r8
            int r8 = r6.getHeight()
            float r8 = (float) r8
            int[] r15 = new int[]{r10, r10}
            r16 = 0
        L_0x0219:
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r12 = r11
            r13 = r9
            r14 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L_0x0223:
            r4.A04 = r10
            goto L_0x00b4
        L_0x0227:
            java.lang.String r8 = "notify_me_sticker_subtle"
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x00a8
            r8 = 2131100790(0x7f060476, float:1.7813971E38)
            int r8 = r3.getColor(r8)
            r4.A00 = r8
            int[] r8 = new int[r9]
            r8 = {-1, -1} // fill-array
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389649py.<init>(android.content.Context, com.instagram.common.session.UserSession, X.9m0, java.lang.String, int, boolean):void");
    }

    public final List A07() {
        return AnonymousClass7TE.A1I(this.A0G);
    }

    public final C2802350v BzV() {
        return this.A0F;
    }

    public final String C4F() {
        return this.A0H;
    }

    public final void Dre(int i, int i2) {
        C387309m0 r1 = this.A0F;
        r1.A01 = (float) i;
        r1.A00 = (float) i2;
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }
}
