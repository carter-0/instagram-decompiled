package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.smb.model.ProfileStickerModel;
import java.util.List;

/* renamed from: X.9pt  reason: invalid class name and case insensitive filesystem */
public final class C389599pt extends C299875vz implements C300645xY {
    public static final double A0d = ((1.0d + Math.sqrt(5.0d)) / 2.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public List A05 = 0sn.A00;
    public final RectF A06 = AnonymousClass7TE.A0Y();
    public final ProfileStickerModel A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final Context A0Q;
    public final Resources A0R;
    public final RectF A0S = AnonymousClass7TE.A0Y();
    public final UserSession A0T;
    public final C244303ay A0U;
    public final C306386Ly A0V;
    public final C306386Ly A0W;
    public final C306386Ly A0X;
    public final C306386Ly A0Y;
    public final C306386Ly A0Z;
    public final C363208jL A0a;
    public final boolean A0b;
    public final boolean A0c;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r2 == 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0035, code lost:
        if (r2 == 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C389599pt(android.content.Context r18, com.instagram.common.session.UserSession r19, com.instagram.reels.smb.model.ProfileStickerModel r20) {
        /*
            r17 = this;
            r6 = 1
            r5 = r17
            r5.<init>()
            r4 = r18
            r5.A0Q = r4
            r0 = r19
            r5.A0T = r0
            r11 = r20
            r5.A07 = r11
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r5.A0S = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r5.A06 = r0
            X.0sn r0 = X.0sn.A00
            r5.A05 = r0
            android.content.res.Resources r1 = r4.getResources()
            r5.A0R = r1
            com.instagram.reels.smb.model.ProfileStickerAiAgentData r14 = r11.A02
            if (r14 == 0) goto L_0x0037
            java.lang.String r0 = r14.A05
            if (r0 == 0) goto L_0x0037
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            r0 = r0 ^ 1
            r5.A0c = r0
            if (r14 == 0) goto L_0x0049
            java.lang.String r0 = r14.A03
            if (r0 == 0) goto L_0x0049
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            r0 = r0 ^ 1
            r5.A0b = r0
            r0 = 2131165259(0x7f07004b, float:1.794473E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A0L = r0
            r2 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r1.getDimensionPixelSize(r2)
            r5.A0M = r0
            int r0 = r1.getDimensionPixelSize(r2)
            r5.A0I = r0
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A0G = r0
            int r0 = X.AnonymousClass7TE.A0F(r1)
            r5.A0N = r0
            r2 = 2131165756(0x7f07023c, float:1.7945738E38)
            int r0 = r1.getDimensionPixelSize(r2)
            r5.A0O = r0
            int r0 = r1.getDimensionPixelSize(r2)
            r5.A0D = r0
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 3
            int r9 = r0 * 2
            r5.A0E = r9
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            r16 = 2131165220(0x7f070024, float:1.794465E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.6Ly r10 = X.AnonymousClass7TE.A0s(r4, r9)
            android.content.Context r8 = r10.A0Z
            X.0qQ.A07(r8)
            float r3 = (float) r0
            r7 = 0
            X.0qq r2 = X.AnonymousClass0qo.A00(r8)
            X.0qm r0 = X.0qm.A0r
            X.AnonymousClass7TE.A1X(r0, r2, r10)
            X.AJB.A0B(r10, r3, r7, r7)
            com.instagram.user.model.User r2 = r11.A03
            if (r2 == 0) goto L_0x01f1
            java.lang.String r0 = r2.getFullName()
        L_0x00b9:
            java.lang.String r13 = ""
            if (r0 != 0) goto L_0x00be
            r0 = r13
        L_0x00be:
            r10.A0M(r0)
            r12 = 2130970335(0x7f0406df, float:1.7549377E38)
            X.AnonymousClass7TG.A0y(r8, r10, r12)
            r5.A0X = r10
            int r0 = X.AnonymousClass7TH.A02(r10)
            r5.A0H = r0
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.6Ly r3 = X.AnonymousClass7TE.A0s(r4, r9)
            float r0 = (float) r0
            X.AJB.A0B(r3, r0, r7, r7)
            if (r14 == 0) goto L_0x00e4
            java.lang.String r0 = r14.A03
            if (r0 != 0) goto L_0x00e5
        L_0x00e4:
            r0 = r13
        L_0x00e5:
            r3.A0M(r0)
            java.lang.String r11 = "…"
            r3.A0G(r6, r11)
            android.content.Context r0 = r3.A0Z
            X.AnonymousClass7TG.A0y(r0, r3, r12)
            r5.A0Y = r3
            r6 = 2131165216(0x7f070020, float:1.7944643E38)
            int r0 = r1.getDimensionPixelSize(r6)
            X.6Ly r8 = X.AnonymousClass7TE.A0s(r4, r9)
            android.content.Context r3 = r8.A0Z
            X.0qQ.A07(r3)
            float r15 = (float) r0
            X.0qq r0 = X.AnonymousClass0qo.A00(r3)
            X.0qm r10 = X.0qm.A0q
            X.AnonymousClass7TE.A1X(r10, r0, r8)
            X.AJB.A0B(r8, r15, r7, r7)
            r15 = 2131952580(0x7f1303c4, float:1.9541607E38)
            if (r14 == 0) goto L_0x01ee
            java.lang.String r0 = r14.A02
        L_0x0118:
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r0, r15)
            r8.A0M(r0)
            int r0 = X.2Yu.A08(r3)
            X.AnonymousClass7TE.A1O(r3, r8, r0)
            r5.A0V = r8
            int r0 = X.AnonymousClass7TH.A02(r8)
            r5.A0B = r0
            int r0 = r1.getDimensionPixelSize(r6)
            X.6Ly r8 = X.AnonymousClass7TE.A0s(r4, r9)
            android.content.Context r6 = r8.A0Z
            X.0qQ.A07(r6)
            float r3 = (float) r0
            X.0qq r0 = X.AnonymousClass0qo.A00(r6)
            X.AnonymousClass7TE.A1X(r10, r0, r8)
            X.AJB.A0B(r8, r3, r7, r7)
            if (r14 == 0) goto L_0x014d
            java.lang.String r0 = r14.A05
            if (r0 == 0) goto L_0x014d
            r13 = r0
        L_0x014d:
            r8.A0M(r13)
            r0 = 4
            r8.A0G(r0, r11)
            X.AnonymousClass7TG.A0y(r6, r8, r12)
            r5.A0Z = r8
            int r0 = r8.A0A
            r5.A0P = r0
            r0 = r16
            int r0 = r1.getDimensionPixelSize(r0)
            X.6Ly r6 = X.AnonymousClass7TE.A0s(r4, r9)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT_BOLD
            float r0 = (float) r0
            r6.A0I(r3)
            X.AJB.A0B(r6, r0, r7, r7)
            r0 = 2131952579(0x7f1303c3, float:1.9541605E38)
            X.AnonymousClass7TE.A1P(r1, r6, r0)
            android.content.Context r3 = r6.A0Z
            r0 = 2130970224(0x7f040670, float:1.7549152E38)
            X.AnonymousClass7TG.A0y(r3, r6, r0)
            r5.A0W = r6
            int r0 = X.AnonymousClass7TH.A02(r6)
            r5.A0C = r0
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            int r0 = r0.widthPixels
            float r0 = (float) r0
            double r6 = (double) r0
            double r8 = A0d
            double r6 = r6 / r8
            int r0 = (int) r6
            r5.A0F = r0
            int r0 = X.AnonymousClass7TE.A0F(r1)
            float r0 = (float) r0
            r5.A08 = r0
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
            r5.A0A = r0
            r0 = 2131165185(0x7f070001, float:1.794458E38)
            int r9 = r1.getDimensionPixelSize(r0)
            r5.A0K = r9
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A0J = r0
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r0 = 2131099699(0x7f060033, float:1.7811759E38)
            int r11 = r4.getColor(r0)
            int r12 = r4.getColor(r0)
            if (r2 == 0) goto L_0x01ec
            com.instagram.common.typedurl.ImageUrl r7 = r2.Bh3()
        L_0x01ce:
            r8 = 0
            X.3ay r6 = new X.3ay
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.A0U = r6
            r0 = 2131165252(0x7f070044, float:1.7944716E38)
            float r3 = r1.getDimension(r0)
            r5.A09 = r3
            r2 = 2131099912(0x7f060108, float:1.781219E38)
            r1 = 48
            X.8jL r0 = new X.8jL
            r0.<init>(r4, r3, r2, r1)
            r5.A0a = r0
            return
        L_0x01ec:
            r7 = 0
            goto L_0x01ce
        L_0x01ee:
            r0 = 0
            goto L_0x0118
        L_0x01f1:
            r0 = 0
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389599pt.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.smb.model.ProfileStickerModel):void");
    }

    public final String C4F() {
        return "share_profile_sticker_id";
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setShadowLayer(this.A0A, 0.0f, 0.0f, AnonymousClass7TF.A03(this.A0Q, R.attr.igds_color_shadow_on_media));
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        RectF rectF = this.A0S;
        float f = this.A08;
        canvas.drawRoundRect(rectF, f, f, paint);
        this.A0U.draw(canvas);
        if (this.A0b) {
            RectF rectF2 = this.A06;
            float height = rectF2.height() / 2.0f;
            for (A5A a5a : this.A05) {
                PointF pointF = a5a.A01;
                canvas.drawCircle(pointF.x, pointF.y, a5a.A00, paint);
            }
            canvas.drawRoundRect(rectF2, height, height, paint);
            for (A5A a5a2 : this.A05) {
                PointF pointF2 = a5a2.A01;
                canvas.drawCircle(pointF2.x, pointF2.y, a5a2.A00, paint2);
            }
            this.A0Y.draw(canvas);
        }
        this.A0X.draw(canvas);
        this.A0V.draw(canvas);
        this.A0Z.draw(canvas);
        this.A0a.draw(canvas);
        this.A0W.draw(canvas);
    }

    public final List A07() {
        return 0sn.A00;
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A0L;
        int i3 = i2 + this.A0J + this.A0K + this.A0I + this.A0X.A06 + this.A0V.A06;
        if (this.A0c) {
            i = this.A0Z.A06 + this.A0O;
        } else {
            i = 0;
        }
        return i3 + i + this.A0N + this.A0a.getIntrinsicHeight() + this.A0D + this.A0W.A06 + i2;
    }

    public final int getIntrinsicWidth() {
        int i = this.A0B;
        int[] iArr = {this.A0H, this.A0P, this.A0C, this.A0F};
        int i2 = 0;
        do {
            i = Math.max(i, iArr[i2]);
            i2++;
        } while (i2 < 4);
        return i + (this.A0L * 2);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i4;
        int i7 = i3;
        super.setBounds(i, i5, i7, i6);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        this.A0S.set((float) i, (float) i5, (float) i7, (float) i6);
        int i8 = this.A0J + i2 + this.A0L;
        C244303ay r2 = this.A0U;
        int i9 = (int) f;
        int i10 = this.A0K;
        int i11 = i10 / 2;
        r2.setBounds(i9 - i11, i8, i11 + i9, i2 + i10);
        C306386Ly r3 = this.A0Y;
        int i12 = r3.A0A / 2;
        r3.setBounds(i9 - i12, i8, i12 + i9, r3.A06 + i8);
        RectF rectF = new RectF(AnonymousClass7TE.A0X(r3));
        RectF rectF2 = this.A06;
        float f3 = rectF.left;
        float f4 = (float) this.A0M;
        rectF2.set(f3 - f4, rectF.top - f4, rectF.right + f4, rectF.bottom + f4);
        float height = rectF2.height() / 4.0f;
        PointF pointF = new PointF(rectF2.left + (rectF2.width() * 0.4f), rectF2.bottom);
        float f5 = (2.0f * height) / 5.0f;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(height, height + f5);
        this.A05 = 0sr.A1P(new A5A[]{new A5A(pointF, height), new A5A(pointF2, f5)});
        int i13 = this.A0H / 2;
        int i14 = i8 + i10 + this.A0I;
        C306386Ly r1 = this.A0X;
        int i15 = r1.A06 + i14 + this.A0G;
        r1.setBounds(i9 - i13, i14, i13 + i9, i15);
        int i16 = this.A0B / 2;
        C306386Ly r12 = this.A0V;
        int i17 = r12.A06 + i15 + this.A0N;
        r12.setBounds(i9 - i16, i15, i16 + i9, i17);
        int min = Math.min(this.A0P, this.A0E) / 2;
        C306386Ly r22 = this.A0Z;
        int i18 = r22.A06 + i17 + this.A0O;
        r22.setBounds(i9 - min, i17, min + i9, i18);
        if (this.A0c) {
            i17 = i18;
        }
        int i19 = i3 - i;
        C363208jL r32 = this.A0a;
        r32.setBounds(i, i17, i19 + i, ((int) this.A09) + i17);
        int i20 = this.A0C / 2;
        int i21 = i9 - i20;
        int i22 = r32.getBounds().bottom + this.A0D;
        int i23 = i9 + i20;
        C306386Ly r0 = this.A0W;
        int i24 = r0.A06 + i22;
        r0.setBounds(i21, i22, i23, i24);
        float f6 = (float) i19;
        this.A01 = f / f6;
        float f7 = (float) (i4 - i3);
        this.A02 = f2 / f7;
        float f8 = ((float) (i24 - i22)) / f7;
        this.A00 = f8;
        this.A04 = ((float) (i23 - i21)) / f6;
        this.A03 = f8;
    }
}
