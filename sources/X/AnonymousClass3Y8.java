package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.3Y8  reason: invalid class name */
public abstract class AnonymousClass3Y8 {
    public static final boolean A00(UserSession userSession, 1Xj r5) {
        User A2A;
        0qQ.A0B(r5, 0);
        0qQ.A0B(userSession, 1);
        if (!0qQ.A0K(r5.A0C.BIl(), "connected_content_note_following") || (A2A = r5.A2A(userSession)) == null || A2A.B6o() == FollowStatus.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, 1Xj r5, AnonymousClass3W1 r6) {
        User A2A;
        0qQ.A0B(r5, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r6, 2);
        if (r5.A69()) {
            return true;
        }
        if (!r6.A2a || (A2A = r5.A2A(userSession)) == null || A2A.B6o() == FollowStatus.A05) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r0 != r1) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(com.instagram.common.session.UserSession r5, X.1Xj r6, X.AnonymousClass3W1 r7) {
        /*
            r4 = 0
            X.0qQ.A0B(r6, r4)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.1Xy r0 = r6.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0060
            X.1s9 r0 = r0.BP1()
            if (r0 == 0) goto L_0x0060
            com.instagram.api.schemas.ClipsMashupType r0 = r0.BP2()
            r3 = 1
            if (r0 == 0) goto L_0x0060
            com.instagram.user.model.User r1 = r6.A2A(r5)
            if (r1 == 0) goto L_0x0060
            X.1Xy r0 = r6.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0060
            X.1s9 r0 = r0.BP1()
            if (r0 == 0) goto L_0x0060
            X.4bJ r0 = r0.BZ6()
            if (r0 == 0) goto L_0x0060
            com.instagram.user.model.User r2 = r0.CCd()
            if (r2 == 0) goto L_0x0060
            com.instagram.user.model.FollowStatus r0 = r1.B6o()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r1) goto L_0x004c
            com.instagram.user.model.FollowStatus r0 = r2.B6o()
            r2 = 0
            if (r0 == r1) goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            if (r7 == 0) goto L_0x0055
            X.1sy r1 = X.1sy.A0H
            X.1sy r0 = r7.A0o
            if (r1 != r0) goto L_0x005e
        L_0x0055:
            if (r2 == 0) goto L_0x005e
            boolean r0 = X.AnonymousClass3Y9.A02(r5, r6)
            if (r0 == 0) goto L_0x005e
            return r3
        L_0x005e:
            r3 = 0
            return r3
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y8.A02(com.instagram.common.session.UserSession, X.1Xj, X.3W1):boolean");
    }

    public static final boolean A03(UserSession userSession, 1Xj r5, AnonymousClass3W1 r6) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(userSession, 1);
        if ((r6 == null || 1sy.A0H == r6.A0o) && 0qQ.A0K(r5.A0C.BYH(), true) && r5.A6H() && 182.A06(0Tu.A05, userSession, 36320279272890557L)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r0 != r1) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(com.instagram.common.session.UserSession r6, X.1Xj r7, X.AnonymousClass3W1 r8) {
        /*
            r5 = 0
            X.0qQ.A0B(r7, r5)
            r3 = 1
            X.0qQ.A0B(r6, r3)
            com.instagram.user.model.User r1 = r7.A2A(r6)
            r4 = 0
            if (r1 == 0) goto L_0x0075
            com.instagram.api.schemas.OriginalitySourceMediaInfo r0 = X.AnonymousClass3Y9.A00(r7)
            if (r0 == 0) goto L_0x0075
            com.instagram.user.model.User r2 = r0.CCd()
            if (r2 == 0) goto L_0x0075
            com.instagram.user.model.FollowStatus r0 = r1.B6o()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r1) goto L_0x002a
            com.instagram.user.model.FollowStatus r0 = r2.B6o()
            r2 = 0
            if (r0 == r1) goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r8 == 0) goto L_0x0033
            X.1sy r1 = X.1sy.A0H
            X.1sy r0 = r8.A0o
            if (r1 != r0) goto L_0x0068
        L_0x0033:
            if (r2 == 0) goto L_0x0068
            boolean r0 = r7.A6R(r6)
            if (r0 == 0) goto L_0x0068
            X.1Xy r0 = r7.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0069
            com.instagram.api.schemas.OriginalityInfo r0 = r0.BZI()
            if (r0 == 0) goto L_0x0069
            com.instagram.api.schemas.OriginalityFollowButtonInfo r2 = r0.B6k()
            if (r2 == 0) goto L_0x0069
            java.lang.Boolean r0 = r2.CYi()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = r2.BvP()
            boolean r0 = X.0qQ.A0K(r0, r1)
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            r4 = 1
        L_0x0068:
            return r4
        L_0x0069:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325703813837983(0x810e09000a349f, double:3.035859591515246E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            goto L_0x0065
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y8.A04(com.instagram.common.session.UserSession, X.1Xj, X.3W1):boolean");
    }
}
