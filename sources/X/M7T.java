package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl;
import java.util.ArrayList;
import java.util.List;

public final class M7T implements Runnable {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ LBR A01;

    public M7T(AnonymousClass4DH r1, LBR lbr) {
        this.A01 = lbr;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.07Z, X.4DH] */
    public final void run() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(C390879rz.MAGIC_MEDIA_REMIX);
        LBR lbr = this.A01;
        JY0 jy0 = lbr.A03;
        if (jy0 == null) {
            0qQ.A0F("suggestionsProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass9IE r1 = new AnonymousClass9IE((List) A1C, 25);
        AnonymousClass07a.A00(this.A00);
        List A002 = jy0.A00(r1);
        if (AnonymousClass7TE.A1b(A002)) {
            C39757A7x a7x = lbr.A0C;
            a7x.A03.clear();
            C74185PqR pqR = new C74185PqR(23, (Object) A002, (Object) lbr);
            ArrayList arrayList = a7x.A02;
            if (DbT.A1b(arrayList)) {
                pqR.invoke(arrayList);
                return;
            }
            UserSession userSession = a7x.A00;
            C74185PqR pqR2 = new C74185PqR(24, (Object) pqR, (Object) a7x);
            1vn A012 = 1vm.A01(userSession);
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGDirectMediaRemixLayouts", A04.getParamsCopy(), A042.getParamsCopy(), IGDirectMediaRemixLayoutsResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1444), AnonymousClass7TE.A1C());
            A012.ATL(C64390Lb7.A00, new C45926DFg(pqR2, 15), pandoGraphQLRequest);
        } else if (!lbr.A04) {
            lbr.A04 = true;
            C66181MGs.A02(lbr, AnonymousClass07a.A00(lbr.A07), 3);
        }
    }
}
