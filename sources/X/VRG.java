package X;

import java.util.ArrayList;

public final class VRG {
    public final C3251571g A00;
    public final C3251571g A01;

    public VRG(C3251571g r5) {
        this.A00 = r5;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < r5.A01(); i++) {
            JTR.A1S(((VXR) r5.A02(i)).A00, arrayList);
        }
        this.A01 = new C3251571g(arrayList, 0, arrayList.size());
    }
}
