package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public final class SNO {
    public static final String A02 = "secondary_dns";
    public static final InetSocketAddress A03;
    public static final InetSocketAddress A04;
    public static final InetSocketAddress[] A05;
    public static final InetSocketAddress A06;
    public static final InetSocketAddress A07;
    public final int A00;
    public final List A01;

    public static InetSocketAddress A00(byte[] bArr) {
        try {
            return new InetSocketAddress(InetAddress.getByAddress(bArr), 53);
        } catch (UnknownHostException e) {
            throw C41845B3m.A0j(e);
        }
    }

    static {
        InetSocketAddress A002 = A00(new byte[]{8, 8, 8, 8});
        A03 = A002;
        InetSocketAddress A003 = A00(new byte[]{8, 8, 4, 4});
        A04 = A003;
        InetSocketAddress A004 = A00(new byte[]{32, 1, 72, 96, 72, 96, 0, 0, 0, 0, 0, 0, 0, 0, -120, -120});
        A06 = A004;
        InetSocketAddress A005 = A00(new byte[]{32, 1, 72, 96, 72, 96, 0, 0, 0, 0, 0, 0, 0, 0, -120, 68});
        A07 = A005;
        A05 = new InetSocketAddress[]{A002, A003, A004, A005};
    }

    public SNO(int i) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A01 = A1C;
        synchronized (A1C) {
            A1C.clear();
            A1C.add(A03);
            A1C.add(A04);
        }
        this.A00 = i;
    }
}
