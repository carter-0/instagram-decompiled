package X;

import com.facebook.msys.mci.NetworkSession;

public final class OFG {
    public long A00;
    public final long A01;
    public final NetworkSession A02;
    public final String A03;

    public OFG(NetworkSession networkSession, String str, long j) {
        AnonymousClass7TG.A1O(str, networkSession);
        this.A03 = str;
        this.A02 = networkSession;
        this.A01 = j;
    }
}
