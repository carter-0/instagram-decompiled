package X;

import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.LoE  reason: case insensitive filesystem */
public final class C65149LoE implements MVQ {
    public final /* synthetic */ AlbumEditFragment A00;

    public final void DkR(C65499LuN luN) {
        0qQ.A0B(luN, 0);
        05G r3 = ((C60323JjS) this.A00.A0f.getValue()).A0J;
        do {
        } while (!r3.AIY(r3.getValue(), new C59721JVf((C66534MVo) luN, AnonymousClass05K.A0N)));
    }

    public C65149LoE(AlbumEditFragment albumEditFragment) {
        this.A00 = albumEditFragment;
    }

    public final void Cp5() {
        AlbumEditFragment.A0E(this.A00, true, false);
    }

    public final void D9J() {
        C64905Lk5 lk5;
        C378369Pn r0;
        C378459Pw r02;
        KB5 kb5 = this.A00.A0D;
        if (kb5 != null && (lk5 = kb5.A0B) != null && (r0 = lk5.A01) != null && (r02 = r0.A08) != null) {
            r02.A0A();
        }
    }

    public final void Dsy() {
        AlbumEditFragment albumEditFragment = this.A00;
        C60439JlX jlX = albumEditFragment.A0L;
        if (jlX == null) {
            0qQ.A0F("audioListAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        LFA lfa = jlX.A00;
        if (lfa != null) {
            jlX.A00 = null;
            jlX.notifyItemChanged(jlX.A06.indexOf(lfa) + 1);
        }
        AlbumEditFragment.A0E(albumEditFragment, false, false);
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        C60323JjS jjS = (C60323JjS) this.A00.A0f.getValue();
        MHN.A03(audioOverlayTrack, jjS, C318116oQ.A00(jjS), 19);
    }
}
