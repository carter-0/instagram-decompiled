package X;

import android.os.SystemClock;

/* renamed from: X.OtO  reason: case insensitive filesystem */
public final class C71938OtO implements C61110lV {
    public final /* synthetic */ OWA A00;

    public C71938OtO(OWA owa) {
        this.A00 = owa;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1420330826);
        OWA owa = this.A00;
        owa.A08.onAppBackgrounded();
        if (owa.A0J.A07.isDeviceLocked()) {
            owa.A06 = true;
        }
        C71142Ods ods = owa.A03;
        if (ods != null) {
            C71142Ods.A02(C69417Nkz.A1S, ods, C74133Ppa.A00);
            ods.A0D = SystemClock.elapsedRealtime();
            C71142Ods.A07(ods, AnonymousClass05K.A0C);
        }
        AnonymousClass0fD.A0A(1922897503, A03);
    }

    public final void onAppForegrounded() {
        C71142Ods ods;
        int A03 = AnonymousClass0fD.A03(-1777226981);
        OWA owa = this.A00;
        C71142Ods ods2 = owa.A03;
        if (ods2 != null) {
            C71142Ods.A02(C69417Nkz.A1T, ods2, new C74190PqW(ods2, 47));
        }
        if (owa.A06 && (ods = owa.A03) != null) {
            C71142Ods.A02(C69417Nkz.A0h, ods, C74135Ppc.A00);
            C71142Ods.A07(ods, AnonymousClass05K.A01);
        }
        AnonymousClass0fD.A0A(1944936013, A03);
    }
}
