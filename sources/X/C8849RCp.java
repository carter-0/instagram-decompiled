package X;

import com.facebook.proxygen.ReadBuffer;
import java.io.InputStream;

/* renamed from: X.RCp  reason: case insensitive filesystem */
public final class C8849RCp extends InputStream {
    public C8838RCa A00;
    public boolean A01;
    public final ReadBuffer A02;

    public final synchronized int available() {
        return this.A02.size();
    }

    public final synchronized void close() {
        if (!this.A01) {
            this.A02.close();
            this.A01 = true;
        }
    }

    public final boolean markSupported() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|(1:14)(1:24)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001a A[LOOP:0: B:7:0x000f->B:14:0x001a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r4, int r5, int r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A01     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0021
            X.RCa r0 = r3.A00     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0027
            com.facebook.proxygen.ReadBuffer r2 = r3.A02     // Catch:{ all -> 0x0028 }
            int r0 = r2.read(r4, r5, r6)     // Catch:{ all -> 0x0028 }
        L_0x000f:
            if (r0 != 0) goto L_0x001f
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0016 }
        L_0x0016:
            X.RCa r0 = r3.A00     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0027
            int r0 = r2.read(r4, r5, r6)     // Catch:{ all -> 0x0028 }
            goto L_0x000f
        L_0x001f:
            monitor-exit(r3)
            return r0
        L_0x0021:
            java.lang.String r0 = "Buffer is Closed"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0028 }
        L_0x0027:
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8849RCp.read(byte[], int, int):int");
    }

    public C8849RCp(ReadBuffer readBuffer) {
        this.A02 = readBuffer;
    }

    public final void mark(int i) {
        throw C66580MXl.A11();
    }

    public final void reset() {
        throw C66580MXl.A11();
    }

    public final long skip(long j) {
        throw C66580MXl.A11();
    }

    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read() {
        byte b;
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        b = -1;
        if (read != -1) {
            if (read == 1) {
                b = bArr[0];
            } else {
                throw DbW.A0b("Liger ReadBufferInputStream n=", read);
            }
        }
        return b;
    }
}
