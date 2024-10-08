package X;

import android.media.MediaPlayer;

/* renamed from: X.Lmj  reason: case insensitive filesystem */
public final class C65065Lmj implements C66506MUk {
    public final Integer A00 = AnonymousClass05K.A00;
    public final String A01;
    public final /* synthetic */ C64145LQi A02;

    public C65065Lmj(C64145LQi lQi) {
        this.A02 = lQi;
        this.A01 = AnonymousClass7TE.A16(lQi.A06.requireContext(), 2131975201);
    }

    public final Integer BVY() {
        return this.A00;
    }

    public final void Cyg() {
        C64145LQi lQi = this.A02;
        C358368an r0 = lQi.A0A.A00;
        r0.A04 = null;
        r0.A1X.FIJ(false);
        MediaPlayer mediaPlayer = lQi.A00;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        lQi.A00 = null;
        lQi.A04 = null;
        lQi.A03 = null;
    }

    public final String getTitle() {
        return this.A01;
    }
}
