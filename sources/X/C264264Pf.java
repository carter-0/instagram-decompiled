package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Pf  reason: invalid class name and case insensitive filesystem */
public final class C264264Pf {
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public Surface A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public boolean A0D;
    public final C264274Pg A0E = new C264274Pg();
    public final C264314Pk A0F;
    public final C264304Pj A0G;

    public final void A03() {
        this.A0D = true;
        this.A02 = 0;
        this.A03 = -1;
        this.A05 = -1;
        C264304Pj r1 = this.A0G;
        if (r1 != null) {
            C264314Pk r0 = this.A0F;
            r0.getClass();
            r0.A02.sendEmptyMessage(1);
            r1.EBL(new C21069XDh(this));
        }
        A02(this, false);
    }

    public final void A04() {
        this.A0D = false;
        C264304Pj r0 = this.A0G;
        if (r0 != null) {
            r0.FIq();
            C264314Pk r02 = this.A0F;
            r02.getClass();
            r02.A02.sendEmptyMessage(2);
        }
        A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r9.A02 < 5000000000L) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r12 = this;
            int r0 = com.google.android.exoplayer2.util.Util.A00
            r7 = 30
            if (r0 < r7) goto L_0x0059
            android.view.Surface r0 = r12.A09
            if (r0 == 0) goto L_0x0059
            X.4Pg r8 = r12.A0E
            X.4Ph r9 = r8.A03
            boolean r11 = r9.A02()
            if (r11 == 0) goto L_0x0063
            r4 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            long r2 = r9.A01
            r0 = 0
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            long r0 = r9.A02
            long r0 = r0 / r2
        L_0x0024:
            double r2 = (double) r0
            double r4 = r4 / r2
            float r6 = (float) r4
        L_0x0027:
            float r10 = r12.A0B
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0059
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            if (r11 == 0) goto L_0x0048
            long r3 = r9.A02
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            if (r0 >= 0) goto L_0x004a
        L_0x0048:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x004a:
            float r0 = r6 - r10
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
        L_0x0054:
            r12.A0B = r6
            A02(r12, r5)
        L_0x0059:
            return
        L_0x005a:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            int r0 = r8.A00
            if (r0 < r7) goto L_0x0059
            goto L_0x0054
        L_0x0063:
            float r6 = r12.A0A
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264264Pf.A00():void");
    }

    public static void A01(C264264Pf r3) {
        Surface surface;
        if (Util.A00 >= 30 && (surface = r3.A09) != null && r3.A01 != Integer.MIN_VALUE && r3.A0C != 0.0f) {
            r3.A0C = 0.0f;
            XFD.A00(surface, 0.0f);
        }
    }

    public static void A02(C264264Pf r4, boolean z) {
        Surface surface;
        if (Util.A00 >= 30 && (surface = r4.A09) != null && r4.A01 != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (r4.A0D) {
                float f2 = r4.A0B;
                if (f2 != -1.0f) {
                    f = r4.A00 * f2;
                }
            }
            if (z || r4.A0C != f) {
                r4.A0C = f;
                XFD.A00(surface, f);
            }
        }
    }

    public final void A05(float f) {
        this.A0A = f;
        C264274Pg r3 = this.A0E;
        r3.A03.A00();
        r3.A02.A00();
        r3.A04 = false;
        r3.A01 = -9223372036854775807L;
        r3.A00 = 0;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r8.A07[(int) ((r3 - 1) % 15)] != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(long r12) {
        /*
            r11 = this;
            long r3 = r11.A05
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x000e
            r11.A03 = r3
            long r0 = r11.A06
            r11.A04 = r0
        L_0x000e:
            long r0 = r11.A02
            r9 = 1
            long r0 = r0 + r9
            r11.A02 = r0
            X.4Pg r7 = r11.A0E
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r0
            X.4Ph r0 = r7.A03
            r0.A01(r12)
            boolean r0 = r0.A02()
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0051
            r7.A04 = r5
        L_0x0029:
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x003d
            X.4Ph r1 = r7.A02
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x003d
            X.4Ph r0 = r7.A03
            r7.A03 = r1
            r7.A02 = r0
            r7.A04 = r5
        L_0x003d:
            r7.A01 = r12
            X.4Ph r0 = r7.A03
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x004b
            int r0 = r7.A00
            int r5 = r0 + 1
        L_0x004b:
            r7.A00 = r5
            r11.A00()
            return
        L_0x0051:
            long r0 = r7.A01
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0029
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0075
            X.4Ph r8 = r7.A02
            long r3 = r8.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            boolean[] r2 = r8.A07
            long r3 = r3 - r9
            r0 = 15
            long r3 = r3 % r0
            int r0 = (int) r3
            boolean r0 = r2[r0]
            if (r0 == 0) goto L_0x0081
        L_0x0075:
            X.4Ph r0 = r7.A02
            r0.A00()
            X.4Ph r8 = r7.A02
            long r0 = r7.A01
            r8.A01(r0)
        L_0x0081:
            r7.A04 = r6
            r8.A01(r12)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264264Pf.A06(long):void");
    }

    public C264264Pf(Context context) {
        C264314Pk r0;
        C264304Pj r1 = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
            if (displayManager != null) {
                r1 = new C264294Pi(displayManager);
            } else {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    r1 = new WMR(windowManager);
                } else {
                    r1 = null;
                }
            }
        }
        this.A0G = r1;
        if (r1 != null) {
            r0 = C264314Pk.A05;
        } else {
            r0 = null;
        }
        this.A0F = r0;
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0A = -1.0f;
        this.A00 = 1.0f;
        this.A01 = 0;
    }
}
