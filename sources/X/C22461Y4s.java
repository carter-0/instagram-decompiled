package X;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: X.Y4s  reason: case insensitive filesystem */
public final class C22461Y4s implements C13972Tma {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final C13972Tma A03;
    public final /* synthetic */ C21485Xcc A04;

    public C22461Y4s(C21485Xcc xcc, C13972Tma tma) {
        this.A04 = xcc;
        if (tma != null) {
            this.A03 = tma;
            return;
        }
        throw AnonymousClass7TE.A0w("delegate == null");
    }

    private IOException A00(IOException iOException) {
        if (this.A02) {
            return iOException;
        }
        this.A02 = true;
        C21485Xcc xcc = this.A04;
        if (iOException != null) {
            xcc.A01(iOException);
        }
        return xcc.A03.A02(iOException, xcc, true, false);
    }

    public final C11291SJy Ezn() {
        return this.A03.Ezn();
    }

    public final void FNi(C13198TPe tPe, long j) {
        if (!this.A01) {
            long j2 = this.A00 + j;
            if (j2 <= 0) {
                try {
                    this.A03.FNi(tPe, j);
                    this.A00 += j;
                } catch (IOException e) {
                    throw A00(e);
                }
            } else {
                throw new ProtocolException(002.A0f("expected ", " bytes but received ", 0, j2));
            }
        } else {
            throw Pxh.A0a();
        }
    }

    public final void close() {
        if (!this.A01) {
            this.A01 = true;
            if (this.A00 == 0) {
                try {
                    this.A03.close();
                    A00((IOException) null);
                } catch (IOException e) {
                    throw A00(e);
                }
            } else {
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    public final void flush() {
        try {
            this.A03.flush();
        } catch (IOException e) {
            throw A00(e);
        }
    }

    public final String toString() {
        return 002.A0u(getClass().getSimpleName(), "(", this.A03.toString(), ")");
    }
}
