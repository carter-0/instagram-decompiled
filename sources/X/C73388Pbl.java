package X;

import com.facebook.advancedcryptotransport.ACTRegistrationDeviceIdProvider;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

/* renamed from: X.Pbl  reason: case insensitive filesystem */
public final class C73388Pbl implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MZB A01;
    public final /* synthetic */ MZ9 A02;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A03;
    public final /* synthetic */ String A04;

    public C73388Pbl(UserSession userSession, MZB mzb, MZ9 mz9, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, String str) {
        this.A00 = userSession;
        this.A03 = msysMailboxSessionManagerImpl;
        this.A02 = mz9;
        this.A01 = mzb;
        this.A04 = str;
    }

    public final void run() {
        ACTRegistrationDeviceIdProvider.initialize(C60960kU.A00);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        ((C72207OyX) userSession.A01(C72207OyX.class, new MMO(userSession, 6))).A00(new C73963Pmh(this.A01, this.A03, userSession, this.A02, this.A04, 14));
    }
}
