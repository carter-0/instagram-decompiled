package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository;

/* renamed from: X.EEh  reason: case insensitive filesystem */
public final class C47724EEh extends C228042kh {
    public final UserSession A00;

    public C47724EEh(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C47869EKp((CreatorMessagingSelectionScreenRepository) userSession.A01(CreatorMessagingSelectionScreenRepository.class, new C58176Ing(userSession, 4)));
    }
}
