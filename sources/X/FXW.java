package X;

import java.util.List;

public final class FXW implements 1wn {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ 1Ng A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ List A04;

    public FXW(C307786Rm r1, C307896Rx r2, 1Ng r3, C277014uI r4, List list) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = list;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1319177722);
        FWQ fwq = (FWQ) obj;
        int A0D = AnonymousClass7TG.A0D(fwq, -1265063751);
        this.A02.A02(this, FWQ.class);
        C307896Rx r3 = this.A01;
        C277014uI r2 = this.A03;
        List list = fwq.A00;
        if (list == null) {
            list = this.A04;
        }
        C308206Td.A0E(r3, r2, list, this.A00);
        AnonymousClass0fD.A0A(-1989333872, A0D);
        AnonymousClass0fD.A0A(-1441469309, A032);
    }
}
