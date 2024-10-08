package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.S6p  reason: case insensitive filesystem */
public class C11037S6p {
    public long A00;
    public long A01;
    public final Map A02 = new LinkedHashMap(100, 0.75f, true);

    public final synchronized Object A00(Object obj) {
        Object obj2;
        C10372Rr9 rr9 = (C10372Rr9) this.A02.get(obj);
        if (rr9 != null) {
            obj2 = rr9.A01;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public final synchronized void A01(long j) {
        while (this.A00 > j) {
            Iterator A0u = AnonymousClass7TF.A0u(this.A02);
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            C10372Rr9 rr9 = (C10372Rr9) A1J.getValue();
            this.A00 -= (long) rr9.A00;
            Object key = A1J.getKey();
            A0u.remove();
            A02(key, rr9.A01);
        }
    }

    public final synchronized void A03(Object obj, Object obj2) {
        int i;
        C13796ThF thF;
        if (!(this instanceof QHU) || (thF = (C13796ThF) obj2) == null) {
            i = 1;
        } else {
            i = thF.getSize();
        }
        long j = (long) i;
        long j2 = this.A01;
        C10372Rr9 rr9 = null;
        if (j >= j2) {
            A02(obj, obj2);
        } else {
            if (obj2 != null) {
                this.A00 += j;
            }
            Map map = this.A02;
            if (obj2 != null) {
                rr9 = new C10372Rr9(obj2, i);
            }
            C10372Rr9 rr92 = (C10372Rr9) map.put(obj, rr9);
            if (rr92 != null) {
                this.A00 -= (long) rr92.A00;
                Object obj3 = rr92.A01;
                if (!obj3.equals(obj2)) {
                    A02(obj, obj3);
                }
            }
            A01(j2);
        }
    }

    public final void A02(Object obj, Object obj2) {
        SOI soi;
        if (this instanceof QHV) {
            Queue queue = SII.A01;
            synchronized (queue) {
                queue.offer(obj);
            }
        } else if ((this instanceof QHU) && (soi = ((QHU) this).A00) != null && obj2 != null) {
            C10364Rr1 rr1 = soi.A05;
            synchronized (rr1) {
                Pxe.A1N(rr1.A01, obj2, 1);
            }
        }
    }

    public C11037S6p(long j) {
        this.A01 = j;
    }
}
