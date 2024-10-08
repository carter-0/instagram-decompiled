package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;

public final class IQU implements MV6 {
    public final /* synthetic */ C54126Gzv A00;

    public final void Cwt(AudioOverlayTrack audioOverlayTrack) {
    }

    public final void Dp5(C66569MWx mWx) {
    }

    public IQU(C54126Gzv gzv) {
        this.A00 = gzv;
    }

    public final void Cwu(AudioOverlayTrack audioOverlayTrack) {
        C52974GgR ggR = (C52974GgR) this.A00.A06.getValue();
        C52974GgR.A04(ggR);
        if (!ggR.A0E.A08) {
            ggR.A0K.add(C51966G9m.A1L(new C59674JTf((Object) audioOverlayTrack, (Object) ggR, (AnonymousClass4D7) null, 22, false), C318116oQ.A00(ggR)));
        }
    }

    public final void E0l() {
        ((C3515789k) ((IQE) this.A00.A04.getValue()).A01.getValue()).A0A((AudioOverlayTrack) null, (MusicOverlaySearchTab) null, true, false);
    }
}
