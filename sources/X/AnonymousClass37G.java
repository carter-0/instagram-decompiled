package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.37G  reason: invalid class name */
public final class AnonymousClass37G implements Runnable {
    public final /* synthetic */ AnonymousClass37F A00;

    public AnonymousClass37G(AnonymousClass37F r1) {
        this.A00 = r1;
    }

    public final void run() {
        C13823Tht tht;
        AnonymousClass37F r9 = this.A00;
        if (!r9.A0Y && (tht = r9.A0G) != null) {
            tht.Cyn();
        }
        AnonymousClass91D r1 = r9.A0B;
        boolean z = false;
        if (r1 != null) {
            C13847TiP tiP = r1.A00.A0U;
            if (tiP == null) {
                z = false;
            } else {
                z = tiP.EvO();
            }
        } else {
            C7218Pzn pzn = r9.A0D;
            if (pzn != null) {
                C71392co A04 = C71392co.A04(20.0d, 12.0d);
                2cs r10 = pzn.A0V;
                r10.A09(A04);
                r10.A06(((double) pzn.A0E(pzn.A09)) + (((double) C7218Pzn.A02(pzn)) * 0.06d));
                z = new Handler(Looper.getMainLooper()).postDelayed(new TE9(pzn), 750);
            }
        }
        r9.A0Y = z;
    }
}
