package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.webrtc.CameraCapturer;

/* renamed from: X.9ne  reason: invalid class name and case insensitive filesystem */
public final class C388329ne extends C369828vO implements AnonymousClass5MJ {
    public float A00;
    public int A01;
    public AnonymousClass9XA A02;
    public User A03;
    public boolean A04;
    public C306386Ly A05;
    public final float A06;
    public final Context A07;
    public final UserSession A08;
    public final AnonymousClass82f A09;
    public final String A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E = 0.7f;
    public final float A0F;
    public final Drawable A0G;
    public final GradientDrawable A0H;
    public final GradientDrawable A0I;
    public final 1Xj A0J;
    public final C306386Ly A0K;

    public final /* synthetic */ void EqG() {
    }

    public final int getOpacity() {
        return -3;
    }

    private final float A00() {
        if (this.A04) {
            return this.A09.A00;
        }
        return this.A0E;
    }

    private final void A01() {
        int i;
        float f = this.A06;
        float A002 = A00();
        int i2 = (int) (f * A002);
        int i3 = (int) (this.A0B * A002);
        C306386Ly r5 = this.A0K;
        float f2 = this.A0C;
        r5.A0A(f2);
        int i4 = (int) (((float) i2) - (2.0f * this.A0F));
        AnonymousClass9XA r0 = this.A02;
        if (r0 != null) {
            i = r0.getIntrinsicWidth();
        } else {
            i = 0;
        }
        r5.A0E(i4 - i);
        this.A05.A0A(f2);
        this.A0I.setBounds(0, 0, i2, (int) (((float) i3) * 0.25f));
    }

    private final void A02() {
        int i;
        float f = this.A06;
        float A002 = A00();
        int i2 = (int) (f * A002);
        int i3 = (int) (this.A0B * A002);
        C306386Ly r5 = this.A0K;
        float f2 = this.A0D;
        r5.A0A(f2);
        int i4 = (int) (((float) i2) - (2.0f * this.A0F));
        AnonymousClass9XA r0 = this.A02;
        if (r0 != null) {
            i = r0.getIntrinsicWidth();
        } else {
            i = 0;
        }
        r5.A0E(i4 - i);
        this.A05.A0A(f2);
        this.A0I.setBounds(0, 0, i2, (int) (((float) i3) * 0.25f));
    }

    public final C2802350v BzV() {
        return this.A09;
    }

    public final String C4F() {
        String str;
        boolean A1Y = AnonymousClass7TF.A1Y(this.A09.A07.A02(), true);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (A1Y) {
            str = "story-reels-metadata-sticker-fullscreen-";
        } else {
            str = "story-reels-metadata-sticker-";
        }
        A1A.append(str);
        return AnonymousClass7TF.A0l(this.A0A, A1A);
    }

    public final int getDurationInMs() {
        int i = this.A09.A06;
        int i2 = 15000;
        if (i > 15000) {
            i2 = 1KU.A00(this.A08);
        }
        return Math.min(i, i2);
    }

    public final int getIntrinsicHeight() {
        return AnonymousClass1GB.A01(this.A0B);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass1GB.A01(this.A06);
    }

