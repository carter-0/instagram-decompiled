package X;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.52V  reason: invalid class name */
public final class AnonymousClass52V extends AnonymousClass52S {
    public int A00;
    public int A01;
    public VUP A02;
    public boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r3.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x002c
            int r0 = r4.hashCode()
            r1 = 1
            r2 = -1
            switch(r0) {
                case -1364013995: goto L_0x0016;
                case 100571: goto L_0x000d;
                case 109757538: goto L_0x0023;
                default: goto L_0x000c;
            }
        L_0x000c:
            return
        L_0x000d:
            java.lang.String r0 = "end"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0020
            return
        L_0x0016:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0020:
            r3.A01 = r1
            return
        L_0x0023:
            java.lang.String r0 = "start"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002c
            return
        L_0x002c:
            r3.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52V.A0F(java.lang.String):void");
    }

    public final float A07(DisplayMetrics displayMetrics) {
        float f = 25.0f / ((float) displayMetrics.densityDpi);
        if (!this.A03) {
            return f * 0.1f;
        }
        return f;
    }

    public final int A08() {
        return this.A01;
    }

    public final int A09() {
        return this.A01;
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        if (this.A01 == Integer.MIN_VALUE) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
        return super.A0C(i, i2, i3, i4, i5);
    }

    public final int A0D(View view, int i) {
        int i2;
        C252553pI r0 = this.A02;
        if (r0 == null || !r0.A1X()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0D(view, i) + i2;
    }

    public final int A0E(View view, int i) {
        int i2;
        C252553pI r0 = this.A02;
        if (r0 == null || !r0.A1Y()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0E(view, i) + i2;
    }

    public final void A03() {
        super.A03();
        VUP vup = this.A02;
        if (vup != null) {
            vup.A02.A02 = null;
            vup.A00.A15(new C14814UAo(vup));
        }
    }
}
