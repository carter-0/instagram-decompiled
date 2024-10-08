package com.instagram.inappbrowser.helper;

import X.AnonymousClass0lh;
import X.C367658rM;
import X.C367958rq;
import X.C367968rr;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class BrowserLinkshimUrlCache implements AnonymousClass0lh {
    public final C367968rr A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r7 = this;
            r4 = 46
            boolean r0 = X.C66145MDx.A02(r4, r10)
            if (r0 == 0) goto L_0x00df
            r3 = r10
            X.MDx r3 = (X.C66145MDx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00df
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r6 = r3.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x0090
            if (r0 != r5) goto L_0x00f5
            java.lang.Object r8 = r3.A02
            java.lang.Object r2 = r3.A01
            com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache r2 = (com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache) r2
            X.0eS.A00(r6)
        L_0x002a:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0087
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r0 = r6.A00
            X.9hW r0 = (X.C384559hW) r0
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x00f0
            X.8rr r0 = r2.A00
            X.8rq r0 = (X.C367958rq) r0
            X.8rQ r0 = r0.A00
            r0.put(r8, r1)
            X.3Ih r6 = new X.3Ih
            r6.<init>(r1)
        L_0x0048:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0074
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00eb
            X.5sO r6 = (X.C297815sO) r6
            java.lang.Object r2 = r6.A00
            X.4dm r2 = (X.C268654dm) r2
            boolean r0 = r2 instanceof X.C268674do
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = "error: "
            X.4do r2 = (X.C268674do) r2
            java.lang.Object r0 = r2.A00
            X.1XR r0 = (X.1XR) r0
            int r0 = r0.getStatusCode()
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L_0x006f:
            X.5sO r6 = new X.5sO
            r6.<init>(r0)
        L_0x0074:
            return r6
        L_0x0075:
            boolean r0 = r2 instanceof X.C268664dn
            if (r0 == 0) goto L_0x00e6
            X.4dn r2 = (X.C268664dn) r2
            java.lang.Throwable r0 = r2.A00
            java.lang.String r1 = r0.getLocalizedMessage()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            goto L_0x006f
        L_0x0087:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0048
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0090:
            X.0eS.A00(r6)
            X.8rr r0 = r7.A00
            java.lang.Object r1 = r0.BEh(r8)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00a9
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00a9
            X.3Ih r4 = new X.3Ih
            r4.<init>(r1)
        L_0x00a8:
            return r4
        L_0x00a9:
            com.instagram.common.session.UserSession r0 = r7.A01
            X.1NY r2 = new X.1NY
            r2.<init>(r0)
            r2.A04()
            java.lang.String r0 = "linkshim/fetch_lynx_url/"
            r2.A0A(r0)
            java.lang.String r0 = "url"
            r2.A9m(r0, r8)
            java.lang.String r0 = "callsite"
            r2.A9m(r0, r9)
            java.lang.Class<X.9hW> r1 = X.C384559hW.class
            java.lang.Class<X.AB1> r0 = X.AB1.class
            r2.A0R(r1, r0)
            X.1OC r1 = r2.A0M()
            r3.A01 = r7
            r3.A02 = r8
            r3.A00 = r5
            r0 = 523127964(0x1f2e4c9c, float:3.6909303E-20)
            java.lang.Object r6 = r1.A00(r0, r3)
            if (r6 == r4) goto L_0x00a8
            r2 = r7
            goto L_0x002a
        L_0x00df:
            X.MDx r3 = new X.MDx
            r3.<init>(r7, r10, r4)
            goto L_0x0016
        L_0x00e6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        ((C367958rq) this.A00).A00.clear();
    }

    public BrowserLinkshimUrlCache(UserSession userSession) {
        this.A01 = userSession;
        C367658rM r3 = new C367658rM();
        r3.A02(10, TimeUnit.MINUTES);
        this.A00 = r3.A00();
    }
}
