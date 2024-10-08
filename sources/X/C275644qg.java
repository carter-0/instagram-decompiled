package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4qg  reason: invalid class name and case insensitive filesystem */
public final class C275644qg implements C250603lj {
    public final /* synthetic */ UserSession A00;

    public C275644qg(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void ATF(AnonymousClass30Y r10, C252093oY r11) {
        AnonymousClass2pP r2 = C271444ir.A00;
        if (r2 == null) {
            r2 = new AnonymousClass2pP(C60510iO.A00(this.A00), false);
            C271444ir.A00 = r2;
        }
        String str = r10.A05;
        C254213s7 A002 = r2.A00(str);
        int intValue = r11.CEk(r10).intValue();
        if (intValue == 0 || intValue == 1) {
            A002.A03(r10, r11);
            C271444ir.A01.put(str, Long.valueOf(A002.A01(r11)));
        } else {
            long BlK = r11.BlK();
            long j = A002.A03;
            if (j > 0) {
                A002.A02 = BlK - j;
                A002.A03 = -1;
            }
            C254213s7.A00(A002, BlK);
            C271444ir.A01.put(str, Long.valueOf(A002.A05));
            A002.A02();
        }
        AnonymousClass3W1 r22 = (AnonymousClass3W1) r10.A04;
        if (r22.A0p()) {
            C271444ir.A02.put(str, Integer.valueOf(r22.getPosition()));
        }
    }
}
