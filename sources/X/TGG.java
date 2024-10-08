package X;

import android.util.Pair;
import java.util.List;

public final class TGG implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ ST9 A01;

    public TGG(Pair pair, ST9 st9) {
        this.A01 = st9;
        this.A00 = pair;
    }

    public final void run() {
        ST3 st3;
        ST3 st32;
        ST9 st9 = this.A01;
        Pair pair = this.A00;
        List list = (List) pair.first;
        if (list != null && !list.isEmpty() && (st32 = st9.A0w) != null && st32.A04()) {
            try {
                int andIncrement = ST3.A0e.getAndIncrement() & 65535;
                st9.A0O.A02(st32, RFZ.SUBACK, "callSub", andIncrement, st9.A0E.A00().A0L);
                synchronized (st32) {
                    if (st32.A04()) {
                        st32.A0J.execute(new C13026TIi(st32, list, andIncrement));
                    } else {
                        Integer num = AnonymousClass05K.A15;
                        throw new C241873Rq(num, S9M.A01(num), (Throwable) null);
                    }
                }
            } catch (C241873Rq e) {
                0KC.A0I(st9.A0X, "exception/subscribe", e);
                st9.A07(st32, C8947RGw.SEND_FAILURE, AnonymousClass05K.A01);
            }
        }
        List list2 = (List) pair.second;
        if (list2 != null && !list2.isEmpty() && (st3 = st9.A0w) != null && st3.A04()) {
            try {
                int andIncrement2 = ST3.A0e.getAndIncrement() & 65535;
                st9.A0O.A02(st3, RFZ.UNSUBACK, "callUnSub", andIncrement2, st9.A0E.A00().A0L);
                synchronized (st3) {
                    if (st3.A04()) {
                        st3.A0J.execute(new C13027TIj(st3, list2, andIncrement2));
                    } else {
                        Integer num2 = AnonymousClass05K.A15;
                        throw new C241873Rq(num2, S9M.A01(num2), (Throwable) null);
                    }
                }
            } catch (C241873Rq e2) {
                0KC.A0I(st9.A0X, "exception/unsubscribe", e2);
                st9.A07(st3, C8947RGw.SEND_FAILURE, AnonymousClass05K.A01);
            }
        }
    }
}
