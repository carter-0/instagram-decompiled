package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nua  reason: case insensitive filesystem */
public abstract class C69934Nua {
    public static final void A00(Context context, AnonymousClass0iw r3, UserSession userSession, C254793t3 r5, String str, String str2, int i, boolean z, boolean z2) {
        C51974G9v.A1K(userSession, context, r5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "link_click_copy");
        if (A0e.isSampled()) {
            C66584MXp.A0q(A0e, r5);
            A0e.Cgf();
        }
        if (str != null) {
            0nC.A00(context, str);
            C59689JTv.A07(context, 2131963179);
            if (z2) {
                C313746gw.A00(userSession).A0M(AnonymousClass05K.A00, C300965yF.A07(r5), str2, i, z);
            }
        }
    }
}
