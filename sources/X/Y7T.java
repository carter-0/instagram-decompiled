package X;

import java.net.ProtocolException;

public final class Y7T extends C22462Y4t {
    public long A00 = -1;
    public boolean A01 = true;
    public final C11427STm A02;
    public final /* synthetic */ C22456Y4n A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Y7T(C11427STm sTm, C22456Y4n y4n) {
        super(y4n);
        this.A03 = y4n;
        this.A02 = sTm;
    }

    public final long E6C(C13198TPe tPe, long j) {
        if (j < 0) {
            throw Pxg.A0b("byteCount < 0: ", j);
        } else if (this.A00) {
            throw Pxh.A0a();
        } else if (!this.A01) {
            return -1;
        } else {
            long j2 = this.A00;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    this.A03.A06.E6p();
                }
                try {
                    C22456Y4n y4n = this.A03;
                    YCT yct = y4n.A06;
                    this.A00 = yct.E6U();
                    String trim = yct.E6p().trim();
                    long j3 = this.A00;
                    if (j3 < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                        throw new ProtocolException(002.A0r("expected chunk size and optional extensions but was \"", trim, "\"", j3));
                    }
                    if (j3 == 0) {
                        this.A01 = false;
                        C22023Xt4 A002 = C22456Y4n.A00(y4n);
                        y4n.A02 = A002;
                        SQZ.A01(y4n.A03.A0I, A002, this.A02);
                        A00();
                    }
                    if (!this.A01) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long E6C = super.E6C(tPe, Math.min(j, this.A00));
            if (E6C != -1) {
                this.A00 -= E6C;
                return E6C;
            }
            this.A03.A04.A01();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            A00();
            throw protocolException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (X.SUS.A0C(java.util.concurrent.TimeUnit.MILLISECONDS, r2, 100) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r2 = this;
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x001f
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x001c
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 100
            boolean r0 = X.SUS.A0C(r1, r2, r0)     // Catch:{ IOException -> 0x0012 }
            if (r0 != 0) goto L_0x001c
        L_0x0012:
            X.Y4n r0 = r2.A03
            X.Y7U r0 = r0.A04
            r0.A01()
            r2.A00()
        L_0x001c:
            r0 = 1
            r2.A00 = r0
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y7T.close():void");
    }
}
