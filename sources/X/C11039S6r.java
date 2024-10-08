package X;

import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.S6r  reason: case insensitive filesystem */
public final class C11039S6r {
    public Timer A00;
    public final long A01;
    public final S1Z A02 = new S1Z();
    public final ExecutorService A03 = Executors.newSingleThreadExecutor();

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        this.A03.execute(new C12853TAt(this));
        S1Z s1z = this.A02;
        AnonymousClass7TE.A1Z(new C66187MGy(s1z, str, (AnonymousClass4D7) null, 1), s1z.A02);
    }

    public final void A02(String str, C62320sa r11) {
        0qQ.A0B(str, 0);
        S1Z s1z = this.A02;
        AnonymousClass7TE.A1Z(new C66187MGy(s1z, str, (AnonymousClass4D7) null, 0), s1z.A02);
        this.A03.execute(new TJT(s1z, this, r11, this.A01));
    }

    public final void A03(Map map) {
        0qQ.A0B(map, 0);
        S1Z s1z = this.A02;
        AnonymousClass7TE.A1Z(new C59677JTi(map, s1z, (AnonymousClass4D7) null, 5), s1z.A02);
    }

    public final void A00(String str) {
        this.A03.execute(new C12853TAt(this));
        if (str.length() > 0) {
            this.A02.A00(new QGF(str), "cancel_reason");
        }
        S1Z s1z = this.A02;
        Pxi.A1J(s1z, s1z.A02, 14);
    }

    public C11039S6r(long j) {
        this.A01 = j;
    }
}
