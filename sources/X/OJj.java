package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;

public final class OJj {
    public C331157Pu A00;

    public final void A00(Activity activity, AnonymousClass0iw r15, UserSession userSession, C72208OyY oyY, AnonymousClass7BY r18, DirectShareTarget directShareTarget, String str, boolean z) {
        int i;
        int i2;
        UserSession userSession2 = userSession;
        Activity activity2 = activity;
        AnonymousClass7TG.A1N(activity, userSession2);
        C313746gw.A00(userSession2).A00 = Boolean.valueOf(z);
        DirectShareTarget directShareTarget2 = directShareTarget;
        String str2 = str;
        if (directShareTarget2.A01 == 29) {
            String A08 = directShareTarget2.A08();
            CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget2.A04;
            if (creatorBroadcastThreadInfo != null) {
                i = creatorBroadcastThreadInfo.A00;
            } else {
                i = 1;
            }
            if (OP8.A01(userSession2, A08, i)) {
                1as r4 = 1as.A04;
                FragmentActivity fragmentActivity = (FragmentActivity) activity2;
                String A082 = directShareTarget2.A08();
                CreatorBroadcastThreadInfo creatorBroadcastThreadInfo2 = directShareTarget2.A04;
                if (creatorBroadcastThreadInfo2 != null) {
                    i2 = creatorBroadcastThreadInfo2.A00;
                } else {
                    i2 = 1;
                }
                r4.A03(fragmentActivity, r15, userSession2, A082, str2, (String) null, "inbox_search", i2);
                return;
            }
        }
        String A002 = OXO.A00(DbT.A09(str2));
        if (A002 != null) {
            C331127Pr A0W = DbS.A0W(userSession2);
            NKN A01 = C71045OaN.A01(C69318NjJ.DIRECT_SEARCH, new P3G(userSession2, oyY, r18, this, A0W, directShareTarget2), A002, (String) null);
            A0W.A0U = A01;
            C331157Pu A003 = A0W.A00();
            this.A00 = A003;
            A003.A02(activity, A01);
        }
    }
}
