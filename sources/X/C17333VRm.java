package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VRm  reason: case insensitive filesystem */
public final class C17333VRm {
    public final String A00;
    public final List A01 = new ArrayList();

    public C17333VRm(VY6 vy6) {
        this.A00 = vy6.A02;
        List<C17434VVn> list = vy6.A03;
        if (list != null) {
            for (C17434VVn vVn : list) {
                if (vVn != null) {
                    List list2 = this.A01;
                    C16623UyJ uyJ = vVn.A02;
                    if (uyJ != null) {
                        list2.add(new VVT((C16566UxJ) C16566UxJ.A01.get(DbT.A10(uyJ)), vVn.A00, vVn.A01));
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
    }
}
