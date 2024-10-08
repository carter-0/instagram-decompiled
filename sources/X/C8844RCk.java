package X;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.RCk  reason: case insensitive filesystem */
public final class C8844RCk extends InputStream {
    public long A00;
    public final RandomAccessFile A01;

    public final int read(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        long j = this.A00;
        if (j <= 0) {
            return -1;
        }
        int read = this.A01.read(bArr, i, (int) Math.min(j, (long) i2));
        if (read >= 0) {
            this.A00 -= (long) read;
        }
        return read;
    }

    public final void close() {
        this.A01.close();
    }

    public C8844RCk(File file, long j, long j2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.A01 = randomAccessFile;
        try {
            randomAccessFile.seek(j);
            this.A00 = j2;
        } catch (IOException e) {
            try {
                this.A01.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    public final int read() {
        long j = this.A00;
        if (j <= 0) {
            return -1;
        }
        this.A00 = j - 1;
        return this.A01.read();
    }
}
