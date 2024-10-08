package X;

import java.util.ArrayList;

public final class M7J implements Runnable {
    public final /* synthetic */ C65225LpV A00;
    public final /* synthetic */ ArrayList A01;

    public M7J(C65225LpV lpV, ArrayList arrayList) {
        this.A00 = lpV;
        this.A01 = arrayList;
    }

    public final void run() {
        C65225LpV lpV = this.A00;
        C60076JfA jfA = lpV.A00;
        if (jfA == null) {
            0qQ.A0F("geoGatingRow");
            throw AnonymousClass00P.createAndThrow();
        } else {
            jfA.setInlineSubtitle(C65225LpV.A00(lpV, this.A01, false));
        }
    }
}
