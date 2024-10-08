package X;

import java.util.List;

public final /* synthetic */ class TKI implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ SzT A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public /* synthetic */ TKI(SzT szT, List list, List list2, List list3, long j) {
        this.A01 = szT;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A00 = j;
    }

    public final void run() {
        SzT szT = this.A01;
        List list = this.A03;
        List list2 = this.A04;
        long j = this.A00;
        if (szT.A08.get()) {
            SzT.A02(szT, (Integer) null, (Long) null, (Long) null, (List) null, (List) null, 6, -6);
            return;
        }
        szT.A05.addAll(list);
        szT.A06.addAll(list2);
        Long valueOf = Long.valueOf(j);
        SzT.A02(szT, (Integer) null, valueOf, valueOf, (List) null, (List) null, 5, 0);
    }
}
