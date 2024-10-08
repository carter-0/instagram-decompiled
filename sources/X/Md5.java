package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.List;

public abstract class Md5 {
    public static final C328657Fq A00(Context context, UserSession userSession, AnonymousClass7FE r23, AnonymousClass9HC r24, AnonymousClass7LQ r25) {
        C2609947v r4;
        String str;
        String str2;
        Integer num;
        1Xj r10;
        int i;
        List list;
        C254923tH r9;
        String str3;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        AnonymousClass9HC r5 = r24;
        C51972G9s.A1C(userSession2, r5);
        AnonymousClass7LQ r2 = r25;
        C254703su r1 = r2.A0e;
        0qQ.A07(r1);
        2FW r42 = r1.A10;
        if (r42 == 2FW.A0p || r42 == 2FW.A0y) {
            r4 = r1.A0g;
        } else {
            Object obj = r1.A1T;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectVoiceMedia");
            r4 = (C2609947v) obj;
        }
        User user = r2.A0K;
        if (r4 != null) {
            str = r4.A02();
        } else {
            str = null;
        }
        DirectMessageIdentifier A0V = r1.A0V();
        if (user != null) {
            str2 = user.getUsername();
        } else {
            str2 = null;
        }
        if (r4 != null) {
            num = r4.A00();
        } else {
            num = null;
        }
        int A0M = AnonymousClass7TE.A0M(C66801Mcn.A00(num, 0, "playbackDurationMs"));
        if (r4 != null) {
            r10 = r4.A02;
            i = r4.A00;
            list = r4.A03();
        } else {
            r10 = null;
            i = 0;
            list = null;
        }
        AnonymousClass7FT A0Y = C66580MXl.A0Y(context2, userSession2, r5, r2, r1);
        C254793t3 r43 = r2.A0G.A0P;
        if (r43 == null || (r9 = C300965yF.A00(r43)) == null) {
            r9 = C254923tH.ACT;
        }
        boolean A1S = r1.A1S();
        Long l = r1.A1K;
        boolean z = r1.A2P;
        Integer num2 = AnonymousClass05K.A00;
        Integer num3 = AnonymousClass05K.A0C;
        C254793t3 r22 = r2.A0G.A0P;
        if (r22 != null) {
            str3 = C66580MXl.A0x(r22);
        } else {
            str3 = null;
        }
        return new C328657Fq(r1.A0G, A0Y, r23, r9, r10, A0V, num2, num3, (Long) null, l, str, str2, str3, list, A0M, i, A1S, z, false);
    }
}
