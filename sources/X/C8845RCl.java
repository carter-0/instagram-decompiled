package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: X.RCl  reason: case insensitive filesystem */
public final class C8845RCl extends InputStream {
    public int A00;
    public int A01;
    public IOException A02;
    public Queue A03 = Pxe.A1A();
    public boolean A04;

    public final synchronized int available() {
        return this.A00;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        synchronized (this) {
            i3 = -1;
            if (!this.A04 || this.A00 != 0) {
                while (!this.A04 && this.A03.isEmpty() && this.A02 == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                Throwable th = this.A02;
                if (th == null) {
                    if (!this.A04 || this.A00 != 0) {
                        int min = Math.min(i2, this.A00);
                        i3 = 0;
                        while (min > 0) {
                            Queue queue = this.A03;
                            byte[] bArr2 = (byte[]) queue.peek();
                            if (bArr2 != null) {
                                int length = bArr2.length;
                                int i4 = this.A01;
                                int A042 = Pxh.A04(length, i4, min);
                                System.arraycopy(bArr2, i4, bArr, i, A042);
                                i3 += A042;
                                int i5 = this.A01 + A042;
                                this.A01 = i5;
                                i += A042;
                                min -= A042;
                                this.A00 -= A042;
                                if (i5 == length) {
                                    queue.remove();
                                    this.A01 = 0;
                                }
                            } else {
                                th = AnonymousClass7TE.A15("Response body stream is in an invalid state: available bytes > 0, but no buffers remain");
                            }
                        }
                    }
                }
                throw th;
            }
        }
        return i3;
    }

    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 1) {
            return bArr[0];
        }
        return -1;
    }
}
