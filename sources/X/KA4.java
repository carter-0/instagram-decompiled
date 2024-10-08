package X;

import com.instagram.reels.store.ReelStore;

public final class KA4 extends 1P0 {
    public final /* synthetic */ LQZ A00;

    public KA4(LQZ lqz) {
        this.A00 = lqz;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1178689389);
        int A032 = AnonymousClass0fD.A03(1002049526);
        LQZ lqz = this.A00;
        ReelStore A05 = 1OP.A05(lqz.A00);
        AnonymousClass3HX r1 = ((K14) obj).A00;
        r1.getClass();
        String id = A05.A0I(r1, true).getId();
        lqz.A04.add(id);
        1Xj r0 = lqz.A01;
        r0.getClass();
        r0.A4E(id);
        AnonymousClass0fD.A0A(837831229, A032);
        AnonymousClass0fD.A0A(-608250807, A03);
    }
}
