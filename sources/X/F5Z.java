package X;

import com.instagram.common.session.UserSession;

public abstract class F5Z {
    public static final void A00(UserSession userSession, EV0 ev0) {
        1An r0;
        String str;
        0xY AR4;
        String str2;
        1Av A00 = 1Au.A00(userSession);
        1Am A01 = 1Al.A01(userSession);
        int ordinal = ev0.ordinal();
        if (ordinal == 1) {
            r0 = 1An.A0Z;
        } else if (ordinal == 0) {
            r0 = 1An.A1E;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        0xa A03 = A01.A03(r0);
        if (ordinal != 1) {
            str = "DISCOVERABLE_PUBLIC_CHANNEL_CREATION_KEY";
        } else {
            str = "BROADCAST_CHAT_CREATION_KEY";
        }
        if (A03.getBoolean(str, false)) {
            AR4 = A03.AR4();
            str2 = "SUBSCRIBER_SOCIAL_CHANNEL_CREATION_KEY";
        } else if (182.A06(0Tu.A05, userSession, 36315868343832198L)) {
            AnonymousClass7TF.A1J(A00, A00.A2Y, 1Av.A8a, 392, true);
            return;
        } else {
            AR4 = A03.AR4();
            if (ordinal != 1) {
                str2 = "DISCOVERABLE_PUBLIC_CHANNEL_CREATION_KEY";
            } else {
                str2 = "BROADCAST_CHAT_CREATION_KEY";
            }
        }
        AR4.E5T(str2, true);
        AR4.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r0.getFanClubId() == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r5, X.EV0 r6) {
        /*
            r4 = 0
            X.1Am r3 = X.1Al.A01(r5)
            int r2 = r6.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x004c
            X.1An r0 = X.1An.A1E
        L_0x000e:
            X.0xa r3 = r3.A03(r0)
            if (r2 == r1) goto L_0x0049
            java.lang.String r0 = "DISCOVERABLE_PUBLIC_CHANNEL_CREATION_KEY"
        L_0x0016:
            r2 = 0
            boolean r1 = r3.getBoolean(r0, r4)
            X.EV0 r0 = X.EV0.Broadcast
            if (r6 == r0) goto L_0x004f
            if (r1 == 0) goto L_0x004f
            X.17i r1 = X.17h.A00(r5)
            java.lang.String r0 = r5.A06
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x003c
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.getFanClubId()
            r1 = 0
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r1 = 1
        L_0x003d:
            java.lang.String r0 = "SUBSCRIBER_SOCIAL_CHANNEL_CREATION_KEY"
            boolean r0 = r3.getBoolean(r0, r4)
            if (r1 != 0) goto L_0x0047
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r2 = 1
        L_0x0048:
            return r2
        L_0x0049:
            java.lang.String r0 = "BROADCAST_CHAT_CREATION_KEY"
            goto L_0x0016
        L_0x004c:
            X.1An r0 = X.1An.A0Z
            goto L_0x000e
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F5Z.A01(com.instagram.common.session.UserSession, X.EV0):boolean");
    }
}
