package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: X.3HL  reason: invalid class name */
public final class AnonymousClass3HL extends InputStream {
    public final /* synthetic */ 1Qc A00;

    public AnonymousClass3HL(1Qc r1) {
        this.A00 = r1;
    }

    public final void close() {
        1Qc r1;
        while (true) {
            r1 = this.A00;
            if (r1.A0A) {
                break;
            }
            1Qc.A00(r1);
        }
        17k.A0E(r1.A0A);
        r1.A01 = true;
        if (r1.A09 != null) {
            throw new IOException(r1.A09);
        }
    }

    public final void finalize() {
        1Qc r2 = this.A00;
        if (!r2.A01) {
            StringBuilder sb = new StringBuilder();
            sb.append("Input stream not closed for uri: ");
            sb.append(r2.A05);
            0wb.A03("HttpEngine", sb.toString());
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        1Qc r1 = this.A00;
        ByteBuffer byteBuffer = r1.A06;
        if (byteBuffer.remaining() == 0 && !r1.A0A) {
            1Qc.A00(r1);
        }
        if (r1.A09 != null) {
            throw r1.A09;
        } else if (r1.A0A) {
            return -1;
        } else {
            Semaphore semaphore = r1.A07;
            if (semaphore.availablePermits() > 0) {
                0wb.A03("HttpMessageExchange_concurrency", "HttpMessageExchange.mByteBuffer is now open to multiple threads read and write to it");
                semaphore.drainPermits();
            }
            int min = Math.min(Math.min(bArr.length - i, byteBuffer.remaining()), i2);
            System.arraycopy(byteBuffer.array(), byteBuffer.position(), bArr, i, min);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    public final int read() {
        1Qc r2 = this.A00;
        ByteBuffer byteBuffer = r2.A06;
        if (byteBuffer.remaining() == 0 && !r2.A0A) {
            1Qc.A00(r2);
        }
        if (r2.A09 != null) {
            throw r2.A09;
        } else if (r2.A0A) {
            return -1;
        } else {
            return byteBuffer.get();
        }
    }
}
