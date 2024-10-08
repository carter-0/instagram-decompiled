package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.KEg  reason: case insensitive filesystem */
public final class C61605KEg extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final TargetViewSizeProvider A02;
    public final ClipsCreationViewModel A03;
    public final AnonymousClass8RF A04;
    public final AnonymousClass8M1 A05;
    public final C61805KMt A06;
    public final C61805KMt A07;
    public final C61806KMu A08;
    public final AnonymousClass861 A09;
    public final C3516889w A0A;
    public final boolean A0B;

    public C61605KEg(FragmentActivity fragmentActivity, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r6, AnonymousClass8M1 r7, C61805KMt kMt, C61805KMt kMt2, C61806KMu kMu, AnonymousClass861 r11, C3516889w r12, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = r6;
        this.A03 = clipsCreationViewModel;
        this.A09 = r11;
        this.A0A = r12;
        this.A06 = kMt;
        this.A07 = kMt2;
        this.A08 = kMu;
        this.A02 = targetViewSizeProvider;
        this.A05 = r7;
        this.A0B = z;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application A0A2 = JTP.A0A(this.A00);
        UserSession userSession = this.A01;
        AnonymousClass8RF r5 = this.A04;
        ClipsCreationViewModel clipsCreationViewModel = this.A03;
        AnonymousClass861 r10 = this.A09;
        C3516889w r11 = this.A0A;
        return new C60108Jfo(A0A2, userSession, this.A02, clipsCreationViewModel, r5, this.A05, this.A06, this.A07, this.A08, r10, r11, this.A0B);
    }
}
