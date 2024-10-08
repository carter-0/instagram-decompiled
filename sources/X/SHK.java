package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

public final class SHK {
    public final C327287Ae A00;
    public final C327307Ag A01;
    public final LiveLocationSession A02;
    public final String A03;

    public final void A00(C13919TlL tlL) {
        LiveLocationSession liveLocationSession = this.A02;
        if (liveLocationSession != null) {
            this.A01.A00(new C12039Sl0(0, tlL, this, liveLocationSession), liveLocationSession);
            return;
        }
        this.A00.AYi(new QJU(tlL, this), this.A03);
    }

    public SHK(C327287Ae r2, LiveLocationSession liveLocationSession, C327307Ag r4) {
        this.A01 = r4;
        this.A00 = r2;
        this.A03 = liveLocationSession.A02;
        this.A02 = liveLocationSession;
    }

    public SHK(C327287Ae r2, C327307Ag r3, String str) {
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = null;
    }
}
