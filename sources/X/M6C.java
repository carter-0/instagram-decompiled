package X;

import java.util.List;

public final /* synthetic */ class M6C implements Runnable {
    public final /* synthetic */ C59870Jat A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ M6C(C59870Jat jat, List list) {
        this.A00 = jat;
        this.A01 = list;
    }

    public final void run() {
        C59870Jat jat = this.A00;
        List<C59796JYp> list = this.A01;
        try {
            C59872Jav jav = jat.A06;
            for (C59796JYp jYp : list) {
                jav.A01.A02(jYp);
                jav.A00 = jYp;
                jYp.A08.add(jav);
            }
            for (C66523MVb DfJ : jav.A02) {
                DfJ.DfJ();
            }
            jat.A07.A05();
        } catch (Exception unused) {
            C59870Jat.A00(jat);
        }
    }
}
