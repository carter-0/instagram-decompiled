package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VsU  reason: case insensitive filesystem */
public class C18478VsU {
    public int A00;
    public C18563VuF A01 = C18563VuF.A05;
    public Integer A02;
    public List A03;

    public static final C18554Vu6 A00(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return new C18554Vu6(AnonymousClass05K.A0C, Float.parseFloat(str));
    }

    public C18478VsU(C17630VbM vbM, List list) {
        ArrayList arrayList;
        Integer num;
        Integer num2 = AnonymousClass05K.A00;
        this.A02 = num2;
        this.A00 = -1;
        if (vbM != null) {
            String str = vbM.A02;
            if (!(str == null || str.length() == 0)) {
                this.A00 = C18679Vwc.A00(str);
            }
            C16626UyM uyM = vbM.A01;
            if (uyM != null) {
                int ordinal = uyM.ordinal();
                if (ordinal == 1) {
                    num = AnonymousClass05K.A01;
                } else if (ordinal != 2) {
                    num = ordinal == 3 ? AnonymousClass05K.A0C : num;
                } else {
                    this.A02 = num2;
                }
                this.A02 = num;
            }
            C18554Vu6 A002 = A00(vbM.A06);
            A002 = A002 == null ? this.A01.A03 : A002;
            C18554Vu6 A003 = A00(vbM.A03);
            A003 = A003 == null ? this.A01.A00 : A003;
            C18554Vu6 A004 = A00(vbM.A05);
            A004 = A004 == null ? this.A01.A02 : A004;
            C18554Vu6 A005 = A00(vbM.A04);
            this.A01 = new C18563VuF(A005 == null ? this.A01.A01 : A005, A002, A004, A003);
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object A10 : list) {
                C13989Tnp.A1R(DbT.A10(A10), arrayList, XR5.A01);
            }
        } else {
            arrayList = 0sn.A00;
        }
        this.A03 = arrayList;
    }
}
