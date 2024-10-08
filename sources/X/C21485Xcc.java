package X;

import java.io.IOException;
import java.net.Proxy;

/* renamed from: X.Xcc  reason: case insensitive filesystem */
public final class C21485Xcc {
    public final C21946Xmb A00;
    public final Y1T A01;
    public final C21492Xcj A02;
    public final C21988Xp1 A03;
    public final YAz A04;

    public final Xny A00(boolean z) {
        try {
            Xny E6d = this.A04.E6d(z);
            if (E6d != null) {
                E6d.A0C = this;
            }
            return E6d;
        } catch (IOException e) {
            A01(e);
            throw e;
        }
    }

    public final void A01(IOException iOException) {
        this.A02.A00();
        Y7U AJK = this.A04.AJK();
        Xnx xnx = AJK.A0F;
        synchronized (xnx) {
            if (iOException instanceof RCb) {
                Integer num = ((RCb) iOException).A00;
                if (num == AnonymousClass05K.A0Y) {
                    int i = AJK.A01 + 1;
                    AJK.A01 = i;
                    if (i > 1) {
                        AJK.A0C = true;
                        AJK.A02++;
                    }
                } else if (num != AnonymousClass05K.A0j) {
                    AJK.A0C = true;
                    AJK.A02++;
                }
            } else if (AJK.A09 == null || (iOException instanceof XQW)) {
                AJK.A0C = true;
                if (AJK.A03 == 0) {
                    C21500Xd1 xd1 = AJK.A0E;
                    Proxy proxy = xd1.A01;
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        C21504XdI xdI = xd1.A02;
                        xdI.A01.connectFailed(xdI.A0A.A0B(), proxy.address(), iOException);
                    }
                    XZX xzx = xnx.A05;
                    synchronized (xzx) {
                        xzx.A00.add(xd1);
                    }
                    AJK.A02++;
                }
            }
        }
    }

    public C21485Xcc(C21946Xmb xmb, Y1T y1t, C21492Xcj xcj, C21988Xp1 xp1, YAz yAz) {
        this.A03 = xp1;
        this.A01 = y1t;
        this.A00 = xmb;
        this.A02 = xcj;
        this.A04 = yAz;
    }
}
