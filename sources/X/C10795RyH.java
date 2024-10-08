package X;

import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.Surface;

/* renamed from: X.RyH  reason: case insensitive filesystem */
public final class C10795RyH {
    public int A00;
    public long A01 = 0;
    public SurfaceTexture A02;
    public HandlerThread A03;
    public Surface A04;
    public Q1W A05;
    public final /* synthetic */ C10429Rs5 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10795RyH(X.C10429Rs5 r5, X.C7334Q4k r6, int r7) {
        /*
            r4 = this;
            r4.A06 = r5
            r4.<init>()
            r0 = 0
            r4.A01 = r0
            boolean r0 = r6.A0F()
            if (r0 == 0) goto L_0x0025
            boolean r0 = r6 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0073
            r1 = r6
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0025
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0u
        L_0x0022:
            r1 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            X.Rs5 r3 = r4.A06
            X.Tih r0 = r3.A00
            r0.getClass()
            android.graphics.SurfaceTexture r2 = r0.BHZ(r7, r1)
            r2.getClass()
            r4.A00 = r7
            if (r1 == 0) goto L_0x003a
            r4.A02 = r2
        L_0x003a:
            X.Q1W r1 = new X.Q1W
            r1.<init>(r2)
            r4.A05 = r1
            boolean r0 = r6 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0071
            X.QeC r6 = (X.C7964QeC) r6
            int r0 = r6.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0071
            r0 = 1
        L_0x004e:
            r1.A03 = r0
            boolean r0 = r3.A01
            r1.A02 = r0
            r1 = -19
            java.lang.String r0 = "videotranscoder-framecallback"
            android.os.HandlerThread r0 = X.Pxf.A0J(r0, r1)
            r4.A03 = r0
            r0.start()
            X.Q1W r1 = r4.A05
            android.os.HandlerThread r0 = r4.A03
            X.Pxh.A16(r1, r2, r0)
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r2)
            r4.A04 = r0
            return
        L_0x0071:
            r0 = 0
            goto L_0x004e
        L_0x0073:
            boolean r0 = r6 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0025
            r0 = r6
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318118900995968(0x81072300011780, double:3.0310628620919634E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10795RyH.<init>(X.Rs5, X.Q4k, int):void");
    }
}
