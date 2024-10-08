package X;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

public final class RC0 extends BufferedOutputStream {
    public boolean A00;

    public final void close() {
        this.A00 = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
            if (th == null) {
                return;
            }
        } catch (Throwable th2) {
            if (th == null) {
                throw th2;
            }
        }
        throw th;
    }

    public final void A00(OutputStream outputStream) {
        C256703wD.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }
}
