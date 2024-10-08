package X;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class RC7 extends FilterInputStream {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;

    public final synchronized void mark(int i) {
        super.mark(i);
        this.A00 = i;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = (long) i2;
        int i3 = this.A00;
        if (i3 == 0) {
            j = -1;
        } else if (i3 != Integer.MIN_VALUE) {
            long j2 = (long) i3;
            if (j > j2) {
                j = j2;
            }
        }
        int i4 = (int) j;
        if (i4 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, i4);
        A00((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    private void A00(long j) {
        int i = this.A00;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.A00 = (int) (((long) i) - j);
        }
    }

    public final int available() {
        int i = this.A00;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public final long skip(long j) {
        int i = this.A00;
        if (i == 0) {
            return 0;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = (long) i;
            if (j > j2) {
                j = j2;
            }
        }
        if (j == -1) {
            return 0;
        }
        long skip = super.skip(j);
        A00(skip);
        return skip;
    }

    public RC7(InputStream inputStream) {
        super(inputStream);
    }

    public final int read() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE) {
            long j = (long) i;
            if (1 > j && j == -1) {
                return -1;
            }
        }
        int read = super.read();
        A00(1);
        return read;
    }
}
