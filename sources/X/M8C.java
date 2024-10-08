package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

public final class M8C implements Runnable {
    public final /* synthetic */ C62491Kgh A00;
    public final /* synthetic */ C62423KfY A01;

    public M8C(C62491Kgh kgh, C62423KfY kfY) {
        this.A01 = kfY;
        this.A00 = kgh;
    }

    public final void run() {
        C65816M0i m0i = this.A01.A0E;
        if (m0i != null) {
            C62491Kgh kgh = this.A00;
            0qQ.A0B(kgh, 0);
            if (!(kgh == C62491Kgh.NORMAL || m0i.A00 <= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS || m0i.A05 == C62635Kj6.STARTED_MATCHING_CONTENT_DETECTED)) {
                m0i.A0S.A03();
            }
            m0i.A0W.A02().A0T.Epw(kgh);
        }
    }
}
