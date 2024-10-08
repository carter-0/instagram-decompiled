package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaar;
import java.util.concurrent.locks.Lock;

public final class Sx7 implements AnonymousClass63y, AnonymousClass640 {
    public final /* synthetic */ C12550Sxb A00;

    public /* synthetic */ Sx7(C12550Sxb sxb) {
        this.A00 = sxb;
    }

    public final void D5q(int i) {
    }

    public final void D5e(Bundle bundle) {
        C12550Sxb sxb = this.A00;
        AnonymousClass3Qk.A02(sxb.A0E);
        C13954TmH tmH = sxb.A01;
        AnonymousClass3Qk.A02(tmH);
        tmH.FOS(new zaar(sxb));
    }

    public final void D5m(ConnectionResult connectionResult) {
        C12550Sxb sxb = this.A00;
        Lock lock = sxb.A0G;
        lock.lock();
        try {
            if (!sxb.A02 || !(connectionResult.A01 == 0 || connectionResult.A02 == null)) {
                C12550Sxb.A02(connectionResult, sxb);
            } else {
                C12550Sxb.A03(sxb);
                C12550Sxb.A04(sxb);
            }
        } finally {
            lock.unlock();
        }
    }
}
