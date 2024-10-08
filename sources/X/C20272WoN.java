package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.WoN  reason: case insensitive filesystem */
public final class C20272WoN implements Runnable {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ C327297Af A01;
    public final /* synthetic */ LiveLocationSession A02;

    public C20272WoN(C13919TlL tlL, C327297Af r2, LiveLocationSession liveLocationSession) {
        this.A01 = r2;
        this.A02 = liveLocationSession;
        this.A00 = tlL;
    }

    public final void run() {
        C327297Af r0 = this.A01;
        r0.A00.FMb(new C18978WFf(this.A00, r0.A01), this.A02);
    }
}
