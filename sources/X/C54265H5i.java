package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.H5i  reason: case insensitive filesystem */
public final class C54265H5i extends C228042kh {
    public final UserSession A00;

    public C54265H5i(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60141JgM(SchoolSettingsRepository.A00(this.A00));
    }
}
