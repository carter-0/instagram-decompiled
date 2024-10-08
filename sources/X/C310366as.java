package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;

/* renamed from: X.6as  reason: invalid class name and case insensitive filesystem */
public final class C310366as extends C228042kh {
    public final UserSession A00;

    public C310366as(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new StoriesTemplateParticipationViewModel(userSession, new C310376au(userSession));
    }
}
