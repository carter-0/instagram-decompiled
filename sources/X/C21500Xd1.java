package X;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: X.Xd1  reason: case insensitive filesystem */
public final class C21500Xd1 {
    public final InetSocketAddress A00;
    public final Proxy A01;
    public final C21504XdI A02;

    public final boolean equals(Object obj) {
        if (obj instanceof C21500Xd1) {
            C21500Xd1 xd1 = (C21500Xd1) obj;
            if (!xd1.A02.equals(this.A02) || !xd1.A01.equals(this.A01) || !xd1.A00.equals(this.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, C21056XCh.A01(this.A02)));
    }

    public C21500Xd1(InetSocketAddress inetSocketAddress, Proxy proxy, C21504XdI xdI) {
        if (inetSocketAddress != null) {
            this.A02 = xdI;
            this.A01 = proxy;
            this.A00 = inetSocketAddress;
            return;
        }
        throw AnonymousClass7TE.A11("inetSocketAddress == null");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Route{");
        return C66582MXn.A0v(this.A00, A1A);
    }
}
