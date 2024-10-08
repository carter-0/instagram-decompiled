package X;

import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Map;

public final class LoC implements MV6 {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ AnonymousClass0eM A01;

    public final void Cwu(AudioOverlayTrack audioOverlayTrack) {
    }

    public final void Dp5(C66569MWx mWx) {
        0qQ.A0B(mWx, 0);
        ((C63933LDs) this.A01.getValue()).A00(mWx);
    }

    public LoC(AlbumEditFragment albumEditFragment, AnonymousClass0eM r2) {
        this.A01 = r2;
        this.A00 = albumEditFragment;
    }

    public final void Cwt(AudioOverlayTrack audioOverlayTrack) {
        C66569MWx mWx;
        C63933LDs lDs = (C63933LDs) this.A01.getValue();
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            mWx = JVW.A00(musicAssetModel);
        } else {
            mWx = null;
        }
        lDs.A00(mWx);
    }

    public final void E0l() {
        C64905Lk5 lk5;
        C378369Pn r0;
        C378459Pw r02;
        AlbumEditFragment albumEditFragment = this.A00;
        KB5 kb5 = albumEditFragment.A0D;
        if (!(kb5 == null || (lk5 = kb5.A0B) == null || (r0 = lk5.A01) == null || (r02 = r0.A08) == null)) {
            r02.A09();
        }
        Map map = albumEditFragment.A0R;
        ((C65146LoA) ((C63933LDs) this.A01.getValue()).A05.getValue()).Exg((C62642Kk4) null, C371088xY.POST_CAPTURE_AUDIO_BAR, (AudioOverlayTrack) null, AnonymousClass05K.A1I, (String) null, map);
    }
}
