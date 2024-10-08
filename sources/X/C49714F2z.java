package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.F2z  reason: case insensitive filesystem */
public final class C49714F2z {
    public final void A00(Context context, UserSession userSession, User user, Integer num, String str) {
        String BAR;
        String str2;
        Long l;
        UserSession userSession2 = userSession;
        User user2 = user;
        int A02 = DbW.A02(1, userSession2, user2);
        C275854s3 AY0 = user2.A03.AY0();
        if (AY0 != null && AY0.BAR() != null && (BAR = AY0.BAR()) != null) {
            String id = user2.getId();
            C275854s3 AY02 = user2.A03.AY0();
            String str3 = null;
            if (!(AY02 == null || AY02.Aq2() == null)) {
                str3 = String.valueOf(AY02.Aq2());
            }
            Long A0n = 00y.A0n(10, id);
            if (A0n != null) {
                switch (num.intValue()) {
                    case 0:
                        str2 = "ACCEPT_FOLLOW_REQUEST";
                        break;
                    case 1:
                        str2 = "ACCEPT_MESSAGE_REQUEST";
                        break;
                    case 2:
                        str2 = "FOLLOW";
                        break;
                    default:
                        str2 = "OPEN_BIO_LINK";
                        break;
                }
                if (str3 != null) {
                    l = 00y.A0n(10, str3);
                } else {
                    l = null;
                }
                HashMap A1E = AnonymousClass7TE.A1E();
                HashMap A1E2 = AnonymousClass7TE.A1E();
                HashMap A1E3 = AnonymousClass7TE.A1E();
                BitSet A0w = DbS.A0w(3);
                A1E.put("target_user_id", A0n);
                A0w.set(A02);
                A1E.put("action", str2);
                A0w.set(0);
                A1E.put("harm", BAR);
                A0w.set(1);
                A1E.put("url", str);
                if (l != null) {
                    A1E.put("connected_user_id", Long.valueOf(l.longValue()));
                }
                IgBloksScreenConfig A0N = DbS.A0N(userSession2);
                A0N.A0R = "com.bloks.www.ig.proactive_warning";
                if (A0w.nextClearBit(0) >= 3) {
                    C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig.proactive_warning", A1E, A1E2);
                    A05.A03 = null;
                    A05.A02 = null;
                    A05.A04 = null;
                    A05.A0H(A1E3);
                    A05.A0E(context, A0N);
                    return;
                }
                throw DbU.A0i();
            }
        }
    }

    public final boolean A01(UserSession userSession, User user, Integer num) {
        String BAR;
        long j;
        AnonymousClass7TF.A1H(user, userSession);
        C275854s3 AY0 = user.A03.AY0();
        if (AY0 == null || AY0.BAR() == null || (BAR = AY0.BAR()) == null) {
            return false;
        }
        int intValue = num.intValue();
        0Tu r2 = 0Tu.A05;
        if (intValue == 0) {
            j = 36884663742235202L;
        } else if (intValue == 3) {
            j = 36884663742497348L;
        } else if (intValue != 2) {
            j = 36884663742562885L;
        } else {
            j = 36884663742366275L;
        }
        String A04 = 182.A04(r2, userSession, j);
        if (!00l.A0W(A04)) {
            return DbX.A0x(A04).contains(BAR);
        }
        return false;
    }
}
