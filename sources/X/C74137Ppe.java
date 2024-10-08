package X;

import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;

/* renamed from: X.Ppe  reason: case insensitive filesystem */
public final class C74137Ppe extends 0Yg implements 0sP {
    public static final C74137Ppe A00 = new C74137Ppe();

    public C74137Ppe() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        N4R n4r = (N4R) obj;
        0qQ.A0B(n4r, 0);
        ((IGRTCSignalingCoordinator) n4r.A02).cacheIncomingMessageUntilFirstSend();
        return C60340gF.A00;
    }
}
