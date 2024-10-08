package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.5uw  reason: invalid class name and case insensitive filesystem */
public final class C299325uw extends C299335ux implements C268714ds {
    public Integer A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final C18064Vkq A04;
    public final UpcomingEvent A05;
    public final Integer A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Drawable A0C;
    public final C268694dq A0D;
    public final C61410nE A0E;
    public final C306386Ly A0F;
    public final C306386Ly A0G;
    public final C363208jL A0H;
    public final List A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r11 == X.AnonymousClass05K.A0C) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b2, code lost:
        if (new X.C310296al(r14).A01(r1) != false) goto L_0x0162;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C299325uw(android.content.Context r19, com.instagram.common.session.UserSession r20, com.instagram.user.model.UpcomingEvent r21, java.lang.Integer r22, java.lang.Integer r23) {
        /*
            r18 = this;
            r10 = 1
            r0 = 4
            r11 = r23
            X.0qQ.A0B(r11, r0)
            r12 = r18
            r12.<init>()
            r13 = r19
            r12.A02 = r13
            r1 = r21
            r12.A05 = r1
            r0 = r22
            r12.A06 = r0
            r2 = r20
            r12.A03 = r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r12.A0I = r9
            X.0nE r0 = X.C61410nE.A00
            r12.A0E = r0
            android.content.res.Resources r3 = r13.getResources()
            X.Vkq r0 = X.C17116VIm.A00(r2, r0, r1)
            r12.A04 = r0
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            if (r11 == r8) goto L_0x003b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r17 = 0
            if (r11 != r0) goto L_0x003d
        L_0x003b:
            r17 = 1
        L_0x003d:
            r0 = 2131165374(0x7f0700be, float:1.7944963E38)
            if (r17 == 0) goto L_0x0045
            r0 = 2131165283(0x7f070063, float:1.7944779E38)
        L_0x0045:
            int r7 = r3.getDimensionPixelSize(r0)
            r12.A01 = r7
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r17 == 0) goto L_0x0052
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x0052:
            int r0 = r3.getDimensionPixelSize(r0)
            r12.A0A = r0
            int r0 = r0 * 2
            int r7 = r7 - r0
            r0 = 2131165580(0x7f07018c, float:1.7945381E38)
            if (r17 == 0) goto L_0x0063
            r0 = 2131165679(0x7f0701ef, float:1.7945582E38)
        L_0x0063:
            int r2 = r3.getDimensionPixelSize(r0)
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r17 == 0) goto L_0x006f
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x006f:
            int r0 = r3.getDimensionPixelSize(r0)
            r12.A09 = r0
            r0 = 2131165388(0x7f0700cc, float:1.7944992E38)
            int r15 = r3.getDimensionPixelSize(r0)
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r1 = r3.getDimensionPixelSize(r0)
            r12.A0B = r1
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            if (r17 == 0) goto L_0x008d
            r0 = 2131165222(0x7f070026, float:1.7944655E38)
        L_0x008d:
            int r0 = r3.getDimensionPixelSize(r0)
            r12.A08 = r0
            r0 = 2131165388(0x7f0700cc, float:1.7944992E38)
            int r16 = r3.getDimensionPixelSize(r0)
            if (r17 == 0) goto L_0x01b6
            X.KHn r6 = new X.KHn
            r6.<init>(r13)
        L_0x00a1:
            r12.A0D = r6
            if (r17 != 0) goto L_0x00c7
            boolean r0 = r6 instanceof X.C15839UjP
            if (r0 == 0) goto L_0x00c7
            r4 = r6
            X.UjP r4 = (X.C15839UjP) r4
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            r4.A0F(r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r13.getColor(r0)
            r4.A09(r0)
            r0 = 2131240258(0x7f082542, float:1.8096846E38)
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            if (r0 == 0) goto L_0x00c7
            r4.A0C(r0)
        L_0x00c7:
            r6.setCallback(r12)
            X.6Ly r5 = new X.6Ly
            r5.<init>(r13, r7)
            r12.A0F = r5
            r0 = 2130970335(0x7f0406df, float:1.7549377E38)
            int r0 = X.2Yu.A0H(r13, r0)
            int r0 = r13.getColor(r0)
            r5.A0F(r0)
            float r0 = (float) r2
            float r2 = (float) r1
            r1 = 0
            X.AJB.A06(r13, r5, r0, r2)
            com.instagram.user.model.UpcomingEvent r0 = r12.A05
            java.lang.String r4 = r0.getTitle()
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r4.toUpperCase(r0)
            X.0qQ.A07(r0)
            r5.A0M(r0)
            java.lang.String r14 = "…"
            r5.A0G(r10, r14)
            r5.setCallback(r12)
            X.6Ly r4 = new X.6Ly
            r4.<init>(r13, r7)
            r12.A0G = r4
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r0 = X.2Yu.A0H(r13, r0)
            int r0 = r13.getColor(r0)
            r4.A0F(r0)
            r4.A0C(r1, r2)
            float r0 = (float) r15
            r4.A0A(r0)
            X.Vkq r2 = r12.A04
            android.content.Context r1 = r12.A02
            X.Uy1 r0 = X.Uy1.A06
            java.lang.String r0 = r2.A00(r1, r0)
            r4.A0M(r0)
            r4.A0G(r10, r14)
            r4.setCallback(r12)
            r0 = 2131165252(0x7f070044, float:1.7944716E38)
            int r0 = r3.getDimensionPixelSize(r0)
            float r2 = (float) r0
            r0 = 2130970314(0x7f0406ca, float:1.7549335E38)
            int r1 = X.2Yu.A0H(r13, r0)
            r0 = 80
            X.8jL r3 = new X.8jL
            r3.<init>(r13, r2, r1, r0)
            r12.A0H = r3
            r3.setCallback(r12)
            java.lang.Integer r15 = r12.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r15 == r2) goto L_0x01b4
            com.instagram.common.session.UserSession r14 = r12.A03
            X.6al r0 = new X.6al
            r0.<init>(r14)
            com.instagram.user.model.UpcomingEvent r1 = r12.A05
            boolean r0 = r0.A00(r1)
            if (r0 != 0) goto L_0x01a7
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
        L_0x0162:
            r12.A00 = r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r11 != r0) goto L_0x018e
            X.H7e r0 = new X.H7e
            r0.<init>(r13, r2)
            r12.A0C = r0
        L_0x016f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.00k.A0r(r9, r2)
            r0 = 0
            android.graphics.drawable.Drawable r1 = r12.A0C
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[]{r6, r5, r4, r3, r1}
            java.util.Collections.addAll(r2, r1)
            if (r17 != 0) goto L_0x018b
            boolean r1 = r6 instanceof X.C15839UjP
            if (r1 == 0) goto L_0x018b
            X.UjP r6 = (X.C15839UjP) r6
            int r0 = r6.A00
        L_0x018b:
            r12.A07 = r0
            return
        L_0x018e:
            X.6Ly r1 = new X.6Ly
            r1.<init>(r13, r7)
            r12.A0C = r1
            r0 = r16
            float r0 = (float) r0
            r1.A0A(r0)
            android.text.TextPaint r0 = r1.A0b
            r0.setFakeBoldText(r10)
            r1.setCallback(r12)
            A00(r12)
            goto L_0x016f
        L_0x01a7:
            if (r15 != r8) goto L_0x01b4
            X.6al r0 = new X.6al
            r0.<init>(r14)
            boolean r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x0162
        L_0x01b4:
            r2 = r8
            goto L_0x0162
        L_0x01b6:
            X.UjP r6 = new X.UjP
            r6.<init>(r13)
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299325uw.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.user.model.UpcomingEvent, java.lang.Integer, java.lang.Integer):void");
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A0D.draw(canvas);
        this.A0F.draw(canvas);
        this.A0G.draw(canvas);
        this.A0H.draw(canvas);
        this.A0C.draw(canvas);
    }

    public static final void A00(C299325uw r3) {
        C306386Ly r2;
        Drawable drawable = r3.A0C;
        if ((drawable instanceof C306386Ly) && (r2 = (C306386Ly) drawable) != null) {
            Integer num = r3.A00;
            Context context = r2.A0Z;
            0qQ.A07(context);
            r2.A0M(C56338Hwp.A01(context, num));
            r2.A0F(C56338Hwp.A00(context, r3.A00));
        }
    }

    public final List A07() {
        return this.A0I;
    }

    public final String A0B() {
        C54309H7e h7e;
        C306386Ly r0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Spannable spannable = this.A0F.A0F;
        0qQ.A0A(spannable);
        String str = null;
        if (!(!00l.A0W(spannable))) {
            spannable = null;
        }
        spannableStringBuilder.append(spannable);
        Spannable spannable2 = this.A0G.A0F;
        0qQ.A0A(spannable2);
        if (!(!00l.A0W(spannable2))) {
            spannable2 = null;
        }
        boolean z = false;
        if (spannableStringBuilder.length() > 0) {
            z = true;
        }
        if (z) {
            spannableStringBuilder.append(", ");
        }
        spannableStringBuilder.append(spannable2);
        Drawable drawable = this.A0C;
        if ((drawable instanceof C306386Ly) && (r0 = (C306386Ly) drawable) != null) {
            Spannable spannable3 = r0.A0F;
            0qQ.A0A(spannable3);
            if (!(!00l.A0W(spannable3))) {
                spannable3 = null;
            }
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(", ");
            }
            spannableStringBuilder.append(spannable3);
        } else if ((drawable instanceof C54309H7e) && (h7e = (C54309H7e) drawable) != null) {
            String obj = h7e.A02.A0F.toString();
            if (!00l.A0W(obj)) {
                str = obj;
            }
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(", ");
            }
            spannableStringBuilder.append(str);
        }
        String obj2 = spannableStringBuilder.toString();
        0qQ.A07(obj2);
        return obj2;
    }

    public final C2802350v BzV() {
        return new C40592Aeg(this.A05);
    }

    public final int getIntrinsicHeight() {
        int i = this.A09 + this.A0F.A06;
        int i2 = this.A0G.A06;
        int i3 = this.A0A;
        return this.A07 + i + i2 + i3 + this.A0C.getIntrinsicHeight() + (i3 * 2);
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A01) / 2.0f;
        float f4 = f - f3;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f5 = f2 - intrinsicHeight;
        float f6 = f3 + f;
        float f7 = f2 + intrinsicHeight;
        int i6 = this.A07;
        C306386Ly r11 = this.A0F;
        int i7 = r11.A0A;
        int i8 = r11.A06;
        int i9 = r11.A08;
        int i10 = this.A09;
        int i11 = this.A0B;
        float f8 = ((float) i7) / 2.0f;
        float f9 = f - f8;
        float f10 = ((float) i6) + f5;
        float f11 = (float) i9;
        float f12 = (((float) i10) + f10) - f11;
        float f13 = f8 + f;
        float f14 = f10 + ((float) (((i8 + i10) - i9) - i11)) + f11;
        C306386Ly r0 = this.A0G;
        C306386Ly r23 = r0;
        float f15 = ((float) r0.A0A) / 2.0f;
        float f16 = f - f15;
        float f17 = ((float) i11) + f14;
        float f18 = f15 + f;
        float f19 = ((float) r0.A06) + f17;
        float f20 = ((float) this.A0A) + f19;
        Drawable drawable = this.A0C;
        float intrinsicWidth = ((float) drawable.getIntrinsicWidth()) / 2.0f;
        float f21 = f - intrinsicWidth;
        float f22 = (((float) this.A08) / 2.0f) + f20;
        float intrinsicHeight2 = ((float) drawable.getIntrinsicHeight()) / 2.0f;
        float f23 = f22 - intrinsicHeight2;
        float f24 = f + intrinsicWidth;
        float f25 = f22 + intrinsicHeight2;
        int i12 = (int) f4;
        int i13 = (int) f5;
        int i14 = (int) f6;
        this.A0D.setBounds(i12, i13, i14, (int) f7);
        r11.setBounds((int) f9, (int) f12, (int) f13, (int) f14);
        r23.setBounds((int) f16, (int) f17, (int) f18, (int) f19);
        int i15 = (int) f20;
        this.A0H.setBounds(i12, i15, i14, i15);
        drawable.setBounds((int) f21, (int) f23, (int) f24, (int) f25);
    }
}
