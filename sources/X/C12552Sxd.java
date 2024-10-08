package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Sxd  reason: case insensitive filesystem */
public final class C12552Sxd implements C13785Th0 {
    public final /* synthetic */ C12553Sxe A00;

    public /* synthetic */ C12552Sxd(C12553Sxe sxe) {
        this.A00 = sxe;
    }

    public final void FOQ(int i, boolean z) {
        C12553Sxe sxe = this.A00;
        Lock lock = sxe.A0B;
        lock.lock();
        try {
            if (sxe.A04) {
                sxe.A04 = false;
                sxe.A07.FOQ(i, false);
                sxe.A03 = null;
                sxe.A02 = null;
            } else {
                sxe.A04 = true;
                sxe.A08.D5q(i);
            }
        } finally {
            lock.unlock();
        }
    }

    public final void FOL(ConnectionResult connectionResult) {
        C12553Sxe sxe = this.A00;
        Lock lock = sxe.A0B;
        lock.lock();
        try {
            sxe.A03 = connectionResult;
            C12553Sxe.A02(sxe);
        } finally {
            lock.unlock();
        }
    }

    public final void FOO(Bundle bundle) {
        C12553Sxe sxe = this.A00;
        Lock lock = sxe.A0B;
        lock.lock();
        try {
            sxe.A03 = ConnectionResult.A04;
            C12553Sxe.A02(sxe);
        } finally {
            lock.unlock();
        }
    }
}
