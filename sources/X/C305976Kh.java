package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Kh  reason: invalid class name and case insensitive filesystem */
public abstract class C305976Kh {
    public static final Integer A00(UserSession userSession, C255773uh r2) {
        0qQ.A0B(userSession, 1);
        if (r2.CWu()) {
            1Xj r0 = r2.A0b;
            r0.getClass();
            if (r0.A5f()) {
                return AnonymousClass05K.A0C;
            }
        }
        if (AnonymousClass3BJ.A00(userSession).A02(r2)) {
            return AnonymousClass05K.A01;
        }
        if (A01(userSession, r2)) {
            return AnonymousClass05K.A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.A0t != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r2, X.C255773uh r3) {
        /*
            r0 = 1
            X.0qQ.A0B(r2, r0)
            boolean r0 = r3.CWu()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            X.1Xj r0 = r3.A0b
            if (r0 == 0) goto L_0x0022
            java.util.ArrayList r0 = r0.A3F()
            X.0qQ.A0B(r0, r1)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C271404in.A05(r0)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.A0t
            if (r0 == 0) goto L_0x0022
        L_0x0020:
            r1 = 1
        L_0x0021:
            return r1
        L_0x0022:
            boolean r0 = X.AnonymousClass6VE.A00(r2, r3)
            if (r0 == 0) goto L_0x0021
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305976Kh.A01(com.instagram.common.session.UserSession, X.3uh):boolean");
    }
}
