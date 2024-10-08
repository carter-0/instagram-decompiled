package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Arrays;

/* renamed from: X.3Xq  reason: invalid class name and case insensitive filesystem */
public abstract class C243163Xq {
    public static final int A00(UserSession userSession, 1Xj r10, AnonymousClass4DU r11, AnonymousClass3W1 r12) {
        AnonymousClass3WB r2;
        int hashCode;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r12, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r11, 3);
        if (C243173Xr.A04.A01(userSession, r10, r12, r11.getModuleName())) {
            r2 = r12.A0l;
        } else {
            r2 = null;
        }
        boolean z = false;
        String A2w = r10.A2w();
        Boolean valueOf = Boolean.valueOf(r10.A5f());
        UpcomingEvent A27 = r10.A27(userSession);
        if (A27 != null) {
            z = A27.getReminderEnabled();
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        if (!r12.A20) {
            hashCode = AnonymousClass972.MUTABLE_FLAG_MASK;
        } else {
            hashCode = Arrays.hashCode(new Object[]{r10.A3E(), r10.A3A()});
        }
        return Arrays.hashCode(new Object[]{r2, A2w, valueOf, valueOf2, Integer.valueOf(hashCode), C243193Xt.A02(userSession, r10, r10), r10.A3b(), r10.A0C.BYK(), Boolean.valueOf(r10.A57())});
    }
}
