package X;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LAj  reason: case insensitive filesystem */
public final class C63880LAj {
    public long A00 = SystemClock.elapsedRealtime();
    public 1QK A01 = 1QK.A0C;
    public final long A02;
    public final C63655L1r A03;
    public final 1Av A04;
    public final List A05 = 0sr.A1P(new C63726L4k[]{new C63726L4k(C62503Kgt.SEARCH_IN_HOME_HEADER, new MP7(this, 5)), new C63726L4k(C62503Kgt.CREATION_IN_HOME_HEADER, new MP7(this, 6))});
    public final 05G A06 = C51967G9n.A0u();
    public final C63307Kuq A07;

    public C63880LAj(C63655L1r l1r, C63307Kuq kuq, 1Av r8) {
        0qQ.A0B(r8, 3);
        this.A03 = l1r;
        this.A07 = kuq;
        this.A04 = r8;
        this.A02 = TimeUnit.SECONDS.toMillis((long) DbS.A04(0Tu.A05, l1r.A00, 36592769175913138L));
    }
}
