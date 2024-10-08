package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5xb  reason: invalid class name and case insensitive filesystem */
public final class C300675xb implements C61110lV, AnonymousClass0lh {
    public static final long A02 = TimeUnit.DAYS.toMillis(1);
    public final UserSession A00;
    public final 1Av A01;

    public C300675xb(14i r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A00 = userSession;
        this.A01 = 1Au.A00(userSession);
        14i.A03(15Y.A03, this);
        if (!14i.A08()) {
            onAppForegrounded();
        }
    }

    public static final void A00(C300675xb r5) {
        1Av r52 = r5.A01;
        0xY AR4 = r52.A01.AR4();
        AR4.E5g("black_hole_url_client_version_key", (String) null);
        AR4.apply();
        r52.A0J.Epx(r52, 0L, 1Av.A8a[508]);
    }

    public final void onSessionWillEnd() {
        if (JVU.A01(this.A00, AnonymousClass05K.A01)) {
            14i.A06(this);
        }
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(-298260068, AnonymousClass0fD.A03(1407547983));
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(1547229806);
        long time = new Date().getTime();
        1Av r6 = this.A01;
        if (time - ((Number) r6.A0J.CDM(r6, 1Av.A8a[508])).longValue() > A02) {
            2IS r5 = new 2IS();
            2IS r2 = new 2IS();
            r5.A04("client_version_id", r6.A01.getString("black_hole_url_client_version_key", (String) null));
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGMessagingBlackHoleURLsQuery", r5.getParamsCopy(), r2.getParamsCopy(), C43005Bpv.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "messaging_blackhole_urls", new ArrayList());
            1vm.A01(this.A00).ATL(new C71550Oml(this), new C71568On3(this), pandoGraphQLRequest);
        }
        AnonymousClass0fD.A0A(1182068624, A03);
    }
}