    public final void setAlpha(int i) {
        this.A0K.setAlpha(i);
        AnonymousClass9XA r0 = this.A02;
        if (r0 != null) {
            r0.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0K.setColorFilter(colorFilter);
        AnonymousClass9XA r0 = this.A02;
        if (r0 != null) {
            r0.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00f0, code lost:
        if (r1 == false) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C388329ne(android.content.Context r15, com.instagram.common.session.UserSession r16, X.AnonymousClass82f r17) {
        /*
            r14 = this;
            r7 = 1060320051(0x3f333333, float:0.7)
            r3 = 1
            r0 = 3
            r9 = r17
            X.0qQ.A0B(r9, r0)
            r14.<init>()
            r12 = r16
            r14.A08 = r12
            r14.A07 = r15
            r14.A09 = r9
            r14.A0E = r7
            X.2Fk r0 = r9.A07
            java.lang.Object r0 = r0.A02()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4 = 0
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r14.A04 = r0
            com.instagram.user.model.User r0 = r9.A0A
            if (r0 != 0) goto L_0x002c
            com.instagram.user.model.User r0 = r9.A0B
        L_0x002c:
            r14.A03 = r0
            X.1Xj r0 = r9.A03
            r14.A0J = r0
            java.lang.String r0 = r9.A0C
            r14.A0A = r0
            int r0 = r9.A01
            float r5 = (float) r0
            r14.A0B = r5
            int r0 = r9.A02
            float r6 = (float) r0
            r14.A06 = r6
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            float r0 = r1.getDimension(r0)
            r14.A0F = r0
            float r0 = r14.A00()
            r14.A00 = r0
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            float r0 = r1.getDimension(r0)
            r14.A0C = r0
            r0 = 2131165306(0x7f07007a, float:1.7944825E38)
            float r0 = r1.getDimension(r0)
            r14.A0D = r0
            int r10 = X.AnonymousClass7TE.A09(r15)
            int r2 = X.AnonymousClass7TE.A08(r15)
            int r8 = (int) r6
            X.6Ly r11 = X.AnonymousClass7TE.A0s(r15, r8)
            android.content.Context r1 = r11.A0Z
            X.0qQ.A07(r1)
            java.lang.String r0 = X.C394659yT.A00(r1, r12, r9)
            r11.A0M(r0)
            r11.A0F(r10)
            X.0qq r0 = X.AnonymousClass0qo.A00(r1)
            X.0qm r9 = X.0qm.A0v
            X.AnonymousClass7TE.A1X(r9, r0, r11)
            java.lang.String r0 = "…"
            r11.A0N(r0, r3, r3)
            r14.A0K = r11
            X.82f r0 = r14.A09
            X.1Xj r0 = r0.A03
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.A2w()
            if (r0 == 0) goto L_0x00d0
            com.instagram.common.session.UserSession r12 = r14.A08
            X.0Tu r11 = X.0Tu.A05
            r0 = 36319175462951937(0x81081900011c01, double:3.031731036127352E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x00d0
            android.content.Context r1 = r14.A07
            r0 = 2131976628(0x7f1361b4, float:1.9590382E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r1, r0)
            float r0 = r14.A06
            int r0 = (int) r0
            X.9XA r11 = new X.9XA
            r11.<init>(r1, r12, r0)
            r14.A02 = r11
            r0 = 2131100202(0x7f06022a, float:1.7812779E38)
            int r1 = r1.getColor(r0)
            X.6Ly r0 = r11.A01
            r0.A0F(r1)
            X.6Ly r0 = r11.A02
            r0.A0F(r1)
        L_0x00d0:
            int r11 = X.AnonymousClass7TE.A09(r15)
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x00f2
            com.instagram.common.session.UserSession r13 = X.0ob.A00(r0)
            X.0Tu r12 = X.0Tu.A05
            r0 = 36329277226172371(0x81114900033fd3, double:3.03811943186449E-306)
            boolean r1 = X.182.A06(r12, r13, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00f2
            r0 = 2131238689(0x7f081f21, float:1.8093664E38)
            if (r1 != 0) goto L_0x00f5
        L_0x00f2:
            r0 = 2131238695(0x7f081f27, float:1.8093676E38)
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r15, r0, r11)
            r14.A0G = r0
            X.AnonymousClass7TG.A13(r0)
            r14.A01 = r4
            X.6Ly r8 = X.AnonymousClass7TE.A0s(r15, r8)
            r8.A0F(r10)
            android.content.Context r0 = r8.A0Z
            X.0qQ.A07(r0)
            X.0qq r0 = X.AnonymousClass0qo.A00(r0)
            X.AnonymousClass7TE.A1X(r9, r0, r8)
            r1 = 1084227584(0x40a00000, float:5.0)
            r0 = 0
            r8.A0D(r1, r0, r0, r2)
            r8.A0N = r3
            r14.A05 = r8
            float r5 = r5 * r7
            float r6 = r6 * r7
            r7 = 1025758986(0x3d23d70a, float:0.04)
            float r7 = r7 * r6
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2130903060(0x7f030014, float:1.7412927E38)
            int[] r2 = r1.getIntArray(r0)
            X.0qQ.A07(r2)
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r1, r2)
            r0.setShape(r4)
            r0.setCornerRadius(r7)
            r14.A0I = r0
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2130903059(0x7f030013, float:1.7412925E38)
            int[] r1 = r1.getIntArray(r0)
            X.0qQ.A07(r1)
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>(r0, r1)
            r3.setShape(r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r5
            int r2 = (int) r0
            int r1 = (int) r6
            int r0 = (int) r5
            r3.setBounds(r4, r2, r1, r0)
            r3.setCornerRadius(r7)
            r14.A0H = r3
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x016e
            r14.A02()
            return
        L_0x016e:
            r14.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388329ne.<init>(android.content.Context, com.instagram.common.session.UserSession, X.82f):void");
    }

    public final void draw(Canvas canvas) {
        float f;
        boolean booleanValue;
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        int save = canvas.save();
        AnonymousClass82f r1 = this.A09;
        Boolean bool = (Boolean) r1.A07.A02();
        if (!(bool == null || (this.A04 == (booleanValue = bool.booleanValue()) && this.A00 == A00()))) {
            this.A04 = booleanValue;
            this.A00 = A00();
            if (booleanValue) {
                A02();
            } else {
                A01();
            }
        }
        float A002 = 1.0f / A00();
        AnonymousClass7TF.A13(canvas, A0L);
        canvas.scale(A002, A002);
        float f2 = this.A0B;
        float A003 = A00();
        float f3 = f2 * A003;
        float f4 = this.A06 * A003;
        canvas.save();
        this.A0I.draw(canvas);
        if (!this.A04) {
            this.A0H.draw(canvas);
        }
        canvas.restore();
        if (!this.A04) {
            canvas.save();
            float f5 = this.A0F;
            canvas.translate(f5, f5);
            this.A0G.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        String A022 = 1G0.A02((long) (r1.A06 - this.A01));
        C306386Ly r8 = this.A05;
        r8.A0M(A022);
        float f6 = this.A0F;
        canvas.translate((f4 - ((float) r8.A0A)) - f6, f6);
        boolean z = this.A04;
        int i = this.A01;
        int i2 = 255;
        if (z && i >= 3000) {
            i2 = i < 3500 ? (255 * (3500 - i)) / CameraCapturer.OPEN_CAMERA_DELAY_MS : 0;
        }
        r8.setAlpha(i2);
        AnonymousClass7TF.A14(canvas, r8);
        if (this.A04) {
            f = f6;
        } else {
            f = (f3 - ((float) this.A0K.A06)) - f6;
        }
        canvas.translate(f6, f);
        C306386Ly r6 = this.A0K;
        r6.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(save);
        AnonymousClass9XA r2 = this.A02;
        if (r2 != null) {
            r2.A00(canvas, ((float) A0L.left) + f6 + ((float) r6.A0A), ((float) A0L.top) + f, 1.0f);
        }
    }

    public final void EXC(int i, int i2) {
        this.A01 = i;
    }
}
