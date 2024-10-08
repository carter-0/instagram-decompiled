package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGTigonService;
import com.instagram.service.tigon.mobileprober.IGMobileProberJob;

/* renamed from: X.3i3  reason: invalid class name and case insensitive filesystem */
public final class C248483i3 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248483i3(2Lk r7) {
        super("initializeMobileProber", 1577914900, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C375499Dv r0 = IGMobileProberJob.Companion;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C61560nl.A00().A00);
        IGTigonService tigonService = IGTigonService.getTigonService(userSession);
        0qQ.A07(tigonService);
        IGMobileProberJob.initializeMobileProberNative(androidAsyncExecutorFactory2, tigonService);
    }
}
