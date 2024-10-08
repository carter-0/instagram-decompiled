package X;

import com.facebook.instagrammem.mca.MailboxInstagramMem$BytesAvailableHandlerCallback;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.IOException;

public final class N2E extends MailboxInstagramMem$BytesAvailableHandlerCallback {
    public UserSession A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final C8850RCq A06;
    public final AnonymousClass1Nw A07;

    public N2E(AnonymousClass1Nw r7, int i) {
        0qQ.A0B(r7, 1);
        this.A07 = r7;
        this.A05 = i;
        this.A06 = new C8850RCq(r7, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, 0);
    }

    public static final void A00(N2E n2e) {
        synchronized (n2e) {
            if (!n2e.A02) {
                try {
                    n2e.A06.close();
                } catch (IOException unused) {
                    0KC.A0C("ArmadilloExpressStreamableDownloadResponse", "Error happened closing input stream");
                }
                n2e.A02 = true;
            }
        }
    }
}
