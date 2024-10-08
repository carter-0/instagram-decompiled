package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Map;

public final class Oy9 implements AnonymousClass0lh {
    public DirectThreadKey A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final UserSession A02;
    public final 2Dm A03;

    public final void onSessionWillEnd() {
        this.A00 = null;
        this.A01.clear();
        this.A02.A03(Oy9.class);
    }

    public Oy9(UserSession userSession, 2Dm r3) {
        AnonymousClass7TG.A1O(userSession, r3);
        this.A02 = userSession;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, com.instagram.direct.model.comments.DirectMessageComments] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r5 = r7.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.model.direct.messageid.MessageIdentifier r8, java.lang.String r9, int r10) {
        /*
            r7 = this;
            X.DbY.A1S(r8, r9)
            com.instagram.model.direct.DirectThreadKey r6 = r7.A00
            if (r6 == 0) goto L_0x0039
            X.2Dm r5 = r7.A03
            java.lang.String r0 = r8.A01
            X.3su r4 = r5.BRz(r6, r0)
            if (r4 == 0) goto L_0x0039
            r3 = 0
            X.3su r2 = new X.3su
            r2.<init>()
            com.instagram.common.session.UserSession r1 = r7.A02
            X.3t0 r0 = X.AnonymousClass3t7.A00(r6)
            if (r0 == 0) goto L_0x0023
            X.3t0 r3 = X.C300965yF.A02(r0)
        L_0x0023:
            r2.A10(r1, r4, r3)
            com.instagram.direct.model.comments.DirectMessageComments r0 = new com.instagram.direct.model.comments.DirectMessageComments
            r0.<init>()
            r0.A00 = r10
            r0.A01 = r9
            r2.A0q = r0
            com.instagram.direct.model.comments.DirectMessageComments r0 = r4.A0q
            if (r0 == 0) goto L_0x003a
            int r0 = r0.A00
            if (r10 != r0) goto L_0x003a
        L_0x0039:
            return
        L_0x003a:
            X.2Dr r5 = (X.2Dr) r5
            monitor-enter(r5)
            r0 = 1
            r5.A9f(r2, r6, r0)     // Catch:{ all -> 0x0043 }
            monitor-exit(r5)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Oy9.A00(com.instagram.model.direct.messageid.MessageIdentifier, java.lang.String, int):void");
    }
}
