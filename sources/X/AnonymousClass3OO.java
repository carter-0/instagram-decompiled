package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.3OO  reason: invalid class name */
public final class AnonymousClass3OO extends InputStream {
    public BufferedOutputStream A00;
    public boolean A01 = true;
    public final long A02;
    public final File A03;
    public final File A04;
    public final InputStream A05;
    public final boolean A06;

    public AnonymousClass3OO(File file, InputStream inputStream, long j, boolean z) {
        0qQ.A0B(file, 2);
        this.A05 = inputStream;
        this.A03 = file;
        this.A06 = z;
        this.A02 = j;
        File file2 = new File(002.A0R(file.getPath(), ".pending"));
        this.A04 = file2;
        try {
            this.A00 = new BufferedOutputStream(new FileOutputStream(file2));
        } catch (Exception e) {
            this.A01 = false;
            if (this.A06) {
                this.A00 = null;
                0KC.A0F("AtomicStreamWrapper", "swallowing error on open", e);
                return;
            }
            throw e;
        }
    }

    public final int read(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        int read = this.A05.read(bArr);
        try {
            BufferedOutputStream bufferedOutputStream = this.A00;
            if (!(read == -1 || bufferedOutputStream == null || !this.A01)) {
                bufferedOutputStream.write(bArr, 0, read);
                return read;
            }
        } catch (Exception e) {
            this.A01 = false;
            if (this.A06) {
                0KC.A0F("AtomicStreamWrapper", "swallowing error on write", e);
            } else {
                throw e;
            }
        }
        return read;
    }

    public final int available() {
        return this.A05.available();
    }

    public final void close() {
        try {
            BufferedOutputStream bufferedOutputStream = this.A00;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            this.A01 = false;
            if (this.A06) {
                0KC.A0F("AtomicStreamWrapper", "swallowing error on close", e);
            } else {
                throw e;
            }
        }
        this.A05.close();
        if (this.A01) {
            File file = this.A04;
            if (file.exists() && file.length() >= this.A02) {
                file.renameTo(this.A03);
                return;
            }
        }
        this.A04.delete();
    }

    public final void mark(int i) {
        throw new RuntimeException("Operation not supported");
    }

    public final boolean markSupported() {
        throw new RuntimeException("Operation not supported");
    }

    public final void reset() {
        throw new RuntimeException("Operation not supported");
    }

    public final long skip(long j) {
        throw new RuntimeException("Operation not supported");
    }

    public final int read(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        int read = this.A05.read(bArr, i, i2);
        try {
            BufferedOutputStream bufferedOutputStream = this.A00;
            if (!(read == -1 || bufferedOutputStream == null || !this.A01)) {
                bufferedOutputStream.write(bArr, i, read);
                return read;
            }
        } catch (Exception e) {
            this.A01 = false;
            if (this.A06) {
                0KC.A0F("AtomicStreamWrapper", "swallowing error on write", e);
            } else {
                throw e;
            }
        }
        return read;
    }

    public final int read() {
        int read = this.A05.read();
        try {
            BufferedOutputStream bufferedOutputStream = this.A00;
            if (!(read == -1 || bufferedOutputStream == null || !this.A01)) {
                bufferedOutputStream.write(read);
                return read;
            }
        } catch (Exception e) {
            this.A01 = false;
            if (this.A06) {
                0KC.A0F("AtomicStreamWrapper", "swallowing error on write", e);
            } else {
                throw e;
            }
        }
        return read;
    }
}
