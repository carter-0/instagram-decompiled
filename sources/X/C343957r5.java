package X;

import org.webrtc.CameraVideoCapturer;

/* renamed from: X.7r5  reason: invalid class name and case insensitive filesystem */
public class C343957r5 extends C343907r0 implements C343967r6 {
    public int Ar5(int i) {
        switch (i) {
            case 1004:
                return 10;
            case 1005:
                return 0;
            case 1007:
                return CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
            default:
                return CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        }
    }

    public boolean CTO(int i) {
        return i == 94 || i == 95;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7qt, java.lang.Object] */
    @Deprecated
    public C343957r5() {
        this.A00 = new Object();
    }

    public final String Ar6(int i) {
        if (!(this instanceof C343947r4)) {
            return "baseline";
        }
        if (182.A06(0Tu.A05, ((C343947r4) this).A00, 36311182528872913L)) {
            return "high";
        }
        return "baseline";
    }

    public long B4o(int i) {
        switch (i) {
            case 4:
                return 10000;
            case 5:
                return 200;
            case 6:
            case 7:
                return -1;
            default:
                return 0;
        }
    }

    public final String B4t(int i) {
        if (!(this instanceof C343947r4)) {
            return "";
        }
        C343947r4 r1 = (C343947r4) this;
        if (i == 1) {
            return 182.A04(0Tu.A05, r1.A00, 36877263513321601L);
        } else if (i == 3) {
            return "prewarm_and_muxer_generate";
        } else {
            return "";
        }
    }

    public final C343937r3 BJv() {
        return C343967r6.A00;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (X.182.A06(r0, r4, r2) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        return java.lang.Boolean.valueOf(X.182.A06(r2, r3, r0)).booleanValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CTP(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C343947r4
            if (r0 == 0) goto L_0x000e
            r0 = r5
            X.7r4 r0 = (X.C343947r4) r0
            r1 = 1
            switch(r6) {
                case 65: goto L_0x0044;
                case 66: goto L_0x0056;
                case 67: goto L_0x0068;
                case 68: goto L_0x007a;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r6) {
                case 74: goto L_0x0022;
                case 75: goto L_0x0010;
                case 76: goto L_0x008c;
                case 77: goto L_0x00a4;
                default: goto L_0x000e;
            }
        L_0x000e:
            r1 = 0
        L_0x000f:
            return r1
        L_0x0010:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r4)
            if (r0 != 0) goto L_0x000e
            X.0Tu r0 = X.0Tu.A06
            r2 = 36311831070049049(0x81016b00130319, double:3.027086412482069E-306)
            goto L_0x009d
        L_0x0022:
            com.instagram.common.session.UserSession r3 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 == 0) goto L_0x00b3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36593078412444588(0x820136000303ac, double:3.204948364305155E-306)
            long r0 = X.182.A01(r2, r3, r0)
            int r2 = (int) r0
            r0 = 48000(0xbb80, float:6.7262E-41)
            r1 = 0
            if (r2 != r0) goto L_0x000f
            r1 = 1
            return r1
        L_0x0044:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r4)
            if (r0 != 0) goto L_0x000e
            X.0Tu r0 = X.0Tu.A06
            r2 = 36311831069917975(0x81016b00110317, double:3.027086412399177E-306)
            goto L_0x009d
        L_0x0056:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r4)
            if (r0 != 0) goto L_0x000e
            X.0Tu r0 = X.0Tu.A06
            r2 = 36311831070442269(0x81016b0019031d, double:3.027086412730743E-306)
            goto L_0x009d
        L_0x0068:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r4)
            if (r0 != 0) goto L_0x000e
            X.0Tu r0 = X.0Tu.A06
            r2 = 36311831070507806(0x81016b001a031e, double:3.0270864127721886E-306)
            goto L_0x009d
        L_0x007a:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r4)
            if (r0 != 0) goto L_0x000e
            X.0Tu r0 = X.0Tu.A06
            r2 = 36311831069590291(0x81016b000c0313, double:3.0270864121919485E-306)
            goto L_0x009d
        L_0x008c:
            com.instagram.common.session.UserSession r4 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r4)
            if (r0 != 0) goto L_0x000e
            X.0Tu r0 = X.0Tu.A06
            r2 = 36311831070311195(0x81016b0017031b, double:3.027086412647851E-306)
        L_0x009d:
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x00a4:
            com.instagram.common.session.UserSession r3 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.C362998is.A00(r0, r3)
            if (r0 == 0) goto L_0x00bb
            boolean r1 = X.XXs.A00(r3)
            return r1
        L_0x00b3:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36311831069983512(0x81016b00120318, double:3.027086412440623E-306)
            goto L_0x00c2
        L_0x00bb:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36311831070180122(0x81016b0015031a, double:3.02708641256496E-306)
        L_0x00c2:
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343957r5.CTP(int):boolean");
    }
}
