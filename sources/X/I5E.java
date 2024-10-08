package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallText;
import java.util.Arrays;

public abstract class I5E {
    public static final void A00(AnonymousClass4DH r6, UserSession userSession, User user, 0sP r9) {
        AnonymousClass7TG.A1Q(userSession, r9);
        1Z4 r1 = 1Z4.A00;
        Context requireContext = r6.requireContext();
        User user2 = user;
        r1.A00(requireContext, (FragmentActivity) null, userSession, user2, new C51051Fnh(r9, 8), r6.getModuleName(), (String) null, user.getUsername());
    }

    public static final void A01(AnonymousClass4DH r4, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        C46474Dfc.A03(DbW.A0H(r4, userSession), userSession, C46447Df9.A02(), C46548Dgp.A01(userSession, str, "wonder_wall", r4.getModuleName()));
    }

    public static final void A02(AnonymousClass4DH r4, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        C46474Dfc.A03(DbW.A0H(r4, userSession), userSession, C46447Df9.A02(), C46548Dgp.A02(userSession, str, "wonder_wall", r4.getModuleName()));
    }

    public static final void A03(AnonymousClass4DH r5, WallText wallText) {
        String str;
        0qQ.A0B(r5, 0);
        Context context = r5.getContext();
        if (context != null) {
            if (wallText instanceof WallText.Res) {
                WallText.Res res = (WallText.Res) wallText;
                int i = res.A00;
                String[] strArr = res.A01;
                str = context.getString(i, Arrays.copyOf(strArr, strArr.length));
            } else if (wallText instanceof WallText.Raw) {
                str = ((WallText.Raw) wallText).A00;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            0qQ.A0A(str);
            C59689JTv.A00(context, str, "wall", 0);
        }
    }
}
