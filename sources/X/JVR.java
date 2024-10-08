package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

public final class JVR implements C74542Pwb {
    public final UserSession A00;
    public final AtomicInteger A01 = new AtomicInteger(0);
    public final C262224Cq A02;
    public final 05G A03;

    public final void start() {
        if (this.A01.getAndIncrement() <= 0) {
            MG2.A01(this, this.A02, 44);
        }
    }

    public final void stop() {
        AtomicInteger atomicInteger = this.A01;
        if (atomicInteger.decrementAndGet() <= 0) {
            atomicInteger.set(0);
            AnonymousClass5H8.A02(this.A02.ArX());
        }
    }

    public JVR(AnonymousClass12V r3, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r3);
        this.A00 = userSession;
        this.A02 = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(JTP.A0V(r3, 1282794279)));
        this.A03 = 106.A01(C376369Hs.A01);
    }
}
