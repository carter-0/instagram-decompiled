package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.8As  reason: invalid class name and case insensitive filesystem */
public final class C351868As extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C62320sa A02;

    public C351868As(FragmentActivity fragmentActivity, UserSession userSession, C62320sa r4) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C3511387s A002 = new 2YN(C351878Au.A00(fragmentActivity, userSession), fragmentActivity).A00(C3511387s.class);
        ClipsDraftRepository A003 = AnonymousClass72U.A00(fragmentActivity, userSession);
        return new ClipsCreationDraftViewModel(fragmentActivity, C361298g0.A00(fragmentActivity, userSession), userSession, new 2YN(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class), A002, A003, new 2YN(fragmentActivity).A00(AnonymousClass88B.class), this.A02);
    }
}
