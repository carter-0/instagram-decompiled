package X;

import android.app.Activity;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Nv2  reason: case insensitive filesystem */
public abstract class C69962Nv2 {
    public static final void A00(Activity activity, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        DirectThreadKey directThreadKey2 = directThreadKey;
        AnonymousClass7TG.A1Q(directThreadKey, str);
        Uri A09 = DbT.A09(str);
        DirectEditAddYoursParams directEditAddYoursParams = new DirectEditAddYoursParams(A09.getQueryParameter("prompt_text"), A09.getQueryParameter("collection_id"));
        UserSession userSession2 = userSession;
        C70846ONz oNz = new C70846ONz(DbS.A0O("DirectEditAddYoursUriHandler"), userSession);
        String str2 = directEditAddYoursParams.A01;
        String str3 = directThreadKey.A00;
        1Ln A03 = 1Ln.A03(oNz.A00);
        if (DbT.A1Y(A03)) {
            A03.A0M(C69497Nmf.EDIT_TAPPED, "action");
            C66583MXo.A11(C69494Nmc.ADMIN_TEXT, A03, str2, str3);
        }
        1as.A04.A02(activity, userSession2, directEditAddYoursParams, DirectPromptTypes.UNKNOWN, directThreadKey2, 0, 0);
    }
}
