package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.TPl  reason: case insensitive filesystem */
public final class C13205TPl implements C13970TmY {
    public final /* synthetic */ InputStream A00;
    public final /* synthetic */ C11291SJy A01;

    public C13205TPl(InputStream inputStream, C11291SJy sJy) {
        this.A01 = sJy;
        this.A00 = inputStream;
    }

    public final long E6C(C13198TPe tPe, long j) {
        Throwable e;
        if (j < 0) {
            e = Pxg.A0b("byteCount < 0: ", j);
            throw e;
        } else if (j == 0) {
            return 0;
        } else {
            try {
                this.A01.A06();
                SRX A09 = tPe.A09(1);
                int i = A09.A00;
                int read = this.A00.read(A09.A06, i, (int) Math.min(j, (long) (8192 - i)));
                if (read == -1) {
                    return -1;
                }
                A09.A00 += read;
                long j2 = (long) read;
                tPe.A00 += j2;
                return j2;
            } catch (AssertionError e2) {
                e = e2;
                if (!(e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed"))) {
                    throw new IOException(e);
                }
            }
        }
    }

    public final C11291SJy Ezn() {
        return this.A01;
    }

    public final void close() {
        this.A00.close();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("source(");
        return Pxg.A0q(this.A00, A1A);
    }
}
