package X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.47U  reason: invalid class name */
public final class AnonymousClass47U extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1wo A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass47U(1wo r4, String str, int i, long j) {
        super(9, 5, false, false);
        this.A02 = r4;
        this.A00 = i;
        this.A03 = str;
        this.A01 = j;
    }

    public final void run() {
        Integer valueOf;
        1wo r1 = this.A02;
        int i = this.A00;
        String str = this.A03;
        long j = this.A01;
        LruCache lruCache = 1wo.A03;
        if (AnonymousClass20W.A02() || r1.A01) {
            LruCache lruCache2 = 1wo.A03;
            synchronized (lruCache2) {
                valueOf = Integer.valueOf(i);
                if (lruCache2.get(valueOf) != null) {
                    lruCache2.put(valueOf, true);
                }
            }
            if (!02m.A0p.isMarkerOn(25624577, i)) {
                return;
            }
            if (str.equals("DISK")) {
                Set set = 1wo.A04;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (set.size() > 300 && it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                    set.add(valueOf);
                    02m.A0p.markerPoint(25624577, i, "DISK", j, TimeUnit.MILLISECONDS);
                }
                return;
            }
            02m.A0p.markerAnnotate(25624577, i, "SOURCE", str);
            02m.A0p.markerEnd(25624577, i, 467, j, TimeUnit.MILLISECONDS);
        }
    }
}
