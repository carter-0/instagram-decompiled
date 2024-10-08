package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;

public final class H68 extends C228042kh {
    public final UserSession A00;
    public final SchoolSettingsRepository A01;

    public H68(UserSession userSession, SchoolSettingsRepository schoolSettingsRepository) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = schoolSettingsRepository;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        SchoolSettingsRepository schoolSettingsRepository = this.A01;
        if (schoolSettingsRepository == null) {
            schoolSettingsRepository = SchoolSettingsRepository.A00(userSession);
        }
        return new C53018Gh9(userSession, schoolSettingsRepository);
    }
}
