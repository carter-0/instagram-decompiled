package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.KEb  reason: case insensitive filesystem */
public final class C61600KEb extends C228042kh {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final AnonymousClass8RL A04;
    public final AnonymousClass8RF A05;
    public final C62320sa A06;
    public final boolean A07;

    public C61600KEb(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RL r5, AnonymousClass8RF r6, C62320sa r7, int i, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = clipsCreationViewModel;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = i;
        this.A07 = z;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application A0A = JTP.A0A(this.A01);
        UserSession userSession = this.A02;
        ClipsCreationViewModel clipsCreationViewModel = this.A03;
        AnonymousClass8RF r5 = this.A05;
        return new C60241Jhy(A0A, userSession, clipsCreationViewModel, this.A04, r5, this.A06, this.A00, this.A07);
    }
}
