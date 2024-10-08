package X;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

public final class N1P extends C278864xe {
    public static long A01;
    public static final C69717Nqd A02 = new Object();
    public static final N1P A03 = new N1P();
    public final ODD A00;

    public final boolean A00(int i) {
        ODD odd = this.A00;
        AtomicReference atomicReference = odd.A02;
        C73345Pb4 pb4 = (C73345Pb4) atomicReference.get();
        if (pb4 == null) {
            return false;
        }
        pb4.A02 = true;
        odd.A00.removeCallbacks(pb4);
        1FH.A00(pb4, (Object) null, atomicReference);
        return true;
    }

    public final boolean A01(Bundle bundle, C278884xg r5, int i) {
        ODD odd = this.A00;
        C73345Pb4 pb4 = new C73345Pb4(r5, odd.A01, odd);
        odd.A02.set(pb4);
        odd.A00.post(pb4);
        return true;
    }

    public N1P() {
        HandlerThread handlerThread = new HandlerThread("PushTokenRefresherJobLogic");
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            this.A00 = new ODD(looper, C70911ORg.A00);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
