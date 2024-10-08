package X;

import android.media.AudioManager;

public final class OW7 {
    public C39894ADw A00;
    public C39894ADw A01;
    public final AudioManager.OnAudioFocusChangeListener A02 = new C71255OgM(this, 1);
    public final C263534Mj A03;
    public final C74437Pus A04 = new C71762OqO((C74437Pus) null);
    public final OUV A05;
    public final C74466PvL A06;

    public OW7(AudioManager audioManager, OUV ouv, C74466PvL pvL) {
        0qQ.A0B(audioManager, 1);
        this.A06 = pvL;
        this.A05 = ouv;
        this.A03 = new C263534Mj(audioManager);
    }

    public static final boolean A00(C39894ADw aDw, OW7 ow7) {
        boolean A1S = AnonymousClass7TF.A1S(ow7.A03.A01(aDw), 1);
        ow7.A05.A00("audio focus request successful: %b", Boolean.valueOf(A1S));
        return A1S;
    }

    public final void A01() {
        C39894ADw aDw = this.A01;
        if (aDw != null) {
            this.A05.A00("releasing audio focus for call", new Object[0]);
            this.A03.A00(aDw);
        }
        this.A01 = null;
    }

    public final void A02() {
        C39894ADw aDw = this.A00;
        if (aDw != null) {
            this.A05.A00("releasing audio focus for tones", new Object[0]);
            this.A03.A00(aDw);
        }
        this.A00 = null;
    }
}
