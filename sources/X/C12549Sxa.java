package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Sxa  reason: case insensitive filesystem */
public final class C12549Sxa implements C13840TiF {
    public final C12554Sxf A00;

    public C12549Sxa(C12554Sxf sxf) {
        this.A00 = sxf;
    }

    public final void FOX(Bundle bundle) {
    }

    public final void FOY(ConnectionResult connectionResult, AnonymousClass63K r2, boolean z) {
    }

    public final void FOZ(int i) {
    }

    public final boolean FOa() {
        return true;
    }

    public final C8412Qts FOK(C8412Qts qts) {
        this.A00.A05.A0F.add(qts);
        return qts;
    }

    public final C8412Qts FON(C8412Qts qts) {
        throw AnonymousClass7TE.A0z("GoogleApiClient is not connected yet.");
    }

    public final void FOR() {
        C12554Sxf sxf = this.A00;
        Iterator A0v = AnonymousClass7TF.A0v(sxf.A09);
        while (A0v.hasNext()) {
            ((AnonymousClass647) A0v.next()).disconnect();
        }
        sxf.A05.A03 = Collections.emptySet();
    }

    public final void FOU() {
        C12554Sxf sxf = this.A00;
        Lock lock = sxf.A0D;
        lock.lock();
        try {
            AnonymousClass643 r5 = sxf.A08;
            Map map = sxf.A0B;
            sxf.A0E = new C12550Sxb(sxf.A02, sxf.A03, sxf.A04, sxf, r5, map, lock);
            sxf.A0E.FOR();
            sxf.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
