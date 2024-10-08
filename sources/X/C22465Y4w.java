package X;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: X.Y4w  reason: case insensitive filesystem */
public final class C22465Y4w implements C13970TmY {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final C13970TmY A03;
    public final long A04;
    public final /* synthetic */ C21485Xcc A05;

    public C22465Y4w(C21485Xcc xcc, C13970TmY tmY, long j) {
        this.A05 = xcc;
        if (tmY != null) {
            this.A03 = tmY;
            this.A04 = j;
            if (j == 0) {
                A00((IOException) null);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("delegate == null");
    }

    public final IOException A00(IOException iOException) {
        if (this.A02) {
            return iOException;
        }
        this.A02 = true;
        C21485Xcc xcc = this.A05;
        if (iOException != null) {
            xcc.A01(iOException);
        }
        return xcc.A03.A02(iOException, xcc, false, true);
    }

    public final long E6C(C13198TPe tPe, long j) {
        if (!this.A01) {
            try {
                long E6C = this.A03.E6C(tPe, j);
                if (E6C == -1) {
                    A00((IOException) null);
                    return -1;
                }
                long j2 = this.A00 + E6C;
                long j3 = this.A04;
                if (j3 == -1 || j2 <= j3) {
                    this.A00 = j2;
                    if (j2 == j3) {
                        A00((IOException) null);
                    }
                    return E6C;
                }
                throw new ProtocolException(002.A0f("expected ", " bytes but received ", j3, j2));
            } catch (IOException e) {
                throw A00(e);
            }
        } else {
            throw Pxh.A0a();
        }
    }

    public final C11291SJy Ezn() {
        return this.A03.Ezn();
    }

    public final void close() {
        if (!this.A01) {
            this.A01 = true;
            try {
                this.A03.close();
                A00((IOException) null);
            } catch (IOException e) {
                throw A00(e);
            }
        }
    }

    public final String toString() {
        return 002.A0u(getClass().getSimpleName(), "(", this.A03.toString(), ")");
    }
}
