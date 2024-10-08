package X;

import java.util.Date;
import java.util.List;

/* renamed from: X.4uc  reason: invalid class name and case insensitive filesystem */
public final class C277174uc extends 1P0 {
    public final /* synthetic */ 1se A00;

    public C277174uc(1se r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(-1320912487, AnonymousClass0fD.A03(-1624821820));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(778837497);
        C277154ua r7 = (C277154ua) obj;
        int A032 = AnonymousClass0fD.A03(-1882074600);
        0qQ.A0B(r7, 0);
        1se r1 = this.A00;
        List list = r7.A00;
        0qQ.A07(list);
        r1.A04(list);
        long time = new Date().getTime();
        0xY AR4 = r1.A00.AR4();
        AR4.E5c("lastSyncMediaIdsTime", time);
        AR4.apply();
        AnonymousClass0fD.A0A(1147028153, A032);
        AnonymousClass0fD.A0A(1119078124, A03);
    }
}
