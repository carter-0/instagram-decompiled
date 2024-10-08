package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.F2y  reason: case insensitive filesystem */
public final class C49713F2y {
    public final PandoGraphQLRequest A00(UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        String str5 = str4;
        0qQ.A0B(userSession, 0);
        String str6 = str3;
        DbW.A1O(str6, 3, str5);
        long A00 = C322606w6.A00(userSession);
        if (A00 > 0) {
            str5 = "";
        }
        boolean z = true;
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, true, "enableGroups");
        0Df.A00(A03, str5, "rank_token");
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("query", str);
        A04.A04("search_surface", "follow_list_page");
        0Tu r0 = 0Tu.A05;
        if (!182.A06(r0, userSession, 36323066703326020L) && !182.A06(r0, userSession, 36323066703522631L)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        A04.A02(AnonymousClass000.A00(651), valueOf);
        boolean A1V = AnonymousClass7TF.A1V(valueOf);
        A04.A01(AnonymousClass000.A00(658));
        Boolean A0R = AnonymousClass7TF.A0R(r0, userSession, 36324737447178554L);
        A04.A02(AnonymousClass000.A00(1327), A0R);
        boolean A1V2 = AnonymousClass7TF.A1V(A0R);
        DbW.A18(A03, A04, "request_data");
        A04.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str6);
        A04.A04("max_id", str2);
        PandoGraphQLRequest A002 = C50173FSf.A00(A04, A042, A1V2, A1V);
        if (A00 > 0) {
            A002.setFreshCacheAgeMs(A00);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(num2);
            A1A.append('-');
            A002.setAdditionalCacheQueryKey(AnonymousClass7TF.A0i(num, A1A));
        }
        0qQ.A0A(A002);
        return A002;
    }

    public final PandoGraphQLRequest A01(UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        String str7 = str4;
        AnonymousClass7TF.A1E(str7, 4, str6);
        long A00 = C322606w6.A00(userSession2);
        if (A00 > 0) {
            str6 = "";
        }
        boolean z = true;
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, true, AnonymousClass000.A00(1455));
        0Df.A00(A03, "follow_list_page", "search_surface");
        0Df.A00(A03, str6, "rank_token");
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("query", str);
        A04.A02("enable_groups", true);
        0Tu r9 = 0Tu.A05;
        if (!182.A06(r9, userSession2, 36323066703391557L) && !182.A06(r9, userSession2, 36323066703522631L)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        A04.A02(AnonymousClass000.A00(651), valueOf);
        boolean A1V = AnonymousClass7TF.A1V(valueOf);
        A04.A01(AnonymousClass000.A00(658));
        Boolean A0R = AnonymousClass7TF.A0R(r9, userSession2, 36324737447178554L);
        A04.A02(AnonymousClass000.A00(1327), A0R);
        boolean A1V2 = AnonymousClass7TF.A1V(A0R);
        DbW.A18(A03, A04, "request_data");
        A04.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str7);
        A04.A04("max_id", str3);
        A04.A04("order", str2);
        17k.A0E(A1V);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A06(A1V2), "FollowingList", A04.getParamsCopy(), A042.getParamsCopy(), C43687C5j.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_api__v1__friendships__following", AnonymousClass7TE.A1C());
        if (A00 > 0) {
            pandoGraphQLRequest.setFreshCacheAgeMs(A00);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(num2);
            A1A.append('-');
            pandoGraphQLRequest.setAdditionalCacheQueryKey(AnonymousClass7TF.A0i(num, A1A));
        }
        return pandoGraphQLRequest;
    }
}
