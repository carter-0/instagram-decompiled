package X;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class TGD implements Runnable {
    public S6G A00;
    public final /* synthetic */ SHT A01;

    public TGD(S6G s6g, SHT sht) {
        this.A01 = sht;
        this.A00 = s6g;
    }

    public final void run() {
        SHT sht = this.A01;
        Executor executor = SHT.A04;
        C10778Rxy rxy = sht.A02;
        S6G s6g = this.A00;
        if (rxy.A00 == Integer.MAX_VALUE) {
            0KC.A0D("CounterSession", "Reached max counterEvents probably due to upload failure, clearing old events");
            rxy.A04.clear();
            rxy.A00 = 0;
        }
        String A11 = 002.A11("fbns_counters", "_", s6g.A00(), "_", s6g.A02);
        Map map = rxy.A04;
        if (map.containsKey(A11)) {
            RQZ rqz = ((S6G) map.get(A11)).A00;
            RQZ rqz2 = s6g.A00;
            rqz.A00 += rqz2.A00;
            rqz.A02 += rqz2.A02;
            rqz.A01 = Math.max(rqz.A01, rqz2.A01);
        } else {
            map.put(A11, s6g);
        }
        int i = rxy.A00 + 1;
        rxy.A00 = i;
        if (i >= 50) {
            SHT.A04.execute(new TCP(sht));
            return;
        }
        AtomicBoolean atomicBoolean = sht.A03;
        if (atomicBoolean.compareAndSet(false, true) && !sht.A00.sendEmptyMessageDelayed(1, 300000)) {
            atomicBoolean.set(false);
        }
    }
}
