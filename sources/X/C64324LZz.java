package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.LZz  reason: case insensitive filesystem */
public final class C64324LZz implements 2YM {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass07Z A01;
    public final /* synthetic */ UserSession A02;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public C64324LZz(FragmentActivity fragmentActivity, AnonymousClass07Z r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final 2YL create(Class cls) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        ClipsCreationViewModel A002 = JTO.A0L(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        C61480nO A003 = 0nY.A00();
        0qQ.A07(A003);
        LOG log = new LOG(userSession, new AnonymousClass8IU(A003));
        ClipsAudioStore clipsAudioStore = C3500382y.A00(JTP.A0A(fragmentActivity), userSession).A00(A002.A0S).A01;
        return new C60322JjR(fragmentActivity, this.A01, userSession, log, new AnonymousClass83F(AnonymousClass7TE.A1H(), AnonymousClass7TE.A1H()), clipsAudioStore, JTO.A0L(new C3507085w(userSession, fragmentActivity), fragmentActivity).A00(C3507185x.class), A002);
    }
}
