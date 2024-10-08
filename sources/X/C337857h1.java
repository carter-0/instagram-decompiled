package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7h1  reason: invalid class name and case insensitive filesystem */
public final class C337857h1 implements C231452rh {
    public final int A00;
    public final C337807gw A01;
    public final C337817gx A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public final void DSU(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        List list = this.A06;
        list.add(i2, list.remove(i));
        List list2 = this.A03;
        Object remove = list2.remove(i);
        arrayList.add(remove);
        list2.add(i2, remove);
        this.A05.add(new C337877h3((List) null, arrayList, 3, i, i2));
    }

    public final void D1O(int i, int i2, Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i2);
        int i3 = 0;
        while (true) {
            int i4 = i;
            if (i3 < i2) {
                int i5 = i + i3;
                C337867h2 r1 = (C337867h2) this.A06.get(i5);
                r1.A01 = true;
                arrayList.add(r1);
                arrayList2.add(this.A03.get(i5));
                i3++;
            } else {
                this.A05.add(new C337877h3(arrayList, arrayList2, 1, i4, -1));
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7h2, java.lang.Object] */
    public final void DKr(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        ArrayList arrayList2 = new ArrayList(i2);
        int i3 = 0;
        while (true) {
            int i4 = i;
            if (i3 < i2) {
                int i5 = i + i3;
                ? obj = new Object();
                obj.A00 = null;
                obj.A01 = true;
                this.A06.add(i5, obj);
                arrayList.add(obj);
                2TP r1 = new 2TP((Object) null, (Object) null);
                this.A03.add(i5, r1);
                arrayList2.add(r1);
                i3++;
            } else {
                this.A05.add(new C337877h3(arrayList, arrayList2, 0, i4, -1));
                return;
            }
        }
    }

    public final void Ddf(int i, int i2) {
        int i3 = i2;
        ArrayList arrayList = new ArrayList(i2);
        int i4 = 0;
        while (true) {
            int i5 = i;
            if (i4 < i2) {
                this.A06.remove(i);
                arrayList.add(this.A03.remove(i));
                i4++;
            } else {
                this.A05.add(new C337877h3((List) null, arrayList, 2, i5, i3));
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.7h2, java.lang.Object] */
    public C337857h1(C337807gw r6, C337817gx r7, List list, List list2) {
        int i;
        this.A07 = list;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A04 = list2;
        this.A01 = r6;
        this.A02 = r7;
        this.A05 = new ArrayList();
        this.A06 = new ArrayList();
        this.A03 = new ArrayList();
        for (int i2 = 0; i2 < this.A00; i2++) {
            List list3 = this.A06;
            ? obj = new Object();
            obj.A00 = null;
            obj.A01 = false;
            list3.add(obj);
            this.A03.add(new 2TP(this.A07.get(i2), (Object) null));
        }
    }
}
