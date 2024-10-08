package X;

import java.io.IOException;

/* renamed from: X.TPg  reason: case insensitive filesystem */
public final class C13200TPg implements C13972Tma {
    public final /* synthetic */ TZ6 A00;
    public final /* synthetic */ C13972Tma A01;

    public final void FNi(C13198TPe tPe, long j) {
        long j2 = j;
        SCP.A00(tPe.A00, 0, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                SRX srx = tPe.A01;
                while (true) {
                    j3 += SRX.A00(srx);
                    if (j3 < j2) {
                        srx = srx.A02;
                        if (j3 >= 65536) {
                            break;
                        }
                    } else {
                        j3 = j2;
                        break;
                    }
                }
                TZ6 tz6 = this.A00;
                tz6.A0A();
                try {
                    this.A01.FNi(tPe, j3);
                    j2 -= j3;
                    tz6.A0B();
                } catch (IOException e) {
                    e = e;
                    if (tz6.A0C()) {
                        e = tz6.A08(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    tz6.A0C();
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public C13200TPg(TZ6 tz6, C13972Tma tma) {
        this.A00 = tz6;
        this.A01 = tma;
    }

    public final C11291SJy Ezn() {
        return this.A00;
    }

    public final void close() {
        TZ6 tz6 = this.A00;
        tz6.A0A();
        try {
            this.A01.close();
            tz6.A0B();
        } catch (IOException e) {
            e = e;
            if (tz6.A0C()) {
                e = tz6.A08(e);
            }
            throw e;
        } catch (Throwable th) {
            tz6.A0C();
            throw th;
        }
    }

    public final void flush() {
        TZ6 tz6 = this.A00;
        tz6.A0A();
        try {
            this.A01.flush();
            tz6.A0B();
        } catch (IOException e) {
            e = e;
            if (tz6.A0C()) {
                e = tz6.A08(e);
            }
            throw e;
        } catch (Throwable th) {
            tz6.A0C();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AsyncTimeout.sink(");
        return Pxg.A0q(this.A01, A1A);
    }
}
