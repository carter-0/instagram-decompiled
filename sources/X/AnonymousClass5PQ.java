package X;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.5PQ  reason: invalid class name */
public final class AnonymousClass5PQ implements AnonymousClass5PR {
    public final Choreographer A00;
    public final AnonymousClass5PM A01;

    public final Object fold(Object obj, 0sL r3) {
        0qQ.A0B(r3, 2);
        return r3.invoke(obj, this);
    }

    public final Object FNV(AnonymousClass4D7 r8, 0sP r9) {
        0sP r0;
        AnonymousClass5PM r6 = this.A01;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r4 = new 1IW(1, 1Ey.A02(r8));
        r4.A0I();
        C298645tn r3 = new C298645tn(this, r9, r4);
        Choreographer choreographer = r6.A05;
        Choreographer choreographer2 = this.A00;
        if (0qQ.A0K(choreographer, choreographer2)) {
            synchronized (r6.A08) {
                r6.A01.add(r3);
                if (!r6.A02) {
                    r6.A02 = true;
                    choreographer.postFrameCallback(r6.A07);
                }
            }
            r0 = new C377469Ly(16, (Object) r6, (Object) r3);
        } else {
            choreographer2.postFrameCallback(r3);
            r0 = new TYA(1, (Object) this, (Object) r3);
        }
        r4.CO0(r0);
        return r4.A0E();
    }

    public final /* synthetic */ C634312c getKey() {
        return AnonymousClass5PR.A00;
    }

    public AnonymousClass5PQ(Choreographer choreographer, AnonymousClass5PM r2) {
        this.A00 = choreographer;
        this.A01 = r2;
    }

    public final C262084Cb get(C634312c r2) {
        return AnonymousClass199.A00(this, r2);
    }

    public final C262094Cc minusKey(C634312c r2) {
        return AnonymousClass199.A01(this, r2);
    }

    public final C262094Cc plus(C262094Cc r2) {
        return AnonymousClass199.A02(this, r2);
    }
}
