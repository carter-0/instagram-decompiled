package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class Sx8 implements AnonymousClass63y, AnonymousClass640 {
    public C3025563x A00;
    public final AnonymousClass63K A01;
    public final boolean A02;

    public Sx8(AnonymousClass63K r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }

    public final void D5e(Bundle bundle) {
        AnonymousClass3Qk.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.D5e(bundle);
    }

    public final void D5m(ConnectionResult connectionResult) {
        AnonymousClass63K r3 = this.A01;
        boolean z = this.A02;
        AnonymousClass3Qk.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.FOM(connectionResult, r3, z);
    }

    public final void D5q(int i) {
        AnonymousClass3Qk.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.D5q(i);
    }
}
