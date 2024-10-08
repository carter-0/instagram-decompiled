package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3kU  reason: invalid class name and case insensitive filesystem */
public abstract class C249863kU {
    public List A00;
    public final int A01;
    public final LinkedList A02;
    public final LinkedList A03;
    public final List A04;
    public final boolean A05;
    public final int A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C251373n0 A02(Integer num, Object obj, int i) {
        Object obj2 = obj;
        Integer num2 = num;
        int i2 = i;
        if (this instanceof C249853kT) {
            C250973mM r2 = (C250973mM) obj2;
            0qQ.A0B(r2, 0);
            0qQ.A0B(num, 2);
            return new C251363mz(((C249853kT) this).A00, r2, num2, AnonymousClass05K.A00, i2);
        }
        AnonymousClass4EB r22 = (AnonymousClass4EB) obj2;
        0qQ.A0B(r22, 0);
        0qQ.A0B(num, 2);
        return new AnonymousClass5EU(r22, num, i);
    }

    public final C251373n0 A00() {
        Object first = this.A02.getFirst();
        first.getClass();
        return (C251373n0) first;
    }

    public final C251373n0 A01() {
        LinkedList linkedList = this.A02;
        C251373n0 r5 = (C251373n0) linkedList.removeFirst();
        int size = linkedList.size();
        for (C308816Vs DY6 : this.A00) {
            DY6.DY6(size + 1, size);
        }
        for (AnonymousClass3CG r2 : this.A04) {
            int BU3 = r2.BU3();
            if (BU3 < size) {
                Object obj = linkedList.get(BU3);
                obj.getClass();
                r2.DMH(((C251373n0) obj).BTb(), BU3);
            }
        }
        return r5;
    }

    public final Collection A03() {
        return Collections.unmodifiableCollection(new LinkedList(this.A02));
    }

    public final LinkedList A04() {
        LinkedList linkedList = this.A02;
        LinkedList linkedList2 = new LinkedList(linkedList);
        if (this.A05) {
            LinkedList linkedList3 = this.A03;
            linkedList3.clear();
            linkedList3.addAll(linkedList);
        }
        linkedList.clear();
        return linkedList2;
    }

    public final void A05(C308816Vs r3) {
        if (r3 != null) {
            List list = this.A00;
            if (!list.contains(r3)) {
                list.add(r3);
            }
        }
    }

    public final void A06(AnonymousClass3CG r5) {
        List list = this.A04;
        if (!list.contains(r5)) {
            list.add(r5);
            int BU3 = r5.BU3();
            int i = 0;
            while (i <= BU3) {
                LinkedList linkedList = this.A02;
                if (i < linkedList.size()) {
                    Object obj = linkedList.get(i);
                    obj.getClass();
                    r5.DMH(((C251373n0) obj).BTb(), BU3);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08() {
        /*
            r5 = this;
            java.util.LinkedList r3 = r5.A02
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x000a
            r0 = 1
            return r0
        L_0x000a:
            r1 = r5
            boolean r0 = r5 instanceof X.C249853kT
            if (r0 == 0) goto L_0x0058
            X.3kT r1 = (X.C249853kT) r1
            com.instagram.common.session.UserSession r4 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321468976735644(0x810a2f0014259c, double:3.033181463479407E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0040
            X.1PG r0 = X.1PG.A00(r4)
            boolean r0 = r0.A08()
        L_0x0028:
            r2 = 0
            if (r0 != 0) goto L_0x005a
            java.lang.Object r1 = r3.peek()
            X.3n0 r1 = (X.C251373n0) r1
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x005a
            int r0 = r5.A06
            if (r0 <= 0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            boolean r0 = r5.A09(r1)
            return r0
        L_0x0040:
            r0 = 36321468976539033(0x810a2f00112599, double:3.033181463355069E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0058
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r4)
            X.1B2 r0 = X.1B2.A0e
            boolean r0 = r1.A00(r0)
            goto L_0x0028
        L_0x0058:
            r0 = 0
            goto L_0x0028
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249863kU.A08():boolean");
    }

    public final boolean A09(C251373n0 r7) {
        if ((!this.A08 || r7.Bxj() == AnonymousClass05K.A0C) && ((!this.A09 || r7.B9W() > 2) && System.currentTimeMillis() - r7.AsM() >= TimeUnit.MINUTES.toMillis((long) this.A06))) {
            return true;
        }
        return false;
    }

    public C249863kU(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = new LinkedList();
        this.A03 = new LinkedList();
        this.A04 = new ArrayList();
        this.A00 = new ArrayList();
        this.A07 = z;
        this.A06 = i;
        this.A01 = i2;
        this.A05 = z4;
        this.A08 = z2;
        this.A09 = z3;
    }

    public final void A07(Integer num, Integer num2, Collection collection, int i, boolean z) {
        if (!collection.isEmpty()) {
            LinkedList linkedList = this.A02;
            int size = linkedList.size();
            if (num2 == AnonymousClass05K.A01) {
                LinkedList linkedList2 = new LinkedList();
                for (Object A022 : collection) {
                    linkedList2.add(A02(num, A022, i));
                }
                linkedList.addAll(0, linkedList2);
            } else {
                for (Object A023 : collection) {
                    linkedList.add(A02(num, A023, i));
                }
            }
            int size2 = linkedList.size();
            if (z) {
                for (C308816Vs DY6 : this.A00) {
                    DY6.DY6(size, size2);
                }
                for (AnonymousClass3CG r3 : this.A04) {
                    int BU3 = r3.BU3();
                    int i2 = size;
                    while (i2 <= BU3 && i2 < linkedList.size()) {
                        Object obj = linkedList.get(i2);
                        obj.getClass();
                        r3.DMH(((C251373n0) obj).BTb(), BU3);
                        i2++;
                    }
                }
            }
        }
    }

    public C249863kU() {
        this.A02 = new LinkedList();
        this.A03 = new LinkedList();
        this.A04 = new ArrayList();
        this.A00 = new ArrayList();
        this.A07 = false;
        this.A06 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A08 = false;
        this.A09 = false;
    }
}
