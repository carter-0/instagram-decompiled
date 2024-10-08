package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.instagram.android.R;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9pr  reason: invalid class name and case insensitive filesystem */
public final class C389579pr extends C299875vz implements C41816B1w, C300645xY {
    public static final double A0Y = ((1.0d + Math.sqrt(5.0d)) / 2.0d);
    public boolean A00;
    public final ProfileStickerModel A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
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
    public final Context A0N;
    public final Resources A0O;
    public final RectF A0P = AnonymousClass7TE.A0Y();
    public final 0lg A0Q;
    public final C244303ay A0R;
    public final C306386Ly A0S;
    public final C306386Ly A0T;
    public final C306386Ly A0U;
    public final C306386Ly A0V;
    public final C363208jL A0W;
    public final C59985Jcu[] A0X;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009a, code lost:
        if (r1 != null) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C389579pr(android.content.Context r26, X.0lg r27, com.instagram.reels.smb.model.ProfileStickerModel r28) {
        /*
            r25 = this;
            r11 = 1
            r10 = 2
            r5 = r25
            r5.<init>()
            r1 = r26
            r5.A0N = r1
            r0 = r27
            r5.A0Q = r0
            r3 = r28
            r5.A01 = r3
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r5.A0P = r0
            android.content.res.Resources r2 = r1.getResources()
            r5.A0O = r2
            r0 = 2131165547(0x7f07016b, float:1.7945314E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r5.A0C = r0
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r5.A0B = r0
            int r0 = X.AnonymousClass7TE.A0B(r2)
            r5.A0I = r0
            int r0 = X.AnonymousClass7TE.A0D(r2)
            r5.A0F = r0
            int r0 = X.AnonymousClass7TE.A0F(r2)
            r5.A0J = r0
            r1 = 2131165756(0x7f07023c, float:1.7945738E38)
            int r0 = r2.getDimensionPixelSize(r1)
            r5.A05 = r0
            int r0 = r2.getDimensionPixelSize(r1)
            r5.A0M = r0
            X.JwE[] r9 = r3.A00
            r19 = 0
            r0 = 0
            if (r9 == 0) goto L_0x009d
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            int r7 = r9.length
            r6 = 0
        L_0x005f:
            if (r6 >= r7) goto L_0x0092
            r1 = r9[r6]
            if (r1 == 0) goto L_0x008f
            java.lang.Object r4 = r1.A00
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto L_0x008f
            int r13 = r4.getWidth()
            int r14 = r4.getHeight()
            int r15 = r5.A0C
            boolean r1 = X.1MF.A02
            android.graphics.Matrix r12 = X.AnonymousClass7TE.A0U()
            r16 = r15
            r18 = r0
            r17 = r0
            X.1MF.A0J(r12, r13, r14, r15, r16, r17, r18)
            r3 = 0
            r2 = 15
            X.Jcu r1 = new X.Jcu
            r1.<init>(r4, r12, r3, r2)
            r8.add(r1)
        L_0x008f:
            int r6 = r6 + 1
            goto L_0x005f
        L_0x0092:
            X.Jcu[] r1 = new X.C59985Jcu[r0]
            java.lang.Object[] r1 = r8.toArray(r1)
            X.Jcu[] r1 = (X.C59985Jcu[]) r1
            if (r1 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            X.Jcu[] r1 = new X.C59985Jcu[r0]
        L_0x009f:
            r5.A0X = r1
            int r3 = r1.length
            int r1 = r5.A0C
            int r2 = r3 * r1
            int r3 = r3 - r11
            int r1 = r5.A0B
            int r3 = r3 * r1
            int r2 = r2 + r3
            r5.A0A = r2
            android.content.res.Resources r1 = r5.A0O
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 / r10
            int r3 = java.lang.Math.max(r1, r2)
            int r1 = r5.A0I
            int r1 = r1 * 2
            int r3 = r3 - r1
            r5.A0D = r3
            android.content.res.Resources r2 = r5.A0O
            r1 = 2131165572(0x7f070184, float:1.7945365E38)
            r4 = 2131165572(0x7f070184, float:1.7945365E38)
            int r6 = r2.getDimensionPixelSize(r1)
            android.content.Context r1 = r5.A0N
            X.6Ly r7 = X.AnonymousClass7TE.A0s(r1, r3)
            android.content.Context r2 = r7.A0Z
            X.0qQ.A07(r2)
            float r1 = (float) r6
            r6 = 0
            X.AJB.A06(r2, r7, r1, r6)
            com.instagram.reels.smb.model.ProfileStickerModel r1 = r5.A01
            com.instagram.user.model.User r1 = r1.A03
            if (r1 == 0) goto L_0x01c0
            java.lang.String r1 = r1.getFullName()
        L_0x00e7:
            java.lang.String r8 = ""
            if (r1 != 0) goto L_0x00ec
            r1 = r8
        L_0x00ec:
            r7.A0M(r1)
            r1 = 2131099659(0x7f06000b, float:1.7811677E38)
            X.AnonymousClass7TE.A1O(r2, r7, r1)
            r5.A0T = r7
            int r1 = X.AnonymousClass7TH.A02(r7)
            r5.A0E = r1
            android.content.res.Resources r2 = r5.A0O
            r1 = 2131165249(0x7f070041, float:1.794471E38)
            int r2 = r2.getDimensionPixelSize(r1)
            android.content.Context r1 = r5.A0N
            X.6Ly r9 = X.AnonymousClass7TE.A0s(r1, r3)
            android.content.Context r7 = r9.A0Z
            X.0qQ.A07(r7)
            float r2 = (float) r2
            X.AnonymousClass7TG.A1N(r7, r9)
            android.graphics.Typeface r1 = X.AnonymousClass7TG.A0O(r7)
            r9.A0I(r1)
            X.AJB.A0B(r9, r2, r6, r6)
            r2 = 64
            com.instagram.reels.smb.model.ProfileStickerModel r1 = r5.A01
            com.instagram.user.model.User r1 = r1.A03
            if (r1 == 0) goto L_0x01bc
            java.lang.String r1 = r1.getUsername()
        L_0x012b:
            java.lang.String r1 = X.002.A0D(r1, r2)
            r9.A0M(r1)
            r1 = 2131099910(0x7f060106, float:1.7812187E38)
            X.AnonymousClass7TE.A1O(r7, r9, r1)
            r5.A0U = r9
            int r1 = X.AnonymousClass7TH.A02(r9)
            r5.A0K = r1
            android.content.res.Resources r2 = r5.A0O
            r1 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r2 = r2.getDimensionPixelSize(r1)
            android.content.Context r1 = r5.A0N
            X.6Ly r3 = X.AnonymousClass7TE.A0s(r1, r3)
            android.content.Context r7 = r3.A0Z
            X.0qQ.A07(r7)
            float r2 = (float) r2
            X.AnonymousClass7TG.A1N(r7, r3)
            android.graphics.Typeface r1 = X.AnonymousClass7TG.A0O(r7)
            r3.A0I(r1)
            X.AJB.A0B(r3, r2, r6, r6)
            com.instagram.reels.smb.model.ProfileStickerModel r1 = r5.A01
            com.instagram.user.model.User r1 = r1.A03
            if (r1 == 0) goto L_0x016f
            java.lang.String r1 = r1.A0O()
            if (r1 == 0) goto L_0x016f
            r8 = r1
        L_0x016f:
            r3.A0M(r8)
            r8 = 4
            java.lang.String r1 = "…"
            r3.A0G(r8, r1)
            r1 = 2131099659(0x7f06000b, float:1.7811677E38)
            X.AnonymousClass7TE.A1O(r7, r3, r1)
            r5.A0S = r3
            android.text.Spannable r2 = r3.A0F
            X.0qQ.A07(r2)
            java.lang.String r1 = "\n"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r20 = 0
            java.util.List r1 = X.00l.A0R(r2, r1, r0)
            java.util.Iterator r7 = r1.iterator()
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x02c5
            java.lang.String r2 = X.AnonymousClass7TE.A18(r7)
            android.text.TextPaint r1 = r3.A0b
            float r3 = r1.measureText(r2)
        L_0x01a5:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01c4
            java.lang.String r2 = X.AnonymousClass7TE.A18(r7)
            X.6Ly r1 = r5.A0S
            android.text.TextPaint r1 = r1.A0b
            float r1 = r1.measureText(r2)
            float r3 = java.lang.Math.max(r3, r1)
            goto L_0x01a5
        L_0x01bc:
            r1 = r19
            goto L_0x012b
        L_0x01c0:
            r1 = r19
            goto L_0x00e7
        L_0x01c4:
            int r10 = (int) r3
            r5.A06 = r10
            android.content.res.Resources r1 = r5.A0O
            int r3 = r1.getDimensionPixelSize(r4)
            android.content.Context r2 = r5.A0N
            int r1 = r5.A0D
            X.6Ly r2 = X.AnonymousClass7TE.A0s(r2, r1)
            android.content.Context r4 = r2.A0Z
            X.0qQ.A07(r4)
            float r1 = (float) r3
            X.AJB.A06(r4, r2, r1, r6)
            android.content.res.Resources r3 = r5.A0O
            r1 = 2131973519(0x7f13558f, float:1.9584076E38)
            X.AnonymousClass7TE.A1P(r3, r2, r1)
            int r1 = X.2Yu.A0D(r4)
            X.AnonymousClass7TE.A1O(r4, r2, r1)
            r5.A0V = r2
            int r9 = X.AnonymousClass7TH.A02(r2)
            r5.A0L = r9
            android.content.res.Resources r1 = r5.A0O
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            double r3 = (double) r1
            double r6 = A0Y
            double r3 = r3 / r6
            int r7 = (int) r3
            int r6 = r5.A0K
            int r1 = r5.A0E
            int[] r4 = new int[]{r1, r10, r9, r7}
            r3 = 0
        L_0x020c:
            r1 = r4[r3]
            int r6 = java.lang.Math.max(r6, r1)
            int r3 = r3 + 1
            if (r3 < r8) goto L_0x020c
            int r1 = r5.A0I
            int r1 = r1 * 2
            int r6 = r6 + r1
            r5.A08 = r6
            android.content.res.Resources r3 = r5.A0O
            r1 = 2131165203(0x7f070013, float:1.7944616E38)
            float r1 = X.AnonymousClass7TE.A01(r3, r1)
            r5.A02 = r1
            android.content.res.Resources r3 = r5.A0O
            r1 = 2131165243(0x7f07003b, float:1.7944698E38)
            float r1 = X.AnonymousClass7TE.A01(r3, r1)
            r5.A04 = r1
            android.content.res.Resources r3 = r5.A0O
            r1 = 2131165498(0x7f07013a, float:1.7945215E38)
            int r6 = r3.getDimensionPixelSize(r1)
            r5.A0H = r6
            int r4 = r6 / 2
            r5.A0G = r4
            android.content.res.Resources r3 = r5.A0O
            r1 = 2131165200(0x7f070010, float:1.794461E38)
            int r22 = r3.getDimensionPixelSize(r1)
            android.content.Context r1 = r5.A0N
            r3 = 2131099699(0x7f060033, float:1.7811759E38)
            int r23 = r1.getColor(r3)
            android.content.Context r1 = r5.A0N
            int r24 = r1.getColor(r3)
            com.instagram.reels.smb.model.ProfileStickerModel r1 = r5.A01
            com.instagram.user.model.User r1 = r1.A03
            if (r1 == 0) goto L_0x0264
            com.instagram.common.typedurl.ImageUrl r19 = r1.Bh3()
        L_0x0264:
            X.3ay r1 = new X.3ay
            r18 = r1
            r21 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r5.A0R = r1
            int r3 = r4 * 2
            X.6Ly r1 = r5.A0T
            int r1 = r1.A06
            int r3 = r3 + r1
            int r1 = r5.A0F
            int r3 = r3 + r1
            X.6Ly r1 = r5.A0U
            int r1 = r1.A06
            int r3 = r3 + r1
            com.instagram.reels.smb.model.ProfileStickerModel r1 = r5.A01
            com.instagram.user.model.User r1 = r1.A03
            if (r1 == 0) goto L_0x0297
            java.lang.String r1 = r1.A0O()
            if (r1 == 0) goto L_0x0297
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0297
            X.6Ly r0 = r5.A0S
            int r1 = r0.A06
            int r0 = r5.A05
            int r0 = r0 + r1
        L_0x0297:
            int r3 = r3 + r0
            int r0 = r5.A0J
            int r3 = r3 + r0
            int r0 = r2.A06
            int r3 = r3 + r0
            int r0 = r5.A0M
            int r3 = r3 + r0
            int r0 = r5.A0I
            int r3 = r3 + r0
            r5.A07 = r3
            int r0 = r5.A0C
            int r3 = r3 + r0
            r5.A09 = r3
            android.content.res.Resources r1 = r5.A0O
            r0 = 2131165252(0x7f070044, float:1.7944716E38)
            float r4 = r1.getDimension(r0)
            r5.A03 = r4
            android.content.Context r3 = r5.A0N
            r2 = 2131099912(0x7f060108, float:1.781219E38)
            r1 = 48
            X.8jL r0 = new X.8jL
            r0.<init>(r3, r4, r2, r1)
            r5.A0W = r0
            return
        L_0x02c5:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389579pr.<init>(android.content.Context, X.0lg, com.instagram.reels.smb.model.ProfileStickerModel):void");
    }

    public final String C4F() {
        return "share_profile_sticker_id";
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setShadowLayer(this.A04, 0.0f, 0.0f, AnonymousClass7TF.A03(this.A0N, R.attr.igds_color_shadow_on_media));
        RectF rectF = this.A0P;
        float f = this.A02;
        canvas.drawRoundRect(rectF, f, f, paint);
        this.A0R.draw(canvas);
        this.A0T.draw(canvas);
        this.A0U.draw(canvas);
        this.A0S.draw(canvas);
        if (this.A00) {
            this.A0W.draw(canvas);
        } else {
            canvas.save();
            for (C59985Jcu draw : this.A0X) {
                draw.draw(canvas);
                canvas.translate((float) (this.A0C + this.A0B), 0.0f);
            }
            canvas.restore();
        }
        this.A0V.draw(canvas);
    }

    public final List A07() {
        return 0sn.A00;
    }

    public final /* synthetic */ int BRc() {
        return 1;
    }

    public final List BRk() {
        List A1I = AnonymousClass7TE.A1I(this.A01.A03);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A1I) {
            if (next != null) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public final int getIntrinsicHeight() {
        if (this.A00) {
            return this.A07;
        }
        return this.A09;
    }

    public final int getIntrinsicWidth() {
        if (this.A00) {
            return this.A08;
        }
        return this.A0A;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        String A0O2;
        super.setBounds(i, i2, i3, i4);
        int i5 = this.A0G;
        int i6 = i5 + i2;
        this.A0P.set((float) i, (float) i6, (float) i3, (float) i4);
        C244303ay r4 = this.A0R;
        int i7 = (int) (((float) (i + i3)) / 2.0f);
        int i8 = this.A0H;
        int i9 = i8 / 2;
        r4.setBounds(i7 - i9, i2, i9 + i7, i8 + i2);
        int i10 = this.A0E / 2;
        int i11 = i6 + i5 + this.A0F;
        C306386Ly r0 = this.A0T;
        int i12 = r0.A06 + i11;
        r0.setBounds(i7 - i10, i11, i10 + i7, i12);
        int i13 = this.A0K / 2;
        C306386Ly r1 = this.A0U;
        int i14 = r1.A06 + i12 + this.A0J;
        r1.setBounds(i7 - i13, i12, i13 + i7, i14);
        int min = Math.min(this.A06, this.A0D) / 2;
        C306386Ly r2 = this.A0S;
        int i15 = r2.A06 + i14 + this.A05;
        r2.setBounds(i7 - min, i14, min + i7, i15);
        User user = this.A01.A03;
        if (!(user == null || (A0O2 = user.A0O()) == null || A0O2.length() <= 0)) {
            i14 = i15;
        }
        if (this.A00) {
            this.A0W.setBounds(i, i14, i3, ((int) this.A03) + i14);
        } else {
            int i16 = this.A0C;
            int i17 = i + i16;
            int i18 = i16 + i14;
            for (C59985Jcu bounds : this.A0X) {
                bounds.setBounds(i, i14, i17, i18);
            }
        }
        int i19 = this.A0L / 2;
        int i20 = i7 - i19;
        if (!this.A00) {
            i14 += this.A0C;
        }
        int i21 = i14 + this.A0M;
        int i22 = i7 + i19;
        C306386Ly r12 = this.A0V;
        r12.setBounds(i20, i21, i22, r12.A06 + i21);
    }
}
