package X;

import android.os.Handler;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4BV  reason: invalid class name */
public final class AnonymousClass4BV implements 1wn {
    public final /* synthetic */ C2596742q A00;

    public AnonymousClass4BV(C2596742q r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        String str2;
        Object remove;
        int A03 = AnonymousClass0fD.A03(-1688861647);
        2Kb r10 = (2Kb) obj;
        int A032 = AnonymousClass0fD.A03(2118399968);
        0qQ.A0B(r10, 0);
        C2596742q r5 = this.A00;
        List<C254703su> list = r10.A02;
        if (list != null) {
            for (C254703su r0 : list) {
                String str3 = r0.A1u;
                0qQ.A07(str3);
                User A02 = r5.A03.A02(str3);
                if (A02 != null) {
                    if (A02.BST() == null) {
                        0wb.A03("updateActivityIndicatorOnNewMessages_nullMessagingUserFbid", "Attempting to update activity indicator for user with null interop_messaging_user_fbid");
                    }
                    str3 = A02.getId();
                    Long BST = A02.BST();
                    str = null;
                    if (BST != null) {
                        str = Long.toString(BST.longValue());
                    }
                } else {
                    0wb.A03("updateActivityIndicatorOnNewMessages_nullUser", "Attempting to update activity indicator for user not found in UserCache");
                    str = null;
                }
                C299305uu r7 = new C299305uu(str3, str);
                C2596942s r6 = r5.A02;
                String str4 = r7.A01;
                if (!((str4 == null || (remove = r6.A02.remove(str4)) == null) && ((str2 = r7.A00) == null || (remove = r6.A01.remove(str2)) == null))) {
                    Handler handler = r5.A00;
                    handler.removeMessages(1, remove);
                    handler.obtainMessage(1, remove).sendToTarget();
                }
            }
        }
        AnonymousClass0fD.A0A(-495773251, A032);
        AnonymousClass0fD.A0A(-1056734170, A03);
    }
}
