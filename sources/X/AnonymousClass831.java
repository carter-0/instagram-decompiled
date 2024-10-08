package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.831  reason: invalid class name */
public final class AnonymousClass831 extends AnonymousClass0T0 {
    public int A00;
    public final List A01;
    public final List A02;
    public final boolean A03;

    public AnonymousClass831(List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A02 = list;
        this.A03 = z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass51O r1 = (AnonymousClass51O) it.next();
            arrayList.add(new AnonymousClass9IM(r1, i));
            i += r1.BrP();
        }
        this.A00 = i;
        this.A01 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass831) {
                AnonymousClass831 r5 = (AnonymousClass831) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00(int i) {
        List list = this.A01;
        if (list.size() <= i || i < 0) {
            return 0;
        }
        return ((AnonymousClass51O) ((AnonymousClass9IM) list.get(i)).A01).BrP();
    }

    public final int A01(int i) {
        List list = this.A01;
        if (list.size() <= i || i < 0) {
            return 0;
        }
        return ((AnonymousClass9IM) list.get(i)).A00;
    }

    public final int A02(long j) {
        List list = this.A01;
        int size = list.size() - 1;
        if (A04(size) != null) {
            AnonymousClass9IM r0 = (AnonymousClass9IM) list.get(size);
            if (j >= ((long) (r0.A00 + ((AnonymousClass51O) r0.A01).BrP()))) {
                return size;
            }
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                AnonymousClass9IM r02 = (AnonymousClass9IM) list.get(i);
                int i2 = r02.A00;
                int BrP = ((AnonymousClass51O) r02.A01).BrP() + i2;
                if (((long) i2) <= j && j < ((long) BrP)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final AnonymousClass51O A03(int i) {
        return (AnonymousClass51O) ((AnonymousClass9IM) this.A01.get(i)).A01;
    }

    public final AnonymousClass51O A04(int i) {
        if (i < 0 || i >= this.A01.size()) {
            return null;
        }
        return A03(i);
    }

    public final ArrayList A05() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass9IM r0 : this.A01) {
            arrayList.add(r0.A01);
        }
        return arrayList;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }
}
