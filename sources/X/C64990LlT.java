package X;

import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.LlT  reason: case insensitive filesystem */
public final class C64990LlT implements C66504MUi {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ JVX A01;

    public C64990LlT(AlbumEditFragment albumEditFragment, JVX jvx) {
        this.A00 = albumEditFragment;
        this.A01 = jvx;
    }

    public final void DXO() {
        C234502xy r0 = this.A00.A0P;
        if (r0 != null) {
            r0.E2p();
        }
    }

    public final boolean isPlaying() {
        C234502xy r3 = this.A00.A0P;
        if (r3 == null || r3.C9D(this.A01.BUq()) == AnonymousClass05K.A00 || !r3.isPlaying()) {
            return false;
        }
        return true;
    }

    public final void onPause() {
        C234502xy r0 = this.A00.A0P;
        if (r0 != null) {
            r0.pause();
        }
    }
}
