package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;

public final class Y7U extends C21293XTb {
    public int A00 = 1;
    public int A01;
    public int A02;
    public int A03;
    public long A04 = Long.MAX_VALUE;
    public Socket A05;
    public Socket A06;
    public C21983Xod A07;
    public XRO A08;
    public Y1K A09;
    public YCS A0A;
    public YCT A0B;
    public boolean A0C;
    public final List A0D = AnonymousClass7TE.A1C();
    public final C21500Xd1 A0E;
    public final Xnx A0F;

    public static void A00(Y7U y7u, int i, int i2) {
        Socket createSocket;
        C21500Xd1 xd1 = y7u.A0E;
        Proxy proxy = xd1.A01;
        C21504XdI xdI = xd1.A02;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            createSocket = xdI.A04.createSocket();
        } else {
            createSocket = new Socket(proxy);
        }
        y7u.A05 = createSocket;
        createSocket.setSoTimeout(i2);
        try {
            SPU.A00.A06(xd1.A00, y7u.A05, i);
            try {
                y7u.A0B = new C13197TPd(SQW.A01(y7u.A05));
                y7u.A0A = new C13196TPc(SQW.A00(y7u.A05));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Failed to connect to ");
            ConnectException connectException = new ConnectException(AnonymousClass7TF.A0i(xd1.A00, A1A));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void A01() {
        synchronized (this.A0F) {
            this.A0C = true;
        }
    }

    public final boolean A02(C11427STm sTm) {
        int i = sTm.A00;
        C11427STm sTm2 = this.A0E.A02.A0A;
        if (i != sTm2.A00) {
            return false;
        }
        String str = sTm.A02;
        if (str.equals(sTm2.A02)) {
            return true;
        }
        C21983Xod xod = this.A07;
        if (xod == null || !TPE.A00.A01(str, (X509Certificate) xod.A00.get(0))) {
            return false;
        }
        return true;
    }

    public Y7U(C21500Xd1 xd1, Xnx xnx) {
        this.A0F = xnx;
        this.A0E = xd1;
    }

    public final String toString() {
        Object obj;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Connection{");
        C21500Xd1 xd1 = this.A0E;
        C11427STm sTm = xd1.A02.A0A;
        A1A.append(sTm.A02);
        A1A.append(":");
        A1A.append(sTm.A00);
        A1A.append(", proxy=");
        A1A.append(xd1.A01);
        A1A.append(" hostAddress=");
        A1A.append(xd1.A00);
        A1A.append(" cipherSuite=");
        C21983Xod xod = this.A07;
        if (xod != null) {
            obj = xod.A01;
        } else {
            obj = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        A1A.append(obj);
        A1A.append(" protocol=");
        return Pxg.A0p(this.A08, A1A);
    }
}
