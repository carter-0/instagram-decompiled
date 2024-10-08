package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.KEf  reason: case insensitive filesystem */
public final class C61604KEf extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final AnonymousClass8II A02;
    public final C60099Jff A03;
    public final C3507185x A04;
    public final C354388Lv A05;
    public final ClipsCreationViewModel A06;
    public final AnonymousClass8RF A07;
    public final AnonymousClass8M1 A08;
    public final C60108Jfo A09;
    public final C61806KMu A0A;
    public final C3516889w A0B;

    public C61604KEf(Application application, UserSession userSession, AnonymousClass8II r4, C60099Jff jff, C3507185x r6, C354388Lv r7, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r9, AnonymousClass8M1 r10, C60108Jfo jfo, C61806KMu kMu, C3516889w r13) {
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A09 = jfo;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = clipsCreationViewModel;
        this.A0B = r13;
        this.A04 = r6;
        this.A0A = kMu;
        this.A08 = r10;
        this.A02 = r4;
        this.A03 = jff;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        C60108Jfo jfo = this.A09;
        AnonymousClass8RF r8 = this.A07;
        C354388Lv r6 = this.A05;
        ClipsCreationViewModel clipsCreationViewModel = this.A06;
        C3516889w r12 = this.A0B;
        C3507185x r5 = this.A04;
        AnonymousClass8II r3 = this.A02;
        C61806KMu kMu = this.A0A;
        return new C60105Jfl(application, userSession, r3, this.A03, r5, r6, clipsCreationViewModel, r8, this.A08, jfo, kMu, r12);
    }
}
