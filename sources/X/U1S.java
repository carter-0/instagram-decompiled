package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;

public final class U1S extends Drawable implements Drawable.Callback, C3724991d {
    public int A00 = 255;
    public ReelsVisualRepliesModel A01;
    public int A02 = -1;
    public C244303ay A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final GradientDrawable A0C;
    public final UserSession A0D;
    public final V2I A0E;
    public final C14272Tsv A0F;
    public final C306386Ly A0G;
    public final C306386Ly A0H;
    public final boolean A0I;

    public final void draw(Canvas canvas) {
        String str;
        0qQ.A0B(canvas, 0);
        0qQ.A07(getBounds());
        int i = this.A02;
        if (i == -1 || i != this.A00) {
            C306386Ly r4 = this.A0G;
            MediaVCRTappableData mediaVCRTappableData = this.A01.A00;
            if (mediaVCRTappableData != null) {
                str = mediaVCRTappableData.A05;
            } else {
                str = null;
            }
            r4.A0L(A00(this.A0B, this.A0D, this.A0F, str));
            this.A02 = this.A00;
        }
        this.A0C.draw(canvas);
        C244303ay r0 = this.A03;
        if (r0 != null) {
            r0.draw(canvas);
        }
        this.A0H.draw(canvas);
        this.A0G.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d3, code lost:
        if (r14 != 9) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0122, code lost:
        if (r1 != 9) goto L_0x0124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U1S(android.content.Context r26, com.instagram.common.session.UserSession r27, com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r28, X.V2I r29) {
        /*
            r25 = this;
            r20 = 1
            r10 = r25
            r10.<init>()
            r12 = r26
            r10.A0B = r12
            r0 = r28
            r10.A01 = r0
            r1 = r27
            r10.A0D = r1
            r11 = r29
            r10.A0E = r11
            r2 = -1
            r10.A02 = r2
            r0 = 255(0xff, float:3.57E-43)
            r10.A00 = r0
            android.content.res.Resources r9 = r12.getResources()
            int r19 = X.JTP.A03(r9)
            r0 = r19
            r10.A0A = r0
            r3 = 2131165184(0x7f070000, float:1.7944578E38)
            int r13 = r9.getDimensionPixelSize(r3)
            r10.A06 = r13
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r8 = r9.getDimensionPixelOffset(r0)
            r10.A07 = r8
            int r7 = r9.getDimensionPixelSize(r3)
            r10.A08 = r7
            X.UkV r6 = X.C15905UkV.A00
            boolean r0 = r11.equals(r6)
            if (r0 == 0) goto L_0x01e1
            r0 = 2131165287(0x7f070067, float:1.7944787E38)
        L_0x004c:
            int r18 = r9.getDimensionPixelSize(r0)
            r0 = r18
            r10.A04 = r0
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r10.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = r0.A08
        L_0x005c:
            int r17 = X.0nH.A0C(r0, r2)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r10.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x01db
            java.lang.String r0 = r0.A03
        L_0x0068:
            int r16 = X.0nH.A0C(r0, r2)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r10.A01
            com.instagram.api.schemas.MediaVCRTappableData r2 = r0.A00
            if (r2 == 0) goto L_0x01d7
            java.lang.String r0 = r2.A08
            r3 = 0
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x01d7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            X.Tsv r5 = X.C14276Tsz.A01(r3, r2, r0)
        L_0x0087:
            r10.A0F = r5
            boolean r0 = X.0mk.A02(r12)
            r10.A0I = r0
            boolean r0 = r11.equals(r6)
            if (r0 == 0) goto L_0x01c6
            android.content.res.Resources r2 = r12.getResources()
            r0 = 2131165495(0x7f070137, float:1.7945209E38)
        L_0x009c:
            int r4 = r2.getDimensionPixelSize(r0)
            X.6Ly r3 = new X.6Ly
            r3.<init>(r12, r4)
            r10.A0G = r3
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r10.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = r0.A05
        L_0x00af:
            android.text.SpannableStringBuilder r0 = r10.A00(r12, r1, r5, r0)
            r3.A0L(r0)
            boolean r0 = r11.equals(r6)
            if (r0 == 0) goto L_0x01b6
            r0 = 2131165306(0x7f07007a, float:1.7944825E38)
        L_0x00bf:
            X.AnonymousClass7TF.A11(r9, r3, r0)
            java.lang.String r2 = "…"
            r1 = 5
            r3.A0G(r1, r2)
            if (r5 == 0) goto L_0x00d5
            int r14 = r5.ordinal()
            r0 = 9
            r15 = 2130970335(0x7f0406df, float:1.7549377E38)
            if (r14 == r0) goto L_0x00d8
        L_0x00d5:
            r15 = 2130970279(0x7f0406a7, float:1.7549264E38)
        L_0x00d8:
            X.AnonymousClass7TG.A0y(r12, r3, r15)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r3.A0K(r0)
            r0 = r20
            r3.A0O = r0
            r15 = 2131956400(0x7f1312b0, float:1.9549355E38)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r10.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x01b2
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x01b2
            java.lang.String r14 = r0.getUsername()
        L_0x00f5:
            r22 = 0
            java.lang.String r15 = X.AnonymousClass7TF.A0e(r9, r14, r15)
            X.0qQ.A07(r15)
            X.6Ly r14 = new X.6Ly
            r14.<init>(r12, r4)
            r10.A0H = r14
            boolean r0 = r11.equals(r6)
            if (r0 == 0) goto L_0x01a5
            r0 = 2131165308(0x7f07007c, float:1.794483E38)
        L_0x010e:
            X.AnonymousClass7TF.A11(r9, r14, r0)
            r14.A0M(r15)
            r14.A0G(r1, r2)
            if (r5 == 0) goto L_0x0124
            int r1 = r5.ordinal()
            r0 = 9
            r2 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r1 == r0) goto L_0x0127
        L_0x0124:
            r2 = 2130970279(0x7f0406a7, float:1.7549264E38)
        L_0x0127:
            X.AnonymousClass7TG.A0y(r12, r14, r2)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            r14.A0K(r0)
            int r1 = r3.A0A
            int r0 = r14.A0A
            int r1 = java.lang.Math.max(r1, r0)
            int r0 = r13 * 2
            int r1 = r1 + r0
            int r1 = r1 + r8
            int r1 = r1 + r18
            r10.A09 = r1
            int r1 = r3.A06
            int r0 = r14.A06
            int r1 = r1 + r0
            int r0 = r7 * 2
            int r1 = r1 + r0
            int r1 = r1 + r19
            r10.A05 = r1
            if (r5 == 0) goto L_0x019c
            int[] r3 = X.C14276Tsz.A02(r5)
        L_0x0151:
            r0 = 2131239993(0x7f082439, float:1.8096309E38)
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r12, r0)
            if (r0 == 0) goto L_0x019a
            android.graphics.drawable.Drawable r2 = r0.mutate()
        L_0x015e:
            r0 = 0
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r0)
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            r10.A0C = r2
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            r2.setOrientation(r0)
            r1 = r3[r22]
            r0 = r3[r20]
            int[] r0 = new int[]{r1, r0}
            r2.setColors(r0)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r10.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x0199
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x0199
            com.instagram.common.typedurl.ImageUrl r19 = r0.Bh3()
            java.lang.String r20 = "CommentShareDrawable"
            X.3ay r0 = new X.3ay
            r21 = r18
            r23 = r22
            r24 = r22
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r10.A03 = r0
        L_0x0199:
            return
        L_0x019a:
            r2 = 0
            goto L_0x015e
        L_0x019c:
            r1 = r17
            r0 = r16
            int[] r3 = new int[]{r1, r0}
            goto L_0x0151
        L_0x01a5:
            X.UkW r0 = X.C15906UkW.A00
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01ee
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            goto L_0x010e
        L_0x01b2:
            java.lang.String r14 = ""
            goto L_0x00f5
        L_0x01b6:
            X.UkW r0 = X.C15906UkW.A00
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01f4
            r0 = 2131165305(0x7f070079, float:1.7944823E38)
            goto L_0x00bf
        L_0x01c3:
            r0 = 0
            goto L_0x00af
        L_0x01c6:
            X.UkW r0 = X.C15906UkW.A00
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01fa
            android.content.res.Resources r2 = r12.getResources()
            r0 = 2131165226(0x7f07002a, float:1.7944663E38)
            goto L_0x009c
        L_0x01d7:
            X.Tsv r5 = X.C14272Tsv.SOLID_WHITE
            goto L_0x0087
        L_0x01db:
            r0 = 0
            goto L_0x0068
        L_0x01de:
            r0 = 0
            goto L_0x005c
        L_0x01e1:
            X.UkW r0 = X.C15906UkW.A00
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0200
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            goto L_0x004c
        L_0x01ee:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01f4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01fa:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0200:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1S.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel, X.V2I):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 != 9) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.text.SpannableStringBuilder A00(android.content.Context r5, com.instagram.common.session.UserSession r6, X.C14272Tsv r7, java.lang.String r8) {
        /*
            r4 = this;
            if (r8 != 0) goto L_0x0004
            java.lang.String r8 = ""
        L_0x0004:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r8)
            if (r7 == 0) goto L_0x0016
            int r1 = r7.ordinal()
            r0 = 9
            r2 = 2130970249(0x7f040689, float:1.7549203E38)
            if (r1 == r0) goto L_0x0019
        L_0x0016:
            r2 = 2130970279(0x7f0406a7, float:1.7549264E38)
        L_0x0019:
            int r2 = X.AnonymousClass7TF.A03(r5, r2)
            int r0 = r4.A00
            float r1 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r0
            int r2 = X.0nH.A07(r2, r1)
            X.3q3 r1 = new X.3q3
            r1.<init>(r3, r6)
            r1.A01 = r2
            r0 = 0
            r1.A03(r0)
            r1.A03 = r2
            r1.A02(r0)
            android.text.SpannableStringBuilder r0 = r1.A00()
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1S.A00(android.content.Context, com.instagram.common.session.UserSession, X.Tsv, java.lang.String):android.text.SpannableStringBuilder");
    }

    public final void Dre(int i, int i2) {
        ReelsVisualRepliesModel reelsVisualRepliesModel = this.A01;
        reelsVisualRepliesModel.A02(Float.valueOf((float) i));
        reelsVisualRepliesModel.A01(Float.valueOf((float) i2));
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A09;
    }

    public final void setAlpha(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A0C.setAlpha(i);
            this.A0G.setAlpha(i);
            this.A0H.setAlpha(i);
            C244303ay r0 = this.A03;
            if (r0 != null) {
                r0.setAlpha(i);
            }
            invalidateSelf();
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        super.setBounds(i9, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        int i10 = this.A09;
        float f3 = ((float) i10) / 2.0f;
        float f4 = f - f3;
        float f5 = ((float) this.A05) / 2.0f;
        float f6 = f2 - f5;
        float f7 = f + f3;
        float f8 = f2 + f5;
        boolean z = this.A0I;
        if (z) {
            i5 = this.A06;
            i6 = (((int) f7) - i5) - this.A04;
        } else {
            i5 = this.A06;
            i6 = ((int) f4) + i5;
        }
        int i11 = (int) f6;
        int i12 = i11 + this.A08;
        int i13 = this.A04;
        int i14 = i6 + i13;
        int i15 = i12 + i13;
        int i16 = (int) f4;
        int i17 = i16;
        if (z) {
            i7 = i5;
        } else {
            i16 = i16 + i5 + i13;
            i7 = this.A07;
        }
        int i18 = i16 + i7;
        C306386Ly r9 = this.A0H;
        int i19 = r9.A0A;
        int i20 = i19 + i18;
        int i21 = r9.A06 + i12;
        if (z) {
            i8 = ((((i10 - (i5 * 2)) - i13) - this.A07) - i19) + i18;
        } else {
            i8 = i18;
        }
        int i22 = this.A0A + i21;
        C306386Ly r6 = this.A0G;
        this.A0C.setBounds(i17, i11, (int) f7, (int) f8);
        r6.setBounds(i8, i22, r6.A0A + i8, r6.A06 + i22);
        r9.setBounds(i18, i12, i20, i21);
        C244303ay r2 = this.A03;
        if (r2 != null) {
            r2.setBounds(i6, i12, i14, i15);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass7TG.A10(colorFilter, this.A0G);
        AnonymousClass7TG.A10(colorFilter, this.A0H);
        C13989Tnp.A11(colorFilter, this.A03);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
