package X;

import android.content.Context;

public final class TIP implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ STY A01;
    public final /* synthetic */ Integer A02;

    public TIP(Context context, STY sty, Integer num) {
        this.A01 = sty;
        this.A00 = context;
        this.A02 = num;
    }

    public final void run() {
        C11288SJh sJh;
        Integer num;
        String str;
        STY sty = this.A01;
        AnonymousClass07Z A002 = STY.A00(sty);
        C270254gR r2 = sty.A0T;
        if (!r2.A04.A0E(false)) {
            2Fg r0 = sty.A0A;
            if (r0 != null) {
                AnonymousClass2Fj r1 = r0.A07;
                AnonymousClass2gO r02 = sty.A01;
                if (r02 != null && A002 != null) {
                    r1.A08(r02);
                    r1.A06(A002, sty.A01);
                    sJh = r2.A02;
                    num = this.A02;
                    str = "setClientCardObserverEnd";
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (sty.A02 != null && A002 != null) {
            S33 s33 = sty.A09;
            if (s33 == null) {
                s33 = new S33(this.A00, A002, r2);
                sty.A09 = s33;
            }
            AnonymousClass2Fj A003 = s33.A00();
            A003.A08(sty.A02);
            A003.A06(A002, sty.A02);
            sJh = r2.A02;
            num = this.A02;
            str = "setViewModelCardObserverEnd";
        } else {
            return;
        }
        sJh.A02(num, (Long) null, str, 772805399);
    }
}
