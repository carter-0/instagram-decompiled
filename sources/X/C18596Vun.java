package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Vun  reason: case insensitive filesystem */
public final class C18596Vun {
    public static final C18596Vun A00 = new Object();

    public final void A00(ImmutableList immutableList, UserSession userSession, C46202DQe dQe) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        r2.A05("highlight_ids", immutableList);
        1vm.A01(userSession2).A01((2Kw) null, new C45926DFg(dQe, 22), new PandoGraphQLRequest(C41845B3m.A05(), "IGProfileShareHighlightsToMainGridQuery", r2.getParamsCopy(), r1.getParamsCopy(), C1N.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_share_highlight_to_main_grid", new ArrayList()));
    }

    public final void A01(ImmutableList immutableList, UserSession userSession, C62320sa r19) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        r2.A05("highlight_ids", immutableList);
        1vm.A01(userSession2).A01((2Kw) null, new C45926DFg(r19, 24), new PandoGraphQLRequest(C41845B3m.A05(), "IGProfileUnShareHighlightsToMainGridQuery", r2.getParamsCopy(), r1.getParamsCopy(), C1X.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_unshare_highlight_to_main_grid", new ArrayList()));
    }
}
