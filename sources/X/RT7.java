package X;

import android.content.Context;

public abstract class RT7 {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        Integer num;
        String A0g = DbY.A0g(r12);
        C277014uI A0N = DbW.A0N(r12);
        C277014uI r3 = ((C280064zw) r12.A00()).A00;
        C307786Rm r0 = r11.A03;
        if (r0 != null) {
            Context context = r0.A00;
            String A0k = AnonymousClass7TF.A0k(A0g);
            if (A0k.equals("BLOKS_SHELL_TEST")) {
                num = AnonymousClass05K.A00;
            } else if (A0k.equals("PAYMENTS_AUTOFILL")) {
                num = AnonymousClass05K.A01;
            } else if (A0k.equals("ENCRYPTED_BACKUPS")) {
                num = AnonymousClass05K.A0C;
            } else {
                throw AnonymousClass7TE.A0w(A0k);
            }
            JGF jgf = new JGF(11, r11, A0N);
            JGF jgf2 = new JGF(12, r11, r3);
            C9230RUh.A00(context, num, AnonymousClass7TE.A1H(), TWj.A00, jgf, jgf2);
        }
        return null;
    }
}
