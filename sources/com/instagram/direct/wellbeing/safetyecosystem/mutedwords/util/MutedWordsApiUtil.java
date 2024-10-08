package com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util;

import X.00k;
import X.0qQ;
import X.0sP;
import X.15p;
import X.1NY;
import X.1OC;
import X.1XP;
import X.1XY;
import X.AnonymousClass7TG;
import X.C384549hV;
import X.C39828AAz;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class MutedWordsApiUtil {
    public static final 1OC A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("accounts/get_post_filter_keywords/");
        A0b.A0Q(C384549hV.class, C39828AAz.class);
        return A0b.A0M();
    }

    public static final 1OC A01(UserSession userSession, List list) {
        0qQ.A0B(userSession, 0);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/set_post_filter_keywords/");
        A0a.A9m("keywords", 00k.A0P(",", "", "", list, (0sP) null));
        A0a.A0O((15p) null, 1XP.class, 1XY.class, false);
        return A0a.A0M();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 16
            boolean r0 = X.C58074Il6.A02(r3, r7)
            if (r0 == 0) goto L_0x005b
            r5 = r7
            X.Il6 r5 = (X.C58074Il6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r3) goto L_0x0066
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0037
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0061
            X.A05 r0 = new X.A05
            r0.<init>()
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x0037:
            return r4
        L_0x0038:
            X.0eS.A00(r0)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r6)
            java.lang.String r0 = "accounts/get_comment_filter_keywords/"
            r2.A0A(r0)
            java.lang.Class<X.9hV> r1 = X.C384549hV.class
            java.lang.Class<X.AAz> r0 = X.C39828AAz.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r3
            r0 = 458382369(0x1b525c21, float:1.7400561E-22)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x005b:
            X.Il6 r5 = new X.Il6
            r5.<init>(r3, r7)
            goto L_0x0016
        L_0x0061:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil.A02(com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }
}
