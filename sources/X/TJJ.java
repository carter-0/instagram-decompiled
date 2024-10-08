package X;

import java.util.Map;

public final class TJJ implements Runnable {
    public final Object A00;
    public final boolean A01;
    public final /* synthetic */ S6X A02;

    public TJJ(S6X s6x, Object obj, boolean z) {
        this.A02 = s6x;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void run() {
        S6X s6x = this.A02;
        synchronized (s6x.A01) {
            Map map = s6x.A03;
            Object obj = this.A00;
            Object obj2 = map.get(obj);
            map.remove(obj);
            Map map2 = s6x.A04;
            map2.remove(obj);
            if (!this.A01 && obj2 != null) {
                map2.put(obj, s6x.A05.invoke(obj2));
            }
            s6x.A02.remove(obj);
        }
    }
}
