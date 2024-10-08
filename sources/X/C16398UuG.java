package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* renamed from: X.UuG  reason: case insensitive filesystem */
public final class C16398UuG extends C60260JiH {
    public final 2Fk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16398UuG(C19850WgV wgV) {
        super(wgV, C16665Uz1.A03);
        2IS r5 = new 2IS();
        2IS r4 = new 2IS();
        UserSession userSession = ((C19850WgV) this.A01).A00;
        this.A00 = DbT.A0G(new C58026IkJ(new C58026IkJ(1vm.A01(userSession).A05(new PandoGraphQLRequest(DbU.A0J(r5, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06), "LikesVisibilityQuery", r5.getParamsCopy(), r4.getParamsCopy(), C6F.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_users__info", new ArrayList())), 0), 2));
    }
}
