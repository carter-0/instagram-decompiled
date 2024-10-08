package X;

import java.net.ProtocolException;

public final class Y7R extends C22462Y4t {
    public long A00;
    public final /* synthetic */ C22456Y4n A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Y7R(C22456Y4n y4n, long j) {
        super(y4n);
        this.A01 = y4n;
        this.A00 = j;
        if (j == 0) {
            A00();
        }
    }

    public final long E6C(C13198TPe tPe, long j) {
        if (j < 0) {
            throw Pxg.A0b("byteCount < 0: ", j);
        } else if (!this.A00) {
            long j2 = this.A00;
            if (j2 == 0) {
                return -1;
            }
            long E6C = super.E6C(tPe, Math.min(j2, j));
            if (E6C != -1) {
                long j3 = this.A00 - E6C;
                this.A00 = j3;
                if (j3 == 0) {
                    A00();
                }
                return E6C;
            }
            this.A01.A04.A01();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            A00();
            throw protocolException;
        } else {
            throw Pxh.A0a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (X.SUS.A0C(java.util.concurrent.TimeUnit.MILLISECONDS, r5, 100) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r5 = this;
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0023
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 100
            boolean r0 = X.SUS.A0C(r1, r5, r0)     // Catch:{ IOException -> 0x0016 }
            if (r0 != 0) goto L_0x0020
        L_0x0016:
            X.Y4n r0 = r5.A01
            X.Y7U r0 = r0.A04
            r0.A01()
            r5.A00()
        L_0x0020:
            r0 = 1
            r5.A00 = r0
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y7R.close():void");
    }
}
