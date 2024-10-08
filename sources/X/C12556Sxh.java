package X;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Sxh  reason: case insensitive filesystem */
public final class C12556Sxh implements AnonymousClass64Q {
    public final boolean A00;
    public final AnonymousClass63K A01;
    public final WeakReference A02;

    public final void De8(ConnectionResult connectionResult) {
        C12550Sxb sxb = (C12550Sxb) this.A02.get();
        if (sxb != null) {
            AnonymousClass3Qk.A09(AnonymousClass7TF.A1W(Looper.myLooper(), sxb.A0D.A05.A06), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            Lock lock = sxb.A0G;
            lock.lock();
            try {
                if (C12550Sxb.A07(sxb, 0)) {
                    if (connectionResult.A01 != 0) {
                        C12550Sxb.A01(connectionResult, this.A01, sxb, this.A00);
                    }
                    if (C12550Sxb.A06(sxb)) {
                        C12550Sxb.A04(sxb);
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public C12556Sxh(AnonymousClass63K r2, C12550Sxb sxb, boolean z) {
        this.A02 = C51965G9l.A0v(sxb);
        this.A01 = r2;
        this.A00 = z;
    }
}
