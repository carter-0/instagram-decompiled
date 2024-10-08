package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.3NC  reason: invalid class name */
public abstract class AnonymousClass3NC {
    public static void A00(Context context, View.OnClickListener onClickListener, AnonymousClass0iw r11, UserSession userSession, AnonymousClass3BT r13, AnonymousClass3N5 r14, C230242pG r15, List list, int i, boolean z) {
        AnonymousClass3N5 r8 = r14;
        AnonymousClass3N6 r5 = r14.A02;
        UserSession userSession2 = userSession;
        AnonymousClass3BT r7 = r13;
        AnonymousClass3ND.A00(userSession, r13, r5);
        Reel reel = r13.A03;
        boolean A0r = reel.A0r();
        AnonymousClass3N8 r2 = r14.A05;
        View A00 = r2.A00();
        if (A0r) {
            AnonymousClass0fU.A00(onClickListener, A00);
        } else {
            A00.setOnClickListener((View.OnClickListener) null);
        }
        0qQ.A0B(userSession, 0);
        AnonymousClass3NE.A00(userSession, reel.A09(userSession), r13, r2, z);
        r14.A00(userSession, reel.A0r()).A02();
        List list2 = r14.A00(userSession, reel.A0r()).A09;
        list2.clear();
        list2.add(new AnonymousClass3NH(new View[]{r5.A00()}[0]));
        r14.A00 = new AnonymousClass3NR(context, r11, userSession2, r7, r8, r15, list, i);
    }
}
