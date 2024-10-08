package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.List;

public abstract class F7B {
    public static final void A00(Activity activity, AnonymousClass4DH r16, AnonymousClass0iw r17, UserSession userSession, User user, String str, String str2, boolean z) {
        UserSession userSession2 = userSession;
        User user2 = user;
        AnonymousClass7TG.A1Q(user2, userSession2);
        AnonymousClass4DH r7 = r16;
        0qQ.A0B(r7, 4);
        Activity activity2 = activity;
        if (user2.A03.AaX() != null) {
            1ps A00 = AnonymousClass9B9.A00();
            int intValue = AnonymousClass9BA.A00(userSession2).A00().intValue();
            if (intValue == 0) {
                C358248ab A0Y = DbS.A0Y(activity);
                A0Y.A08(2131952581);
                A0Y.A0I((DialogInterface.OnClickListener) null, 2131952582);
                AnonymousClass7TH.A0a(A0Y, true);
            } else if (intValue == 1 || intValue == 2) {
                A00.A00(activity, C69503Nml.A02, userSession2);
            } else {
                new AiAgentThreadLauncher(userSession2).A08(activity2, r17, user2.getId(), (String) null, (String) null, (String) null, true);
            }
        } else {
            List A1I = AnonymousClass7TE.A1I(new PendingRecipient(user2));
            C291175gg r3 = new C291175gg(A1I);
            String str3 = str;
            String str4 = str2;
            if (182.A06(0Tu.A05, userSession2, 2342156064350996112L)) {
                AnonymousClass7VT.A00(userSession2).A02(r3, A1I, new TWQ(activity2, userSession2, r7, str3, str4, 4, z), true);
                return;
            }
            A01(activity, r7, userSession2, r3, str3, str4, z);
        }
    }

    public static final void A01(Activity activity, AnonymousClass4DH r3, UserSession userSession, C254783t2 r5, String str, String str2, boolean z) {
        1pE A01 = 1pE.A01(activity, r3, userSession, str);
        A01.A0B = r5;
        A01.A0q = true;
        A01.A01 = r3;
        A01.A0z = false;
        A01.A0t = z;
        if (str2 != null) {
            A01.A0h = str2;
        }
        if (0qQ.A0K(str, C273654mx.A00(288))) {
            FragmentActivity activity2 = r3.getActivity();
            if (activity2 != null) {
                A01.A08(activity2, r5, -1.0f);
                return;
            }
            return;
        }
        A01.A06();
    }
}
