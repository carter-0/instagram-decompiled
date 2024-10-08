package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

public final class KEP extends C228042kh {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final AnonymousClass8RF A04;
    public final C62320sa A05;

    public KEP(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r5, C62320sa r6, int i) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = r5;
        this.A03 = clipsCreationViewModel;
        this.A00 = i;
        this.A05 = r6;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application A0A = JTP.A0A(this.A01);
        UserSession userSession = this.A02;
        AnonymousClass8RF r4 = this.A04;
        return new C61806KMu(A0A, userSession, this.A03, r4, this.A05, this.A00);
    }
}
