package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.47r  reason: invalid class name and case insensitive filesystem */
public class C2609547r extends C2609647s {
    public final C257263x7 A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2609547r(X.C257263x7 r2, java.io.IOException r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r0) goto L_0x0009
            r0 = 1
            if (r5 != r0) goto L_0x0009
            r4 = 2001(0x7d1, float:2.804E-42)
        L_0x0009:
            r1.<init>((int) r4, (java.lang.Throwable) r3)
            r1.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2609547r.<init>(X.3x7, java.io.IOException, int, int):void");
    }

    public static C2609547r A00(C257263x7 r3, IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && C256643w7.A00(message).matches(Pxd.A00(666))) {
            return new C2609547r(r3, iOException, Pxd.A00(458), 2007);
        } else {
            i2 = 2001;
        }
        return new C2609547r(r3, iOException, i2, i);
    }

    @Deprecated
    public C2609547r(C257263x7 r2, String str, int i) {
        this(r2, str, (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, i);
    }

    public C2609547r(C257263x7 r1) {
        this.A00 = r1;
    }

    public C2609547r(C257263x7 r1, IOException iOException, String str, int i) {
        super(str, iOException, i);
        this.A00 = r1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2609547r(X.C257263x7 r2, java.lang.String r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r0) goto L_0x0009
            r0 = 1
            if (r5 != r0) goto L_0x0009
            r4 = 2001(0x7d1, float:2.804E-42)
        L_0x0009:
            r1.<init>((java.lang.String) r3, (int) r4)
            r1.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2609547r.<init>(X.3x7, java.lang.String, int, int):void");
    }
}
