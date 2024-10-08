package X;

import java.util.List;

/* renamed from: X.Ht7  reason: case insensitive filesystem */
public final class C56120Ht7 {
    public List A00;
    public final C56075HsO A01;
    public final 0sP A02;
    public final Object[] A03;

    public final 2Vi A00(C55585Hk5 hk5) {
        Object[] objArr;
        0sn r0;
        List list = null;
        if (hk5 != null) {
            objArr = hk5.A01;
        } else {
            objArr = null;
        }
        if (!C245173cR.A02(objArr, this.A03)) {
            if (hk5 != null) {
                list = hk5.A00;
            }
            C55586Hk6 hk6 = new C55586Hk6(list);
            list = (2Vi) this.A02.invoke(hk6);
            if (list != null) {
                AnonymousClass4F8.A02(list, this.A01.A00);
            }
            if (this.A00 == null) {
                r0 = hk6.A00;
                if (r0 == null) {
                    r0 = 0sn.A00;
                }
            }
            return list;
        } else if (hk5 != null) {
            r0 = hk5.A00;
        } else {
            r0 = null;
        }
        this.A00 = r0;
        return list;
    }

    public final C56075HsO A01() {
        return this.A01;
    }

    public final C55585Hk5 A02() {
        return new C55585Hk5(this.A00, this.A03);
    }

    public C56120Ht7(C56075HsO hsO, 0sP r2, Object[] objArr) {
        this.A01 = hsO;
        this.A03 = objArr;
        this.A02 = r2;
    }
}
