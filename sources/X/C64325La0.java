package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.La0  reason: case insensitive filesystem */
public final class C64325La0 implements 2YM {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass2Np A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C262224Cq A04;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public C64325La0(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass2Np r3, String str, C262224Cq r5) {
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = fragmentActivity;
    }

    public final 2YL create(Class cls) {
        String str = this.A03;
        if (str != null) {
            UserSession userSession = this.A01;
            SfxAudioRepository sfxAudioRepository = new SfxAudioRepository(userSession, new C63946LEm(this.A02), new SfxNetworkSource(), str, this.A04);
            FragmentActivity fragmentActivity = this.A00;
            return new C60290Jin(sfxAudioRepository, C3500382y.A00(JTP.A0A(fragmentActivity), userSession).A00(JTO.A0L(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class).A0S).A01);
        }
        throw AnonymousClass7TE.A0y();
    }
}
