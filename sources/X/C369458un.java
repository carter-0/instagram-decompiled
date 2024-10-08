package X;

import android.graphics.Matrix;

/* renamed from: X.8un  reason: invalid class name and case insensitive filesystem */
public final class C369458un {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public String A0C;
    public boolean A0D;
    public final Matrix A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369458un(com.instagram.common.session.UserSession r21, X.B3f r22) {
        /*
            r20 = this;
            r0 = 1
            r2 = r22
            X.0qQ.A0B(r2, r0)
            r3 = r2
            X.9Qs r3 = (X.C378669Qs) r3
            int r14 = r3.A0g
            java.lang.String r6 = r3.A0j
            float r7 = r2.Bcl()
            float r8 = r2.Bcm()
            android.graphics.drawable.Drawable r0 = r3.A0B
            android.graphics.Rect r0 = r0.getBounds()
            int r15 = r0.width()
            r5 = r21
            if (r21 == 0) goto L_0x0058
            X.0Tu r4 = X.0Tu.A06
            r0 = 36323302926527544(0x810bda00012c38, double:3.0343412607125274E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0058
            android.graphics.drawable.Drawable r0 = r3.A0B
            int r16 = r0.getIntrinsicHeight()
        L_0x0036:
            float r9 = r3.A01
            float r10 = r3.A02
            float r11 = r3.A03
            float r12 = r3.A04
            float r13 = r3.A00
            float r12 = r12 * r13
            int r1 = r3.A08
            int r0 = r3.A09
            boolean r3 = r3.A0J
            r5 = r20
            r17 = r1
            r18 = r0
            r19 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            android.graphics.Matrix r0 = r5.A0E
            r2.C9R(r0)
            return
        L_0x0058:
            android.graphics.drawable.Drawable r0 = r3.A0B
            android.graphics.Rect r0 = r0.getBounds()
            int r16 = r0.height()
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369458un.<init>(com.instagram.common.session.UserSession, X.B3f):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        C369458un r4 = (C369458un) obj;
        if (this.A08 == r4.A08 && 0qQ.A0K(this.A0C, r4.A0C) && this.A0A == r4.A0A && this.A07 == r4.A07 && this.A09 == r4.A09 && this.A0B == r4.A0B && Float.compare(r4.A03, this.A03) == 0 && Float.compare(r4.A04, this.A04) == 0 && Float.compare(r4.A01, this.A01) == 0 && Float.compare(r4.A02, this.A02) == 0 && Float.compare(r4.A05, this.A05) == 0 && Float.compare(r4.A06, this.A06) == 0 && Float.compare(r4.A00, this.A00) == 0 && this.A0D == r4.A0D) {
            return 0qQ.A0K(this.A0E, r4.A0E);
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int floatToIntBits3;
        int floatToIntBits4;
        int floatToIntBits5;
        int floatToIntBits6;
        int hashCode = ((((((((((this.A0E.hashCode() * 31) + this.A08) * 31) + this.A0A) * 31) + this.A07) * 31) + this.A09) * 31) + this.A0B) * 31;
        float f = this.A03;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.A04;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        float f3 = this.A01;
        if (f3 == 0.0f) {
            floatToIntBits3 = 0;
        } else {
            floatToIntBits3 = Float.floatToIntBits(f3);
        }
        int i4 = (i3 + floatToIntBits3) * 31;
        float f4 = this.A02;
        if (f4 == 0.0f) {
            floatToIntBits4 = 0;
        } else {
            floatToIntBits4 = Float.floatToIntBits(f4);
        }
        int i5 = (i4 + floatToIntBits4) * 31;
        float f5 = this.A05;
        if (f5 == 0.0f) {
            floatToIntBits5 = 0;
        } else {
            floatToIntBits5 = Float.floatToIntBits(f5);
        }
        int i6 = (i5 + floatToIntBits5) * 31;
        float f6 = this.A06;
        if (f6 == 0.0f) {
            floatToIntBits6 = 0;
        } else {
            floatToIntBits6 = Float.floatToIntBits(f6);
        }
        int i7 = (i6 + floatToIntBits6) * 31;
        float f7 = this.A00;
        if (f7 != 0.0f) {
            i = Float.floatToIntBits(f7);
        }
        return i7 + i;
    }

    public C369458un(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, int i4, int i5, boolean z) {
        0qQ.A0B(str, 2);
        this.A08 = i;
        this.A0C = str;
        this.A0A = i2;
        this.A07 = i3;
        this.A09 = i4;
        this.A0B = i5;
        this.A03 = f;
        this.A04 = f2;
        this.A01 = f3;
        this.A02 = f4;
        this.A05 = f5;
        this.A06 = f6;
        this.A00 = f7;
        this.A0D = z;
        this.A0E = new Matrix();
    }

    public C369458un() {
        this(AnonymousClass0HM.A00().toString(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, false);
    }
}
