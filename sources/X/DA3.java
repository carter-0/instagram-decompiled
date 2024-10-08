package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDirectStoreStickerSendMutationResponseImpl;
import java.util.List;

public final class DA3 {
    public final UserSession A00;

    public static final 2IV A00(C254933tI r4, String str, String str2, String str3, List list) {
        String str4;
        2IV r3 = new 2IV();
        r3.A05(AnonymousClass000.A00(3842), list);
        r3.A09(str, "sticker_id");
        r3.A09(str2, "ig_thread_igid");
        r3.A09(str3, AnonymousClass000.A00(726));
        String str5 = null;
        if (r4 != null) {
            str4 = r4.A0R;
        } else {
            str4 = null;
        }
        r3.A09(str4, AnonymousClass000.A00(1762));
        if (r4 != null) {
            str5 = r4.A0T;
        }
        r3.A09(str5, AnonymousClass000.A00(1763));
        return r3;
    }

    public DA3(UserSession userSession) {
        this.A00 = userSession;
    }

    public static final void A01(2IV r17, UserSession userSession, C74551Pwk pwk) {
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A00(r17, "data");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGDirectStoreStickerSendMutation", A04.getParamsCopy(), A042.getParamsCopy(), IGDirectStoreStickerSendMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_direct_store_sticker_send", AnonymousClass7TE.A1C());
        UserSession userSession2 = userSession;
        1vn A01 = 1vm.A01(userSession2);
        C43886CHa cHa = new C43886CHa(userSession2, pwk);
        A01.ATL(new C45919DEz(3, cHa, userSession2), new DFQ(6, userSession2, cHa), pandoGraphQLRequest);
    }
}
