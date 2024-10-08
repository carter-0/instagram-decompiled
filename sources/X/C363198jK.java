package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.instagram.android.R;

/* renamed from: X.8jK  reason: invalid class name and case insensitive filesystem */
public final class C363198jK implements C252203oj {
    public static final C71392co A09 = C71392co.A04(80.0d, 10.0d);
    public boolean A00;
    public boolean A01;
    public float A02;
    public boolean A03;
    public boolean A04;
    public final 2cs A05;
    public final C363208jL A06;
    public final int A07;
    public final int A08;

    public C363198jK(Context context, 2cp r7, Integer num) {
        int i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A08 = context.getColor(R.color.cyan_5);
        this.A07 = context.getColor(R.color.design_dark_default_color_on_background);
        float f = (float) dimensionPixelSize;
        switch (num.intValue()) {
            case 0:
                i = 16;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 48;
                break;
            case 3:
                i = 80;
                break;
            case 4:
                i = 3;
                break;
            default:
                i = 5;
                break;
        }
        this.A06 = new C363208jL(context, f, R.color.cyan_5, i);
        2cs A022 = r7.A02();
        A022.A06 = true;
        A022.A0A(this);
        A022.A09(A09);
        this.A05 = A022;
        this.A03 = true;
        A022.A0A(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r9.A00 != false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (java.lang.Math.abs(r15) < 0.5f) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(float r10, float r11, boolean r12, boolean r13, float r14, float r15, float r16) {
        /*
            r9 = this;
            r3 = 0
            if (r12 != 0) goto L_0x0008
            boolean r0 = r9.A00
            r8 = 0
            if (r0 == 0) goto L_0x0009
        L_0x0008:
            r8 = 1
        L_0x0009:
            boolean r5 = r9.A00
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x001a
            float r1 = java.lang.Math.abs(r15)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 0
            if (r0 >= 0) goto L_0x001b
        L_0x001a:
            r7 = 1
        L_0x001b:
            r6 = 925353388(0x3727c5ac, float:1.0E-5)
            r4 = 1
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x0025
            r2 = 1
        L_0x0025:
            float r1 = r10 - r6
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            float r0 = r10 + r6
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x003a
        L_0x0031:
            float r10 = r10 + r6
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006a
        L_0x003a:
            r0 = 1
        L_0x003b:
            if (r8 == 0) goto L_0x0068
            if (r7 == 0) goto L_0x0068
            if (r0 != 0) goto L_0x0047
            if (r2 != 0) goto L_0x0045
            if (r5 == 0) goto L_0x0068
        L_0x0045:
            if (r13 == 0) goto L_0x0068
        L_0x0047:
            r9.A00 = r4
            r5 = r16
            r9.A02 = r5
            X.2cs r2 = r9.A05
            if (r4 == 0) goto L_0x0065
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0053:
            r2.A06(r0)
            r0 = 1117126656(0x42960000, float:75.0)
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            r0 = 0
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0062
            r3 = 1
        L_0x0062:
            r9.A04 = r3
            return
        L_0x0065:
            r0 = 0
            goto L_0x0053
        L_0x0068:
            r4 = 0
            goto L_0x0047
        L_0x006a:
            r0 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363198jK.A01(float, float, boolean, boolean, float, float, float):void");
    }

    public final void A02(Canvas canvas) {
        C363208jL r3;
        int i = (this.A05.A09.A00 > 0.0d ? 1 : (this.A05.A09.A00 == 0.0d ? 0 : -1));
        boolean z = this.A01;
        if (i > 0) {
            if (z) {
                C363208jL r0 = this.A06;
                r0.A08.setColor(this.A08);
            }
            r3 = this.A06;
        } else if (z && this.A04 && !this.A00) {
            r3 = this.A06;
            r3.A08.setColor(this.A07);
            r3.setAlpha(Math.max(((int) (255.0f * ((100.0f - this.A02) / 100.0f))) - 80, 0));
        } else {
            return;
        }
        r3.draw(canvas);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r6) {
        0qQ.A0B(r6, 0);
        if (r6.A09.A00 == 1.0d) {
            AnonymousClass2S0.A01.A05(5);
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r11) {
        0qQ.A0B(r11, 0);
        if (0qQ.A0K(this.A05, r11)) {
            this.A06.setAlpha((int) AnonymousClass37Q.A04(r11.A09.A00, 0.0d, 1.0d, 0.0d, 255.0d));
        }
    }

    public final void A00() {
        this.A05.A08(0.0d, true);
        this.A04 = false;
        this.A00 = false;
        this.A02 = 0.0f;
    }

    public final void A03(Rect rect) {
        C363208jL r2 = this.A06;
        r2.setBounds(rect);
        int i = rect.left;
        int i2 = rect.top;
        r2.A01 = i;
        r2.A02 = i2;
    }

    public final void A04(boolean z) {
        double d;
        2cs r2 = this.A05;
        if (z) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        r2.A06(d);
    }
}
