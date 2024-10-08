package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.Ei6  reason: case insensitive filesystem */
public abstract class C48659Ei6 {
    public static final Object A00(C307896Rx r6) {
        Context context;
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            context = r0.A00;
        } else {
            context = null;
        }
        0lg A0V = DbU.A0V(r6);
        if (context != null) {
            SP0 A00 = SP0.A00(context);
            AnonymousClass7TE.A1Z(new JVD(A00, (AnonymousClass4D7) null, 31), DbY.A0r(AnonymousClass12T.A00, 535));
            C46649DiU A04 = C46649DiU.A04("com.instagram.settings.about", DbY.A0m("is_managed", String.valueOf(A00.A03())));
            IgBloksScreenConfig A0N = DbS.A0N(A0V);
            DbS.A18(context, A0N, 2131951981);
            A04.A0D(context, A0N);
        }
        return null;
    }
}
