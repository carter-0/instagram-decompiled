package X;

import android.os.Handler;
import com.instagram.clips.intf.ClipsViewerConfig;

public final class GD0 extends C52050GCw {
    public long A00;
    public boolean A01;
    public final Handler A02 = new Handler();
    public final C57048IMo A03 = new C57048IMo(this, 3);
    public final ClipsViewerConfig A04;
    public final C270664h6 A05 = new H39(this, 1);
    public final Runnable A06 = new C57779IgK(this);
    public final Runnable A07 = new C57780IgL(this);
    public final C62320sa A08;

    public GD0(ClipsViewerConfig clipsViewerConfig, C62320sa r4) {
        this.A04 = clipsViewerConfig;
        this.A08 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = ((X.GD6) r7.A08.invoke()).A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r7 = this;
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.A00
            long r5 = r5 - r3
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0013
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
        L_0x0013:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0072
            X.0sa r0 = r7.A08
            java.lang.Object r0 = r0.invoke()
            X.GD6 r0 = (X.GD6) r0
            r4 = 1
            X.GBg r0 = r0.A0A
            int r1 = r0.A0A()
            if (r4 >= r1) goto L_0x0072
            java.util.List r0 = r0.A0I()
            java.util.List r0 = r0.subList(r4, r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r2.next()
            X.4bN r0 = (X.C267324bN) r0
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r1 != r0) goto L_0x0034
            com.instagram.clips.intf.ClipsViewerConfig r0 = r7.A04
            X.4h4 r0 = r0.A0H
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x005e
            r0 = 2
            if (r1 == r0) goto L_0x0068
            r0 = 0
            if (r1 == r0) goto L_0x0072
            r0 = 3
            if (r1 == r0) goto L_0x0072
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005e:
            r2 = 500(0x1f4, double:2.47E-321)
            android.os.Handler r1 = r7.A02
            java.lang.Runnable r0 = r7.A06
            r1.postDelayed(r0, r2)
            goto L_0x0070
        L_0x0068:
            X.GBj r1 = r7.A02
            if (r1 == 0) goto L_0x0070
            r0 = 0
            r1.A0L(r0)
        L_0x0070:
            r7.A01 = r4
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GD0.A0C():void");
    }
}
