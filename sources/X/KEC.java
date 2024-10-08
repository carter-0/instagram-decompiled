package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.audio.soundsync.repository.data.SoundSyncSuggestedAudioNetworkDataSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

public final class KEC extends C228042kh {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AudioOverlayTrack A02;
    public final List A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C361278fx r0;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        ClipsCreationViewModel A002 = JTO.A0L(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        String str = A002.A0S;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack == null) {
            2Fk r2 = A002.A0K.A06;
            C361278fx r02 = (C361278fx) r2.A02();
            if (r02 == null || r02.A00 != 3 || (r0 = (C361278fx) r2.A02()) == null) {
                audioOverlayTrack = null;
            } else {
                audioOverlayTrack = (AudioOverlayTrack) r0.A00();
            }
        }
        List list = this.A03;
        SoundSyncSuggestedAudioNetworkDataSource soundSyncSuggestedAudioNetworkDataSource = new SoundSyncSuggestedAudioNetworkDataSource(userSession);
        0qQ.A0B(userSession, 0);
        return new C60297Jiv((C63910LBu) userSession.A01(C63910LBu.class, new C20609Wvq(soundSyncSuggestedAudioNetworkDataSource, 49)), userSession, C3500382y.A00(JTP.A0A(fragmentActivity), userSession).A00(str).A00, audioOverlayTrack, list);
    }

    public KEC(FragmentActivity fragmentActivity, UserSession userSession, AudioOverlayTrack audioOverlayTrack, List list) {
        AnonymousClass7TG.A1P(userSession, list);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = list;
        this.A02 = audioOverlayTrack;
    }
}
