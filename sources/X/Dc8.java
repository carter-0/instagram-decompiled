package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailTabController;
import java.lang.ref.Reference;

public final class Dc8 extends C48203Eaj {
    public C46463DfR A00;
    public final UserSession A01;
    public final C46394DeH A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.DeH] */
    public Dc8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00(Context context, UserDetailTabController userDetailTabController, boolean z, boolean z2) {
        AnonymousClass5Gv r0;
        0qQ.A0B(userDetailTabController, 3);
        this.A02.A00 = false;
        C322486vu r1 = userDetailTabController.A0P;
        if (r1.A05 != null) {
            r1.A05 = null;
            if (z) {
                r1.A00();
            }
        }
        C46463DfR dfR = this.A00;
        if (dfR != null) {
            C46544Dgl dgl = C46544Dgl.TOOLTIP_HYPER_CARD;
            dfR.A01.remove(dgl);
            Reference reference = (Reference) dfR.A03.remove(dgl);
            if (!(reference == null || (r0 = (AnonymousClass5Gv) reference.get()) == null)) {
                r0.A08(false);
            }
            if (z2 && context != null) {
                UserSession userSession = this.A01;
                C375949Fw.A02(userSession, context, false);
                C375949Fw.A02(userSession, context, true);
                return;
            }
            return;
        }
        0qQ.A0F("tooltipsController");
        throw AnonymousClass00P.createAndThrow();
    }
}
