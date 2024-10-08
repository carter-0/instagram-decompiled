package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;

public final class U1R extends Drawable implements Drawable.Callback, C3724991d {
    public int A00 = 255;
    public ReelsVisualRepliesModel A01;
    public int A02 = -1;
    public GradientDrawable A03;
    public C244303ay A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final UserSession A0D;
    public final C14272Tsv A0E;
    public final C306386Ly A0F;
    public final C306386Ly A0G;
    public final boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bb, code lost:
        if (r1 != 9) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0101, code lost:
        if (r2 != 9) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U1R(android.content.Context r20, com.instagram.common.session.UserSession r21, com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r22) {
        /*
            r19 = this;
            r8 = 1
            r6 = r19
            r6.<init>()
            r9 = r20
            r6.A0C = r9
            r0 = r22
            r6.A01 = r0
            r2 = r21
            r6.A0D = r2
            r1 = -1
            r6.A02 = r1
            r0 = 255(0xff, float:3.57E-43)
            r6.A00 = r0
            android.content.res.Resources r11 = r9.getResources()
            int r10 = X.AnonymousClass7TE.A0D(r11)
            r6.A0B = r10
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r7 = r11.getDimensionPixelSize(r0)
            r6.A07 = r7
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
            int r5 = r11.getDimensionPixelOffset(r3)
            r6.A08 = r5
            int r4 = r11.getDimensionPixelSize(r0)
            r6.A09 = r4
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r18 = r11.getDimensionPixelSize(r0)
            r0 = r18
            r6.A05 = r0
            r11.getDimensionPixelSize(r3)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r6.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x0193
            java.lang.String r0 = r0.A08
        L_0x0050:
            int r17 = X.0nH.A0C(r0, r1)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r6.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r0.A03
        L_0x005c:
            int r16 = X.0nH.A0C(r0, r1)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r6.A01
            com.instagram.api.schemas.MediaVCRTappableData r1 = r0.A00
            if (r1 == 0) goto L_0x018c
            java.lang.String r0 = r1.A08
            r3 = 0
            if (r0 == 0) goto L_0x018c
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x018c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            X.Tsv r14 = X.C14276Tsz.A01(r3, r1, r0)
        L_0x007b:
            r6.A0E = r14
            boolean r0 = X.0mk.A02(r9)
            r6.A0H = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r13 = r1.getDimensionPixelSize(r0)
            X.6Ly r12 = new X.6Ly
            r12.<init>(r9, r13)
            r6.A0F = r12
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r6.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = r0.A05
        L_0x009d:
            android.text.SpannableStringBuilder r0 = r6.A00(r9, r2, r14, r0)
            r12.A0L(r0)
            r0 = 2131165305(0x7f070079, float:1.7944823E38)
            X.AnonymousClass7TF.A11(r11, r12, r0)
            java.lang.String r3 = "…"
            r2 = 5
            r12.A0G(r2, r3)
            if (r14 == 0) goto L_0x00bd
            int r1 = r14.ordinal()
            r0 = 9
            r15 = 2130970335(0x7f0406df, float:1.7549377E38)
            if (r1 == r0) goto L_0x00c0
        L_0x00bd:
            r15 = 2130970279(0x7f0406a7, float:1.7549264E38)
        L_0x00c0:
            X.AnonymousClass7TG.A0y(r9, r12, r15)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r12.A0K(r0)
            r12.A0O = r8
            r1 = 2131976702(0x7f1361fe, float:1.9590532E38)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r6.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x0185
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = r0.getUsername()
        L_0x00db:
            r15 = 0
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r11, r0, r1)
            X.0qQ.A07(r0)
            X.6Ly r1 = new X.6Ly
            r1.<init>(r9, r13)
            r6.A0G = r1
            r13 = 2131165249(0x7f070041, float:1.794471E38)
            X.AnonymousClass7TF.A11(r11, r1, r13)
            r1.A0M(r0)
            r1.A0G(r2, r3)
            if (r14 == 0) goto L_0x0103
            int r2 = r14.ordinal()
            r0 = 9
            r3 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r2 == r0) goto L_0x0106
        L_0x0103:
            r3 = 2130970279(0x7f0406a7, float:1.7549264E38)
        L_0x0106:
            X.AnonymousClass7TG.A0y(r9, r1, r3)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            r1.A0K(r0)
            int r2 = r12.A0A
            int r0 = r1.A0A
            int r2 = java.lang.Math.max(r2, r0)
            int r0 = r7 * 2
            int r2 = r2 + r0
            int r2 = r2 + r5
            int r2 = r2 + r18
            r6.A0A = r2
            int r2 = r12.A06
            int r0 = r1.A06
            int r2 = r2 + r0
            int r0 = r4 * 2
            int r2 = r2 + r0
            int r2 = r2 + r10
            r6.A06 = r2
            if (r14 == 0) goto L_0x017c
            int[] r3 = X.C14276Tsz.A02(r14)
        L_0x012f:
            r0 = 2131239993(0x7f082439, float:1.8096309E38)
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r9, r0)
            if (r0 == 0) goto L_0x017a
            android.graphics.drawable.Drawable r1 = r0.mutate()
        L_0x013c:
            boolean r0 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x0178
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
        L_0x0142:
            r6.A03 = r1
            if (r1 == 0) goto L_0x014b
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            r1.setOrientation(r0)
        L_0x014b:
            android.graphics.drawable.GradientDrawable r2 = r6.A03
            if (r2 == 0) goto L_0x015a
            r1 = r3[r15]
            r0 = r3[r8]
            int[] r0 = new int[]{r1, r0}
            r2.setColors(r0)
        L_0x015a:
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = r6.A01
            com.instagram.api.schemas.MediaVCRTappableData r0 = r0.A00
            if (r0 == 0) goto L_0x0177
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x0177
            com.instagram.common.typedurl.ImageUrl r12 = r0.Bh3()
            java.lang.String r13 = "ReelsVisualRepliesDrawable"
            X.3ay r11 = new X.3ay
            r14 = r18
            r16 = r15
            r17 = r15
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6.A04 = r11
        L_0x0177:
            return
        L_0x0178:
            r1 = 0
            goto L_0x0142
        L_0x017a:
            r1 = 0
            goto L_0x013c
        L_0x017c:
            r1 = r17
            r0 = r16
            int[] r3 = new int[]{r1, r0}
            goto L_0x012f
        L_0x0185:
            java.lang.String r0 = ""
            goto L_0x00db
        L_0x0189:
            r0 = 0
            goto L_0x009d
        L_0x018c:
            X.Tsv r14 = X.C14272Tsv.SOLID_WHITE
            goto L_0x007b
        L_0x0190:
            r0 = 0
            goto L_0x005c
        L_0x0193:
            r0 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1R.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel):void");
    }

    public final void draw(Canvas canvas) {
        String str;
        0qQ.A0B(canvas, 0);
        0qQ.A07(getBounds());
        int i = this.A02;
        if (i == -1 || i != this.A00) {
            C306386Ly r4 = this.A0F;
            MediaVCRTappableData mediaVCRTappableData = this.A01.A00;
            if (mediaVCRTappableData != null) {
                str = mediaVCRTappableData.A05;
            } else {
                str = null;
            }
            r4.A0L(A00(this.A0C, this.A0D, this.A0E, str));
            this.A02 = this.A00;
        }
        GradientDrawable gradientDrawable = this.A03;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        C244303ay r0 = this.A04;
        if (r0 != null) {
            r0.draw(canvas);
        }
        this.A0F.draw(canvas);
        this.A0G.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.U1R.A00(android.content.Context, com.instagram.common.session.UserSession, X.Tsv, java.lang.String):android.text.SpannableStringBuilder");
    }

    public final void Dre(int i, int i2) {
        ReelsVisualRepliesModel reelsVisualRepliesModel = this.A01;
        reelsVisualRepliesModel.A02(Float.valueOf((float) i));
        reelsVisualRepliesModel.A01(Float.valueOf((float) i2));
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    public final void setAlpha(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            GradientDrawable gradientDrawable = this.A03;
            if (gradientDrawable != null) {
                gradientDrawable.setAlpha(i);
            }
            this.A0F.setAlpha(i);
            this.A0G.setAlpha(i);
            C244303ay r0 = this.A04;
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
        int i10 = this.A0A;
        float f3 = ((float) i10) / 2.0f;
        float f4 = f - f3;
        float f5 = ((float) this.A06) / 2.0f;
        float f6 = f2 - f5;
        float f7 = f + f3;
        float f8 = f2 + f5;
        boolean z = this.A0H;
        if (z) {
            i5 = this.A07;
            i6 = (((int) f7) - i5) - this.A05;
        } else {
            i5 = this.A07;
            i6 = ((int) f4) + i5;
        }
        int i11 = (int) f6;
        int i12 = i11 + this.A09;
        int i13 = this.A05;
        int i14 = i6 + i13;
        int i15 = i12 + i13;
        int i16 = (int) f4;
        int i17 = i16;
        if (z) {
            i7 = i5;
        } else {
            i16 = i16 + i5 + i13;
            i7 = this.A08;
        }
        int i18 = i16 + i7;
        C306386Ly r0 = this.A0F;
        C306386Ly r20 = r0;
        int i19 = r0.A0A + i18;
        int i20 = r0.A06 + i12;
        if (z) {
            i8 = ((((i10 - (i5 * 2)) - i13) - this.A08) - this.A0G.A0A) + i18;
        } else {
            i8 = i18;
        }
        int i21 = this.A0B + i20;
        C306386Ly r3 = this.A0G;
        int i22 = r3.A0A + i8;
        int i23 = r3.A06 + i21;
        GradientDrawable gradientDrawable = this.A03;
        GradientDrawable gradientDrawable2 = gradientDrawable;
        if (gradientDrawable != null) {
            GradientDrawable gradientDrawable3 = gradientDrawable2;
            gradientDrawable3.setBounds(i17, i11, (int) f7, (int) f8);
        }
        r20.setBounds(i18, i12, i19, i20);
        r3.setBounds(i8, i21, i22, i23);
        C244303ay r2 = this.A04;
        if (r2 != null) {
            r2.setBounds(i6, i12, i14, i15);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass7TG.A10(colorFilter, this.A0F);
        AnonymousClass7TG.A10(colorFilter, this.A0G);
        C13989Tnp.A11(colorFilter, this.A04);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
