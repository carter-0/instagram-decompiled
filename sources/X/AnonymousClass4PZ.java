package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.4PZ  reason: invalid class name */
public final class AnonymousClass4PZ {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C264214Pa A0A;
    public final C264224Pb A0B;

    public final void A02() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A02.sendEmptyMessage(1);
            C264214Pa r2 = this.A0A;
            if (r2 != null) {
                r2.A00.registerDisplayListener(r2, (Handler) null);
            }
            A00(this);
        }
    }

    public static void A00(AnonymousClass4PZ r4) {
        Display defaultDisplay = r4.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            r4.A06 = refreshRate;
            r4.A07 = (refreshRate * 80) / 100;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (java.lang.Math.abs((r23 - r13.A01) - r15) > 20000000) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A01(long r21, long r23) {
        /*
            r20 = this;
            r6 = 1000(0x3e8, double:4.94E-321)
            r10 = r21
            long r6 = r6 * r21
            r13 = r20
            boolean r12 = r13.A08
            r8 = r23
            if (r12 == 0) goto L_0x009b
            long r0 = r13.A04
            int r2 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x001f
            long r0 = r13.A03
            r2 = 1
            long r0 = r0 + r2
            r13.A03 = r0
            long r0 = r13.A05
            r13.A02 = r0
        L_0x001f:
            long r0 = r13.A03
            r3 = 6
            r14 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            long r4 = r13.A00
            long r15 = r6 - r4
            if (r2 < 0) goto L_0x0088
            long r15 = r15 / r0
            long r2 = r13.A02
            long r2 = r2 + r15
            long r17 = r2 - r4
            long r0 = r13.A01
            long r15 = r23 - r0
            long r15 = r15 - r17
            long r18 = java.lang.Math.abs(r15)
            r16 = 20000000(0x1312d00, double:9.881313E-317)
            int r15 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r15 > 0) goto L_0x0098
            long r0 = r0 + r2
            long r0 = r0 - r4
        L_0x0045:
            if (r12 != 0) goto L_0x0052
            r13.A00 = r6
            r13.A01 = r8
            r4 = 0
            r13.A03 = r4
            r4 = 1
            r13.A08 = r4
        L_0x0052:
            r13.A04 = r10
            r13.A05 = r2
            X.4Pb r7 = r13.A0B
            if (r7 == 0) goto L_0x009e
            long r5 = r13.A06
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x009e
            long r5 = r7.A04
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x009e
            long r7 = r13.A06
            long r2 = r0 - r5
            long r2 = r2 / r7
            long r2 = r2 * r7
            long r5 = r5 + r2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0084
            long r2 = r5 - r7
        L_0x0078:
            long r7 = r5 - r0
            long r0 = r0 - r2
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0080
            r5 = r2
        L_0x0080:
            long r0 = r13.A07
            long r5 = r5 - r0
            return r5
        L_0x0084:
            long r7 = r7 + r5
            r2 = r5
            r5 = r7
            goto L_0x0078
        L_0x0088:
            long r0 = r13.A01
            long r2 = r23 - r0
            long r2 = r2 - r15
            long r3 = java.lang.Math.abs(r2)
            r1 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
        L_0x0098:
            r13.A08 = r14
            r12 = 0
        L_0x009b:
            r0 = r8
            r2 = r6
            goto L_0x0045
        L_0x009e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PZ.A01(long, long):long");
    }

    public AnonymousClass4PZ(Context context) {
        C264214Pa r0;
        if (context != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            this.A09 = windowManager;
            if (windowManager != null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager == null) {
                    r0 = null;
                } else {
                    r0 = new C264214Pa(displayManager, this);
                }
                this.A0A = r0;
                this.A0B = C264224Pb.A05;
            }
            this.A0A = null;
            this.A0B = null;
        } else {
            this.A09 = null;
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public AnonymousClass4PZ() {
        this((Context) null);
    }
}
