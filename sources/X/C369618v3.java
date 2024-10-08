package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8v3  reason: invalid class name and case insensitive filesystem */
public final class C369618v3 extends C299875vz implements C268714ds, C300645xY {
    public C39771A8l A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final UserSession A08;
    public final C19475WaN A09;
    public final C15839UjP A0A;
    public final C306386Ly A0B;
    public final C306386Ly A0C;
    public final C306386Ly A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Drawable A0H;
    public final C363208jL A0I;
    public final List A0J;

    public final String C4F() {
        return "fundraiser_sticker_fundraiser_sticker_bundle_id";
    }

    public final List A07() {
        return this.A0J;
    }

    public final C2802350v BzV() {
        return this.A09;
    }

    public final void draw(Canvas canvas) {
        this.A0A.draw(canvas);
        this.A0H.draw(canvas);
        this.A0D.draw(canvas);
        this.A0C.draw(canvas);
        this.A0B.draw(canvas);
        if (this.A01) {
            this.A0I.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        int i = this.A0G;
        C306386Ly r1 = this.A0D;
        int i2 = (i + r1.A06) - r1.A08;
        int i3 = this.A04;
        int i4 = i2 - i3;
        C306386Ly r5 = this.A0C;
        int i5 = (r5.A06 - i3) + this.A0F;
        int i6 = (int) (((float) this.A09.A00.A00) * this.A07.getResources().getDisplayMetrics().density);
        int i7 = r5.A06;
        int i8 = 0;
        if (i7 < i6) {
            i8 = i6 - i7;
        }
        return this.A0A.A00 + i4 + i5 + i8 + this.A0E;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        float f;
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f2 = ((float) (i + i3)) / 2.0f;
        float f3 = ((float) (i2 + i4)) / 2.0f;
        float f4 = ((float) this.A06) / 2.0f;
        float f5 = f2 - f4;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f6 = f3 - intrinsicHeight;
        float f7 = f4 + f2;
        float f8 = f3 + intrinsicHeight;
        float f9 = (float) this.A0E;
        float f10 = f8 - f9;
        float f11 = f9 + f10;
        float f12 = (f9 / 2.0f) + f10;
        C15839UjP ujP = this.A0A;
        C15839UjP ujP2 = ujP;
        int i6 = ujP.A00;
        C306386Ly r7 = this.A0D;
        int i7 = r7.A0A;
        int i8 = r7.A06;
        int i9 = r7.A08;
        int i10 = this.A0G;
        int i11 = i10;
        int i12 = ((i10 + i8) - i9) - this.A04;
        C306386Ly r6 = this.A0C;
        int i13 = r6.A0A;
        int i14 = r6.A06;
        int i15 = (int) (((float) this.A09.A00.A00) * this.A07.getResources().getDisplayMetrics().density);
        if (i14 < i15) {
            f = ((float) (i15 - i14)) / 2.0f;
        } else {
            f = 0.0f;
        }
        C306386Ly r3 = this.A0B;
        int i16 = r3.A0A;
        int i17 = r3.A06;
        int i18 = (int) f5;
        int i19 = (int) f7;
        ujP2.setBounds(i18, (int) f6, i19, (int) f8);
        float f13 = ((float) i7) / 2.0f;
        float f14 = f6 + ((float) i6);
        float f15 = (float) i9;
        float f16 = f14 + ((float) i12);
        int i20 = (int) (f15 + f16);
        r7.setBounds((int) (f2 - f13), (int) ((((float) i11) + f14) - f15), (int) (f13 + f2), i20);
        float f17 = ((float) i13) / 2.0f;
        r6.setBounds((int) (f2 - f17), (int) (f16 + f), (int) (f17 + f2), (int) (f16 + ((float) i14) + f));
        int i21 = (int) f10;
        this.A0I.setBounds(i18, i21, i19, i21);
        this.A0H.setBounds(i18, i21, i19, (int) f11);
        float f18 = ((float) i16) / 2.0f;
        float f19 = ((float) i17) / 2.0f;
        r3.setBounds((int) (f2 - f18), (int) (f12 - f19), (int) (f2 + f18), (int) (f12 + f19));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0134, code lost:
        if (r7 == r2[1]) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0246  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369618v3(android.content.Context r15, com.instagram.common.session.UserSession r16, X.C19475WaN r17) {
        /*
            r14 = this;
            r14.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r14.A0J = r2
            r14.A07 = r15
            r0 = r16
            r14.A08 = r0
            r0 = r17
            r14.A09 = r0
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165374(0x7f0700be, float:1.7944963E38)
            int r3 = r1.getDimensionPixelSize(r0)
            r14.A06 = r3
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r4 = r1.getDimensionPixelSize(r0)
            r14.A0F = r4
            r0 = 2131165580(0x7f07018c, float:1.7945381E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A05 = r0
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A0G = r0
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A04 = r0
            r0 = 2131165388(0x7f0700cc, float:1.7944992E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A03 = r0
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A0E = r0
            r0 = 2131165412(0x7f0700e4, float:1.794504E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A02 = r0
            int r0 = r4 * 2
            int r3 = r3 - r0
            X.UjP r5 = new X.UjP
            r5.<init>(r15)
            r14.A0A = r5
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            r5.A0F(r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r15.getColor(r0)
            r5.A09(r0)
            r5.setCallback(r14)
            r0 = 2131237356(0x7f0819ec, float:1.809096E38)
            android.graphics.drawable.Drawable r6 = r15.getDrawable(r0)
            r14.A0H = r6
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r4 = 2131099912(0x7f060108, float:1.781219E38)
            r0 = 80
            X.8jL r7 = new X.8jL
            r7.<init>(r15, r1, r4, r0)
            r14.A0I = r7
            X.6Ly r8 = new X.6Ly
            r8.<init>(r15, r3)
            r14.A0D = r8
            X.6Ly r9 = new X.6Ly
            r9.<init>(r15, r3)
            r14.A0C = r9
            X.6Ly r10 = new X.6Ly
            r10.<init>(r15, r3)
            r14.A0B = r10
            r11 = 0
            r1 = 1
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r5, r6, r7, r8, r9, r10}
            java.util.Collections.addAll(r2, r0)
            android.content.Context r6 = r14.A07
            X.6Ly r5 = r14.A0D
            int r0 = r14.A05
            float r2 = (float) r0
            int r0 = r14.A04
            float r0 = (float) r0
            r3 = 0
            X.AJB.A06(r6, r5, r2, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.A0F(r0)
            r5.setCallback(r14)
            X.6Ly r2 = r14.A0C
            int r0 = r14.A04
            float r0 = (float) r0
            r2.A0C(r3, r0)
            int r0 = r14.A03
            float r0 = (float) r0
            r2.A0A(r0)
            int[] r0 = X.C19475WaN.A03
            r0 = -6710887(0xffffffffff999999, float:NaN)
            r2.A0F(r0)
            r2.setCallback(r14)
            X.6Ly r2 = r14.A0B
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r2.A0J(r0, r1)
            android.content.Context r0 = r14.A07
            r5 = 2131962837(0x7f132bd5, float:1.956241E38)
            java.lang.String r0 = r0.getString(r5)
            r2.A0M(r0)
            int r0 = r14.A02
            float r0 = (float) r0
            r2.A0A(r0)
            r0 = -13068304(0xffffffffff3897f0, float:-2.4536686E38)
            r2.A0F(r0)
            r2.setCallback(r14)
            X.WaN r3 = r14.A09
            X.8YF r8 = r3.A00
            com.instagram.user.model.User r12 = r8.A02
            r13 = 0
            if (r12 != 0) goto L_0x0111
            r13 = 1
        L_0x0111:
            java.lang.String r2 = r8.A0A
            int[] r9 = X.C19475WaN.A02
            r0 = r9[r11]
            int r10 = X.0nH.A0C(r2, r0)
            java.lang.String r2 = r8.A05
            r0 = r9[r1]
            int r7 = X.0nH.A0C(r2, r0)
            r6 = 0
            r0 = r9[r11]
            if (r10 != r0) goto L_0x012c
            r0 = r9[r1]
            if (r7 == r0) goto L_0x0136
        L_0x012c:
            int[] r2 = X.C19475WaN.A03
            r0 = r2[r11]
            if (r10 != r0) goto L_0x0137
            r0 = r2[r1]
            if (r7 != r0) goto L_0x0137
        L_0x0136:
            r6 = 1
        L_0x0137:
            r14.A01 = r6
            if (r13 == 0) goto L_0x0246
            java.lang.String r6 = ""
        L_0x013d:
            android.content.Context r2 = r14.A07
            if (r13 == 0) goto L_0x0239
            r0 = 2131962843(0x7f132bdb, float:1.9562423E38)
            java.lang.String r9 = r2.getString(r0)
        L_0x0148:
            X.UjP r11 = r14.A0A
            r11.A08()
            int[] r1 = new int[]{r10, r7}
            android.graphics.drawable.GradientDrawable r0 = r11.A0A
            r0.setColors(r1)
            android.graphics.drawable.GradientDrawable r0 = r11.A05
            if (r0 == 0) goto L_0x015d
            r0.setColors(r1)
        L_0x015d:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165237(0x7f070035, float:1.7944685E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.U1N r7 = r11.A0B
            float r0 = (float) r0
            r7.A00 = r0
            r7.invalidateSelf()
            int r0 = r2.getColor(r4)
            android.graphics.Paint r10 = r7.A04
            r10.setColor(r0)
            r7.invalidateSelf()
            if (r12 != 0) goto L_0x0230
            r0 = 2131237414(0x7f081a26, float:1.8091078E38)
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r0.<init>(r4, r1)
            r11.A0C(r0)
            r0 = 2131100200(0x7f060228, float:1.7812775E38)
            int r0 = r2.getColor(r0)
            r10.setColor(r0)
            r7.invalidateSelf()
        L_0x01a5:
            X.6Ly r7 = r14.A0D
            java.lang.String r0 = r8.A0C
            r7.A0M(r0)
            java.lang.String r1 = r8.A0D
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = X.0nH.A0C(r1, r0)
            r7.A0F(r0)
            X.6Ly r4 = r14.A0C
            java.lang.String r1 = r8.A0B
            r0 = -6710887(0xffffffffff999999, float:NaN)
            int r0 = X.0nH.A0B(r1, r0)
            r4.A0F(r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r9)
            X.6Jl r0 = new X.6Jl
            r0.<init>()
            X.AnonymousClass7AV.A03(r1, r0, r6)
            r4.A0L(r1)
            X.6Ly r6 = r14.A0B
            java.lang.String r1 = r8.A04
            r0 = -13068304(0xffffffffff3897f0, float:-2.4536686E38)
            int r0 = X.0nH.A0C(r1, r0)
            r6.A0F(r0)
            java.lang.String r0 = r2.getString(r5)
            r6.A0M(r0)
            if (r13 == 0) goto L_0x01f8
            r0 = 127(0x7f, float:1.78E-43)
            r6.setAlpha(r0)
            r7.setAlpha(r0)
            r4.setAlpha(r0)
        L_0x01f7:
            return
        L_0x01f8:
            X.A8l r0 = r14.A00
            if (r0 != 0) goto L_0x0204
            com.instagram.common.session.UserSession r0 = r14.A08
            X.A8l r0 = X.C39575A0r.A00(r0)
            r14.A00 = r0
        L_0x0204:
            boolean r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x01f7
            r0 = 2131962839(0x7f132bd7, float:1.9562414E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0M(r0)
            android.graphics.Rect r5 = r6.getBounds()
            int r0 = r5.centerX()
            float r4 = (float) r0
            int r0 = r6.A0A
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = r4 - r1
            int r3 = (int) r0
            int r2 = r5.top
            float r4 = r4 + r1
            int r1 = (int) r4
            int r0 = r5.bottom
            r6.setBounds(r3, r2, r1, r0)
            return
        L_0x0230:
            com.instagram.common.typedurl.ImageUrl r0 = r12.Bh3()
            r7.A00(r0)
            goto L_0x01a5
        L_0x0239:
            r1 = 2131962853(0x7f132be5, float:1.9562443E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            java.lang.String r9 = r2.getString(r1, r0)
            goto L_0x0148
        L_0x0246:
            r12.getClass()
            java.lang.String r6 = r12.getUsername()
            goto L_0x013d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369618v3.<init>(android.content.Context, com.instagram.common.session.UserSession, X.WaN):void");
    }
}
