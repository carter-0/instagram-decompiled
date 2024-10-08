package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FV5 implements AnonymousClass0iw {
    public static final FV5 A00 = new Object();
    public static final String __redex_internal_original_name = "DirectVideoCallDialogHelper";

    public static final void A00(Context context, UserSession userSession, Runnable runnable, Runnable runnable2, List list) {
        String A0h;
        Object[] objArr;
        String string;
        C358248ab A0Y = DbS.A0Y(context);
        int size = list.size();
        if (size == 1) {
            A0h = context.getString(2131976590);
        } else {
            A0h = DbW.A0h(context, Integer.valueOf(size), 2131976587);
        }
        0qQ.A0A(A0h);
        A0Y.A05 = A0h;
        int size2 = list.size();
        if (size2 == 1) {
            int i = 2131976588;
            if (182.A05(0Tu.A05, userSession)) {
                i = 2131976589;
            }
            objArr = new Object[]{list.get(0)};
            string = context.getString(r2, objArr);
        } else if (size2 != 2) {
            Resources resources = context.getResources();
            boolean A05 = 182.A05(0Tu.A05, userSession);
            int i2 = R.plurals.videocall_start_multiple_blocked_user_message;
            if (A05) {
                i2 = R.plurals.videocall_start_multiple_blocked_user_message_chat;
            }
            int i3 = size2 - 2;
            string = resources.getQuantityString(i2, i3, new Object[]{list.get(0), list.get(1), Integer.valueOf(i3)});
        } else {
            int i4 = 2131976591;
            if (182.A05(0Tu.A05, userSession)) {
                i4 = 2131976592;
            }
            objArr = new Object[]{list.get(0), list.get(1)};
            string = context.getString(i4, objArr);
        }
        0qQ.A07(string);
        A0Y.A0q(string);
        A0Y.A0c(C50023FJi.A00(runnable2, 42), AnonymousClass7TE.A16(context, 2131976586));
        C49968FHb.A00(A0Y, runnable, 2);
        A0Y.A0C(FJB.A00);
        A0Y.A0s(true);
        DbT.A1V(A0Y);
    }

    public final String getModuleName() {
        return "direct_thread";
    }
}
