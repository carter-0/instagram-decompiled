package X;

import android.app.Application;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.JgT  reason: case insensitive filesystem */
public final class C60148JgT extends 2YL {
    public final UserSession A00;
    public final L0J A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public C60148JgT(UserSession userSession, L0J l0j) {
        SettableFuture settableFuture;
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = l0j;
        C65001Lle lle = C65001Lle.A00;
        02z A012 = 106.A01(lle);
        this.A02 = A012;
        this.A03 = 10b.A03(A012);
        A012.Epw(lle);
        L0J l0j2 = this.A01;
        LcN lcN = new LcN(this, 0);
        Application application = l0j2.A00;
        String str = userSession.A06;
        StellaIpcDirectMessagingServiceClient A002 = C64011LIy.A00(application, userSession);
        ONU onu = new ONU(application, ImmutableMap.of(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str, TraceFieldType.RequestID, "SGDirectImportRepo"), userSession);
        if (A002 != null) {
            settableFuture = A002.runIpcRequest(onu);
        } else {
            settableFuture = null;
        }
        C255183ti.A04(lcN, C303646Ae.A02(new Lc4(new C73933PmD(onu, 17), 5), settableFuture, C61560nl.A00().A00), 1Lf.A01);
    }
}
