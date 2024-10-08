package X;

import android.graphics.ColorFilter;
import android.text.TextPaint;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;

/* renamed from: X.9lu  reason: invalid class name and case insensitive filesystem */
public final class C387249lu extends C369598v1 implements C369578uz {
    public final int A00;
    public final int A01;
    public final C306386Ly A02;
    public final C306386Ly A03;
    public final TextPaint A04;
    public final TextPaint A05;
    public final ProductCollectionShareInfo A06;
    public final String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C387249lu(android.content.Context r22, com.instagram.shopping.model.collection.ProductCollectionShareInfo r23, float r24, int r25, int r26) {
        /*
            r21 = this;
            r6 = 1
            r2 = 2
            r3 = r23
            java.lang.String r1 = r3.A09
            com.instagram.common.typedurl.ImageUrl r15 = r3.A02
            java.util.List r0 = r3.A0A
            if (r0 == 0) goto L_0x0126
            r13 = r21
            r14 = r22
            r18 = r24
            r19 = r25
            r20 = r26
            r16 = r1
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r13.A06 = r3
            android.text.TextPaint r11 = new android.text.TextPaint
            r11.<init>(r6)
            r13.A05 = r11
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>(r6)
            r13.A04 = r10
            r0 = 92
            java.lang.String r0 = X.C273654mx.A00(r0)
            r13.A07 = r0
            java.lang.String r5 = r3.A05
            java.lang.String r4 = r3.A03
            r0 = 2130970316(0x7f0406cc, float:1.7549339E38)
            int r8 = X.AnonymousClass7TF.A03(r14, r0)
            r1 = 14
            float r0 = X.0nA.A04(r14, r1)
            r11.setTextSize(r0)
            int r9 = r13.A0R
            r11.setColor(r9)
            android.graphics.Typeface r0 = X.AnonymousClass7TG.A0N(r14)
            r11.setTypeface(r0)
            float r0 = X.0nA.A04(r14, r1)
            r10.setTextSize(r0)
            int r0 = r13.A0S
            r10.setColor(r0)
            r3 = 0
            if (r5 == 0) goto L_0x0071
            java.util.regex.Pattern r0 = X.0mp.A00
            int r1 = r5.length()
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r11.getTextBounds(r5, r3, r1, r0)
        L_0x0071:
            if (r4 == 0) goto L_0x0080
            java.util.regex.Pattern r0 = X.0mp.A00
            int r1 = r4.length()
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r10.getTextBounds(r4, r3, r1, r0)
        L_0x0080:
            r7 = 12
            float r12 = X.0nA.A04(r14, r7)
            float r0 = X.0nA.A04(r14, r2)
            int r0 = java.lang.Math.round(r0)
            r13.A00 = r0
            r0 = 8
            float r0 = X.0nA.A04(r14, r0)
            int r0 = java.lang.Math.round(r0)
            r13.A01 = r0
            float r3 = r13.A06
            int r0 = r13.A03
            int r0 = r0 * 2
            float r0 = (float) r0
            float r1 = r3 - r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r0
            int r2 = (int) r1
            float r0 = r13.A01
            float r3 = r3 - r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r12 = r12 * r0
            float r3 = r3 - r12
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r5, r11, r3, r1)
            java.lang.String r5 = r0.toString()
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r4, r10, r3, r1)
            java.lang.String r4 = r0.toString()
            X.6Ly r3 = X.AnonymousClass7TE.A0s(r14, r2)
            r13.A03 = r3
            X.6Ly r2 = X.AnonymousClass7TE.A0s(r14, r2)
            r13.A02 = r2
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0102
            r0 = 20
            X.AnonymousClass7TG.A0x(r14, r3, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = X.0nA.A03(r14, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A0B(r1, r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r3.A0J(r0, r6)
            r3.A0F(r9)
            r1 = 1092616192(0x41200000, float:10.0)
            r0 = 0
            r3.A0D(r1, r0, r0, r8)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r3.A0K(r0)
            java.lang.String r0 = "…"
            r3.A0G(r6, r0)
            r3.A0O = r6
            r3.A0M(r5)
        L_0x0102:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0125
            int r0 = X.2Yu.A08(r14)
            int r1 = r14.getColor(r0)
            X.AnonymousClass7TG.A0x(r14, r2, r7)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r2.A0J(r0, r6)
            r2.A0F(r1)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2.A0K(r0)
            r2.A0O = r6
            r2.A0M(r4)
        L_0x0125:
            return
        L_0x0126:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387249lu.<init>(android.content.Context, com.instagram.shopping.model.collection.ProductCollectionShareInfo, float, int, int):void");
    }

    public final String Aoi() {
        return this.A06.A04;
    }

    public final String Aov() {
        return this.A06.A06;
    }

    public final String BRr() {
        return this.A06.A08;
    }

    public final String C4F() {
        return this.A07;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
        super.setColorFilter(colorFilter);
    }
}
