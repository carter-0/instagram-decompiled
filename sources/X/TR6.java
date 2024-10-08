package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public final class TR6 extends Thread {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ STY A01;

    public TR6(Context context, STY sty) {
        this.A01 = sty;
        this.A00 = context;
    }

    public final void run() {
        PackageManager packageManager;
        STY sty = this.A01;
        C270254gR r6 = sty.A0T;
        1yd r7 = r6.A04;
        if (r7.A0E(false) && AnonymousClass2IK.A06 == null) {
            Context context = sty.A04.A00;
            2I7.A06.A00(sty.A0B);
            if (!(context == null || (packageManager = context.getPackageManager()) == null)) {
                packageManager.setComponentEnabledSetting(new ComponentName(context, "com.instagram.fbpay.w3c.views.PaymentActivity"), 1, 1);
            }
        }
        Context context2 = this.A00;
        C11288SJh sJh = r6.A02;
        Integer A002 = sJh.A00((Long) null, 772805399, 0);
        if (sty.A0A == null) {
            sty.A0A = new 2Fg(context2, r6);
        }
        if (!r7.A0E(false)) {
            2Fg r11 = sty.A0A;
            if (2Fg.A01(r11.A04, r11, "org.chromium.intent.action.IS_READY_TO_PAY") == null) {
                SUR.A0C(r6, sty, sty.A06("W3CCLIENT_NOT_AVAILABLE"));
                sJh.A03(A002, "FETCH_RESULT", "W3CCLIENT_NOT_AVAILABLE", 772805399);
                sJh.A01(A002, (Long) null, 772805399);
                sty.A08();
            }
        }
        if (sty.A02 == null && r7.A0E(false)) {
            sJh.A02(A002, (Long) null, "setViewModelCardObserverStart", 772805399);
            sty.A02 = new C11648Sdq(1, (Object) A002, (Object) sty);
        } else if (sty.A01 == null && !r7.A0E(false)) {
            sJh.A02(A002, (Long) null, "setClientCardObserverStart", 772805399);
            sty.A01 = new C11648Sdq(2, (Object) A002, (Object) sty);
        }
        SB5.A00(new TIP(context2, sty, A002));
        sty.A08();
    }
}
