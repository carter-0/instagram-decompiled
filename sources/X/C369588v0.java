package X;

import android.graphics.Canvas;
import com.instagram.shopping.model.share.ShopShareInfo;

/* renamed from: X.8v0  reason: invalid class name and case insensitive filesystem */
public final class C369588v0 extends C369598v1 implements C369608v2 {
    public final int A00;
    public final ShopShareInfo A01;
    public final C306386Ly A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369588v0(android.content.Context r12, com.instagram.shopping.model.share.ShopShareInfo r13, float r14, int r15, int r16) {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r6 = r13.A04
            com.instagram.common.typedurl.ImageUrl r5 = r13.A00
            java.util.List r7 = r13.A07
            if (r7 == 0) goto L_0x0065
            r3 = r11
            r4 = r12
            r8 = r14
            r9 = r15
            r10 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.A01 = r13
            float r0 = X.0nA.A04(r12, r0)
            int r0 = java.lang.Math.round(r0)
            r11.A00 = r0
            java.lang.String r0 = "storefront_reshare_sticker"
            r11.A03 = r0
            float r1 = r11.A06
            int r0 = r11.A03
            int r0 = r0 * 2
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = r11.A01
            float r1 = r1 - r0
            int r0 = r11.A0A
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (int) r1
            X.6Ly r2 = new X.6Ly
            r2.<init>(r12, r0)
            r11.A02 = r2
            com.instagram.shopping.model.share.ShopShareInfo r0 = r11.A01
            java.lang.String r0 = r0.A02
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0064
            r0 = 14
            float r0 = X.0nA.A04(r12, r0)
            r2.A0A(r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r0 = 0
            r2.A0J(r1, r0)
            int r0 = r11.A0S
            r2.A0F(r0)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2.A0K(r0)
            r0 = 1
            r2.A0O = r0
            java.lang.String r0 = r13.A02
            r2.A0M(r0)
        L_0x0064:
            return
        L_0x0065:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369588v0.<init>(android.content.Context, com.instagram.shopping.model.share.ShopShareInfo, float, int, int):void");
    }

    public final void A00(Canvas canvas) {
        int i;
        float f;
        float f2;
        if (this.A01.A02.length() == 0) {
            super.A00(canvas);
            return;
        }
        float f3 = (float) this.A00;
        float f4 = -f3;
        boolean z = this.A0L;
        if (z) {
            i = this.A0A;
            f = (float) ((-i) - this.A0W.A0A);
        } else {
            float f5 = this.A07;
            i = this.A0A;
            f = f5 + ((float) i);
        }
        canvas.translate(f, f4);
        this.A0W.draw(canvas);
        canvas.restore();
        float f6 = this.A07;
        C306386Ly r2 = this.A02;
        float f7 = (f3 + f6) - ((float) r2.A06);
        if (z) {
            f2 = (float) ((-i) - r2.A0A);
        } else {
            f2 = f6 + ((float) i);
        }
        canvas.translate(f2, f7);
        r2.draw(canvas);
        canvas.restore();
    }

    public final String C4F() {
        return this.A03;
    }
}
