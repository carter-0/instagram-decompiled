package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.9QG  reason: invalid class name */
public final class AnonymousClass9QG implements C3495480u {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass9QG(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int A0M = AnonymousClass7TE.A0M(obj);
        C353498Hw r3 = this.A00;
        if (r3.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", (Throwable) null);
            return;
        }
        AnonymousClass885 r2 = r3.A1m;
        Object A0O = 00k.A0O(C339947kR.A01(), A0M);
        if (A0O == null) {
            A0O = AnonymousClass886.A09;
        }
        r2.A00.A0B(A0O);
        C353498Hw.A0v(r3, C353498Hw.A02(r3) / IgNetworkConsentStorage.MAX_ENTRIES);
    }
}
