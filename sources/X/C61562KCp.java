package X;

import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository;

/* renamed from: X.KCp  reason: case insensitive filesystem */
public final class C61562KCp extends C228042kh {
    public final UserSession A00;
    public final 1Xj A01;

    public C61562KCp(UserSession userSession, 1Xj r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60167Jgm(userSession, this.A01, new IGMetadataFooterRepository(userSession));
    }
}
