package com.instagram.zero.headers;

import X.0qQ;
import com.instagram.common.session.UserSession;

public final class IGZeroHeadersConfigFetch {
    public final UserSession A00;
    public final Object A01;

    public IGZeroHeadersConfigFetch(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = userSession.A03.A06().getSystemService("connectivity");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22) {
        /*
            r19 = this;
            r3 = 23
            r6 = r22
            boolean r0 = X.C66147MDz.A02(r3, r6)
            r5 = r19
            if (r0 == 0) goto L_0x0101
            r4 = r6
            X.MDz r4 = (X.C66147MDz) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0101
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r2) goto L_0x0108
            X.0eS.A00(r1)
        L_0x0028:
            return r1
        L_0x0029:
            X.0eS.A00(r1)
            X.0jg r0 = X.0jh.A04
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0jh r6 = r0.A01(r1)
            X.19f r0 = X.19f.A1C
            X.19i r0 = r6.A01(r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r6 = r0.A01
        L_0x003e:
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r11 = X.C41845B3m.A04()
            r13 = 0
            java.lang.String r0 = "is_on_wifi"
            r7.A01(r0)
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = ""
        L_0x0051:
            java.lang.String r0 = "logged_out_id"
            r7.A04(r0, r6)
            java.lang.String r0 = "old_cursor"
            r6 = r21
            boolean r10 = X.C41848B3p.A1Z(r7, r0, r6)
            java.lang.Object r9 = r5.A01
            X.0wX r0 = r1.A03
            android.content.Context r6 = r0.A06()
            boolean r0 = r9 instanceof android.net.ConnectivityManager
            java.lang.String r8 = "none"
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r6.checkCallingOrSelfPermission(r0)
            if (r0 != 0) goto L_0x008e
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9
            android.net.Network r0 = r9.getActiveNetwork()
            android.net.NetworkCapabilities r6 = r9.getNetworkCapabilities(r0)
            if (r6 == 0) goto L_0x008e
            boolean r0 = r6.hasTransport(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 1603(0x643, float:2.246E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
        L_0x008e:
            java.lang.String r0 = "network_interface"
            r7.A04(r0, r8)
            java.lang.String r0 = "reason"
            r6 = r20
            boolean r0 = X.C41848B3p.A1Z(r7, r0, r6)
            X.17k.A0E(r10)
            X.1vR r8 = X.C41845B3m.A06(r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r11.getParamsCopy()
            java.lang.Class<X.QWv> r12 = X.C7784QWv.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "ZeroHeadersPingParamsV2"
            java.lang.String r17 = "xig_zero_headers_ping_params_v2"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r6 = X.1vm.A01(r1)
            r4.A01 = r5
            r4.A02 = r7
            r4.A03 = r6
            r4.A00 = r2
            X.3Pl r4 = X.JTQ.A0m(r4)
            r0 = 2
            X.Smo r2 = new X.Smo
            r2.<init>(r0, r5, r4)
            r1 = 10
            X.Omr r0 = new X.Omr
            r0.<init>(r1, r5, r4)
            r6.ATL(r0, r2, r7)
            java.lang.Object r1 = r4.A00()
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00e6:
            boolean r0 = r6.hasTransport(r2)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r8 = "wifi"
            goto L_0x008e
        L_0x00f0:
            r0 = 3
            boolean r0 = r6.hasTransport(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r8 = "ethernet"
            goto L_0x008e
        L_0x00fa:
            java.lang.String r8 = "unknown"
            goto L_0x008e
        L_0x00fe:
            r6 = 0
            goto L_0x003e
        L_0x0101:
            X.MDz r4 = new X.MDz
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x0108:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.headers.IGZeroHeadersConfigFetch.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
