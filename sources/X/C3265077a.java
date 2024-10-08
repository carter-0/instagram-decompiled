package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.77a  reason: invalid class name and case insensitive filesystem */
public abstract class C3265077a {
    public static final void A00(UserSession userSession, AnonymousClass77Z r3, String str, String str2, String str3) {
        0qQ.A0B(userSession, 0);
        List singletonList = Collections.singletonList(str2);
        0qQ.A07(singletonList);
        List singletonList2 = Collections.singletonList(str3);
        0qQ.A07(singletonList2);
        A01(userSession, r3, str, singletonList, singletonList2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1P0, java.lang.Object, X.77f] */
    public static final void A01(UserSession userSession, AnonymousClass77Z r16, String str, List list, List list2) {
        0Tu r8 = 0Tu.A05;
        UserSession userSession2 = userSession;
        AnonymousClass77Z r5 = r16;
        String str2 = str;
        List list3 = list;
        List list4 = list2;
        if (182.A06(r8, userSession, 36327499109644768L)) {
            1vn A01 = 1vm.A01(userSession);
            2IS r7 = new 2IS();
            2IS r82 = new 2IS();
            r7.A04(AnonymousClass000.A00(305), str2);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list3);
            r7.A05("ig_item_ids", copyOf);
            boolean z = false;
            if (copyOf != null) {
                z = true;
            }
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) list4);
            r7.A05("otids", copyOf2);
            boolean z2 = false;
            if (copyOf2 != null) {
                z2 = true;
            }
            17k.A0E(z);
            17k.A0E(z2);
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGDirectGetThreadItemsV2", r7.getParamsCopy(), r82.getParamsCopy(), C42978Bou.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_direct_get_thread_items_v2", new ArrayList());
            A01.ATL(new C71554Omp(r5), new C71573OnA(userSession2, r5, str2), pandoGraphQLRequest);
            return;
        }
        1OC A0E = DirectThreadApi.A0E(userSession, str2, (String) null, list3, list4);
        C3265277d r3 = new C3265277d(userSession, str2, list3, list4);
        C3265377e r02 = new C3265377e(userSession, r5, str2);
        ? obj = new Object();
        obj.A00 = r02;
        obj.A01 = new AnonymousClass433(4);
        obj.A02 = r3;
        A0E.A00 = obj;
        if (182.A06(r8, userSession, 36327499109513694L)) {
            1ES.A05(A0E, 805, 4, true, false);
        } else {
            1ES.A03(A0E);
        }
    }
}
