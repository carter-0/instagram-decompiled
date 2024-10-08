package X;

import android.content.Context;

public abstract class V9E {
    /* JADX WARNING: type inference failed for: r0v9, types: [X.Vum, java.lang.Object] */
    public static final void A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Integer num;
        String str;
        String A0h = DbY.A0h(r7, 0);
        C277014uI A0P = DbW.A0P(r7, 1);
        Context context = null;
        try {
            String A0k = AnonymousClass7TF.A0k(A0h);
            if (A0k.equals("ADS_TRACKING")) {
                num = AnonymousClass05K.A00;
            } else if (A0k.equals("LOCATION")) {
                num = AnonymousClass05K.A01;
            } else {
                throw new IllegalArgumentException(A0k);
            }
        } catch (IllegalArgumentException unused) {
            num = null;
        }
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            context = r0.A00;
        }
        Integer num2 = AnonymousClass05K.A0C;
        if (!(context == null || num == null)) {
            int intValue = num.intValue();
            if (intValue == 1) {
                num2 = new Object().A01(context);
            } else if (intValue != 0) {
                num2 = AnonymousClass05K.A00;
            }
        }
        C308276Tl r1 = new C308276Tl();
        switch (num2.intValue()) {
            case 0:
                str = "os_granted";
                break;
            case 1:
                str = "os_restricted";
                break;
            default:
                str = "status_error";
                break;
        }
        DbX.A1P(r6, r1, A0P, str, 0);
    }
}
