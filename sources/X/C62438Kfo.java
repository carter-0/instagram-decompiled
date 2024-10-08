package X;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;

/* renamed from: X.Kfo  reason: case insensitive filesystem */
public final class C62438Kfo extends InputStream {
    public ByteBuffer A00;
    public final C249533jw A01;

    public C62438Kfo(C249533jw r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        ByteBuffer A002 = A00();
        if (A002 != null && A002.hasRemaining()) {
            int min = Math.min(Math.min(bArr.length - i, i2), A002.remaining());
            A002.get(bArr, i, min);
            this.A00 = A002;
            return min;
        } else if (this.A01.CQF()) {
            return -1;
        } else {
            return 0;
        }
    }

    private final ByteBuffer A00() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            C249533jw r3 = this.A01;
            if (!r3.CQF()) {
                Object FIE = r3.FIE();
                if (FIE instanceof AnonymousClass1Ws) {
                    FIE = C67351tA.A00(19B.A00, new MG7(r3, (AnonymousClass4D7) null, 27));
                }
                byteBuffer = (ByteBuffer) FIE;
            } else {
                byteBuffer = null;
            }
        }
        this.A00 = byteBuffer;
        return byteBuffer;
    }

    public final void close() {
        this.A01.AG7((CancellationException) null);
    }

    public final int read() {
        ByteBuffer A002 = A00();
        if (A002 != null) {
            return A002.get();
        }
        return -1;
    }
}
