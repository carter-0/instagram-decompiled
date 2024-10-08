package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.S2p  reason: case insensitive filesystem */
public final class C10957S2p {
    public ServiceConnection A00;
    public IBinder A01;
    public final AnonymousClass2Fj A02 = new 2Fk(C8884REb.UNKNOWN);
    public final String A03;
    public final Context A04;

    public C10957S2p(Context context, String str) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A04 = context;
        A00();
    }

    public final void A00() {
        C8884REb rEb;
        AnonymousClass2Fj r4 = this.A02;
        C8884REb rEb2 = (C8884REb) r4.A02();
        this.A00 = new SVZ(this, 3);
        Intent A09 = DbS.A09();
        C66581MXm.A17(A09, this.A03, "com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl");
        ServiceConnection serviceConnection = this.A00;
        if (!0b6.A00().A06().A04(this.A04, A09, serviceConnection, 1)) {
            this.A01 = null;
            this.A00 = null;
            if (rEb2 == null) {
                rEb2 = C8884REb.UNKNOWN;
            }
            int ordinal = rEb2.ordinal();
            if (ordinal == 0) {
                rEb = C8884REb.FIRST_RETRY;
            } else if (ordinal == 2) {
                rEb = C8884REb.SECOND_RETRY;
            } else if (ordinal == 3 || ordinal == 4) {
                rEb = C8884REb.UNSUCCESSFUL;
            } else if (ordinal == 1) {
                rEb = C8884REb.CONNECTED;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            r4.A0B(rEb);
        }
    }
}
