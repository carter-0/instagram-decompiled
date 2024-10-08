package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;

/* renamed from: X.P3m  reason: case insensitive filesystem */
public final class C72373P3m implements C74400PuG {
    public final /* synthetic */ C68456NIu A00;

    public final void CoD(User user) {
        0qQ.A0B(user, 0);
        C71110Ocp ocp = C71110Ocp.A00;
        C68456NIu nIu = this.A00;
        ocp.A05(nIu, nIu, AnonymousClass7TE.A0l(nIu.A03), user);
    }

    public final void FMo(User user) {
        0qQ.A0B(user, 0);
        C71110Ocp ocp = C71110Ocp.A00;
        C68456NIu nIu = this.A00;
        ocp.A06(nIu.requireActivity(), (GPK) null, nIu, AnonymousClass7TE.A0l(nIu.A03), (ContentNoteMetadata) null, user.getId(), false);
    }

    public C72373P3m(C68456NIu nIu) {
        this.A00 = nIu;
    }
}
