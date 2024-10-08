package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.LnS  reason: case insensitive filesystem */
public final class C65105LnS implements C3515289f, C3499982t {
    public final int A00;
    public final Object A01;

    public C65105LnS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final String BUn() {
        if (this.A00 != 0) {
            return ((ClipsEditMetadataController) this.A01).A14;
        }
        C353508Hx r1 = ((AnonymousClass8XA) this.A01).A0a;
        0qQ.A0C(r1, AnonymousClass000.A00(1629));
        return ((C3499982t) r1).BUn();
    }

    public final void Dsz(AudioOverlayTrack audioOverlayTrack, boolean z) {
        if (this.A00 != 0) {
            LFL lfl = ((ClipsEditMetadataController) this.A01).A0B;
            if (lfl != null) {
                lfl.A00 = null;
                lfl.A03.DtB((AudioOverlayTrack) null);
                return;
            }
            return;
        }
        C362048hG r0 = ((AnonymousClass8XA) this.A01).A02;
        if (r0 != null) {
            r0.A0n.A03();
        }
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        int i = this.A00;
        0qQ.A0B(audioOverlayTrack, 0);
        if (i != 0) {
            LFL lfl = ((ClipsEditMetadataController) this.A01).A0B;
            if (lfl != null) {
                lfl.A00 = audioOverlayTrack;
                lfl.A03.DtB(audioOverlayTrack);
                return;
            }
            return;
        }
        AnonymousClass8XA r2 = (AnonymousClass8XA) this.A01;
        C353508Hx r1 = r2.A0a;
        0qQ.A0C(r1, AnonymousClass000.A00(1629));
        ((C3515289f) r1).Dt2(audioOverlayTrack);
        C362048hG r0 = r2.A02;
        if (r0 != null) {
            r0.A0n.A03();
        }
    }

    public final /* synthetic */ void DT3(boolean z) {
    }

    public final /* synthetic */ void Dsx(AudioOverlayTrack audioOverlayTrack) {
    }

    public final /* synthetic */ void Dt0(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    public final /* synthetic */ void Dt6(AudioOverlayTrack audioOverlayTrack, Integer num) {
        C63171Kse.A00(this, audioOverlayTrack);
    }
}
