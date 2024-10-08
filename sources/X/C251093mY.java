package X;

import android.os.SystemClock;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3mY  reason: invalid class name and case insensitive filesystem */
public abstract class C251093mY implements C251073mW {
    public final 29x A00;
    public final AbstractMap A01;
    public final List A02;
    public final Map A03;
    public final Set A04;
    public volatile long A05 = 0;

    public long A06(String str) {
        long j;
        C251083mX r2 = (C251083mX) this;
        synchronized (r2) {
            Long l = (Long) r2.A08.get(str);
            if (l == null) {
                j = -1;
            } else {
                j = l.longValue();
            }
        }
        return j;
    }

    public String A07() {
        String obj;
        C251083mX r5 = (C251083mX) this;
        synchronized (r5) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            for (2R9 r6 : r5.A09.values()) {
                sb.append(Pxd.A00(797));
                sb.append(elapsedRealtime - r6.A01);
                sb.append(",");
                sb.append("waitCount:");
                sb.append(r6.A00);
                sb.append(",");
                sb.append("key:");
                sb.append(r6.A06);
                sb.append("\r\n");
            }
            obj = sb.toString();
        }
        return obj;
    }

    public void A08() {
        C251083mX r0 = (C251083mX) this;
        Object obj = r0.A00;
        synchronized (obj) {
            if (!r0.A01) {
                obj.wait();
            }
        }
    }

    public abstract void A09(29x r1);

    public void A0B(String str, long j) {
        C251083mX r2 = (C251083mX) this;
        synchronized (r2) {
            r2.A08.put(str, Long.valueOf(j));
        }
    }

    public boolean A0C() {
        return ((C251083mX) this).A01;
    }

    public void A0A(2R9 r4) {
        List list = (List) this.A03.get(r4.A06);
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((29y) list.get(size)).Dls(this, r4);
            }
        }
        29x r0 = this.A00;
        if (r0 != null) {
            r0.Dls(this, r4);
        }
        for (29y Dls : this.A02) {
            Dls.Dls(this, r4);
        }
    }

    public C251093mY(29x r3, ArrayList arrayList) {
        this.A00 = r3;
        this.A01 = new HashMap();
        this.A04 = new HashSet();
        this.A03 = new HashMap();
        this.A02 = arrayList;
    }
}
