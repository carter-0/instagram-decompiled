package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* renamed from: X.WgV  reason: case insensitive filesystem */
public final class C19850WgV implements MUZ {
    public final UserSession A00;
    public final C56154Hth A01;

    public final AnonymousClass0r6 Bt3() {
        2IS r4 = new 2IS();
        2IS r3 = new 2IS();
        UserSession userSession = this.A00;
        return new C58026IkJ(1vm.A01(userSession).A05(new PandoGraphQLRequest(DbU.A0J(r4, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06), "LikesVisibilityQuery", r4.getParamsCopy(), r3.getParamsCopy(), C6F.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_users__info", new ArrayList())), 1);
    }

    public final /* bridge */ /* synthetic */ Object EK9(Object obj, Object obj2, AnonymousClass4D7 r20, boolean z) {
        AnonymousClass0K0 r2 = GraphQlCallInput.A02;
        String valueOf = String.valueOf(obj2);
        0Df A02 = r2.A02();
        2IS A0D = JTQ.A0D(A02, valueOf, "setting");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A02, A0D, "input"), "LikesVisibilityMutation", A0D.getParamsCopy(), new 2IS().getParamsCopy(), URW.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_likes_visibility_preference", new ArrayList());
        1vn A012 = 1vm.A01(this.A00);
        try {
            A012.ATL(new C45917DEx(this, 8), new C45926DFg(this, 29), pandoGraphQLRequest);
            return new C239793Ih(C60340gF.A00);
        } catch (DIS e) {
            C297815sO r1 = e.A00;
            0qQ.A0C(r1, AnonymousClass000.A00(180));
            return r1;
        }
    }

    public C19850WgV(UserSession userSession, C56154Hth hth) {
        AnonymousClass7TG.A1O(userSession, hth);
        this.A00 = userSession;
        this.A01 = hth;
    }
}
