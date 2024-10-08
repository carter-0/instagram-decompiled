package X;

import java.io.IOException;

/* renamed from: X.TPk  reason: case insensitive filesystem */
public final class C13204TPk implements C13970TmY {
    public final /* synthetic */ TZ6 A00;
    public final /* synthetic */ C13970TmY A01;

    public C13204TPk(TZ6 tz6, C13970TmY tmY) {
        this.A00 = tz6;
        this.A01 = tmY;
    }

    public final long E6C(C13198TPe tPe, long j) {
        TZ6 tz6 = this.A00;
        tz6.A0A();
        try {
            long E6C = this.A01.E6C(tPe, j);
            tz6.A0B();
            return E6C;
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

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AsyncTimeout.source(");
        return Pxg.A0q(this.A01, A1A);
    }
}
