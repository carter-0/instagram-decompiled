package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.5xX  reason: invalid class name and case insensitive filesystem */
public final class C300635xX extends Drawable implements C268714ds, C300645xY, C300655xZ {
    public static final 0bY A0g = new 1Q7("IgSecureUriParser").A00;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public LinearGradient A09;
    public LinearGradient A0A;
    public String A0B;
    public int[] A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final Context A0J;
    public final Resources A0K;
    public final Bitmap A0L;
    public final Bitmap A0M;
    public final Canvas A0N;
    public final Paint A0O;
    public final Rect A0P = new Rect();
    public final Rect A0Q = new Rect();
    public final RectF A0R = new RectF();
    public final Typeface A0S;
    public final UserSession A0T;
    public final AnonymousClass6MT A0U;
    public final Boolean A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final String[] A0c;
    public final String[] A0d;
    public final int A0e;
    public final Map A0f;

    public final void A02(Integer num, Integer num2) {
        if (num2 != null) {
            A00(num2.intValue(), false);
        }
        if (num != null) {
            this.A02 = num.intValue();
        }
        invalidateSelf();
    }

    public final void AGn(C21236XQh xQh, int i) {
        0qQ.A0B(xQh, 0);
        A00(xQh.A01(i), true);
        this.A02 = xQh.A00(i);
        invalidateSelf();
    }

