package X;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SJy  reason: case insensitive filesystem */
public class C11291SJy {
    public static final C11291SJy A03 = new TZ5();
    public long A00;
    public long A01;
    public boolean A02;

    public final long A00() {
        if (this instanceof Y7X) {
            return ((Y7X) this).A00.A00();
        }
        if (this.A02) {
            return this.A00;
        }
        throw AnonymousClass7TE.A0z("No deadline");
    }

    public final long A01() {
        if (this instanceof Y7X) {
            return ((Y7X) this).A00.A01();
        }
        return this.A01;
    }

    public final C11291SJy A02() {
        if (this instanceof Y7X) {
            return ((Y7X) this).A00.A02();
        }
        this.A02 = false;
        return this;
    }

    public final C11291SJy A03() {
        if (this instanceof Y7X) {
            return ((Y7X) this).A00.A03();
        }
        this.A01 = 0;
        return this;
    }

    public final C11291SJy A04(long j) {
        if (!(this instanceof TZ5)) {
            if (this instanceof Y7X) {
                return ((Y7X) this).A00.A04(j);
            }
            this.A02 = true;
            this.A00 = j;
        }
        return this;
    }

    public final C11291SJy A05(TimeUnit timeUnit, long j) {
        if (this instanceof TZ5) {
            return this;
        }
        if (this instanceof Y7X) {
            return ((Y7X) this).A00.A05(timeUnit, j);
        }
        if (j >= 0) {
            this.A01 = timeUnit.toNanos(j);
            return this;
        }
        throw Pxg.A0b("timeout < 0: ", j);
    }

    public final boolean A07() {
        if (this instanceof Y7X) {
            return ((Y7X) this).A00.A07();
        }
        return this.A02;
    }

    public final void A06() {
        if (Thread.interrupted()) {
            Pxe.A1F();
            throw new InterruptedIOException("interrupted");
        } else if (this.A02 && this.A00 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
