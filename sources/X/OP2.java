package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.Map;

public abstract class OP2 {
    public static final void A00(Context context, UserSession userSession, String str, String str2, Map map, boolean z) {
        AnonymousClass7TF.A1B(userSession, 1, str);
        Map A02 = 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("seller_id", userSession.A06), AnonymousClass7TE.A1L("buyer_id", str), AnonymousClass7TE.A1L("entrypoint", str2)});
        if (map != null) {
            A02 = 0Yt.A04(map, A02);
        }
        if (z) {
            C46649DiU A04 = C46649DiU.A04("com.bloks.www.biig.universal.business.consent", A02);
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A0i = true;
            Bundle A00 = C49891FBs.A00(A0N, A04);
            Dba.A0K(C61270mF.A00(context), A00, userSession, ModalActivity.class, "bloks").A0C(context);
            return;
        }
        C46649DiU.A04("com.bloks.www.biig.universal.business.consent", A02).A0D(context, DbS.A0N(userSession));
    }

    public static final void A01(UserSession userSession, Context context, boolean z) {
        HashMap A0m = DbY.A0m("seller_id", userSession.A06);
        if (z) {
            C46649DiU A04 = C46649DiU.A04("com.bloks.www.biig.data.sharing.settings", A0m);
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A0i = true;
            A0N.A0U = context.getString(2131952093);
            Bundle A00 = C49891FBs.A00(A0N, A04);
            Dba.A0K(C61270mF.A00(context), A00, userSession, ModalActivity.class, "bloks").A0C(context);
            return;
        }
        C46649DiU A042 = C46649DiU.A04("com.bloks.www.biig.data.sharing.settings", A0m);
        IgBloksScreenConfig A0N2 = DbS.A0N(userSession);
        A0N2.A0U = context.getString(2131952093);
        A042.A0D(context, A0N2);
    }
}
