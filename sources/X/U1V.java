package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class U1V extends Drawable implements View.OnTouchListener, Drawable.Callback, C252203oj {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public C18508Vt5 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Paint A0H;
    public final Paint A0I = new Paint(1);
    public final RectF A0J = new RectF();
    public final 2cs A0K;
    public final 2cs A0L;
    public final 2cs A0M;
    public final C15840UjQ A0N;
    public final C14671U0r A0O;
    public final UserSession A0P;

    public final void A03(int i) {
        float f = (float) i;
        this.A01 = f / 2.0f;
        this.A02 = f;
        invalidateSelf();
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public static void A00(Rect rect, U1V u1v) {
        u1v.A0I.setShader(new LinearGradient(0.0f, rect.exactCenterY(), (float) rect.width(), rect.exactCenterY(), u1v.A06, u1v.A05, Shader.TileMode.CLAMP));
    }

    public final void A01(float f) {
        this.A00 = f;
        C15840UjQ ujQ = this.A0N;
        int A022 = 0nH.A02(f, this.A06, this.A05);
        C14671U0r u0r = ujQ.A04;
        u0r.A02 = A022;
        u0r.invalidateSelf();
        ujQ.invalidateSelf();
        invalidateSelf();
    }

    public final void A02(int i) {
        C15840UjQ ujQ = this.A0N;
        float f = (float) i;
        ujQ.A00 = f;
        ujQ.A06.A0A(f);
        C14671U0r u0r = ujQ.A04;
        u0r.A00 = ujQ.A00 / 2.0f;
        u0r.invalidateSelf();
        U1O u1o = ujQ.A05;
        u1o.A00 = ujQ.A00;
        u1o.invalidateSelf();
        ujQ.invalidateSelf();
    }

    public final void A04(Integer num) {
        C15840UjQ ujQ = this.A0N;
        ujQ.A01 = num;
        ujQ.A02 = null;
        ujQ.A03.A02();
        ujQ.invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        int i = this.A04;
        if (i <= 0) {
            return (int) this.A0N.A00;
        }
        return i;
    }

    public final void setAlpha(int i) {
        this.A0N.setAlpha(i);
        this.A0H.setAlpha(i);
        this.A0I.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0N.setColorFilter(colorFilter);
        this.A0H.setColorFilter(colorFilter);
        this.A0I.setColorFilter(colorFilter);
    }

    public U1V(Context context, UserSession userSession) {
        Paint paint = new Paint(1);
        this.A0H = paint;
        2cp A002 = C61340me.A00();
        this.A0P = userSession;
        C15840UjQ ujQ = new C15840UjQ(context);
        this.A0N = ujQ;
        ujQ.setCallback(this);
        2cs A022 = A002.A02();
        A022.A09(C71392co.A02(10.0d));
        A022.A02();
        A022.A0A(this);
        this.A0K = A022;
        C14671U0r u0r = new C14671U0r(context);
        this.A0O = u0r;
        u0r.setCallback(this);
        2cs A023 = A002.A02();
        A023.A09(C71392co.A02(10.0d));
        A023.A02();
        A023.A0A(this);
        this.A0M = A023;
        2cs A024 = A002.A02();
        A024.A0A(this);
        A024.A08(0.0d, true);
        A024.A09(C71392co.A01());
        this.A0L = A024;
        int color = context.getColor(R.color.chat_sticker_button_divider_color);
        this.A0E = color;
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink);
        this.A0G = A032;
        int A033 = AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink);
        this.A0F = A033;
        this.A06 = A032;
        this.A05 = A033;
        paint.setColor(color);
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        2cs r0;
        float f3;
        Rect bounds = getBounds();
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        Rect bounds2 = getBounds();
        float height = ((float) bounds2.height()) / 2.0f;
        RectF rectF = this.A0J;
        rectF.set(0.0f, height - (this.A02 / 2.0f), (float) bounds2.width(), height + (this.A02 / 2.0f));
        float f4 = this.A01;
        canvas.drawRoundRect(rectF, f4, f4, this.A0H);
        Rect bounds3 = getBounds();
        C15840UjQ ujQ = this.A0N;
        float f5 = (float) ((int) ujQ.A00);
        float height2 = ((float) bounds3.height()) / 2.0f;
        boolean z = this.A09;
        float f6 = this.A00;
        float width = (float) bounds3.width();
        if (z) {
            f = (f6 * (width - f5)) + (f5 / 2.0f);
        } else {
            f = f6 * width;
        }
        float f7 = this.A02 / 2.0f;
        rectF.set(0.0f, height2 - f7, f, height2 + f7);
        float f8 = this.A01;
        canvas.drawRoundRect(rectF, f8, f8, this.A0I);
        if (this.A0A) {
            int A022 = 0nH.A02(this.A03, this.A06, this.A05);
            C14671U0r u0r = this.A0O;
            u0r.A02 = A022;
            u0r.invalidateSelf();
            if (this.A0B) {
                r0 = this.A0L;
            } else {
                r0 = this.A0M;
            }
            float f9 = (float) r0.A09.A00;
            Rect bounds4 = getBounds();
            float intrinsicWidth = (float) u0r.getIntrinsicWidth();
            float intrinsicHeight = (float) u0r.getIntrinsicHeight();
            boolean z2 = this.A09;
            float f10 = this.A03;
            float width2 = (float) bounds4.width();
            if (z2) {
                f3 = (f10 * (width2 - intrinsicWidth)) + (intrinsicWidth / 2.0f);
            } else {
                f3 = f10 * width2;
            }
            float height3 = (float) (bounds4.height() / 2);
            canvas.save();
            canvas.scale(f9, f9, f3, height3);
            float f11 = intrinsicWidth / 2.0f;
            float f12 = intrinsicHeight / 2.0f;
            u0r.setBounds((int) (f3 - f11), (int) (height3 - f12), (int) (f3 + f11), (int) (height3 + f12));
            u0r.draw(canvas);
            canvas.restore();
        }
        Rect bounds5 = getBounds();
        float f13 = (float) ((int) ujQ.A00);
        float f14 = (float) this.A0K.A09.A00;
        boolean z3 = this.A09;
        float f15 = this.A00;
        float width3 = (float) bounds5.width();
        if (z3) {
            f2 = (f15 * (width3 - f13)) + (f13 / 2.0f);
        } else {
            f2 = f15 * width3;
        }
        float height4 = (float) (bounds5.height() / 2);
        canvas.save();
        canvas.scale(f14, f14, f2, height4);
        float f16 = f13 / 2.0f;
        ujQ.setBounds((int) (f2 - f16), (int) (height4 - f16), (int) (f2 + f16), (int) (height4 + f16));
        ujQ.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [java.lang.Object, X.Cvz] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r1 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r1 != 3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
            r14 = this;
            android.graphics.Rect r2 = r14.getBounds()
            float r0 = r16.getX()
            int r3 = (int) r0
            int r0 = r2.left
            int r3 = r3 - r0
            float r0 = r16.getY()
            int r5 = (int) r0
            int r0 = r2.top
            int r5 = r5 - r0
            int r1 = r16.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x004e
            if (r1 == r4) goto L_0x00a5
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x00a5
        L_0x0023:
            return r4
        L_0x0024:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0023
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x0023
            float r1 = (float) r3
            int r0 = r2.width()
            float r0 = (float) r0
            float r1 = r1 / r0
            double r5 = (double) r1
            r0 = 0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.max(r5, r0)
            double r1 = java.lang.Math.min(r0, r2)
            float r0 = (float) r1
            r14.A01(r0)
            X.Vt5 r1 = r14.A07
            if (r1 == 0) goto L_0x0023
            float r0 = r14.A00
            X.C18508Vt5.A00(r1, r0)
            return r4
        L_0x004e:
            X.UjQ r0 = r14.A0N
            android.graphics.Rect r0 = r0.getBounds()
            boolean r0 = r0.contains(r3, r5)
            r14.A0C = r0
            r1 = 4606281698659794944(0x3fecccccc0000000, double:0.8999999761581421)
            if (r0 == 0) goto L_0x0066
            X.2cs r0 = r14.A0K
            r0.A06(r1)
        L_0x0066:
            X.U0r r0 = r14.A0O
            android.graphics.Rect r0 = r0.getBounds()
            boolean r0 = r0.contains(r3, r5)
            r14.A0D = r0
            if (r0 == 0) goto L_0x0079
            X.2cs r0 = r14.A0M
            r0.A06(r1)
        L_0x0079:
            X.Vt5 r3 = r14.A07
            if (r3 == 0) goto L_0x0023
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0099
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x0099
            float r2 = r14.A00
            X.4Wh r0 = r3.A04
            r0.DlV()
        L_0x008c:
            X.C18508Vt5.A00(r3, r2)
            X.4Wi r0 = r3.A05
            X.U1U r0 = r0.A00
            if (r0 == 0) goto L_0x016b
            r0.A01()
            return r4
        L_0x0099:
            boolean r1 = r14.A0C
            float r2 = r14.A00
            X.4Wh r0 = r3.A04
            r0.DlT()
            if (r1 == 0) goto L_0x0023
            goto L_0x008c
        L_0x00a5:
            X.Vt5 r6 = r14.A07
            if (r6 == 0) goto L_0x0139
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0149
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x0149
            float r9 = r14.A00
            X.WaK r0 = r6.A06
            X.BHJ r0 = r0.A00
            java.lang.String r13 = r0.A08
            if (r13 != 0) goto L_0x00bd
            java.lang.String r13 = ""
        L_0x00bd:
            r5 = 0
            X.1hu r1 = new X.1hu
            r1.<init>(r5)
            r3 = 0
            r8 = 6
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r8, r3)
            X.BIu r0 = new X.BIu
            r0.<init>(r5, r5, r5)
            java.lang.Integer r10 = r0.A02
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r6.A03
            com.instagram.user.model.User r7 = r1.A01(r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r9)
            X.1hu r1 = new X.1hu
            r1.<init>(r5)
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r8, r3)
            X.BIu r8 = new X.BIu
            r8.<init>(r7, r2, r10)
            X.4Wh r12 = r6.A04
            X.9JD r0 = r6.A02
            java.lang.String r11 = r0.A03
            java.lang.String r10 = r6.A07
            java.lang.String r7 = r0.A02
            java.lang.String r2 = r6.A08
            int r1 = r6.A01
            X.Cvz r0 = new X.Cvz
            r0.<init>()
            r0.A03 = r11
            r0.A05 = r13
            r0.A01 = r8
            r0.A04 = r10
            r0.A02 = r7
            r0.A06 = r2
            r0.A00 = r1
            X.4Wi r1 = r6.A05
            r12.DlU(r1, r0)
            X.UpW r0 = r1.A00()
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.U1V r0 = (X.U1V) r0
            r0.A08 = r3
            X.UpW r0 = r1.A00()
            r0.A01 = r8
            X.C16145UpW.A00(r0)
            X.C18508Vt5.A00(r6, r9)
            X.U1U r2 = r1.A00
            if (r2 == 0) goto L_0x016b
            java.util.List r1 = r2.A09
            X.Vak r0 = r2.A03
            r1.add(r3, r0)
            r2.A03 = r5
        L_0x0139:
            r0 = 0
            r14.A0C = r0
            r14.A0D = r0
            X.2cs r0 = r14.A0K
            r0.A03()
            X.2cs r0 = r14.A0M
            r0.A03()
            return r4
        L_0x0149:
            boolean r5 = r14.A0C
            boolean r3 = r14.A0D
            float r2 = r14.A00
            X.4Wh r1 = r6.A04
            X.4Wi r0 = r6.A05
            r1.DlS(r0, r3)
            if (r5 == 0) goto L_0x0139
            X.C18508Vt5.A00(r6, r2)
            X.U1U r3 = r0.A00
            if (r3 == 0) goto L_0x016b
            java.util.List r2 = r3.A09
            X.Vak r1 = r3.A03
            r0 = 0
            r2.add(r0, r1)
            r0 = 0
            r3.A03 = r0
            goto L_0x0139
        L_0x016b:
            java.lang.String r0 = "sliderParticleSystem"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1V.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void DmE(2cs r1) {
        invalidateSelf();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        A00(rect, this);
    }
}
