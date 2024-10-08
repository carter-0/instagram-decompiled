package X;

import java.nio.ByteBuffer;

/* renamed from: X.TPc  reason: case insensitive filesystem */
public final class C13196TPc implements YCS {
    public boolean A00;
    public final C13198TPe A01 = new Object();
    public final C13972Tma A02;

    public final void A00() {
        if (!this.A00) {
            C13198TPe tPe = this.A01;
            long j = tPe.A00;
            if (j != 0) {
                SRX srx = tPe.A01.A03;
                int i = srx.A00;
                if (i < 8192 && srx.A04) {
                    j -= (long) (i - srx.A01);
                }
                if (j > 0) {
                    this.A02.FNi(tPe, j);
                    return;
                }
                return;
            }
            return;
        }
        throw Pxh.A0a();
    }

    public final C13198TPe AEA() {
        return this.A01;
    }

    public final YCS ARF() {
        if (!this.A00) {
            C13198TPe tPe = this.A01;
            long j = tPe.A00;
            if (j > 0) {
                this.A02.FNi(tPe, j);
            }
            return this;
        }
        throw Pxh.A0a();
    }

    public final C11291SJy Ezn() {
        return this.A02.Ezn();
    }

    public final YCS FNc(byte[] bArr) {
        if (!this.A00) {
            this.A01.A0J(bArr);
            A00();
            return this;
        }
        throw Pxh.A0a();
    }

    public final void FNi(C13198TPe tPe, long j) {
        if (!this.A00) {
            this.A01.FNi(tPe, j);
            A00();
            return;
        }
        throw Pxh.A0a();
    }

    public final YCS FNn(int i) {
        if (!this.A00) {
            this.A01.A0B(i);
            A00();
            return this;
        }
        throw Pxh.A0a();
    }

    public final YCS FNu(long j) {
        if (!this.A00) {
            this.A01.A0F(j);
            A00();
            return this;
        }
        throw Pxh.A0a();
    }

    public final YCS FNw(int i) {
        if (!this.A00) {
            this.A01.A0C(i);
            A00();
            return this;
        }
        throw Pxh.A0a();
    }

    public final YCS FO7(int i) {
        if (!this.A00) {
            this.A01.A0D(i);
            A00();
            return this;
        }
        throw Pxh.A0a();
    }

    public final YCS FOH(String str) {
        if (!this.A00) {
            this.A01.A0G(str, 0, str.length());
            A00();
            return this;
        }
        throw Pxh.A0a();
    }

    public final void close() {
        if (!this.A00) {
            Throwable th = null;
            try {
                C13198TPe tPe = this.A01;
                long j = tPe.A00;
                if (j > 0) {
                    this.A02.FNi(tPe, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.A02.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.A00 = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.A00) {
            C13198TPe tPe = this.A01;
            long j = tPe.A00;
            if (j > 0) {
                this.A02.FNi(tPe, j);
            }
            this.A02.flush();
            return;
        }
        throw Pxh.A0a();
    }

    public final boolean isOpen() {
        return !this.A00;
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.A00) {
            int write = this.A01.write(byteBuffer);
            A00();
            return write;
        }
        throw Pxh.A0a();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.TPe] */
    public C13196TPc(C13972Tma tma) {
        this.A02 = tma;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("buffer(");
        return Pxg.A0q(this.A02, A1A);
    }
}
