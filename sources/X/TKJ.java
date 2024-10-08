package X;

import android.os.SystemClock;
import java.util.List;

public final /* synthetic */ class TKJ implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ SzT A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public /* synthetic */ TKJ(SzT szT, List list, List list2, List list3, long j) {
        this.A01 = szT;
        this.A00 = j;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
    }

    public final void run() {
        SzT szT = this.A01;
        long j = this.A00;
        List list = this.A02;
        List list2 = this.A03;
        List list3 = this.A04;
        int i = 0;
        long j2 = 0;
        do {
            j2 = Math.min(j, j2 + (j / 3));
            SzT.A02(szT, (Integer) null, Long.valueOf(j2), Long.valueOf(j), (List) null, (List) null, 2, 0);
            SystemClock.sleep(SzT.A0F);
            int i2 = ((Qy2) ((C10893Rzt) szT.A09.get())).A01;
            if (i2 != 9 && i2 != 7 && i2 != 6) {
                i++;
            } else {
                return;
            }
        } while (i < 3);
        szT.A07.execute(new TKI(szT, list, list2, list3, j));
    }
}
