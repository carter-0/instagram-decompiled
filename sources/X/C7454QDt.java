package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: X.QDt  reason: case insensitive filesystem */
public class C7454QDt extends C8841RCg {
    public final int A00;
    public final SH8 A01;

    public C7454QDt(SH8 sh8) {
        this.A01 = sh8;
        this.A00 = 1;
    }

    public static C7454QDt A00(SH8 sh8, IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && C256643w7.A00(message).matches("cleartext.*not permitted.*")) {
            return new C7454QDt(sh8, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", 2007);
        } else {
            i2 = 2001;
        }
        return new C7454QDt(sh8, iOException, i2, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7454QDt(X.SH8 r2, java.io.IOException r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r0) goto L_0x0009
            r0 = 1
            if (r5 != r0) goto L_0x0009
            r4 = 2001(0x7d1, float:2.804E-42)
        L_0x0009:
            r1.<init>(r4, r3)
            r1.A01 = r2
            r1.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7454QDt.<init>(X.SH8, java.io.IOException, int, int):void");
    }

    public C7454QDt(SH8 sh8, IOException iOException, String str, int i) {
        super(str, iOException, i);
        this.A01 = sh8;
        this.A00 = 1;
    }
}
