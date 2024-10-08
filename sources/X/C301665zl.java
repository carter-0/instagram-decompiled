package X;

import android.os.SystemClock;

/* renamed from: X.5zl  reason: invalid class name and case insensitive filesystem */
public final class C301665zl {
    public int A00 = -1;
    public AnonymousClass8GP A01;
    public AnonymousClass8GN A02;
    public C353058Gc A03;
    public AnonymousClass8GR A04;
    public C353038Ga A05;
    public Float A06;
    public Integer A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C = true;
    public final C301655zk A0D;
    public final Runnable A0E = new C301675zm(this);

    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.MotionEvent r11, X.C301685zn r12, X.C301665zl r13) {
        /*
            X.5zk r2 = r13.A0D
            android.os.Handler r1 = r2.getHandler()
            java.lang.Runnable r0 = r13.A0E
            r1.removeCallbacks(r0)
            r0 = 0
            r13.A06 = r0
            int r1 = r11.getAction()
            r0 = 3
            if (r1 != r0) goto L_0x0035
            X.8GN r0 = r13.A02
            if (r0 == 0) goto L_0x0034
            X.8GM r0 = (X.AnonymousClass8GM) r0
            X.8Fl r0 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A0f
            X.8A2 r2 = X.AnonymousClass8A1.A01(r0)
            X.29E r3 = r2.A0K
            long r7 = r2.A08
            r6 = 17630492(0x10d051c, float:2.5901276E-38)
            java.lang.String r4 = "user_cancelled"
            java.lang.String r5 = ""
            long r0 = r3.A06(r4, r5, r6, r7)
            r2.A08 = r0
        L_0x0034:
            return
        L_0x0035:
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x0043
            X.8GN r0 = r13.A02
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "Action up suppressed"
        L_0x003f:
            r0.CkU(r1)
            return
        L_0x0043:
            java.lang.Integer r1 = r13.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00d8
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "single_tap_stop"
        L_0x004f:
            r2.DnW(r0)
            return
        L_0x0053:
            X.5zn r3 = X.C301685zn.READY_TO_SHOOT
            if (r12 == r3) goto L_0x005b
            X.5zn r0 = X.C301685zn.READY_TO_SHOOT_MULTI_CAPTURE
            if (r12 != r0) goto L_0x00d8
        L_0x005b:
            r7 = r2
            com.instagram.ui.widget.shutterbutton.ShutterButton r7 = (com.instagram.ui.widget.shutterbutton.ShutterButton) r7
            X.2cs r0 = r7.A0g
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00d8
            float r0 = r11.getRawX()
            int r10 = (int) r0
            float r0 = r11.getRawY()
            int r9 = (int) r0
            int[] r4 = r7.A0m
            r7.getLocationOnScreen(r4)
            android.graphics.Rect r8 = r7.A0a
            r7.getGlobalVisibleRect(r8)
            r0 = 0
            r6 = r4[r0]
            int r1 = r8.bottom
            int r0 = r8.top
            int r1 = r1 - r0
            int r5 = r6 + r1
            r0 = 1
            r4 = r4[r0]
            int r1 = r8.right
            int r0 = r8.left
            int r1 = r1 - r0
            int r0 = r4 + r1
            r8.set(r6, r4, r5, r0)
            boolean r0 = r8.contains(r10, r9)
            if (r0 == 0) goto L_0x00d8
            X.5zn r1 = r7.A0C
            X.5zn r0 = X.C301685zn.READY_TO_SHOOT_MULTI_CAPTURE
            if (r1 != r0) goto L_0x00ad
            float r1 = r7.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
        L_0x00a5:
            X.8GR r0 = r13.A04
            if (r0 == 0) goto L_0x0034
            r0.Dkw()
            return
        L_0x00ad:
            X.8GP r0 = r13.A01
            if (r0 == 0) goto L_0x00a5
            X.8GO r0 = (X.AnonymousClass8GO) r0
            X.8Fl r0 = r0.A00
            boolean r0 = X.C352888Fl.A0I(r0)
            if (r0 != 0) goto L_0x00a5
            X.8GP r0 = r13.A01
            if (r0 == 0) goto L_0x00d0
            X.8GO r0 = (X.AnonymousClass8GO) r0
            X.8Fl r0 = r0.A00
            X.8W6 r0 = r0.A0B
            X.88F r1 = r0.A0N
            if (r1 == 0) goto L_0x00d0
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x00d0
            r1.A06()
        L_0x00d0:
            r2.setMode(r3)
            java.lang.String r0 = "ShutterButton"
            java.lang.String r1 = "Not handling single tap since camera is not initialized"
            goto L_0x00f5
        L_0x00d8:
            java.lang.Integer r1 = r13.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00ee
            X.5zn r0 = X.C301685zn.RECORDING_VIDEO
            if (r12 == r0) goto L_0x00e6
            X.5zn r0 = X.C301685zn.RECORD_VIDEO_REQUESTED
            if (r12 != r0) goto L_0x00ee
        L_0x00e6:
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "long_press_stop"
            goto L_0x004f
        L_0x00ee:
            java.lang.String r0 = "ShutterButton"
            java.lang.String r1 = "Empty action at the end of ShutterButton touch"
            X.0KC.A0D(r0, r1)
        L_0x00f5:
            X.0wb.A03(r0, r1)
            X.8GN r0 = r13.A02
            if (r0 == 0) goto L_0x0034
            goto L_0x003f
        L_0x00fe:
            r0 = 1
            r13.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C301665zl.A00(android.view.MotionEvent, X.5zn, X.5zl):void");
    }

    public final void A01(String str) {
        AnonymousClass88F r1;
        AnonymousClass8GP r0 = this.A01;
        if (r0 == null || C352888Fl.A0I(((AnonymousClass8GO) r0).A00)) {
            AnonymousClass8GN r02 = this.A02;
            if (r02 != null) {
                AnonymousClass8A1.A01(((AnonymousClass8GM) r02).A00.A0f).A0F(str);
            }
            this.A0D.setMode(C301685zn.RECORD_VIDEO_REQUESTED);
            SystemClock.elapsedRealtime();
            C353058Gc r03 = this.A03;
            if (r03 != null) {
                r03.Dmi(str);
                return;
            }
            return;
        }
        AnonymousClass8GP r04 = this.A01;
        if (!(r04 == null || (r1 = ((AnonymousClass8GO) r04).A00.A0B.A0N) == null || r1.A0f)) {
            r1.A06();
        }
        this.A0D.setMode(C301685zn.READY_TO_SHOOT);
    }

    public C301665zl(C301655zk r3) {
        this.A0D = r3;
    }
}
