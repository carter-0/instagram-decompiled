package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5DQ  reason: invalid class name */
public final class AnonymousClass5DQ implements Comparator, 29x {
    public AtomicLong A00 = new AtomicLong(0);
    public final float A01;
    public final long A02;
    public final Map A03;
    public final int A04;
    public final Map A05;
    public final NavigableSet A06;

    public final void DCr(String str, String str2, int i, int i2) {
    }

    public final void A00(C251073mW r7, String str, long j) {
        NavigableSet navigableSet;
        try {
            27d.A01("perVideoLRUEvict");
            String A002 = 2RB.A00(str);
            if (A002 != null && (navigableSet = (NavigableSet) this.A05.get(A002)) != null) {
                while (true) {
                    Long l = (Long) this.A03.get(A002);
                    if (l == null || ((float) l.longValue()) / ((float) this.A02) < this.A01 || navigableSet.isEmpty()) {
                        break;
                    } else if (r7 instanceof 2OG) {
                        ((2OG) r7).A02((2R9) navigableSet.first(), "lru_policy");
                    } else {
                        r7.EEe((2R9) navigableSet.first());
                    }
                }
            }
            while (this.A00.get() + j > this.A02) {
                2R9 r0 = (2R9) this.A06.first();
                if (r0 != null) {
                    r7.EEe(r0);
                }
            }
            27d.A00();
        } catch (NoSuchElementException unused) {
            27B.A01("PerVideoLruCacheEvictor", "mLeastRecentlyUsed is empty while trying global eviction", new Object[0]);
        } catch (Throwable th) {
            27d.A00();
            throw th;
        }
    }

    public final void Dlr(C251073mW r8, 2R9 r9) {
        Long valueOf;
        this.A06.add(r9);
        AtomicLong atomicLong = this.A00;
        long j = r9.A03;
        atomicLong.addAndGet(j);
        String str = r9.A06;
        String A002 = 2RB.A00(str);
        Map map = this.A03;
        Number number = (Number) map.get(A002);
        if (number != null) {
            valueOf = Long.valueOf(number.longValue() + j);
        } else {
            valueOf = Long.valueOf(j);
        }
        map.put(A002, valueOf);
        if (r9.A04 > ((long) this.A04)) {
            Map map2 = this.A05;
            Set set = (Set) map2.get(A002);
            if (set != null) {
                set.add(r9);
            } else {
                TreeSet treeSet = new TreeSet(this);
                treeSet.add(r9);
                map2.put(A002, treeSet);
            }
        }
        if (str != null) {
            A00(r8, str, 0);
        }
    }

    public final void Dls(C251073mW r9, 2R9 r10) {
        String A002 = 2RB.A00(r10.A06);
        if (A002 != null) {
            Map map = this.A03;
            Number number = (Number) map.get(A002);
            if (number != null) {
                long longValue = number.longValue() - r10.A03;
                Long valueOf = Long.valueOf(longValue);
                if (longValue <= 0) {
                    map.remove(A002);
                } else {
                    map.put(A002, valueOf);
                }
            }
            Map map2 = this.A05;
            Set set = (Set) map2.get(A002);
            if (set != null) {
                set.remove(r10);
                if (set.isEmpty()) {
                    map2.remove(A002);
                }
            }
        }
        this.A06.remove(r10);
        this.A00.addAndGet(-r10.A03);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        2R9 r10 = (2R9) obj;
        2R9 r11 = (2R9) obj2;
        long j = r10.A02;
        long j2 = r11.A02;
        if (j - j2 == 0) {
            return r10.A02(r11);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public AnonymousClass5DQ(long j, int i, double d) {
        j = j <= 0 ? 104857600 : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        this.A03 = new HashMap();
        this.A05 = new HashMap();
        this.A06 = new TreeSet(this);
        this.A02 = j;
        this.A04 = i;
        this.A01 = (float) d;
    }

    public final void Dlt(C251073mW r1, 2R9 r2, 2R9 r3) {
        Dls(r1, r2);
        Dlr(r1, r3);
    }

    public final void Dlu(C251073mW r1, 2R9 r2, 2R9 r3, Integer num) {
        Dls(r1, r2);
        Dlr(r1, r3);
    }

    public final void DmT(C251073mW r1, String str, long j, long j2) {
        A00(r1, str, j2);
    }
}
