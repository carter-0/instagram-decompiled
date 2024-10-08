package X;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: X.TLz  reason: case insensitive filesystem */
public final class C13115TLz implements Comparator, 29x {
    public long A00;
    public long A01;
    public NavigableSet A02;
    public SortedSet A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final long A07;
    public final Map A08;
    public final int A09;
    public final Map A0A;

    public final void DCr(String str, String str2, int i, int i2) {
    }

    public final void Dlr(C251073mW r8, 2R9 r9) {
        long j;
        new TGW(this, r9).run();
        String str = r9.A06;
        String A002 = 2RB.A00(str);
        if (A002 != null) {
            Map map = this.A08;
            Number A14 = C51966G9m.A14(A002, map);
            if (A14 != null) {
                j = A14.longValue() + r9.A03;
            } else {
                j = r9.A03;
            }
            map.put(A002, Long.valueOf(j));
            if (r9.A04 > ((long) this.A09)) {
                Map map2 = this.A0A;
                Set set = (Set) map2.get(A002);
                if (set != null) {
                    set.add(r9);
                } else {
                    TreeSet treeSet = new TreeSet(this);
                    treeSet.add(r9);
                    map2.put(A002, treeSet);
                }
            }
        }
        A00(r8, str, 0);
    }

    public final void Dls(C251073mW r9, 2R9 r10) {
        String A002 = 2RB.A00(r10.A06);
        if (A002 != null) {
            Map map = this.A08;
            Number A14 = C51966G9m.A14(A002, map);
            if (A14 != null) {
                long longValue = A14.longValue() - r10.A03;
                Long valueOf = Long.valueOf(longValue);
                if (longValue <= 0) {
                    map.remove(A002);
                } else {
                    map.put(A002, valueOf);
                }
            }
            Map map2 = this.A0A;
            Set set = (Set) map2.get(A002);
            if (set != null) {
                set.remove(r10);
                if (set.isEmpty()) {
                    map2.remove(A002);
                }
            }
        }
        new TGX(this, r10).run();
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

    public C13115TLz(double d, double d2, int i, int i2, long j) {
        j = j <= 0 ? 104857600 : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        d2 = d2 <= 0.0d ? 0.30000001192092896d : d2;
        this.A08 = AnonymousClass7TE.A1E();
        this.A0A = AnonymousClass7TE.A1E();
        this.A07 = j;
        this.A09 = i;
        this.A05 = (float) d;
        this.A06 = i2;
        this.A04 = (float) d2;
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = new TreeSet(this);
        this.A03 = new TreeSet(this);
    }

    public final void A00(C251073mW r8, String str, long j) {
        NavigableSet navigableSet;
        try {
            27d.A01("preVideoLruProtectPrefetchEvict");
            String A002 = 2RB.A00(str);
            if (A002 != null && (navigableSet = (NavigableSet) this.A0A.get(A002)) != null) {
                while (true) {
                    Long A0o = Pxe.A0o(A002, this.A08);
                    if (A0o == null || ((float) A0o.longValue()) / ((float) this.A07) < this.A05 || navigableSet.isEmpty()) {
                        break;
                    }
                    2R9 r2 = (2R9) navigableSet.first();
                    if (r8 instanceof 2OG) {
                        ((2OG) r8).A02(r2, "lru_policy");
                    } else {
                        r8.EEe(r2);
                    }
                }
            }
            while (true) {
                long j2 = this.A00;
                long j3 = this.A01;
                long j4 = this.A07;
                if (j2 + j3 + j > j4) {
                    if (((float) j3) > ((float) j4) * this.A04 || this.A03.isEmpty()) {
                        NavigableSet navigableSet2 = this.A02;
                        if (!navigableSet2.isEmpty()) {
                            r8.EEe((2R9) navigableSet2.first());
                        }
                    }
                    SortedSet sortedSet = this.A03;
                    if (sortedSet.isEmpty()) {
                        break;
                    }
                    r8.EEe((2R9) sortedSet.first());
                } else {
                    break;
                }
            }
        } finally {
            27d.A00();
        }
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
