package X;

import java.util.Random;

public final class Wv2 extends Random {
    public boolean A00;
    public final 2SP A01;

    public final void nextBytes(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        this.A01.A0B(bArr);
    }

    public final int next(int i) {
        return this.A01.A04(i);
    }

    public final boolean nextBoolean() {
        return this.A01.A0A();
    }

    public final double nextDouble() {
        return this.A01.A00();
    }

    public final float nextFloat() {
        return this.A01.A02();
    }

    public final int nextInt(int i) {
        return this.A01.A05(i);
    }

    public final long nextLong() {
        return this.A01.A07();
    }

    public final void setSeed(long j) {
        if (!this.A00) {
            this.A00 = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public Wv2(2SP r1) {
        this.A01 = r1;
    }

    public final int nextInt() {
        return this.A01.A03();
    }
}
