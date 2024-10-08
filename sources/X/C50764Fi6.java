package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.Fi6  reason: case insensitive filesystem */
public final class C50764Fi6 implements G6H {
    public final Activity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        String str2;
        UserSession userSession = this.A01;
        if (AnonymousClass5IJ.A01(userSession)) {
            C313756gx A002 = C313746gw.A00(userSession);
            boolean A003 = C375469Dr.A00(userSession);
            A002.A01 = AnonymousClass7TF.A0b();
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A002);
                DbV.A1M(A0J, "creator_nux_sheet_rendered");
                A0J.A0p("start_broadcast_chat_button");
                if (A003) {
                    str = "inbox_sbc_qp";
                } else {
                    str = "inbox";
                }
                A0J.A0q(str);
                if (A003) {
                    str2 = "subscriber_broadcast";
                } else {
                    str2 = "instagram";
                }
                A0J.A0o(str2);
                Dba.A1C(A0J, A002);
            }
            C51901G6v A012 = FC2.A01(userSession, new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) null, (String) null, (String) null), ChannelCreationSource.QUICK_PROMOTION, EV0.Broadcast, false);
            FragmentActivity fragmentActivity = this.A00;
            DbS.A1X(fragmentActivity);
            A012.CfS(fragmentActivity);
        }
    }

    public C50764Fi6(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
