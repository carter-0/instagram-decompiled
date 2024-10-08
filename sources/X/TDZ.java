package X;

import java.util.Iterator;
import java.util.Map;

public final class TDZ implements Runnable {
    public final /* synthetic */ SSF A00;

    public TDZ(SSF ssf) {
        this.A00 = ssf;
    }

    public final void run() {
        SSF ssf = this.A00;
        if (ssf.A0D.getAndSet(5) != 5) {
            for (C369008tg r0 : ssf.A0C) {
                if (r0 != null) {
                    r0.A01();
                }
            }
            C11419SSu sSu = ssf.A02;
            if (sSu != null) {
                sSu.A00 = null;
                Map map = sSu.A02;
                Iterator A0v = AnonymousClass7TF.A0v(map);
                while (A0v.hasNext()) {
                    C361248fu r02 = (C361248fu) A0v.next();
                    if (r02 != null) {
                        r02.A02();
                    }
                }
                map.clear();
            }
            ssf.A02 = null;
            C344587s6 r03 = ssf.A00;
            if (r03 != null) {
                r03.release();
            }
            ssf.A00 = null;
        }
    }
}
