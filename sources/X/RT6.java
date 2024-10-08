package X;

import android.content.Context;
import com.facebook.caa.shared.passkey.igconfig.IGContextProvider;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public abstract class RT6 {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        C276544tV A0O = DbY.A0O(r13);
        C307786Rm r0 = r12.A03;
        if (r0 != null) {
            Context context = r0.A00;
            List A0N = A0O.A0N(35);
            0qQ.A07(A0N);
            Set A0k = 00k.A0k(A0N);
            String A0G = A0O.A0G();
            C58718IwR iwR = new C58718IwR(28, (Object) r12, (Object) A0O);
            C58718IwR iwR2 = new C58718IwR(29, (Object) r12, (Object) A0O);
            JGF jgf = new JGF(10, r12, A0O);
            TYA tya = new TYA(13, (Object) A0O, (Object) r12);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            C229382nI A00 = IGContextProvider.A00(context);
            if (A00 != null) {
                ((OMB) SecurityProviderEphemeral.A00.invoke()).A01(new TWV(context, A00, A0G, A1H, A0k, iwR2, iwR, tya, jgf));
            }
        }
        return null;
    }
}
