package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.9jt  reason: invalid class name and case insensitive filesystem */
public final class C385999jt extends C268694dq {
    public Drawable A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final C306386Ly A08;
    public final C306386Ly A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Drawable A0E;
    public final boolean A0F;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A0E.draw(canvas);
        this.A08.draw(canvas);
        this.A09.draw(canvas);
        this.A00.draw(canvas);
    }

    public final List A07() {
        return 0sn.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00fa, code lost:
        if (r2 < 250) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C385999jt(android.content.Context r9, X.C40598Aem r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.A07 = r9
            r0 = 2131237327(0x7f0819cf, float:1.8090901E38)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            if (r0 == 0) goto L_0x010d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r8.A0E = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165272(0x7f070058, float:1.7944756E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r8.A0B = r2
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A0A = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165486(0x7f07012e, float:1.794519E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A0C = r0
            int r0 = X.AnonymousClass7TG.A06(r9)
            r8.A01 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A0D = r0
            android.content.res.Resources r0 = r9.getResources()
            int r0 = X.AnonymousClass7TE.A0D(r0)
            r8.A04 = r0
            int r0 = X.AnonymousClass7TG.A06(r9)
            r8.A06 = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A03 = r0
            X.6Ly r0 = X.AnonymousClass7TE.A0s(r9, r2)
            r8.A08 = r0
            java.lang.String r4 = r10.A02     // Catch:{ NumberFormatException -> 0x0083 }
            java.lang.Integer r3 = X.00y.A0l(r4)     // Catch:{ NumberFormatException -> 0x0083 }
            android.content.res.Resources r2 = X.AnonymousClass7TF.A0A(r9)     // Catch:{ NumberFormatException -> 0x0083 }
            r1 = 0
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r1 = X.C253673rC.A04(r2, r3, r0, r1, r1)     // Catch:{ NumberFormatException -> 0x0083 }
            goto L_0x0086
        L_0x0083:
            java.lang.String r1 = r10.A02
            r4 = r1
        L_0x0086:
            X.6Ly r5 = r8.A08
            android.content.Context r3 = r8.A07
            r2 = 2131962603(0x7f132aeb, float:1.9561936E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = r3.getString(r2, r1)
            X.AnonymousClass7TF.A1A(r5, r1)
            X.6Ly r2 = r8.A08
            android.content.Context r1 = r8.A07
            r7 = 2130970335(0x7f0406df, float:1.7549377E38)
            X.AnonymousClass7TG.A0y(r1, r2, r7)
            android.content.Context r3 = r8.A07
            X.6Ly r2 = r8.A08
            int r1 = r8.A0C
            float r1 = (float) r1
            r6 = 0
            X.AJB.A06(r3, r2, r1, r6)
            X.6Ly r1 = r8.A08
            int r1 = X.AnonymousClass7TH.A02(r1)
            r8.A02 = r1
            android.content.Context r2 = r8.A07
            int r1 = r8.A0B
            X.6Ly r5 = X.AnonymousClass7TE.A0s(r2, r1)
            r8.A09 = r5
            android.content.Context r1 = r8.A07
            X.AnonymousClass7TG.A0y(r1, r5, r7)
            r2 = 64
            com.instagram.user.model.User r1 = r10.A01
            java.lang.String r1 = r1.getUsername()
            java.lang.String r1 = X.002.A0D(r1, r2)
            X.AnonymousClass7TF.A1A(r5, r1)
            android.content.Context r3 = r8.A07
            int r1 = r8.A0D
            float r2 = (float) r1
            X.AnonymousClass7TG.A1N(r3, r5)
            android.graphics.Typeface r1 = X.AnonymousClass7TG.A0O(r3)
            r5.A0I(r1)
            X.AJB.A0B(r5, r2, r6, r6)
            int r1 = X.AnonymousClass7TH.A02(r5)
            r8.A05 = r1
            android.graphics.Bitmap r3 = r10.A00
            int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00fd }
            r0 = 1500000(0x16e360, float:2.101948E-39)
            if (r2 >= r0) goto L_0x00fc
            r1 = 250(0xfa, float:3.5E-43)
            r0 = 0
            if (r2 >= r1) goto L_0x00fd
        L_0x00fc:
            r0 = 1
        L_0x00fd:
            r8.A0F = r0
            android.content.Context r0 = r8.A07
            android.content.res.Resources r1 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r3)
            r8.A00 = r0
            return
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385999jt.<init>(android.content.Context, X.Aem):void");
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) this.A0B) / 2.0f;
        int A012 = AnonymousClass1GB.A01(f - f2);
        int A013 = AnonymousClass1GB.A01(f2 + f);
        this.A0E.setBounds(A012, i2, A013, this.A0A + i2);
        if (this.A0F) {
            Drawable drawable = this.A00;
            drawable.setBounds(A012, i2, A013, drawable.getIntrinsicHeight() + i2);
            C306386Ly r5 = this.A08;
            float f3 = ((float) this.A02) / 2.0f;
            int i7 = this.A01;
            i5 = this.A06;
            r5.setBounds((int) (f - f3), drawable.getIntrinsicHeight() + i2 + i7, (int) (f3 + f), drawable.getIntrinsicHeight() + i2 + i5);
            i6 = i2 + drawable.getIntrinsicHeight() + i5 + i7 + this.A04;
        } else {
            int dimensionPixelSize = this.A07.getResources().getDimensionPixelSize(R.dimen.achievement_details_image_height_v2);
            Drawable drawable2 = this.A00;
            float f4 = ((float) dimensionPixelSize) / 2.0f;
            int A014 = AnonymousClass1GB.A01(f - f4);
            int i8 = this.A03;
            int i9 = i8 + i2;
            drawable2.setBounds(A014, i9, AnonymousClass1GB.A01(f4 + f), i9 + dimensionPixelSize);
            C306386Ly r52 = this.A08;
            float f5 = ((float) this.A02) / 2.0f;
            int i10 = i2 + dimensionPixelSize;
            int i11 = this.A01;
            i5 = this.A06;
            int i12 = i10 + i5;
            r52.setBounds((int) (f - f5), i11 + i10 + i8, (int) (f5 + f), i12 + i8);
            i6 = i12 + i11 + this.A04 + i8;
        }
        C306386Ly r3 = this.A09;
        float f6 = ((float) this.A05) / 2.0f;
        r3.setBounds((int) (f - f6), i6, (int) (f + f6), i5 + i6);
    }
}