    public final Drawable AKn(String str) {
        0qQ.A0B(str, 0);
        Context context = this.A0J;
        AnonymousClass6MT r3 = this.A0U;
        int i = this.A0e;
        return new C300635xX(context, this.A0T, r3, false, (Integer) null, (Integer) null, str, (String) null, (String) null, i, false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            r4 = 0
            X.0qQ.A0B(r14, r4)
            android.graphics.Paint r3 = r13.A0O
            int r0 = r13.A02
            r3.setColor(r0)
            android.graphics.RectF r2 = r13.A0R
            android.graphics.Rect r0 = r13.getBounds()
            int r0 = r0.centerX()
            float r6 = (float) r0
            android.graphics.Rect r0 = r13.getBounds()
            int r0 = r0.centerY()
            float r5 = (float) r0
            android.graphics.Rect r0 = r13.getBounds()
            int r0 = r0.centerX()
            float r1 = (float) r0
            android.graphics.Rect r0 = r13.getBounds()
            int r0 = r0.centerY()
            float r0 = (float) r0
            r2.set(r6, r5, r1, r0)
            int r0 = r13.A08
            int r0 = -r0
            int r0 = r0 / 2
            float r1 = (float) r0
            int r0 = r13.A04
            int r0 = -r0
            int r11 = r0 / 2
            float r0 = (float) r11
            r2.inset(r1, r0)
            int r0 = r13.A0H
            float r0 = (float) r0
            r14.drawRoundRect(r2, r0, r0, r3)
            java.lang.String r5 = r13.A0W
            if (r5 == 0) goto L_0x016f
            float r0 = r13.A01
            r3.setTextSize(r0)
            android.graphics.Typeface r0 = r13.A0S
            r3.setTypeface(r0)
            r0 = -1
            r3.setColor(r0)
            android.graphics.LinearGradient r0 = r13.A09
            r3.setShader(r0)
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.left
            android.graphics.Bitmap r6 = r13.A0L
            int r0 = r6.getWidth()
            int r1 = r1 + r0
            int r0 = r13.A06
            int r1 = r1 + r0
            int r0 = r13.A0F
            int r1 = r1 + r0
            float r7 = (float) r1
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.centerY()
            int r0 = r13.A07
            int r0 = r0 / 2
            int r1 = r1 + r0
            float r1 = (float) r1
            java.lang.String r0 = r13.A0B
            r14.drawText(r0, r7, r1, r3)
            android.content.Context r9 = r13.A0J
            r0 = 2131099912(0x7f060108, float:1.781219E38)
            int r0 = r9.getColor(r0)
            r3.setColor(r0)
            r0 = 0
            r3.setShader(r0)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.content.res.Resources r1 = r13.A0K
            r0 = 2131165502(0x7f07013e, float:1.7945223E38)
            int r12 = r1.getDimensionPixelSize(r0)
            int r7 = (int) r7
            android.graphics.Rect r8 = r13.A0Q
            int r0 = r8.width()
            int r7 = r7 + r0
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r7 = r7 + r0
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.centerY()
            android.graphics.Rect r0 = r13.getBounds()
            int r0 = r0.centerY()
            r10.set(r7, r1, r7, r0)
            int r0 = -r12
            r10.inset(r0, r11)
            r14.drawRect(r10, r3)
            X.0qq r1 = X.AnonymousClass0qo.A00(r9)
            X.0qm r0 = X.0qm.A0Y
            android.graphics.Typeface r0 = r1.A02(r0)
            r3.setTypeface(r0)
            float r0 = r13.A00
            r3.setTextSize(r0)
            r0 = 2131099936(0x7f060120, float:1.781224E38)
            int r0 = r9.getColor(r0)
            r3.setColor(r0)
            int r0 = r8.top
            int r1 = java.lang.Math.abs(r0)
            android.graphics.Paint$FontMetrics r0 = r3.getFontMetrics()
            float r0 = r0.ascent
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            int r1 = java.lang.Math.min(r1, r0)
            int r0 = r13.A0E
            int r7 = r7 + r0
            float r7 = (float) r7
            android.graphics.Rect r0 = r13.getBounds()
            int r8 = r0.centerY()
        L_0x010c:
            int r0 = r1 / 2
            int r8 = r8 + r0
            float r9 = (float) r8
        L_0x0110:
            r14.drawText(r5, r7, r9, r3)
            android.graphics.Bitmap r5 = r13.A0M
            r5.eraseColor(r4)
            android.graphics.Canvas r7 = r13.A0N
            r8 = 0
            r4 = 0
            r7.drawBitmap(r6, r8, r8, r4)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            r3.setXfermode(r0)
            r7.save()
            float r2 = r2.left
            int r0 = r13.A06
            float r0 = (float) r0
            float r2 = r2 + r0
            r0 = -1
            r3.setColor(r0)
            java.lang.String[] r1 = r13.A0c
            java.lang.String r0 = r13.A0Y
            boolean r0 = X.03t.A0O(r0, r1)
            if (r0 == 0) goto L_0x0165
            android.graphics.LinearGradient r0 = r13.A0A
            r3.setShader(r0)
        L_0x0145:
            r7.drawPaint(r3)
            r7.restore()
            r3.setXfermode(r4)
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.centerY()
            int r0 = r6.getHeight()
            int r0 = r0 / 2
            int r1 = r1 - r0
            float r0 = (float) r1
            r14.drawBitmap(r5, r2, r0, r4)
            r3.setShader(r4)
            return
        L_0x0165:
            android.graphics.LinearGradient r0 = r13.A09
            r3.setShader(r0)
            float r0 = -r2
            r7.translate(r0, r8)
            goto L_0x0145
        L_0x016f:
            java.lang.String r5 = r13.A0X
            if (r5 == 0) goto L_0x01d2
            float r0 = r13.A01
            r3.setTextSize(r0)
            android.graphics.Typeface r0 = r13.A0S
            r3.setTypeface(r0)
            r0 = -1
            r3.setColor(r0)
            android.graphics.LinearGradient r0 = r13.A09
            r3.setShader(r0)
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.left
            android.graphics.Bitmap r6 = r13.A0L
            int r0 = r6.getWidth()
            int r1 = r1 + r0
            int r0 = r13.A06
            int r1 = r1 + r0
            int r0 = r13.A0F
            int r1 = r1 + r0
            float r7 = (float) r1
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.centerY()
            int r0 = r13.A07
            int r0 = r0 / 2
            int r1 = r1 + r0
            float r9 = (float) r1
            java.lang.String r1 = r13.A0B
            int r0 = r13.A0I
            int r0 = r0 / 2
            float r8 = (float) r0
            float r0 = r9 - r8
            r14.drawText(r1, r7, r0, r3)
            android.content.Context r0 = r13.A0J
            X.0qq r1 = X.AnonymousClass0qo.A00(r0)
            X.0qm r0 = X.0qm.A11
            android.graphics.Typeface r0 = r1.A02(r0)
            r3.setTypeface(r0)
            android.content.res.Resources r1 = r13.A0K
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r3.setTextSize(r0)
            float r9 = r9 + r8
            goto L_0x0110
        L_0x01d2:
            boolean r0 = r13.A0Z
            if (r0 == 0) goto L_0x020e
            float r0 = r13.A01
            r3.setTextSize(r0)
            android.graphics.Typeface r0 = r13.A0S
            r3.setTypeface(r0)
            r0 = -1
            r3.setColor(r0)
            android.graphics.LinearGradient r0 = r13.A09
            r3.setShader(r0)
            java.lang.String r5 = r13.A0B
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.left
            android.graphics.Bitmap r6 = r13.A0L
            int r0 = r6.getWidth()
            int r1 = r1 + r0
            int r0 = r13.A06
            int r1 = r1 + r0
            int r0 = r13.A0F
            int r1 = r1 + r0
            float r7 = (float) r1
            android.graphics.Rect r0 = r13.getBounds()
            int r8 = r0.centerY()
            int r1 = r13.A07
            int r0 = r13.A03
            int r1 = r1 - r0
            goto L_0x010c
        L_0x020e:
            r0 = -1
            r3.setColor(r0)
            android.graphics.LinearGradient r0 = r13.A09
            r3.setShader(r0)
            java.lang.String r5 = r13.A0B
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.left
            android.graphics.Bitmap r6 = r13.A0L
            int r0 = r6.getWidth()
            int r1 = r1 + r0
            int r0 = r13.A06
            int r1 = r1 + r0
            int r0 = r13.A0F
            int r1 = r1 + r0
            float r7 = (float) r1
            android.graphics.Rect r0 = r13.getBounds()
            int r8 = r0.centerY()
            int r1 = r13.A07
            goto L_0x010c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300635xX.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return -2;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A09 = new LinearGradient((float) (getBounds().centerX() - (this.A08 / 2)), 0.0f, (float) (getBounds().centerX() + (this.A08 / 2)), 0.0f, this.A0C, (float[]) null, Shader.TileMode.REPEAT);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final boolean A01(UserSession userSession) {
        if (this.A0a || !C346897vw.A01(userSession)) {
            return false;
        }
        return true;
    }

    public final C2802350v BzV() {
        return this.A0U;
    }

    public final String C4F() {
        return this.A0Y;
    }

    public final int getIntrinsicHeight() {
        return this.A04;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    private final void A00(int i, boolean z) {
        this.A0C = new int[]{i, i};
        this.A09 = new LinearGradient((float) (getBounds().centerX() - (this.A08 / 2)), 0.0f, (float) (getBounds().centerX() + (this.A08 / 2)), 0.0f, this.A0C, (float[]) null, Shader.TileMode.REPEAT);
        if (z) {
            invalidateSelf();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0379, code lost:
        if (r13.equals("link_sticker_redesign_default") == false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x038a, code lost:
        r0.A02 = r15.A00;
        r1 = r15.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03c1, code lost:
        r0.A0C = r1;
        r4 = (float) r2.getWidth();
        r5 = (float) r2.getHeight();
        r6 = X.ABP.A01(r11);
        r7 = X.ABP.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03f8, code lost:
        r1 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0428, code lost:
        r0.A0C = r1;
        r4 = (float) r2.getWidth();
        r5 = (float) r2.getHeight();
        r6 = new int[]{r10, r10};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x012d, code lost:
        if (r55 != false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x046f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0470, code lost:
        r0.A0A = new android.graphics.LinearGradient(0.0f, 0.0f, r4, r5, r6, r7, android.graphics.Shader.TileMode.REPEAT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x047b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x014c, code lost:
        if (X.03t.A0O(r0.A0Y, r0.A0d) == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05bf, code lost:
        if (r2 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05d1, code lost:
        if (X.03t.A0O(r13, r3) != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05d5, code lost:
        r1 = com.instagram.android.R.dimen.clips_template_landing_page_template_preview_clip_index_text_size;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0101, code lost:
        if (r55 != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01df, code lost:
        if (r5 != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0205, code lost:
        if (r2 != false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x021f, code lost:
        if (r1 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x011b, code lost:
        if (r14 >= 13) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0357, code lost:
        r0.A0C = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0359, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x035a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C300635xX(android.content.Context r44, com.instagram.common.session.UserSession r45, X.AnonymousClass6MT r46, java.lang.Boolean r47, java.lang.Integer r48, java.lang.Integer r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, int r53, boolean r54, boolean r55, boolean r56) {
        /*
            r43 = this;
            r34 = r53
            r33 = 1
            r11 = r44
            r0 = r33
            X.0qQ.A0B(r11, r0)
            r32 = 2
            r7 = r46
            r0 = r32
            X.0qQ.A0B(r7, r0)
            r0 = 6
            r8 = r45
            X.0qQ.A0B(r8, r0)
            r0 = r43
            r0.<init>()
            r0.A0J = r11
            r0.A0T = r8
            r6 = r54
            r0.A0a = r6
            r18 = r55
            r1 = r18
            r0.A0b = r1
            r36 = r51
            r1 = r36
            r0.A0X = r1
            r35 = r52
            r1 = r35
            r0.A0W = r1
            r1 = r47
            r0.A0V = r1
            r1 = r56
            r0.A0Z = r1
            android.content.res.Resources r12 = r11.getResources()
            X.0qQ.A07(r12)
            r0.A0K = r12
            android.graphics.Paint r5 = new android.graphics.Paint
            r1 = r33
            r5.<init>(r1)
            r0.A0O = r5
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.A0R = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.A0Q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.A0P = r1
            r1 = 2130970169(0x7f040639, float:1.754904E38)
            int r1 = X.2Yu.A0H(r11, r1)
            int r10 = r11.getColor(r1)
            X.6MW r15 = X.AnonymousClass6MW.A06
            java.lang.String r31 = "link_sticker_redesign_default"
            X.0eP r17 = new X.0eP
            r2 = r31
            r1 = r17
            r1.<init>(r2, r15)
            r9 = 0
            X.6MW r30 = X.AnonymousClass6MW.A0B
            java.lang.String r29 = "link_sticker_redesign_subtle"
            X.0eP r16 = new X.0eP
            r3 = r29
            r2 = r30
            r1 = r16
            r1.<init>(r3, r2)
            X.6MW r28 = X.AnonymousClass6MW.A0A
            java.lang.String r27 = "link_sticker_redesign_rainbow"
            X.0eP r14 = new X.0eP
            r2 = r27
            r1 = r28
            r14.<init>(r2, r1)
            X.6MW r26 = X.AnonymousClass6MW.A07
            java.lang.String r25 = "link_sticker_redesign_hero"
            X.0eP r13 = new X.0eP
            r2 = r25
            r1 = r26
            r13.<init>(r2, r1)
            X.6MW r24 = X.AnonymousClass6MW.A0C
            java.lang.String r23 = "link_sticker_redesign_vibrant"
            X.0eP r4 = new X.0eP
            r2 = r23
            r1 = r24
            r4.<init>(r2, r1)
            X.6MW r22 = X.AnonymousClass6MW.A09
            java.lang.String r21 = "link_sticker_redesign_monotone"
            X.0eP r3 = new X.0eP
            r2 = r21
            r1 = r22
            r3.<init>(r2, r1)
            r37 = r17
            r38 = r16
            r39 = r14
            r40 = r13
            r41 = r4
            r42 = r3
            X.0eP[] r1 = new X.0eP[]{r37, r38, r39, r40, r41, r42}
            java.util.LinkedHashMap r4 = X.0Yt.A07(r1)
            r0.A0f = r4
            java.lang.String r20 = "link_sticker_hero"
            java.lang.String r19 = "link_sticker_redesign_primary_icon"
            r13 = r20
            r3 = r31
            r2 = r25
            r1 = r19
            java.lang.String[] r1 = new java.lang.String[]{r13, r3, r2, r1}
            r0.A0c = r1
            r2 = r29
            r1 = r27
            java.lang.String[] r3 = new java.lang.String[]{r3, r2, r1}
            r0.A0d = r3
            r1 = -1
            r0.A08 = r1
            r0.A04 = r1
            r13 = r50
            r0.A0Y = r13
            if (r54 == 0) goto L_0x05c7
            if (r55 == 0) goto L_0x05d5
        L_0x0103:
            r1 = 2131165317(0x7f070085, float:1.7944848E38)
        L_0x0106:
            int r1 = r12.getDimensionPixelSize(r1)
            float r1 = (float) r1
            r0.A01 = r1
            r5.setTextSize(r1)
            if (r52 == 0) goto L_0x011d
            int r14 = r35.length()
            r2 = 13
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r14 < r2) goto L_0x0120
        L_0x011d:
            r1 = 2131165264(0x7f070050, float:1.794474E38)
        L_0x0120:
            int r1 = r12.getDimensionPixelSize(r1)
            float r1 = (float) r1
            r0.A00 = r1
            if (r54 == 0) goto L_0x05ab
            X.0qq r1 = X.AnonymousClass0qo.A00(r11)
            if (r55 == 0) goto L_0x05c3
        L_0x012f:
            X.0qm r2 = X.0qm.A0Y
        L_0x0131:
            android.graphics.Typeface r1 = r1.A02(r2)
            r0.A0S = r1
            r5.setTypeface(r1)
            r0.A0U = r7
            com.instagram.common.session.UserSession r1 = r0.A0T
            boolean r1 = r0.A01(r1)
            if (r1 == 0) goto L_0x014e
            java.lang.String[] r2 = r0.A0d
            java.lang.String r1 = r0.A0Y
            boolean r1 = X.03t.A0O(r1, r2)
            if (r1 != 0) goto L_0x0156
        L_0x014e:
            boolean r1 = r0.A0a
            if (r1 == 0) goto L_0x055a
            boolean r1 = r0.A0b
            if (r1 == 0) goto L_0x055a
        L_0x0156:
            com.instagram.api.schemas.StoryLinkInfoDict r1 = r7.A00
            if (r1 == 0) goto L_0x04fc
            java.lang.String r1 = r1.A06
            if (r1 == 0) goto L_0x04fc
            java.lang.CharSequence r1 = X.00l.A0B(r1)
            java.lang.String r2 = r1.toString()
            if (r2 == 0) goto L_0x04fc
            boolean r1 = X.0mp.A0B(r2)
            if (r1 != 0) goto L_0x04fc
            java.util.Locale r1 = java.util.Locale.getDefault()
            X.0qQ.A07(r1)
            java.lang.String r4 = r2.toLowerCase(r1)
            X.0qQ.A07(r4)
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x01a2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r1 = r4.charAt(r9)
            java.lang.String r1 = X.AnonymousClass9VV.A00(r1)
            r2.append(r1)
            r1 = r33
            java.lang.String r1 = r4.substring(r1)
            X.0qQ.A07(r1)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
        L_0x01a2:
            r0.A0B = r4
            r1 = r34
            r0.A0e = r1
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            int r1 = r12.getDimensionPixelSize(r1)
            int r34 = r53 - r1
            r1 = r34
            r0.A0D = r1
            r1 = 2131165231(0x7f07002f, float:1.7944673E38)
            if (r54 == 0) goto L_0x01bc
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
        L_0x01bc:
            int r4 = r12.getDimensionPixelSize(r1)
            r0.A0E = r4
            if (r51 == 0) goto L_0x04f9
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            int r2 = r12.getDimensionPixelSize(r1)
            r1 = 2131165293(0x7f07006d, float:1.79448E38)
            int r1 = r12.getDimensionPixelSize(r1)
            int r2 = r2 + r1
        L_0x01d2:
            r0.A0I = r2
            int r2 = r4 / 2
            if (r54 != 0) goto L_0x01e1
            boolean r5 = r0.A01(r8)
            r1 = 2131165293(0x7f07006d, float:1.79448E38)
            if (r5 == 0) goto L_0x01e4
        L_0x01e1:
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
        L_0x01e4:
            int r1 = r12.getDimensionPixelSize(r1)
            int r2 = r2 + r1
            r0.A06 = r2
            int r4 = r4 / r32
            r0.A0F = r4
            if (r54 == 0) goto L_0x04e5
            if (r55 == 0) goto L_0x04f6
            r1 = 2131165200(0x7f070010, float:1.794461E38)
        L_0x01f6:
            int r1 = r12.getDimensionPixelSize(r1)
        L_0x01fa:
            r0.A0G = r1
            if (r54 != 0) goto L_0x0207
            boolean r2 = r0.A01(r8)
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
            if (r2 == 0) goto L_0x020a
        L_0x0207:
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x020a:
            int r1 = r12.getDimensionPixelSize(r1)
            r0.A0H = r1
            if (r54 != 0) goto L_0x0221
            boolean r1 = r0.A01(r8)
            if (r1 == 0) goto L_0x04e0
            boolean r1 = X.03t.A0O(r13, r3)
            r2 = 2131165203(0x7f070013, float:1.7944616E38)
            if (r1 == 0) goto L_0x0224
        L_0x0221:
            r2 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x0224:
            int r1 = r12.getDimensionPixelSize(r2)
            r0.A05 = r1
            android.graphics.Paint r8 = r0.A0O
            float r1 = r0.A00
            r8.setTextSize(r1)
            java.lang.String r3 = r0.A0W
            if (r3 == 0) goto L_0x04dd
            java.util.regex.Pattern r1 = X.0mp.A00
            int r2 = r3.length()
            android.graphics.Rect r1 = r0.A0P
            r8.getTextBounds(r3, r9, r2, r1)
            int r3 = r1.width()
            android.content.res.Resources r2 = r0.A0K
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            int r1 = r2.getDimensionPixelSize(r1)
            int r1 = r1 * 3
            int r3 = r3 + r1
        L_0x0250:
            int r7 = r0.A06
            int r1 = r0.A0E
            r18 = r1
            int r7 = r7 + r1
            int r1 = r0.A0F
            int r7 = r7 + r1
            int r7 = r7 + r3
            float r1 = r0.A01
            r8.setTextSize(r1)
            java.lang.String r2 = r0.A0B
            java.util.regex.Pattern r1 = X.0mp.A00
            if (r2 == 0) goto L_0x04da
            int r1 = r2.length()
        L_0x026a:
            android.graphics.Rect r6 = r0.A0Q
            r8.getTextBounds(r2, r9, r1, r6)
            int r2 = r6.width()
            int r1 = r0.A05
            int r2 = r2 + r1
            int r2 = r2 + r7
            int r5 = r0.A0D
            if (r2 <= r5) goto L_0x02b8
            float r4 = r0.A01
            r14 = 1063675494(0x3f666666, float:0.9)
            float r3 = r4 * r14
            float r2 = (float) r1
            float r2 = r2 * r14
            float r1 = r0.A00
            float r1 = r1 * r14
        L_0x0287:
            r14 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r14
            r14 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x04ac
            r8.setTextSize(r3)
            java.lang.String r14 = r0.A0B
            if (r14 == 0) goto L_0x04a9
            int r4 = r14.length()
        L_0x029a:
            r8.getTextBounds(r14, r9, r4, r6)
            java.lang.Boolean r14 = r0.A0V
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r33)
            boolean r4 = X.0qQ.A0K(r14, r4)
            if (r4 == 0) goto L_0x0487
            int r4 = r6.width()
            int r14 = (int) r2
            int r4 = r4 + r14
            int r4 = r4 + r7
            if (r4 > r5) goto L_0x0487
            r0.A01 = r3
            r0.A05 = r14
        L_0x02b6:
            r0.A00 = r1
        L_0x02b8:
            int r2 = r6.width()
            int r1 = r0.A05
            int r2 = r2 + r1
            int r2 = r2 + r7
            int r1 = java.lang.Math.min(r5, r2)
            r0.A08 = r1
            int r1 = r6.top
            int r2 = java.lang.Math.abs(r1)
            android.graphics.Paint$FontMetrics r1 = r8.getFontMetrics()
            float r1 = r1.ascent
            float r1 = java.lang.Math.abs(r1)
            int r1 = (int) r1
            int r1 = java.lang.Math.min(r2, r1)
            r0.A07 = r1
            int r2 = r6.height()
            int r1 = r18 * 2
            int r2 = r2 + r1
            int r1 = r0.A0G
            int r1 = r1 * 2
            int r2 = r2 - r1
            int r1 = r0.A0I
            int r2 = r2 + r1
            r0.A04 = r2
            boolean r1 = r0.A0Z
            if (r1 == 0) goto L_0x031a
            java.lang.String r2 = r0.A0B
            if (r2 == 0) goto L_0x0484
            int r1 = r2.length()
        L_0x02fa:
            int r1 = r1 + -2
            r8.getTextBounds(r2, r9, r1, r6)
            int r3 = r6.top
            java.lang.String r2 = r0.A0B
            if (r2 == 0) goto L_0x0481
            int r1 = r2.length()
        L_0x0309:
            r8.getTextBounds(r2, r9, r1, r6)
            int r1 = r6.top
            int r1 = r1 - r3
            int r2 = java.lang.Math.abs(r1)
            r0.A03 = r2
            int r1 = r0.A04
            int r1 = r1 - r2
            r0.A04 = r1
        L_0x031a:
            if (r49 == 0) goto L_0x047c
            int r1 = r49.intValue()
        L_0x0320:
            android.graphics.Bitmap r3 = X.AnonymousClass6MX.A00(r12, r1)
            int r2 = r0.A05
            r1 = r33
            android.graphics.Bitmap r2 = X.0fO.A00(r3, r2, r2, r1)
            r0.A0L = r2
            int r4 = r2.getWidth()
            int r3 = r2.getHeight()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r4, r3, r1)
            r0.A0M = r3
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r3)
            r0.A0N = r1
            int r1 = r13.hashCode()
            switch(r1) {
                case -1956452003: goto L_0x037c;
                case -1711030815: goto L_0x035a;
                case -1658936038: goto L_0x0373;
                case -1296605985: goto L_0x0392;
                case -939059263: goto L_0x03af;
                case -854948068: goto L_0x03d7;
                case -163590988: goto L_0x03e8;
                case 1001089748: goto L_0x03fc;
                case 1542538141: goto L_0x0416;
                case 1984394274: goto L_0x0439;
                case 2064803983: goto L_0x0453;
                default: goto L_0x034c;
            }
        L_0x034c:
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            int r1 = r11.getColor(r1)
            r0.A02 = r1
            int[] r1 = X.AnonymousClass6LW.A08
        L_0x0357:
            r0.A0C = r1
            return
        L_0x035a:
            r1 = r20
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            int r1 = r11.getColor(r1)
            r0.A02 = r1
            r1 = r32
            int[] r1 = new int[r1]
            r1 = {-16777216, -16777216} // fill-array
            goto L_0x03c1
        L_0x0373:
            r1 = r31
            boolean r1 = r13.equals(r1)
            if (r1 != 0) goto L_0x038a
            goto L_0x034c
        L_0x037c:
            r1 = r19
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            if (r48 == 0) goto L_0x038a
            int r10 = r48.intValue()
        L_0x038a:
            int r1 = r15.A00
            r0.A02 = r1
            int[] r1 = r15.A03
            goto L_0x0428
        L_0x0392:
            java.lang.String r1 = "link_sticker_primary_color"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            int r1 = r11.getColor(r1)
            r0.A02 = r1
            X.0qQ.A0A(r48)
            int r1 = r48.intValue()
            int[] r1 = new int[]{r1, r1}
            goto L_0x0357
        L_0x03af:
            r1 = r25
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = r26
            int r1 = r1.A00
            r0.A02 = r1
            r1 = r26
            int[] r1 = r1.A03
        L_0x03c1:
            r0.A0C = r1
            int r1 = r2.getWidth()
            float r4 = (float) r1
            int r1 = r2.getHeight()
            float r5 = (float) r1
            int[] r6 = X.ABP.A01(r11)
            float[] r7 = X.ABP.A00()
            goto L_0x0470
        L_0x03d7:
            r1 = r21
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = r22
            int r1 = r1.A00
            r0.A02 = r1
            r1 = r22
            goto L_0x03f8
        L_0x03e8:
            r1 = r29
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = r30
            int r1 = r1.A00
            r0.A02 = r1
            r1 = r30
        L_0x03f8:
            int[] r1 = r1.A03
            goto L_0x0357
        L_0x03fc:
            java.lang.String r1 = "link_sticker_subtle"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = 2131100790(0x7f060476, float:1.7813971E38)
            int r1 = r11.getColor(r1)
            r0.A02 = r1
            r1 = r32
            int[] r1 = new int[r1]
            r1 = {-1, -1} // fill-array
            goto L_0x0357
        L_0x0416:
            r1 = r23
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = r24
            int r1 = r1.A00
            r0.A02 = r1
            int[] r1 = new int[]{r10, r10}
        L_0x0428:
            r0.A0C = r1
            int r1 = r2.getWidth()
            float r4 = (float) r1
            int r1 = r2.getHeight()
            float r5 = (float) r1
            int[] r6 = new int[]{r10, r10}
            goto L_0x046f
        L_0x0439:
            java.lang.String r1 = "link_sticker_black_white"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            int r1 = r11.getColor(r1)
            r0.A02 = r1
            r1 = r32
            int[] r1 = new int[r1]
            r1 = {-16777216, -16777216} // fill-array
            goto L_0x0357
        L_0x0453:
            r1 = r27
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034c
            r1 = r28
            int r1 = r1.A00
            r0.A02 = r1
            int[] r6 = X.AnonymousClass5BH.A01
            r0.A0C = r6
            int r1 = r2.getWidth()
            float r4 = (float) r1
            int r1 = r2.getHeight()
            float r5 = (float) r1
        L_0x046f:
            r7 = 0
        L_0x0470:
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.REPEAT
            r2 = 0
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.A0A = r1
            return
        L_0x047c:
            r1 = 2131239126(0x7f0820d6, float:1.809455E38)
            goto L_0x0320
        L_0x0481:
            r1 = 0
            goto L_0x0309
        L_0x0484:
            r1 = 0
            goto L_0x02fa
        L_0x0487:
            int r4 = r6.width()
            int r14 = r0.A05
            int r4 = r4 + r14
            int r4 = r4 + r7
            if (r4 > r5) goto L_0x0495
            r0.A01 = r3
            goto L_0x02b6
        L_0x0495:
            float r4 = r0.A01
            r17 = 1036831949(0x3dcccccd, float:0.1)
            float r16 = r4 * r17
            float r3 = r3 - r16
            float r14 = (float) r14
            float r14 = r14 * r17
            float r2 = r2 - r14
            float r14 = r0.A00
            float r14 = r14 * r17
            float r1 = r1 - r14
            goto L_0x0287
        L_0x04a9:
            r4 = 0
            goto L_0x029a
        L_0x04ac:
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>(r8)
            android.content.res.Resources r1 = r0.A0K
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r3.density = r1
            java.lang.String r4 = r0.A0B
            int r2 = r5 - r7
            int r1 = r0.A05
            int r2 = r2 - r1
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r4, r3, r2, r1)
            java.lang.String r1 = r1.toString()
            r0.A0B = r1
            if (r1 == 0) goto L_0x04d5
            int r14 = r1.length()
        L_0x04d5:
            r8.getTextBounds(r1, r9, r14, r6)
            goto L_0x02b8
        L_0x04da:
            r1 = 0
            goto L_0x026a
        L_0x04dd:
            r3 = 0
            goto L_0x0250
        L_0x04e0:
            r2 = 2131165248(0x7f070040, float:1.7944708E38)
            goto L_0x0224
        L_0x04e5:
            boolean r1 = r0.A01(r8)
            if (r1 == 0) goto L_0x04f6
            boolean r1 = X.03t.A0O(r13, r3)
            if (r1 == 0) goto L_0x04f6
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            goto L_0x01f6
        L_0x04f6:
            r1 = 0
            goto L_0x01fa
        L_0x04f9:
            r2 = 0
            goto L_0x01d2
        L_0x04fc:
            java.lang.String r1 = r7.A00()
            java.lang.CharSequence r1 = X.00l.A0B(r1)
            java.lang.String r2 = r1.toString()
            X.0bY r1 = A0g
            android.net.Uri r1 = X.0cp.A01(r1, r2)
            if (r1 == 0) goto L_0x0517
            java.lang.String r1 = r1.getHost()
            if (r1 == 0) goto L_0x0517
            r2 = r1
        L_0x0517:
            java.util.Locale r1 = java.util.Locale.getDefault()
            X.0qQ.A07(r1)
            java.lang.String r4 = r2.toLowerCase(r1)
            X.0qQ.A07(r4)
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x059c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r1 = r4.charAt(r9)
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            X.0qQ.A0C(r5, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r5.toUpperCase(r1)
            X.0qQ.A07(r1)
            r2.append(r1)
            r1 = r33
            java.lang.String r1 = r4.substring(r1)
            X.0qQ.A07(r1)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L_0x059c
        L_0x055a:
            com.instagram.api.schemas.StoryLinkInfoDict r1 = r7.A00
            if (r1 == 0) goto L_0x0579
            java.lang.String r2 = r1.A06
        L_0x0560:
            boolean r1 = X.0mp.A0B(r2)
            if (r1 != 0) goto L_0x057b
            X.0qQ.A0A(r2)
            java.util.Locale r1 = java.util.Locale.getDefault()
            X.0qQ.A07(r1)
            java.lang.String r4 = r2.toUpperCase(r1)
            X.0qQ.A07(r4)
            goto L_0x01a2
        L_0x0579:
            r2 = 0
            goto L_0x0560
        L_0x057b:
            java.lang.String r2 = r7.A00()
            X.0bY r1 = A0g
            android.net.Uri r1 = X.0cp.A01(r1, r2)
            if (r1 == 0) goto L_0x058e
            java.lang.String r1 = r1.getHost()
            if (r1 == 0) goto L_0x058e
            r2 = r1
        L_0x058e:
            java.util.Locale r1 = java.util.Locale.getDefault()
            X.0qQ.A07(r1)
            java.lang.String r4 = r2.toUpperCase(r1)
            X.0qQ.A07(r4)
        L_0x059c:
            java.lang.String r1 = "^WWW\\."
            X.11S r2 = new X.11S
            r2.<init>(r1)
            java.lang.String r1 = ""
            java.lang.String r4 = r2.A01(r4, r1)
            goto L_0x01a2
        L_0x05ab:
            boolean r2 = r0.A01(r8)
            X.0qq r1 = X.AnonymousClass0qo.A00(r11)
            if (r2 == 0) goto L_0x05c3
            java.lang.Object r2 = r4.get(r13)
            X.6MW r2 = (X.AnonymousClass6MW) r2
            if (r2 == 0) goto L_0x012f
            X.0qm r2 = r2.A01
            if (r2 != 0) goto L_0x0131
            goto L_0x012f
        L_0x05c3:
            X.0qm r2 = X.0qm.A0V
            goto L_0x0131
        L_0x05c7:
            boolean r1 = r0.A01(r8)
            if (r1 == 0) goto L_0x05da
            boolean r1 = X.03t.A0O(r13, r3)
            if (r1 == 0) goto L_0x05d5
            goto L_0x0103
        L_0x05d5:
            r1 = 2131165486(0x7f07012e, float:1.794519E38)
            goto L_0x0106
        L_0x05da:
            r1 = 2131165333(0x7f070095, float:1.794488E38)
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300635xX.<init>(android.content.Context, com.instagram.common.session.UserSession, X.6MT, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean):void");
    }
}
