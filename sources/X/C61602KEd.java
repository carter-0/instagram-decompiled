package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.KEd  reason: case insensitive filesystem */
public final class C61602KEd extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ClipsTimelineEditorConfig A02;
    public final C354388Lv A03;
    public final ClipsCreationViewModel A04;
    public final C3511387s A05;
    public final AnonymousClass8RF A06;
    public final C61805KMt A07;
    public final C60108Jfo A08;
    public final AnonymousClass88B A09;

    public C61602KEd(FragmentActivity fragmentActivity, UserSession userSession, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C354388Lv r5, ClipsCreationViewModel clipsCreationViewModel, C3511387s r7, AnonymousClass8RF r8, C61805KMt kMt, C60108Jfo jfo, AnonymousClass88B r11) {
        0qQ.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A04 = clipsCreationViewModel;
        this.A09 = r11;
        this.A06 = r8;
        this.A08 = jfo;
        this.A07 = kMt;
        this.A05 = r7;
        this.A03 = r5;
        this.A02 = clipsTimelineEditorConfig;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application A0A = JTP.A0A(this.A00);
        UserSession userSession = this.A01;
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        AnonymousClass88B r10 = this.A09;
        AnonymousClass8RF r7 = this.A06;
        C60108Jfo jfo = this.A08;
        C61805KMt kMt = this.A07;
        C3511387s r6 = this.A05;
        return new C60109Jfp(A0A, userSession, this.A02, this.A03, clipsCreationViewModel, r6, r7, kMt, jfo, r10);
    }
}
