package X;

import androidx.paging.PageEvent$Insert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.La7  reason: case insensitive filesystem */
public final class C64332La7 implements C22558YAp {
    public static final C64332La7 A04;
    public int A00;
    public int A01;
    public int A02;
    public final List A03;

    public C64332La7(List list, int i, int i2) {
        0qQ.A0B(list, 1);
        this.A03 = AnonymousClass7TE.A1D(list);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 = DbT.A01(((LRX) it.next()).A01, i3);
        }
        this.A02 = i3;
        this.A01 = i;
        this.A00 = i2;
    }

    static {
        PageEvent$Insert pageEvent$Insert = PageEvent$Insert.A06;
        A04 = new C64332La7(pageEvent$Insert.A05, pageEvent$Insert.A01, pageEvent$Insert.A00);
    }

    public static final int A00(C64332La7 la7) {
        Integer valueOf;
        int[] iArr = ((LRX) 00k.A0I(la7.A03)).A03;
        int length = iArr.length;
        int i = 1;
        if (length == 0) {
            valueOf = null;
        } else {
            int i2 = iArr[0];
            int i3 = length - 1;
            if (1 <= i3) {
                while (true) {
                    int i4 = iArr[i];
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    if (i == i3) {
                        break;
                    }
                    i++;
                }
            }
            valueOf = Integer.valueOf(i2);
        }
        return JTP.A09(valueOf);
    }

    public static final int A01(C64332La7 la7) {
        Integer valueOf;
        int[] iArr = ((LRX) 00k.A0K(la7.A03)).A03;
        int length = iArr.length;
        int i = 1;
        if (length == 0) {
            valueOf = null;
        } else {
            int i2 = iArr[0];
            int i3 = length - 1;
            if (1 <= i3) {
                while (true) {
                    int i4 = iArr[i];
                    if (i2 < i4) {
                        i2 = i4;
                    }
                    if (i == i3) {
                        break;
                    }
                    i++;
                }
            }
            valueOf = Integer.valueOf(i2);
        }
        return JTP.A09(valueOf);
    }

    public final C60351Jjz A02(int i) {
        List list;
        int i2 = i - this.A01;
        int i3 = 0;
        while (true) {
            list = this.A03;
            if (i2 < ((LRX) list.get(i3)).A01.size() || i3 >= C51966G9m.A06(list)) {
                LRX lrx = (LRX) list.get(i3);
                int i4 = i - this.A01;
                int size = ((getSize() - i) - this.A00) - 1;
                int A002 = A00(this);
                int A012 = A01(this);
                int i5 = lrx.A00;
                List list2 = lrx.A02;
            } else {
                i2 -= ((LRX) list.get(i3)).A01.size();
                i3++;
            }
        }
        LRX lrx2 = (LRX) list.get(i3);
        int i42 = i - this.A01;
        int size2 = ((getSize() - i) - this.A00) - 1;
        int A0022 = A00(this);
        int A0122 = A01(this);
        int i52 = lrx2.A00;
        List list22 = lrx2.A02;
        if (list22 != null && 0sr.A1R(list22).A01(i2)) {
            i2 = C51971G9r.A0I(list22, i2);
        }
        return new C60351Jjz(i52, i2, i42, size2, A0022, A0122);
    }

    public final Object B8H(int i) {
        List list = this.A03;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((LRX) list.get(i2)).A01.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((LRX) list.get(i2)).A01.get(i);
    }

    public final int Bcq() {
        return this.A00;
    }

    public final int Bcr() {
        return this.A01;
    }

    public final int Bzs() {
        return this.A02;
    }

    public final int getSize() {
        return this.A01 + this.A02 + this.A00;
    }

    public final String toString() {
        int i = this.A02;
        ArrayList A0v = DbS.A0v(i);
        for (int i2 = 0; i2 < i; i2++) {
            A0v.add(B8H(i2));
        }
        String A0z = DbT.A0z(", ", A0v, (0sP) null);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[(");
        A1A.append(this.A01);
        A1A.append(" placeholders), ");
        A1A.append(A0z);
        A1A.append(", (");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(" placeholders)]", A1A);
    }
}
