package X;

import android.os.SystemClock;
import java.util.EnumSet;

public final class S5H {
    public final /* synthetic */ ST3 A00;

    public S5H(ST3 st3) {
        this.A00 = st3;
    }

    public final void A00() {
        ST3 st3 = this.A00;
        EnumSet enumSet = ST3.A0c;
        synchronized (st3) {
            st3.notifyAll();
        }
    }

    public final void A01(String str, String str2) {
        ST3 st3 = this.A00;
        EnumSet enumSet = ST3.A0c;
        st3.A0T = SystemClock.elapsedRealtime();
        st3.A0A.A02(String.format("O %s%s", new Object[]{str, str2}));
        st3.A0R = st3.A0T;
        st3.A0B.A06(str, str2, st3.A0a, false);
        st3.A08.A00();
    }

    public final void A02(Throwable th) {
        ST3 st3 = this.A00;
        EnumSet enumSet = ST3.A0c;
        C10416Rrs rrs = st3.A0X;
        if (rrs != null) {
            rrs.A01.A05.post(new TGK(rrs, th));
        }
    }
}
