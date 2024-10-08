package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class TZ6 extends C11291SJy {
    public static TZ6 A03;
    public static final long A04;
    public static final long A05;
    public long A00;
    public TZ6 A01;
    public boolean A02;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        A04 = millis;
        A05 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public void A09() {
        if (this instanceof TZ3) {
            TZ3 tz3 = (TZ3) this;
            try {
                tz3.A00.close();
            } catch (Exception e) {
                SQW.A00.log(Level.WARNING, AnonymousClass7TF.A0i(tz3.A00, AnonymousClass7TF.A0n("Failed to close timed out socket ")), e);
            } catch (AssertionError e2) {
                if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                    throw e2;
                }
                SQW.A00.log(Level.WARNING, AnonymousClass7TF.A0i(tz3.A00, AnonymousClass7TF.A0n("Failed to close timed out socket ")), e2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.TZ6, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[LOOP:0: B:25:0x005a->B:29:0x0065, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068 A[EDGE_INSN: B:40:0x0068->B:30:0x0068 ?: BREAK  
    EDGE_INSN: B:41:0x0068->B:30:0x0068 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r10 = this;
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0078
            long r3 = r10.A01()
            boolean r5 = r10.A07()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            if (r5 != 0) goto L_0x0015
            return
        L_0x0015:
            r0 = 1
            r10.A02 = r0
            java.lang.Class<X.TZ6> r9 = X.TZ6.class
            monitor-enter(r9)
            X.TZ6 r0 = A03     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x002e
            X.TZ6 r0 = new X.TZ6     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            A03 = r0     // Catch:{ all -> 0x0075 }
            X.TQx r0 = new X.TQx     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            r0.start()     // Catch:{ all -> 0x0075 }
        L_0x002e:
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0075 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            long r0 = r10.A00()     // Catch:{ all -> 0x0075 }
            long r0 = r0 - r7
            long r3 = java.lang.Math.min(r3, r0)     // Catch:{ all -> 0x0075 }
            goto L_0x004e
        L_0x0042:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            if (r5 == 0) goto L_0x0049
            goto L_0x0050
        L_0x0049:
            java.lang.AssertionError r0 = X.Pxe.A0d()     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x004e:
            long r3 = r3 + r7
            goto L_0x0054
        L_0x0050:
            long r3 = r10.A00()     // Catch:{ all -> 0x0075 }
        L_0x0054:
            r10.A00 = r3     // Catch:{ all -> 0x0075 }
            long r3 = r3 - r7
            X.TZ6 r6 = A03     // Catch:{ all -> 0x0075 }
            r5 = r6
        L_0x005a:
            X.TZ6 r0 = r6.A01     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0068
            long r1 = r0.A00     // Catch:{ all -> 0x0075 }
            long r1 = r1 - r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            X.TZ6 r6 = r6.A01     // Catch:{ all -> 0x0075 }
            goto L_0x005a
        L_0x0068:
            X.TZ6 r0 = r6.A01     // Catch:{ all -> 0x0075 }
            r10.A01 = r0     // Catch:{ all -> 0x0075 }
            r6.A01 = r10     // Catch:{ all -> 0x0075 }
            if (r6 != r5) goto L_0x0073
            r9.notify()     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r9)
            return
        L_0x0075:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0078:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TZ6.A0A():void");
    }

    public final boolean A0C() {
        boolean z;
        if (!this.A02) {
            return false;
        }
        this.A02 = false;
        synchronized (TZ6.class) {
            TZ6 tz6 = A03;
            while (true) {
                if (tz6 == null) {
                    z = true;
                    break;
                }
                TZ6 tz62 = tz6.A01;
                if (tz62 == this) {
                    tz6.A01 = this.A01;
                    this.A01 = null;
                    z = false;
                    break;
                }
                tz6 = tz62;
            }
        }
        return z;
    }

    public IOException A08(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void A0B() {
        if (A0C()) {
            throw A08((IOException) null);
        }
    }
}
