package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.8jb  reason: invalid class name and case insensitive filesystem */
public final class C363368jb {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02;
    public final 0xa A03;
    public final List A04 = new ArrayList();
    public final ConcurrentMap A05 = new ConcurrentHashMap();
    public final C363348jZ A06;
    public final C61410nE A07 = C61410nE.A00;
    public final String A08;
    public final Comparator A09;

    public C363368jb(C363348jZ r3, 0xa r4, String str, Comparator comparator) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r3, 3);
        this.A03 = r4;
        this.A08 = str;
        this.A06 = r3;
        this.A09 = comparator;
    }

    public final synchronized void A06(Object obj) {
        if (this.A05.remove(this.A06.Ah7(obj)) != null) {
            A00();
            A04();
        }
    }

    public final void A07(List list) {
        0qQ.A0B(list, 0);
        A01();
        for (Object next : list) {
            this.A05.put(this.A06.Ah7(next), next);
        }
        this.A00 = -1;
        this.A01 = System.currentTimeMillis();
        A00();
        this.A02 = true;
        A04();
    }

    private final void A00() {
        List list = this.A04;
        list.clear();
        Comparator comparator = this.A09;
        if (comparator != null) {
            list.addAll(this.A05.values());
            01V.A1D(list, comparator);
        }
    }

    public final void A01() {
        this.A00 = -1;
        this.A01 = -1;
        this.A05.clear();
        this.A04.clear();
        this.A02 = false;
    }

    public final void A02() {
        0xa r0 = this.A03;
        0xY AR4 = r0.AR4();
        List A0X = 00k.A0X(0Yt.A0B(r0.getAll()).keySet());
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : A0X) {
            if (00p.A0k((String) next, this.A08, false)) {
                arrayList.add(next);
            }
        }
        for (String ED3 : arrayList) {
            AR4.ED3(ED3);
        }
        AR4.ED3("expiration_timestamp_ms");
        AR4.ED3("last_fetched_time_ms");
        AR4.apply();
    }

    public final void A05(long j) {
        this.A00 = j;
        0xY AR4 = this.A03.AR4();
        AR4.E5c("expiration_timestamp_ms", this.A00);
        AR4.apply();
    }

    public final void A03() {
        A01();
        for (Map.Entry entry : this.A03.getAll().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!(str == null || value == null || !00p.A0k(str, this.A08, false))) {
                try {
                    C363348jZ r0 = this.A06;
                    Object AOn = r0.AOn((String) value);
                    this.A05.put(r0.Ah7(AOn), AOn);
                } catch (IOException e) {
                    0wb.A07("BootstrapSource", e);
                }
            }
        }
        A00();
        this.A02 = true;
    }

    public final void A04() {
        A02();
        0xY AR4 = this.A03.AR4();
        for (Object next : this.A05.values()) {
            if (next != null) {
                try {
                    String str = this.A08;
                    C363348jZ r2 = this.A06;
                    AR4.E5g(002.A0R(str, r2.Ah7(next)), r2.END(next));
                } catch (IOException e) {
                    0wb.A07("BootstrapSource", e);
                }
            }
        }
        AR4.E5c("expiration_timestamp_ms", this.A00);
        AR4.E5c("last_fetched_time_ms", this.A01);
        AR4.apply();
    }
}
