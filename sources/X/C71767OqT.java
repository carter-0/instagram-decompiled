package X;

import androidx.media.AudioAttributesCompat;

/* renamed from: X.OqT  reason: case insensitive filesystem */
public final class C71767OqT implements C74466PvL {
    public final /* synthetic */ C71125OdK A00;

    public final synchronized void DHM() {
        C71125OdK odK = this.A00;
        AudioAttributesCompat audioAttributesCompat = C71125OdK.A0M;
        C70828ONa oNa = odK.A00;
        if (oNa != null) {
            odK.A06.EwM(oNa);
        }
    }

    public final synchronized void DPQ() {
        this.A00.A04();
    }

    public final synchronized void Dtj() {
        C71125OdK odK = this.A00;
        AudioAttributesCompat audioAttributesCompat = C71125OdK.A0M;
        odK.A06.pause();
    }

    public C71767OqT(C71125OdK odK) {
        this.A00 = odK;
    }

    public final void DeR() {
        AudioAttributesCompat audioAttributesCompat = C71125OdK.A0M;
    }
}
