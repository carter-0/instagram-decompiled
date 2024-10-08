package X;

import java.util.List;

public final class U9O extends C232322tW {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public U9O(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final int A02() {
        List list;
        if (this.A00 != 0) {
            list = (List) this.A02;
        } else {
            list = ((Tq8) this.A01).A03;
        }
        return list.size();
    }

    public final int A03() {
        Object obj;
        if (this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A02;
        }
        return ((List) obj).size();
    }

    public final boolean A04(int i, int i2) {
        switch (this.A00) {
            case 0:
                C14538Txy txy = (C14538Txy) ((List) this.A02).get(i);
                C14538Txy txy2 = (C14538Txy) ((Tq8) this.A01).A03.get(i2);
                0qQ.A0B(txy2, 0);
                if (!(C276674ti.A00() == null && 02S.A00(txy.A01, txy2.A01) && txy.A00.A00 == txy2.A00.A00)) {
                    return false;
                }
                break;
            case 1:
                return 0qQ.A0K(((List) this.A01).get(i), ((List) this.A02).get(i2));
            default:
                Object A0O = 00k.A0O((List) this.A01, i);
                Object A0O2 = 00k.A0O((List) this.A02, i2);
                if (A0O == null || A0O2 == null || !A0O.equals(A0O2)) {
                    return false;
                }
                break;
        }
        return true;
    }

    public final boolean A05(int i, int i2) {
        switch (this.A00) {
            case 0:
                if (((long) ((C14538Txy) ((List) this.A02).get(i)).A01.A03) == ((long) ((C14538Txy) ((Tq8) this.A01).A03.get(i2)).A01.A03)) {
                    return true;
                }
                return false;
            case 1:
                return 0qQ.A0K(((List) this.A01).get(i), ((List) this.A02).get(i2));
            default:
                Object A0O = 00k.A0O((List) this.A01, i);
                Object A0O2 = 00k.A0O((List) this.A02, i2);
                if (A0O == null || A0O2 == null || !A0O.equals(A0O2)) {
                    return false;
                }
                return true;
        }
    }
}
