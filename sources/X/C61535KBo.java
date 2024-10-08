package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.ghostwriter.graphql.GhostWriterGraphQLDataSource;

/* renamed from: X.KBo  reason: case insensitive filesystem */
public final class C61535KBo extends C228042kh {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60165Jgk(new KWT(new GhostWriterGraphQLDataSource(1vm.A01(this.A00))));
    }

    public C61535KBo(UserSession userSession) {
        this.A00 = userSession;
    }
}
