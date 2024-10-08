package X;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: X.6I9  reason: invalid class name */
public final class AnonymousClass6I9 implements Runnable, Choreographer.FrameCallback, AnonymousClass2DP, AnonymousClass6IA {
    public static long A06;
    public boolean A00;
    public long A01;
    public boolean A02;
    public final View A03;
    public final C285045Pl A04 = new C285045Pl(new AnonymousClass6IB[16]);
    public final Choreographer A05 = Choreographer.getInstance();

    public final void Csx() {
    }

    public final void DGg() {
        this.A02 = false;
        this.A03.removeCallbacks(this);
        this.A05.removeFrameCallback(this);
    }

    public final void DdA() {
        this.A02 = true;
    }

    public final void doFrame(long j) {
        if (this.A02) {
            this.A01 = j;
            this.A03.post(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r10 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            X.5Pl r9 = r11.A04
            int r1 = r9.A00
            r0 = 0
            if (r1 != 0) goto L_0x0008
            r0 = 1
        L_0x0008:
            r8 = 0
            if (r0 != 0) goto L_0x0057
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x0057
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0057
            android.view.View r0 = r11.A03
            int r0 = r0.getWindowVisibility()
            if (r0 != 0) goto L_0x0057
            long r0 = r11.A01
            long r2 = A06
            long r0 = r0 + r2
            X.GR1 r7 = new X.GR1
            r7.<init>(r0)
            r10 = 0
        L_0x0026:
            int r0 = r9.A00
            if (r0 == 0) goto L_0x004f
            if (r10 != 0) goto L_0x0051
            long r5 = r7.A00
            long r0 = java.lang.System.nanoTime()
            long r5 = r5 - r0
            r3 = 0
            long r1 = java.lang.Math.max(r3, r5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            java.lang.Object[] r0 = r9.A02
            r0 = r0[r8]
            X.6IB r0 = (X.AnonymousClass6IB) r0
            boolean r0 = r0.ATI(r7)
            if (r0 != 0) goto L_0x004d
            r9.A00(r8)
            goto L_0x0026
        L_0x004d:
            r10 = 1
            goto L_0x0026
        L_0x004f:
            if (r10 == 0) goto L_0x0057
        L_0x0051:
            android.view.Choreographer r0 = r11.A05
            r0.postFrameCallback(r11)
            return
        L_0x0057:
            r11.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6I9.run():void");
    }

    public AnonymousClass6I9(View view) {
        this.A03 = view;
        if (A06 == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            A06 = (long) (1.0E9f / f);
        }
    }
}
