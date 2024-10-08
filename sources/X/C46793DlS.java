package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.DlS  reason: case insensitive filesystem */
public final class C46793DlS extends 2YL implements AnonymousClass0hF {
    public final UserSession A00;
    public final C49620Ezd A01;
    public final AnonymousClass9BB A02;
    public final AiAgentThreadLauncher A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public C46793DlS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        C49620Ezd ezd = new C49620Ezd(userSession);
        this.A01 = ezd;
        this.A03 = new AiAgentThreadLauncher(userSession);
        this.A02 = new AnonymousClass9BB(userSession);
        02z A10 = DbS.A10(new BBV((String) null, 1, 16, (DefaultConstructorMarker) null));
        this.A04 = A10;
        C61820pm A032 = AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 6), ezd.A04, A10);
        this.A05 = 10b.A02(new C47175Drq((Integer) null, (List) null, (List) null, 0, 255, false, false), C318116oQ.A00(this), A032, AnonymousClass10A.A00);
    }

    public final void Dms(07T r19, AnonymousClass07Z r20) {
        if (DbU.A02(r19, 1) == 1) {
            C49620Ezd ezd = this.A01;
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "AiAgentListQuery", A042.getParamsCopy(), A043.getParamsCopy(), C43157Bth.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1964), AnonymousClass7TE.A1C());
            UserSession userSession = ezd.A00;
            0Tu r2 = 0Tu.A05;
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(182.A01(r2, userSession, 36600873779793940L));
            pandoGraphQLRequest.setFreshCacheAgeMs(182.A01(r2, userSession, 36600873779728403L));
            G3F g3f = G3F.A00;
            ezd.A01.ATL(new FS6(1, (0sP) g3f), new DFQ(2, ezd, g3f), pandoGraphQLRequest);
        }
    }

    public static final List A00(List list, String str) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C61081JwJ jwJ = (C61081JwJ) it.next();
            String str2 = jwJ.A01;
            A0r.add(new C47237DtO((C266444Yx) jwJ.A00, str2, 0qQ.A0K(str2, str)));
        }
        return A0r;
    }
}
