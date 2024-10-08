package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5bv  reason: invalid class name and case insensitive filesystem */
public final class C288445bv implements C288455bw {
    public 0vq A00;
    public final C63100yG A01 = new 01K(16);
    public final C63100yG A02 = new 01K(16);
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();
    public final Set A07;

    public static final void A00(C288445bv r12, int i) {
        List list = r12.A04;
        if (!list.isEmpty()) {
            ArrayList arrayList = null;
            int i2 = 0;
            01K r5 = null;
            01K r4 = null;
            int i3 = 0;
            while (true) {
                C63100yG r1 = r12.A01;
                if (i3 >= r1.A00) {
                    break;
                } else if (i <= r1.A00(i3)) {
                    Object remove = list.remove(i3);
                    int A012 = r1.A01(i3);
                    int A013 = r12.A02.A01(i3);
                    if (arrayList == null) {
                        arrayList = 0sr.A1M(new Object[]{remove});
                        r4 = new 01K(16);
                        r4.A02(A012);
                        r5 = new 01K(16);
                    } else {
                        0qQ.A0C(r5, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        0qQ.A0C(r4, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        arrayList.add(remove);
                        r4.A02(A012);
                    }
                    r5.A02(A013);
                } else {
                    i3++;
                }
            }
            if (arrayList != null) {
                0qQ.A0C(r5, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                0qQ.A0C(r4, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = arrayList.size() - 1;
                while (i2 < size) {
                    int i4 = i2 + 1;
                    int size2 = arrayList.size();
                    for (int i5 = i4; i5 < size2; i5++) {
                        int A002 = r4.A00(i2);
                        int A003 = r4.A00(i5);
                        if (A002 < A003 || (A003 == A002 && r5.A00(i2) < r5.A00(i5))) {
                            Object obj = arrayList.get(i2);
                            arrayList.set(i2, arrayList.get(i5));
                            arrayList.set(i5, obj);
                            int A004 = r5.A00(i2);
                            r5.A04(i2, r5.A00(i5));
                            r5.A04(i5, A004);
                            int A005 = r4.A00(i2);
                            r4.A04(i2, r4.A00(i5));
                            r4.A04(i5, A005);
                        }
                    }
                    i2 = i4;
                }
                r12.A03.addAll(arrayList);
            }
        }
    }

    public final void A01() {
        Set set = this.A07;
        if (!set.isEmpty()) {
            0fg.A01("Compose:abandons", 1854082573);
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((AnonymousClass2DP) it.next()).Csx();
                }
            } finally {
                0fg.A00(1166705813);
            }
        }
    }

    public final void A02() {
        A00(this, AnonymousClass972.MUTABLE_FLAG_MASK);
        List list = this.A03;
        if (!list.isEmpty()) {
            0fg.A01("Compose:onForgotten", 1854082573);
            try {
                0vq r3 = this.A00;
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = list.get(size);
                    if (obj instanceof AnonymousClass2DP) {
                        this.A07.remove(obj);
                        ((AnonymousClass2DP) obj).DGg();
                    }
                    if (obj instanceof AnonymousClass5R9) {
                        if (r3 == null || !r3.A04(obj)) {
                            ((AnonymousClass5R9) obj).D7s();
                        } else {
                            ((AnonymousClass5R9) obj).Dcz();
                        }
                    }
                }
            } finally {
                0fg.A00(1166705813);
            }
        }
        List list2 = this.A05;
        if (!list2.isEmpty()) {
            0fg.A01("Compose:onRemembered", 1854082573);
            int size2 = list2.size();
            for (int i = 0; i < size2; i++) {
                AnonymousClass2DP r1 = (AnonymousClass2DP) list2.get(i);
                this.A07.remove(r1);
                r1.DdA();
            }
            0fg.A00(1166705813);
        }
    }

    public C288445bv(Set set) {
        this.A07 = set;
    }

    public final void AWN(AnonymousClass2DP r2, int i, int i2, int i3) {
        A00(this, i);
        if (i3 < 0 || i3 >= i) {
            this.A03.add(r2);
            return;
        }
        this.A04.add(r2);
        this.A02.A02(i2);
        this.A01.A02(i3);
    }
}
