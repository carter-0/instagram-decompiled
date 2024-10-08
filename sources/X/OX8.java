package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.ArrayList;

public abstract class OX8 {
    public static final ArrayList A00(Context context, UserSession userSession, Boolean bool, C62320sa r12, C62320sa r13, C62320sa r14, C62320sa r15, boolean z, boolean z2) {
        int i;
        int i2;
        Integer A0m;
        C73656PhV phV;
        ArrayList A0q = AnonymousClass7TF.A0q(userSession, 1);
        Context context2 = context;
        if (z && 182.A06(0Tu.A05, userSession, 36324312244629478L)) {
            int i3 = 2131954946;
            if (z2) {
                i3 = 2131954945;
            }
            A0q.add(C71127OdQ.A04(context2, true, (Integer) null, new C73656PhV(r15, 20), i3, R.drawable.instagram_menu_pano_outline_24));
        }
        if (0qQ.A0K(bool, true)) {
            if (182.A06(0Tu.A05, userSession, 36324312243974109L)) {
                A0q.add(C71127OdQ.A04(context2, true, (Integer) null, new C73656PhV(r12, 21), 2131954930, R.drawable.instagram_circle_x_pano_outline_24));
            }
            i = 2131954919;
            i2 = R.drawable.instagram_delete_pano_outline_24;
            A0m = C66581MXm.A0m(context2);
            phV = new C73656PhV(r13, 22);
        } else {
            i = 2131972171;
            i2 = R.drawable.instagram_report_pano_outline_24;
            A0m = C66581MXm.A0m(context2);
            phV = new C73656PhV(r14, 23);
        }
        A0q.add(C71127OdQ.A04(context2, true, A0m, phV, i, i2));
        return A0q;
    }

    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo) {
        0qQ.A0B(userSession, 0);
        P43 p43 = new P43(fragmentActivity, 0);
        C49731F3w A07 = 1as.A04.A02.A07(r5, userSession, 2FW.A0R);
        A07.A07.putParcelable("DirectShareSheetConstants.channel_challenge", channelChallengeShareInfo);
        A07.A01 = p43;
        DirectShareSheetFragment A00 = A07.A00();
        AnonymousClass37D A0i = DbT.A0i(fragmentActivity);
        if (A0i != null) {
            A0i.A0J(A00);
        }
    }

    public static final void A02(2da r3, C62320sa r4, 0sP r5) {
        r3.Eu4(true);
        Dbc.A0k(r3);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_more_horizontal_outline_44;
        A0K.A05 = 2131966734;
        A0K.A07 = 0;
        A0K.A0B = 0;
        DbX.A19(new C71407Ok6(r5, 53), A0K, r3);
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A06 = R.drawable.instagram_direct_pano_outline_24;
        A0K2.A05 = 2131973441;
        DbX.A19(new C71407Ok6(r4, 54), A0K2, r3);
    }
}
