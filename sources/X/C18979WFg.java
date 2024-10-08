package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.WFg  reason: case insensitive filesystem */
public final class C18979WFg implements C13919TlL {
    public final /* synthetic */ UHR A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ boolean A02;

    public C18979WFg(UHR uhr, LiveLocationSession liveLocationSession, boolean z) {
        this.A00 = uhr;
        this.A01 = liveLocationSession;
        this.A02 = z;
    }

    public final void onError(Throwable th) {
        UHR uhr = this.A00;
        UHS.A04(uhr, th, "ERROR");
        UHS.A05(uhr, "screen error", new Object[0]);
    }

    public final void onSuccess() {
        UHR uhr = this.A00;
        C17908Vhz vhz = uhr.A02;
        VN2 vn2 = vhz.A04;
        vn2.A00.submit(new C13068TJy(vhz.A02, vhz.A03, vn2, AnonymousClass05K.A01));
        vhz.A00 = false;
        UHS.A04(uhr, (Object) null, "LIVE_LOCATION_STOPPED");
        if (this.A02) {
            UHR.A01(uhr);
        }
        UHR.A02(uhr);
    }
}
