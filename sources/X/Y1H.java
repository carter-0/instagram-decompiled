package X;

import java.io.Closeable;

public final class Y1H implements Closeable {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final C21983Xod A04;
    public final C22023Xt4 A05;
    public final XRO A06;
    public final C21464Xbw A07;
    public final Y1H A08;
    public final Y1H A09;
    public final Y1H A0A;
    public final Y1D A0B;
    public final C21485Xcc A0C;

    public final void close() {
        Y1D y1d = this.A0B;
        if (y1d != null) {
            y1d.close();
            return;
        }
        throw AnonymousClass7TE.A0z("response is not eligible for a body and must not be closed");
    }

    public Y1H(Xny xny) {
        this.A07 = xny.A07;
        this.A06 = xny.A06;
        this.A00 = xny.A00;
        this.A03 = xny.A03;
        this.A04 = xny.A04;
        this.A05 = new C22023Xt4(xny.A05);
        this.A0B = xny.A0B;
        this.A09 = xny.A09;
        this.A08 = xny.A08;
        this.A0A = xny.A0A;
        this.A02 = xny.A02;
        this.A01 = xny.A01;
        this.A0C = xny.A0C;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Response{protocol=");
        A1A.append(this.A06);
        A1A.append(C66579MXk.A00(186));
        A1A.append(this.A00);
        A1A.append(Pxd.A00(47));
        A1A.append(this.A03);
        A1A.append(", url=");
        return Pxg.A0p(this.A07.A03, A1A);
    }
}
