package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;

/* renamed from: X.P3n  reason: case insensitive filesystem */
public final class C72374P3n implements C74400PuG {
    public final /* synthetic */ C70799OLu A00;

    public final void CoD(User user) {
        0qQ.A0B(user, 0);
        C70799OLu oLu = this.A00;
        UserSession userSession = oLu.A07;
        C3018660j.A01(userSession).A0B(C69506Nmo.A0D);
        C71110Ocp.A00.A05(oLu.A05, oLu.A06, userSession, user);
    }

    public final void FMo(User user) {
        0qQ.A0B(user, 0);
        C71110Ocp ocp = C71110Ocp.A00;
        C70799OLu oLu = this.A00;
        ocp.A06(oLu.A05.requireActivity(), (GPK) null, oLu.A06, oLu.A07, (ContentNoteMetadata) null, user.getId(), false);
    }

    public C72374P3n(C70799OLu oLu) {
        this.A00 = oLu;
    }
}
