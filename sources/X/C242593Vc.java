package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Vc  reason: invalid class name and case insensitive filesystem */
public final class C242593Vc {
    public final C13997Tnz A00;
    public final 0fA A01;
    public final C2813957l A02;
    public final C242633Vg A03;
    public final List A04;
    public final Map A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;

    public C242593Vc(C13997Tnz tnz, 0fA r4, 0sP r5) {
        C2813957l r0;
        0qQ.A0B(tnz, 1);
        0qQ.A0B(r4, 2);
        this.A00 = tnz;
        this.A01 = r4;
        if (r5 != null) {
            r0 = (C2813957l) r5.invoke(this);
        } else {
            r0 = null;
        }
        this.A02 = r0;
        this.A04 = new ArrayList();
        this.A05 = new LinkedHashMap();
        02z r02 = new 02z(0);
        this.A06 = r02;
        this.A08 = 10b.A03(r02);
        C242633Vg r03 = new C242633Vg(tnz);
        this.A03 = r03;
        this.A07 = r03.A03;
    }

    public static final void A00(C242593Vc r9, int i, int i2) {
        List list = r9.A04;
        synchronized (list) {
            int i3 = i + 1;
            int i4 = 1;
            if (!list.isEmpty()) {
                i4 = ((List) list.get(0)).size();
            }
            for (int size = list.size(); size < i3; size++) {
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(new C242733Vs(r9.A02, size, i5));
                }
                list.add(arrayList);
                for (int i6 = 0; i6 < i4; i6++) {
                    if (size > 0) {
                        C242733Vs r1 = (C242733Vs) ((List) list.get(size - 1)).get(i6);
                        C242733Vs r0 = (C242733Vs) ((List) list.get(size)).get(i6);
                        r1.A00 = r0;
                        r0.A04 = r1;
                    }
                    if (i6 < i4 - 1) {
                        C242733Vs r2 = (C242733Vs) ((List) list.get(size)).get(i6);
                        C242733Vs r02 = (C242733Vs) ((List) list.get(size)).get(i6 + 1);
                        r2.A03 = r02;
                        r02.A02 = r2;
                    }
                }
            }
            r9.A06.Epw(Integer.valueOf(i3));
            int i7 = i2 + 1;
            if (((List) list.get(0)).size() != i7) {
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    for (int size3 = ((List) list.get(i8)).size(); size3 < i7; size3++) {
                        C242733Vs r22 = new C242733Vs(r9.A02, i8, size3);
                        ((List) list.get(i8)).add(r22);
                        int i9 = size3 - 1;
                        ((C242733Vs) ((List) list.get(i8)).get(i9)).A03 = r22;
                        r22.A02 = (C242643Vh) ((List) list.get(i8)).get(i9);
                        if (i8 > 0) {
                            int i10 = i8 - 1;
                            ((C242733Vs) ((List) list.get(i10)).get(size3)).A00 = r22;
                            r22.A04 = (C242643Vh) ((List) list.get(i10)).get(size3);
                        }
                    }
                }
            }
        }
    }

    public final boolean A01(Object obj) {
        C242643Vh r4 = (C242643Vh) this.A05.get(obj);
        if (r4 == null) {
            return false;
        }
        r4.DPd(obj);
        C242633Vg r2 = this.A03;
        if (((Boolean) C242633Vg.A00(r2, r2, new C377429Lu(3, r4, r2))).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A02(Object obj) {
        C242643Vh r4 = (C242643Vh) this.A05.get(obj);
        if (r4 == null) {
            return false;
        }
        C242633Vg r2 = this.A03;
        boolean booleanValue = ((Boolean) C242633Vg.A00(r2, r2, new C377429Lu(4, r4, r2))).booleanValue();
        r4.DPe(obj);
        if (booleanValue) {
            return true;
        }
        return false;
    }
}
