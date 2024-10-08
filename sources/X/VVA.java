package X;

import java.util.ArrayList;
import java.util.List;

public final class VVA {
    public final C3251571g A00;
    public final C3251571g A01;
    public final List A02;

    public VVA(C3251571g r5, List list) {
        this.A02 = list;
        this.A00 = r5;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < r5.A01(); i++) {
            JTR.A1S(((C17662Vbs) r5.A02(i)).A03, arrayList);
        }
        this.A01 = new C3251571g(arrayList, 0, arrayList.size());
    }
}
