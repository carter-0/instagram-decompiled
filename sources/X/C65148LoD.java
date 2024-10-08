package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Map;

/* renamed from: X.LoD  reason: case insensitive filesystem */
public final class C65148LoD implements MV6 {
    public final /* synthetic */ C59962JcV A00;
    public final /* synthetic */ AnonymousClass0eM A01;

    public final void Cwu(AudioOverlayTrack audioOverlayTrack) {
    }

    public final void Dp5(C66569MWx mWx) {
        0qQ.A0B(mWx, 0);
        ((C63933LDs) this.A01.getValue()).A00(mWx);
    }

    public C65148LoD(C59962JcV jcV, AnonymousClass0eM r2) {
        this.A01 = r2;
        this.A00 = jcV;
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
        Map map = this.A00.A0W;
        ((C65146LoA) ((C63933LDs) this.A01.getValue()).A05.getValue()).Exg((C62642Kk4) null, C371088xY.POST_CAPTURE_AUDIO_BAR, (AudioOverlayTrack) null, AnonymousClass05K.A1I, (String) null, map);
    }
}
