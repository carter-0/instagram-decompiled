package com.instagram.barcelona.weblink.data;

import X.AnonymousClass0lh;
import X.C367658rM;
import X.C367958rq;
import X.C367968rr;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class FetchLinkMetadataCache implements AnonymousClass0lh {
    public final C367968rr A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r4 = 29
            boolean r0 = X.C66146MDy.A02(r4, r11)
            if (r0 == 0) goto L_0x011d
            r3 = r11
            X.MDy r3 = (X.C66146MDy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x00ac
            if (r0 != r5) goto L_0x012e
            java.lang.Object r9 = r3.A02
            java.lang.Object r4 = r3.A01
            com.instagram.barcelona.weblink.data.FetchLinkMetadataCache r4 = (com.instagram.barcelona.weblink.data.FetchLinkMetadataCache) r4
            X.0eS.A00(r2)
        L_0x002a:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a3
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r0 = r0.FH3()
            X.0qQ.A07(r0)
            X.Tiz r0 = (X.C13878Tiz) r0
            X.QPe r0 = (X.QPe) r0
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L_0x0047
            java.lang.String r3 = ""
        L_0x0047:
            com.instagram.api.schemas.IntegrityInterstitialType r2 = r0.A00
            java.lang.String r0 = r0.A02
            X.JV7 r1 = new X.JV7
            r1.<init>((com.instagram.api.schemas.IntegrityInterstitialType) r2, (java.lang.String) r3, (java.lang.String) r0)
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x005f
            X.8rr r0 = r4.A00
            X.8rq r0 = (X.C367958rq) r0
            X.8rQ r0 = r0.A00
            r0.put(r9, r1)
        L_0x005f:
            X.3Ih r2 = new X.3Ih
            r2.<init>(r1)
        L_0x0064:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0090
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0129
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r2 = r2.A00
            X.4dm r2 = (X.C268654dm) r2
            boolean r0 = r2 instanceof X.C268674do
            if (r0 == 0) goto L_0x0091
            java.lang.String r1 = "error: "
            X.4do r2 = (X.C268674do) r2
            java.lang.Object r0 = r2.A00
            X.1XR r0 = (X.1XR) r0
            int r0 = r0.getStatusCode()
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L_0x008b:
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x0090:
            return r2
        L_0x0091:
            boolean r0 = r2 instanceof X.C268664dn
            if (r0 == 0) goto L_0x0124
            X.4dn r2 = (X.C268664dn) r2
            java.lang.Throwable r0 = r2.A00
            java.lang.String r1 = r0.getLocalizedMessage()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            goto L_0x008b
        L_0x00a3:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0064
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ac:
            X.0eS.A00(r2)
            X.8rr r0 = r8.A00
            java.lang.Object r1 = r0.BEh(r9)
            X.JV7 r1 = (X.JV7) r1
            if (r1 == 0) goto L_0x00c9
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00c9
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
            return r0
        L_0x00c9:
            com.instagram.common.session.UserSession r1 = r8.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = -2
            X.1NY r7 = new X.1NY
            r7.<init>(r1, r0)
            java.lang.String r6 = "api/"
            java.lang.String r2 = "v1/"
            java.lang.String r1 = "link_protection/"
            java.lang.String r0 = "fetch_link_protection_metadata/"
            r7.A04()
            r7.A02()
            java.lang.String r0 = X.002.A0u(r6, r2, r1, r0)
            X.0qQ.A07(r0)
            r7.A0E = r0
            java.lang.Class<X.R7h> r1 = X.C8743R7h.class
            java.lang.Class<X.SAD> r0 = X.SAD.class
            r7.A0Q(r1, r0)
            if (r10 == 0) goto L_0x00fa
            java.lang.String r0 = "callsite"
            r7.A9m(r0, r10)
        L_0x00fa:
            if (r9 == 0) goto L_0x0101
            java.lang.String r0 = "url"
            r7.A9m(r0, r9)
        L_0x0101:
            X.1OC r1 = r7.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FetchProtectionLinkResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FetchProtectionLinkResponse>>"
            X.0qQ.A0C(r1, r0)
            r3.A01 = r8
            r3.A02 = r9
            r3.A00 = r5
            r0 = 1274345409(0x4bf4f7c1, float:3.2108418E7)
            java.lang.Object r2 = r1.A00(r0, r3)
            if (r2 != r4) goto L_0x011a
            return r4
        L_0x011a:
            r4 = r8
            goto L_0x002a
        L_0x011d:
            X.MDy r3 = new X.MDy
            r3.<init>(r8, r11, r4)
            goto L_0x0016
        L_0x0124:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0129:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x012e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.weblink.data.FetchLinkMetadataCache.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        ((C367958rq) this.A00).A00.clear();
    }

    public FetchLinkMetadataCache(UserSession userSession) {
        this.A01 = userSession;
        C367658rM r3 = new C367658rM();
        r3.A02(10, TimeUnit.MINUTES);
        this.A00 = r3.A00();
    }
}
