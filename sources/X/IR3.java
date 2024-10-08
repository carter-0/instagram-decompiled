package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;

public final class IR3 implements C74400PuG {
    public final /* synthetic */ C54162H1g A00;

    public final void CoD(User user) {
        0qQ.A0B(user, 0);
        C71110Ocp ocp = C71110Ocp.A00;
        C54162H1g h1g = this.A00;
        ocp.A05(h1g, h1g, AnonymousClass7TE.A0l(h1g.A09), user);
    }

    public final void FMo(User user) {
        0qQ.A0B(user, 0);
        C71110Ocp ocp = C71110Ocp.A00;
        C54162H1g h1g = this.A00;
        ocp.A06(h1g.requireActivity(), (GPK) null, h1g, AnonymousClass7TE.A0l(h1g.A09), (ContentNoteMetadata) null, user.getId(), false);
    }

    public IR3(C54162H1g h1g) {
        this.A00 = h1g;
    }
}
