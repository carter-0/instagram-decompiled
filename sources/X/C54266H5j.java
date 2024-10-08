package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.H5j  reason: case insensitive filesystem */
public final class C54266H5j extends C228042kh {
    public final UserSession A00;

    public C54266H5j(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C52985Ggc(SchoolSettingsRepository.A00(this.A00));
    }
}
