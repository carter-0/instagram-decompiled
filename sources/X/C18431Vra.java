package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.Vra  reason: case insensitive filesystem */
public abstract class C18431Vra {
    public boolean A00;
    public final X2G A01;

    public C18431Vra(X2G x2g) {
        this.A01 = x2g;
    }

    public static void A06(UHR uhr, boolean z) {
        LiveLocationSession liveLocationSession = UHR.A00(uhr).A03;
        if (liveLocationSession == null) {
            UHS.A04(uhr, (Object) null, "LIVE_LOCATION_STOPPED");
        } else {
            UHR.A03(uhr, liveLocationSession, z);
        }
    }
}
