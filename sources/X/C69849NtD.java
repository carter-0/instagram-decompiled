package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NtD  reason: case insensitive filesystem */
public abstract class C69849NtD {
    public static final void A00(Context context, UserSession userSession, String str, 0sP r7, long j, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TF.A1H(userSession, context);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("direct_v2/threads/%s/toggle_enable_instamadillo/", new Object[]{str});
        A0a.A0H("enable_instamadillo", z);
        A0a.A0H("is_ttlc", z2);
        A0a.A0H("is_proton", z3);
        if (!z) {
            j = 0;
        }
        A0a.A0D("instamadillo_msg_type_bit_flag", j);
        1OC A0S = DbU.A0S(A0a, NHZ.class, OQJ.class);
        A0S.A00 = new NMG(0, context, r7, z2);
        1ES.A03(A0S);
    }
}
