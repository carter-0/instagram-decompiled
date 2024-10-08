package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.WFk  reason: case insensitive filesystem */
public abstract class C18983WFk implements C13920TlM {
    public void A00(Object obj) {
        String str;
        Object obj2 = obj;
        if (this instanceof UHO) {
            UHO uho = (UHO) this;
            uho.A01.execute(new C20135Wlv(uho, obj2));
        } else if (this instanceof UHP) {
            UHP uhp = (UHP) this;
            LiveLocationSession liveLocationSession = (LiveLocationSession) obj2;
            if (liveLocationSession != null || uhp.A01) {
                AnonymousClass7AX r2 = uhp.A00;
                if (liveLocationSession != null) {
                    str = liveLocationSession.A04;
                } else {
                    str = null;
                }
                VVZ vvz = new VVZ(r2, str, uhp.A01);
                String str2 = r2.A08;
                UserSession userSession = r2.A04;
                Executor executor = C17145VJx.A00;
                2IS r5 = new 2IS();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(C41845B3m.A03(GraphQlCallInput.A02, str2, "thread_igid"), r5, "data"), "IGDirectLiveLocationSessionsForThreadQuery", r5.getParamsCopy(), new 2IS().getParamsCopy(), C15113UQc.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_live_location_sessions_for_thread_query", new ArrayList());
                1vm.A01(userSession).ATL(C19034WHl.A00, new C19040WHs(vvz, 6), pandoGraphQLRequest);
                return;
            }
            AnonymousClass7AX r22 = uhp.A00;
            AnonymousClass7AX.A00(r22, r22.A08, false);
        } else {
            UHR uhr = ((UHN) this).A00;
            if (uhr.A00) {
                if (obj != null) {
                    UHS.A04(uhr, obj2, "LIVE_LOCATION_STARTED");
                } else {
                    C18431Vra.A06(uhr, false);
                }
                C249803kO it = UHR.A00(uhr).A09.iterator();
                while (it.hasNext()) {
                    it.next();
                    System.currentTimeMillis();
                }
            }
        }
    }

    public final void onSuccess(Object obj) {
        A00(obj);
    }
}
