package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;

public final class P15 implements AnonymousClass7H7 {
    public MessagingUser A00;
    public final int A01;
    public final Activity A02;
    public final UserSession A03;
    public final C74313Psp A04;
    public final AnonymousClass7VW A05;
    public final String A06;
    public final List A07;
    public final int A08;
    public final Capabilities A09;

    public P15(Activity activity, UserSession userSession, Capabilities capabilities, C74313Psp psp, AnonymousClass7VW r6, String str, List list, int i, int i2) {
        AnonymousClass7TF.A1G(userSession, 1, list);
        this.A03 = userSession;
        this.A01 = i;
        this.A02 = activity;
        this.A09 = capabilities;
        this.A06 = str;
        this.A05 = r6;
        this.A08 = i2;
        this.A04 = psp;
        this.A07 = list;
    }

    public final void DBr(String str, String str2, String str3) {
        if (str != null && str3 != null) {
            UserSession userSession = this.A03;
            String str4 = this.A06;
            int i = this.A08;
            Bundle A0A = DbY.A0A(userSession);
            AnonymousClass0Dg.A00(A0A, userSession);
            A0A.putString("direct_emoji_collection_item_id", str);
            A0A.putString("direct_emoji_collection_type", str3);
            A0A.putString("direct_emoji_thread_id", str4);
            A0A.putString("direct_emoji_message_id", str2);
            A0A.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", i);
            A0A.putBoolean(AnonymousClass000.A00(60), true);
            NK7 nk7 = new NK7();
            nk7.setArguments(A0A);
            C331127Pr A0e = DbX.A0e(userSession, true);
            A0e.A0T = nk7;
            A0e.A03 = 0.6f;
            Activity activity = this.A02;
            A0e.A06 = 2Yu.A0F(new ContextThemeWrapper(activity, i), R.attr.igds_color_elevated_background);
            C331157Pu A022 = C72959PQr.A00(A0e, this, 15).A02(activity, nk7);
            if (A022 != null) {
                nk7.A01 = new C72628PDh(this, A022);
            }
        }
    }
}
