package X;

import com.google.common.io.Closeables;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.ByteBuffer;

/* renamed from: X.LeY  reason: case insensitive filesystem */
public final class C64588LeY implements 1Qb, 1Qd {
    public long A00 = -1;
    public InputStream A01;
    public final C249513ju A02 = JTO.A1G(1);
    public final C249513ju A03 = JTO.A1G(1);
    public final URI A04;
    public final C249513ju A05 = G9w.A0w();

    public final void onFailed(IOException iOException) {
        0qQ.A0B(iOException, 0);
        C249513ju r1 = this.A03;
        C301205yj.A00(new C61502KAh(iOException), r1);
        r1.AI3(iOException);
        this.A05.AI3(iOException);
    }

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
        allocate.put(byteBuffer);
        allocate.rewind();
        C301205yj.A00(allocate, this.A05);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[Catch:{ InterruptedException -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[Catch:{ InterruptedException -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[Catch:{ InterruptedException -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResponseStarted(X.2ZD r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            int r4 = r6.A01     // Catch:{ InterruptedException -> 0x004e }
            java.lang.String r3 = r6.A02     // Catch:{ InterruptedException -> 0x004e }
            int r2 = r6.A00     // Catch:{ InterruptedException -> 0x004e }
            java.util.List r0 = r6.A03     // Catch:{ InterruptedException -> 0x004e }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ InterruptedException -> 0x004e }
            X.2ZL r1 = new X.2ZL     // Catch:{ InterruptedException -> 0x004e }
            r1.<init>(r3, r0, r4, r2)     // Catch:{ InterruptedException -> 0x004e }
            r1.A00 = r5     // Catch:{ InterruptedException -> 0x004e }
            X.3ju r0 = r5.A02     // Catch:{ InterruptedException -> 0x004e }
            X.C301205yj.A00(r1, r0)     // Catch:{ InterruptedException -> 0x004e }
            r0 = 426(0x1aa, float:5.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ InterruptedException -> 0x004e }
            X.1Fn r0 = r6.A00(r0)     // Catch:{ InterruptedException -> 0x004e }
            r2 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0034
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x003a
        L_0x0032:
            r0 = move-exception
            goto L_0x0036
        L_0x0034:
            r1 = r2
            goto L_0x003a
        L_0x0036:
            X.0eQ r1 = X.JTO.A1B(r0)     // Catch:{ InterruptedException -> 0x004e }
        L_0x003a:
            boolean r0 = r1 instanceof X.0eQ     // Catch:{ InterruptedException -> 0x004e }
            if (r0 != 0) goto L_0x003f
            r2 = r1
        L_0x003f:
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ InterruptedException -> 0x004e }
            if (r2 == 0) goto L_0x004a
            long r0 = r2.longValue()     // Catch:{ InterruptedException -> 0x004e }
        L_0x0047:
            r5.A00 = r0     // Catch:{ InterruptedException -> 0x004e }
            goto L_0x004d
        L_0x004a:
            long r0 = r5.A00     // Catch:{ InterruptedException -> 0x004e }
            goto L_0x0047
        L_0x004d:
            return
        L_0x004e:
            java.lang.String r0 = "Interrupted while receiving response."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64588LeY.onResponseStarted(X.2ZD):void");
    }

    public final void AI7() {
        Closeables.A01(this.A01);
    }

    public final long AJg() {
        return this.A00;
    }

    public final InputStream AjD() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            return inputStream;
        }
        C62438Kfo kfo = new C62438Kfo(this.A05);
        this.A01 = kfo;
        return kfo;
    }

    public final void close() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void onComplete() {
        C249513ju r2 = this.A03;
        C301205yj.A00(C61503KAi.A00, r2);
        r2.AI3((Throwable) null);
        this.A05.AI3((Throwable) null);
    }

    public C64588LeY(URI uri) {
        this.A04 = uri;
    }
}
