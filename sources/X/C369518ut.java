package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8ut  reason: invalid class name and case insensitive filesystem */
public final class C369518ut extends C268694dq implements C41816B1w, C300645xY {
    public final Context A00;
    public final C387369m6 A01;
    public final A7J A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Drawable A08;
    public final Drawable A09;
    public final C306386Ly A0A;
    public final C306386Ly A0B;
    public final String A0C;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A0B.draw(canvas);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        C306386Ly r0 = this.A0A;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    public final List A07() {
        return new ArrayList();
    }

    public final int BRc() {
        if (this.A01.A03 != null) {
            return 1;
        }
        return 0;
    }

    public final List BRk() {
        List singletonList = Collections.singletonList(this.A01.A03);
        0qQ.A07(singletonList);
        ArrayList arrayList = new ArrayList();
        for (Object next : singletonList) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final String C4F() {
        return this.A0C;
    }

    public final int getIntrinsicHeight() {
        return this.A07 + this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A05;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.A7J, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ab, code lost:
        if (X.00l.A0W(r2) != false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369518ut(android.content.Context r10, X.QP8 r11, X.C387369m6 r12) {
        /*
            r9 = this;
            r9.<init>()
            r9.A00 = r10
            r9.A01 = r12
            java.lang.String r6 = r11.A01
            java.lang.String r0 = ""
            if (r6 != 0) goto L_0x000e
            r6 = r0
        L_0x000e:
            java.lang.String r5 = r11.A04
            if (r5 != 0) goto L_0x0013
            r5 = r0
        L_0x0013:
            java.lang.String r4 = r11.A03
            if (r4 != 0) goto L_0x0018
            r4 = r0
        L_0x0018:
            r1 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            com.instagram.reels.question.model.responsetype.QuestionResponseType r2 = com.instagram.reels.question.model.responsetype.QuestionResponseType.MEDIA
            X.A7J r0 = new X.A7J
            r0.<init>()
            r0.A02 = r6
            r0.A04 = r5
            r0.A03 = r4
            r0.A01 = r3
            r0.A00 = r2
            r9.A02 = r0
            r0 = 358(0x166, float:5.02E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A0C = r0
            r2 = 2131165247(0x7f07003f, float:1.7944706E38)
            android.content.res.Resources r0 = r10.getResources()
            int r4 = r0.getDimensionPixelSize(r2)
            r9.A05 = r4
            r2 = 2131165184(0x7f070000, float:1.7944578E38)
            android.content.Context r0 = r9.A00
            android.content.res.Resources r0 = r0.getResources()
            int r3 = r0.getDimensionPixelSize(r2)
            r9.A04 = r3
            r2 = 2131165218(0x7f070022, float:1.7944647E38)
            android.content.Context r0 = r9.A00
            android.content.res.Resources r0 = r0.getResources()
            int r6 = r0.getDimensionPixelSize(r2)
            r9.A03 = r6
            int r8 = r3 * 2
            int r0 = r4 - r8
            X.6Ly r7 = new X.6Ly
            r7.<init>(r10, r0)
            r2 = 2131165331(0x7f070093, float:1.7944876E38)
            android.content.Context r0 = r9.A00
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r2)
            float r0 = (float) r0
            r7.A0A(r0)
            android.content.Context r2 = r7.A0Z
            int r0 = X.2Yu.A0A(r2)
            int r0 = r2.getColor(r0)
            r7.A0F(r0)
            X.0qq r2 = X.AnonymousClass0qo.A00(r2)
            X.0qm r0 = X.0qm.A0V
            android.graphics.Typeface r0 = r2.A02(r0)
            r7.A0I(r0)
            r7.A09()
            java.lang.String r2 = r11.A02
            r5 = 0
            if (r2 == 0) goto L_0x00ad
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            X.0qQ.A07(r2)
            boolean r0 = X.00l.A0W(r2)
            if (r0 == 0) goto L_0x00b8
        L_0x00ad:
            X.33y r3 = X.C70572Rz.A00()
            java.lang.String r2 = "📸"
            r0 = -1
            java.lang.CharSequence r2 = r3.Cmk(r0, r2)
        L_0x00b8:
            r7.A0M(r2)
            r9.A0B = r7
            com.instagram.user.model.User r3 = r12.A03
            if (r3 == 0) goto L_0x0107
            int r0 = r6 * 2
            int r4 = r4 - r0
            X.6Ly r5 = new X.6Ly
            r5.<init>(r10, r4)
            r2 = 2131165216(0x7f070020, float:1.7944643E38)
            android.content.Context r0 = r9.A00
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r2)
            float r0 = (float) r0
            r5.A0A(r0)
            android.content.Context r2 = r5.A0Z
            r0 = 2130970335(0x7f0406df, float:1.7549377E38)
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            r5.A0F(r0)
            X.0qq r2 = X.AnonymousClass0qo.A00(r2)
            X.0qm r0 = X.0qm.A0T
            android.graphics.Typeface r0 = r2.A02(r0)
            r5.A0I(r0)
            r5.A09()
            r2 = 64
            java.lang.String r0 = r3.getUsername()
            java.lang.String r0 = X.002.A0D(r0, r2)
            r5.A0M(r0)
        L_0x0107:
            r9.A0A = r5
            r0 = 2131239481(0x7f082239, float:1.809527E38)
            android.graphics.drawable.Drawable r4 = r10.getDrawable(r0)
            java.lang.Object r0 = r11.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x012a
            int r3 = r0.intValue()
            boolean r0 = r4 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x012a
            r2 = r4
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            if (r2 == 0) goto L_0x012a
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r3)
            r2.setColor(r0)
        L_0x012a:
            r9.A09 = r4
            r0 = 2131239478(0x7f082236, float:1.8095264E38)
            android.graphics.drawable.Drawable r0 = r10.getDrawable(r0)
            r9.A08 = r0
            int r0 = r7.A06
            int r0 = r0 + r8
            r9.A07 = r0
            if (r5 == 0) goto L_0x013e
            int r1 = r5.A06
        L_0x013e:
            int r0 = r6 * 2
            int r1 = r1 + r0
            r9.A06 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369518ut.<init>(android.content.Context, X.QP8, X.9m6):void");
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (int) (((float) (i + i3)) / 2.0f);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, this.A07 + i2);
        }
        C306386Ly r6 = this.A0B;
        int i6 = r6.A08;
        int i7 = (int) (((float) r6.A0A) / 2.0f);
        int i8 = this.A04 + i2;
        r6.setBounds(i5 - i7, i8 - i6, i7 + i5, i8 + r6.A06);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setBounds(i, i4 - this.A06, i3, i4);
        }
        C306386Ly r4 = this.A0A;
        if (r4 != null) {
            int i9 = r4.A08;
            int i10 = (int) (((float) r4.A0A) / 2.0f);
            int i11 = i2 + this.A07;
            int i12 = this.A03;
            r4.setBounds(i5 - i10, (i11 + i12) - i9, i5 + i10, i4 - i12);
        }
    }
}
