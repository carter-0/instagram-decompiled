package X;

import java.net.InetAddress;

public final class S19 {
    public final long A00;
    public final InetAddress A01;

    public S19(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("InetAddress (");
        A1A.append(this.A01);
        A1A.append(", expiry: ");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(" ms", A1A);
    }
}
