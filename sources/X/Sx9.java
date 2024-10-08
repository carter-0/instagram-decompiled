package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class Sx9 implements AnonymousClass63y, AnonymousClass640 {
    public AnonymousClass63S A00;
    public final int A01;
    public final C13675Tek A02;

    public final void D5q(int i) {
    }

    public final void A00(C13675Tek tek) {
        boolean A0F = this.A00.A0F();
        AnonymousClass63S r1 = this.A00;
        if (A0F) {
            tek.D5D(r1);
            return;
        }
        r1.A0B(new Sx5(this, tek));
        this.A00.A0D(new SxA(this, tek));
        this.A00.A08();
    }

    public final void D5e(Bundle bundle) {
        if (this.A01 == 11) {
            AnonymousClass63S r2 = this.A00;
            AnonymousClass3Qk.A03(r2, "client must not be null");
            r2.A07(new C8412Qts(C10136RnD.A04, r2));
        }
        this.A02.D5D(this.A00);
        this.A00.A0C(this);
    }

    public final void D5m(ConnectionResult connectionResult) {
        this.A02.D5D((Object) null);
    }

    public Sx9(C13675Tek tek, boolean z) {
        this.A01 = z ? 10 : 11;
        this.A02 = tek;
    }
}
