package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: X.3ox  reason: invalid class name and case insensitive filesystem */
public abstract class C252343ox implements C250603lj {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03;
    public C228812mN A04;
    public C233452vk A05 = new C233442vj();
    public boolean A06 = true;
    public C233372vc A07;
    public C233522vr A08;
    public final List A09 = new LinkedList();
    public final List A0A = new LinkedList();
    public final Set A0B = new HashSet();
    public final Set A0C = new HashSet();
    public final Set A0D = new HashSet();
    public final Set A0E = new HashSet();
    public final boolean A0F;

    public final int A02(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == -1 && i2 == -1) {
            return i4;
        }
        int i7 = 0;
        int i8 = 0;
        if (i != -1) {
            i8 = i + i5 + 1;
        }
        if (i2 != -1) {
            i7 = i2 + i6 + 1;
        }
        return Math.max(Math.max(i8, i7), i3 + 1);
    }

    public int A03(C233472vm r2, int i, int i2, int i3) {
        return ((C233542vt) this).A0R((C233462vl) r2, i, i2, i3);
    }

    public abstract int A04(Object obj);

    public 1PW A07(AnonymousClass30Y r5, C252093oY r6) {
        C252333ow r2 = (C252333ow) this;
        r2.A04.getClass();
        Object obj = r5.A04;
        Object A0A2 = r2.A0A(obj);
        int A042 = r2.A04(obj);
        if (!r2.A04.CcL(A0A2) && !r2.A04.CYA(A0A2) && A042 > r2.A01 && A042 > r2.A02) {
            r2.A0N(r5, r6).A03(r5, r6);
            if (!r2.A0Q(r2.A04.BJS(r5.A03))) {
                return r2.A0M(r5, r6);
            }
        }
        return 1PW.A0K;
    }

    public abstract Object A0A(Object obj);

    public void A0B() {
        this.A06 = false;
    }

    public void A0C() {
    }

    public boolean A0H(C252093oY r4, 1PW r5, C233472vm r6, int i, int i2, int i3) {
        C233542vt r1 = (C233542vt) this;
        C233462vl r62 = (C233462vl) r6;
        0qQ.A0B(r62, 3);
        if (r1.A0R(r62, i, i2, i3) > r1.A00) {
            return true;
        }
        return false;
    }

    public final boolean A0J(C252093oY r13, Object obj, List list, int i) {
        int A052 = A05(list);
        int A062 = A06(list);
        C233472vm A092 = A09(obj);
        A092.getClass();
        C233522vr r2 = this.A08;
        int i2 = i;
        if (!A0I(r13, A092, obj, A052, A062, i2, r2.BRQ(), r2.BRR())) {
            return false;
        }
        r2.Crw(A03(A092, A052, A062, i2), obj);
        return true;
    }

    public static void A00(C252343ox r3, 1PW r4, C233472vm r5, int i) {
        String str;
        C233452vk r32 = r3.A05;
        if (r32 != null) {
            r32.ETU(r5);
            Integer num = AnonymousClass05K.A01;
            Integer num2 = r4.A0C;
            if (num == num2) {
                str = "Insert success";
            } else {
                str = "Insert fail";
            }
            if (AnonymousClass05K.A0C != num2) {
                r32.BtU().A04(r4.A00(), i, str);
            }
        }
    }

    public 1PW A08(List list) {
        1PW r1 = new 1PW(AnonymousClass05K.A0N);
        r1.A02 = this.A00;
        return r1;
    }

    public C233472vm A09(Object obj) {
        AnonymousClass4EB r2 = (AnonymousClass4EB) obj;
        0qQ.A0B(r2, 0);
        return r2.A03;
    }

    public void A0D(int i, Object obj, Object obj2) {
        Set set;
        this.A04.getClass();
        AnonymousClass3VX BtU = this.A05.BtU();
        Set set2 = this.A0D;
        int size = set2.size();
        Set set3 = this.A0E;
        BtU.A03(size, set3.size(), i);
        if (!this.A0F || (i > this.A01 && i > this.A02)) {
            set = this.A0B;
            if (!set.contains(this.A04.BJS(obj2))) {
                boolean CcL = this.A04.CcL(obj);
                C228812mN r0 = this.A04;
                if (CcL) {
                    set3.add(r0.BJS(obj2));
                } else {
                    boolean CYA = r0.CYA(obj);
                    String BJS = this.A04.BJS(obj2);
                    if (CYA) {
                        set2.add(BJS);
                        this.A08.Cs7(i);
                    } else {
                        set2.add(BJS);
                        set3.add(this.A04.BJS(obj2));
                        this.A08.Cs7(i);
                    }
                }
                this.A08.Cs8(i);
            }
        } else {
            set = this.A0B;
        }
        set.add(this.A04.BJS(obj2));
    }

    public void A0E(AnonymousClass30Y r5, C252093oY r6, Object obj, int i) {
        List list;
        if (obj != null) {
            this.A04.getClass();
            String BEZ = this.A04.BEZ(obj);
            Set set = this.A0C;
            if (!set.contains(BEZ)) {
                if (this.A04.CcL(obj)) {
                    this.A0D.clear();
                    this.A01 = i;
                    set.add(BEZ);
                    list = this.A09;
                } else if (this.A04.CYA(obj)) {
                    this.A0E.clear();
                    this.A02 = i;
                    set.add(BEZ);
                    list = this.A0A;
                } else {
                    return;
                }
                list.add(BEZ);
                this.A06 = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (A0H(r18, r6, r7, r8, r9, r10) != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r9 != -1) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C252093oY r18, X.1PW r19, java.lang.Object r20, java.util.List r21, int r22) {
        /*
            r17 = this;
            r4 = r17
            r2 = r21
            int r8 = r4.A05(r2)
            int r9 = r4.A06(r2)
            r3 = r20
            X.2vm r7 = r4.A09(r3)
            r7.getClass()
            r10 = r22
            int r15 = r4.A03(r7, r8, r9, r10)
            r1 = -1
            if (r8 != r1) goto L_0x0021
            r0 = 1
            if (r9 == r1) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r2.size()
            r6 = r19
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "highest_position_rule_did_meet"
            r6.A01(r0)
        L_0x002e:
            r11 = r4
            r12 = r6
            r13 = r8
            r14 = r9
            r16 = r10
            r11.A0G(r12, r13, r14, r15, r16)
            X.2vr r0 = r4.A08
            r0.Crw(r15, r3)
        L_0x003c:
            A00(r4, r6, r7, r15)
            return
        L_0x0040:
            r5 = r18
            boolean r0 = r4.A0H(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x003c
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252343ox.A0F(X.3oY, X.1PW, java.lang.Object, java.util.List, int):void");
    }

    public void A0G(1PW r2, int i, int i2, int i3, int i4) {
        r2.A03 = i3;
        r2.A02 = i4;
        r2.A0C = AnonymousClass05K.A01;
        this.A06 = false;
    }

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        Object obj = r5.A04;
        Object A0A2 = A0A(obj);
        if (r6.CEk(r5) == AnonymousClass05K.A00) {
            int A042 = A04(obj);
            this.A00 = A042;
            A0E(r5, r6, A0A2, A042);
            A0D(this.A00, A0A2, r5.A03);
        }
    }

    public C252343ox(C233372vc r2, C233522vr r3, boolean z) {
        this.A0F = z;
        this.A08 = r3;
        this.A07 = r2;
    }

    public int A05(List list) {
        if (list.isEmpty()) {
            return -2;
        }
        List list2 = this.A09;
        ListIterator listIterator = list2.listIterator(list2.size());
        while (listIterator.hasPrevious()) {
            int indexOf = list.indexOf(listIterator.previous());
            if (indexOf != -1) {
                return indexOf;
            }
            listIterator.remove();
        }
        return -1;
    }

    public int A06(List list) {
        if (list.isEmpty()) {
            return -2;
        }
        List list2 = this.A0A;
        ListIterator listIterator = list2.listIterator(list2.size());
        while (listIterator.hasPrevious()) {
            int indexOf = list.indexOf(listIterator.previous());
            if (indexOf != -1) {
                return indexOf;
            }
            listIterator.remove();
        }
        return -1;
    }

    public boolean A0K(C233472vm r2) {
        return false;
    }

    public int A01(int i, int i2) {
        return -1;
    }

    public boolean A0I(C252093oY r2, C233472vm r3, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
